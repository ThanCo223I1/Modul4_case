package com.example.shops96.controller;
import com.example.shops96.model.Product;
import com.example.shops96.service.ICrudService;
import com.example.shops96.service.ProductService;
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

    @GetMapping ("/edit/{id}")
    public void edit(@PathVariable int id, @RequestBody Product product) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) {
            productService.save(product);
        }
    }
    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id){
    productService.delete(id);    }


}
