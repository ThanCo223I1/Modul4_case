package com.example.demowebservice.service;

import com.example.demowebservice.model.Product;
import com.example.demowebservice.repositpry.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
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

    @Override
    public void delete(int id) {
        iProductRepository.deleteById(id);
    }
    public Optional<Product> findById(int id){
        return iProductRepository.findById(id);
    }
}
