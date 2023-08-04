package com.example.store_fashion.controller;

import com.example.store_fashion.model.Account;
import com.example.store_fashion.model.Product;
import com.example.store_fashion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView showProduct(@RequestParam(defaultValue = "0") int page){
        List<Product> productList = new ArrayList<>();
        httpSession.setAttribute("product",productList);
        ModelAndView modelAndView = new ModelAndView("products");
        Page<Product> productPage = productService.getAll(PageRequest.of(page,5));
        modelAndView.addObject("product", productPage);
        Account account = (Account) httpSession.getAttribute("account");
        modelAndView.addObject("account", account);
        return modelAndView;
    }
}
