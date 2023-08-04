package com.example.lanthuenno.service;

import com.example.lanthuenno.model.Product;
import com.example.lanthuenno.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Product> getAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void edit(Product product) {
        iProductRepository.save(product);
    }

    public Product findById(int id){
        Optional<Product> product = iProductRepository.findById(id);
        if (product!=null){
            return product.get();
        }
        return null;
    }
    @Override
    public void delete(int id) {
        iProductRepository.deleteById(id);
    }
}
