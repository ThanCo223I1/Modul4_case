package com.example.demowebservice.controller;

import com.example.demowebservice.model.Product;
import com.example.demowebservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @PutMapping("/{id}")
    public void edit(@PathVariable int id, @RequestBody Product product) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) {
            productService.save(product);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }


}
