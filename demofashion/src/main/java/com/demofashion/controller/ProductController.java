package com.demofashion.controller;

import com.demofashion.model.Account;
import com.demofashion.model.Product;
import com.demofashion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/fashion")
public class ProductController {
//    @Autowired
//    ProductService productService;
//    @GetMapping("/fashion")
//    public String showProduct(Model model){
//        model.addAttribute("product",productService.getAllProduct());
//        return "fashion";
//    }
    @Autowired
    ProductService productService;
    @Autowired
    HttpSession httpSession;

    @GetMapping
    public ModelAndView show(@RequestParam(defaultValue = "0") int page) {
        List<Product> productList = new ArrayList<>();
        httpSession.setAttribute("products", productList);
        ModelAndView modelAndView = new ModelAndView("user/fashion");
        Page<Product> products = productService.getAll(PageRequest.of(page,3));
        modelAndView.addObject("products", products);
        Account account = (Account) httpSession.getAttribute("account");
        modelAndView.addObject("account", account);
        return modelAndView;
    }
}
