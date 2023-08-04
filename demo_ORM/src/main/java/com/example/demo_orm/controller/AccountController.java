package com.example.demo_orm.controller;
import com.example.demo_orm.dao.AccountDao;
import com.example.demo_orm.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    AccountDao accountDAO;

    @GetMapping("accounts")
    public String getAll(Model model) {
        List<Account> accounts = accountDAO.getAccountAll();
        model.addAttribute("accounts", accountDAO.getAccountAll());
        return "accounts";
    }
}