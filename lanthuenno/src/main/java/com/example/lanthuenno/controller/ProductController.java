package com.example.lanthuenno.controller;

import com.example.lanthuenno.model.Product;
import com.example.lanthuenno.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    HttpSession httpSession;
    @GetMapping
    public List<Product> showProduct() {
        return productService.getAll();
    }
}
