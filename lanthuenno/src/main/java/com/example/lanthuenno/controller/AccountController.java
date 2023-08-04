package com.example.lanthuenno.controller;

import com.example.lanthuenno.model.Account;
import com.example.lanthuenno.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
@Controller
public class AccountController {
    @Autowired
    AccountService accountService;
    @Autowired
    HttpSession httpSession;
    @GetMapping("/login")
    public String showLogin(@RequestParam (defaultValue = "no") String error, Model model) {
        if (!error.equals("no")) {
            model.addAttribute("login", "Account Không tồn tại");
        }
        return "login";
    }
    @PostMapping("/login")
    public String login(Account account){
        Account account1 = accountService.getAccountLogin(account);
        if (account1 != null){
            httpSession.setAttribute("account",account1);
            if (account1.getRole().getName().equals("Admin")){
               return "redirect:/managerLogin";
            }else {
                return "redirect:/";
            }
        }return "redirect:/";
    }

}
