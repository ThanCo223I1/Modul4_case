package com.example.baitapvenha.dao;

import com.example.baitapvenha.model.Product;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class ProductDao {
    @PersistenceContext
    EntityManager entityManager;
    public List<Product> getAllProduct(){
        String queryStr = "SELECT a FROM Product a";
        TypedQuery<Product> typedQuery = entityManager.createQuery(queryStr,Product.class);
        return typedQuery.getResultList();
    }
    public Product findById(int id){
        String queryStr = "SELECT a FROM Product a where a.id = :id";
        TypedQuery<Product> typedQuery = entityManager.createQuery(queryStr,Product.class).setParameter("id",id);
        return typedQuery.getSingleResult();
    }
    public void createProduct(Product product){
        entityManager.persist(product);
    }
    public void updateProduct(Product product){
        entityManager.merge(product);
    }

    public void deleteProduct(int id){
        Product product = findById(id);
        entityManager.remove(product);
    }
}
