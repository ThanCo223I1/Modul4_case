package com.demofashion.controller;

import com.demofashion.model.Bill;
import com.demofashion.model.BillDetails;
import com.demofashion.model.Product;
import com.demofashion.service.BillDetailsService;
import com.demofashion.service.BillService;
import com.demofashion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    HttpSession httpSession;

    @Autowired
    ProductService productService;

    @Autowired
    BillService billService;

    @Autowired
    BillDetailsService billDetailsService;

    //Thêm vào giỏ hàng
    @GetMapping("/addCart")
    public String addCart(@RequestParam int id) {
        Product product = productService.findById(id);
        product.setQuantity(1);
        List<Product> products = (List<Product>) httpSession.getAttribute("products");
        if (products == null) {
            products = new ArrayList<>();
        }
        boolean check = false;
        double total = 0;
        for (Product product1 : products) {
            if (product1.getId() == id) {
                product1.setQuantity(product1.getQuantity() + 1);
                check = true;
            }
            total += (product1.getPriceProduct() * product1.getQuantity());
        }

        if (!check) {
            products.add(product);
            total += (product.getPriceProduct() * product.getQuantity());
        }
        httpSession.setAttribute("products", products);
        httpSession.setAttribute("total", total);
        System.out.println(products);
        return "redirect:/cart/cartProduct";
    }

    //hiển thị danh sách sản phẩm trong giỏ hàng
    @GetMapping("/cartProduct")
    public ModelAndView showCartProduct() {
        ModelAndView modelAndView = new ModelAndView("/cart/cartProduct");
        List<Product> products = (List<Product>) httpSession.getAttribute("products");
        modelAndView.addObject("products", products);
        modelAndView.addObject("total", httpSession.getAttribute("total"));

        return modelAndView;
    }


    //Hiển thị detailProduct chi tiết sản phẩm
    @GetMapping("/detailProduct")
    public ModelAndView showProductDetails(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("/user/detailProduct");
        Product product = productService.findById(id);
        modelAndView.addObject("products", product);
        return modelAndView;
    }


    @GetMapping("/pay")
    public String Pay() {
        List<Product> products = (List<Product>) httpSession.getAttribute("products");
        if (products != null) {
            double total = (double) httpSession.getAttribute("total");
            Bill bill = new Bill(0, new Date(System.currentTimeMillis()), total);
            billService.save(bill);
            for (Product product : products) {
                BillDetails billDetails = new BillDetails(0, product.getQuantity(), product, bill);
                billDetailsService.save(billDetails);

                Product product1 = productService.findById(product.getId());
                product1.setQuantity(product1.getQuantity() - product.getQuantity());
                productService.edit(product1);
            }
            httpSession.setAttribute("products", null);
            double setTotal = 0;
            httpSession.setAttribute("total", setTotal);
        }
        return "redirect:/user/fashion";
    }

    @GetMapping("/deleteProduct/{id}")
    public ModelAndView deleteProduct(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/cart/cartProduct");
        double total = (double) httpSession.getAttribute("total");
        List<Product> products = (List<Product>) httpSession.getAttribute("products");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                if (products.get(i).getQuantity() > 1) {
                    int a = products.get(i).getQuantity();
                     products.get(i).setQuantity(products.get(i).getQuantity() - 1);
                    total -= products.get(i).getPriceProduct() * (a - products.get(i).getQuantity());
                } else {
                    total -= products.get(i).getPriceProduct() * products.get(i).getQuantity();
                    products.remove(i);
                }
            }
        }
        httpSession.setAttribute("products", products);
        httpSession.setAttribute("total", total);
        return modelAndView;
    }


}
