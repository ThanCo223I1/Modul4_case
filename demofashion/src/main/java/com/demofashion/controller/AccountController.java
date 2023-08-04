package com.demofashion.controller;

import com.demofashion.model.Account;
import com.demofashion.model.Product;
import com.demofashion.service.AccountService;
import com.demofashion.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class AccountController {
    @Autowired
    AccountService accountService;

    @Autowired
    HttpSession httpSession;

    @GetMapping("/login")
    public String showLogin(@RequestParam(defaultValue = "no") String error, Model model){
        if (!error.equals("no")){
            model.addAttribute("mess","Account không tồn tại");
        }
        return "login/login";
    }

    @PostMapping("/login")
    public String login(Account account, @CookieValue(defaultValue = "0") int a){
        Account account1 = accountService.getAccountLogin(account);
        if (account1 != null){
            httpSession.setAttribute("account",account1);
            if (account1.getRole().getName().equals("ADMIN")){
                return "redirect:/admin/managerProduct";
            }else {
                return "redirect:/fashion";
            }
        }
        return "redirect:/login?error=true";
    }


}
