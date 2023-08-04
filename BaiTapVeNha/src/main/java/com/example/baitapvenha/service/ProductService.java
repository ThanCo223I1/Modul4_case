package com.example.baitapvenha.service;

import com.example.baitapvenha.dao.ProductDao;
import com.example.baitapvenha.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    public List<Product> getAllProduct(){
        return productDao.getAllProduct();
    }
    //Them moi san pham.
    public void createProduct(){

    }

}
