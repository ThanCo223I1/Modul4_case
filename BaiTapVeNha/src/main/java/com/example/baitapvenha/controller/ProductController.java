package com.example.baitapvenha.controller;

import com.example.baitapvenha.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/showProduct")
    public String showProduct(Model model){
        model.addAttribute("product",productService.getAllProduct());
        return "showProduct";
    }

}
