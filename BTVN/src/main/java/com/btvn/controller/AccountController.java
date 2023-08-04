package com.btvn.controller;

import com.btvn.model.Account;
import com.btvn.service.AccountService;
import com.btvn.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService iAccountService;
    @Autowired
    AccountService accountService;
    @GetMapping
    public List<Account> getAllAccount(){
        return iAccountService.getAll();
    }
    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        for (Account account1: iAccountService.getAll()){
            if (account1.getUsername().equals(account.getUsername())){
                return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
            }else {
                Account account2 = accountService.save(account);
                return new ResponseEntity<>(account2,HttpStatus.OK);
            }
        }
        return null;
    }

    @PostMapping("/{username}/{password}")
    public Account login(@PathVariable String username, @PathVariable String password) {
        return iAccountService.checkLogin(username, password);
    }

    @PostMapping("/register")
    public Account register(@RequestBody Account account){
        return account;
    }
//    @GetMapping
//    public List<Account> getAll(){
//        return accountService.getAll();
//    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

}
