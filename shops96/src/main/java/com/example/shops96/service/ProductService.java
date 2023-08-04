package com.example.shops96.service;

import com.example.shops96.model.Account;
import com.example.shops96.model.Product;
import com.example.shops96.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ICrudService<Product> {
    @Autowired
    IProductRepository iProductRepository;

    @Override
    public List<Product> getAll() {
        return (List<Product>) iProductRepository.findAll();
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void edit(Product product) {
iProductRepository.save(product);
    }

    public void delete(int id) {
     Product product = iProductRepository.findById(id).get();
     iProductRepository.delete(product);

    }

    public Optional<Product> findById(int id){
        return iProductRepository.findById(id);
    }
}
