package com.example.thuchanhudqlkhachhang.controller;

import com.example.thuchanhudqlkhachhang.model.Customer;
import com.example.thuchanhudqlkhachhang.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerCustomer {
    CustomerService customerService = new CustomerService();
    @GetMapping("/customer")
    public String showCustomer(Model model){
        model.addAttribute("customer", customerService.getCustomers());
        return "showCustomer";
    }

    @PostMapping("/createCustomer")
    public String createCustomer(Customer customer){
        customerService.createCustomer(customer);
        return "redirect: customer";
    }


    @GetMapping("/editCustomer")
    public String showEditCustomer(@RequestParam int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "editCustomer";
    }
    @PostMapping("/editCustomer")
    public String editCustomer(Customer customer){
        customerService.editCustomer(customer.getId(),customer);
        return "redirect:/customer";
    }

}
