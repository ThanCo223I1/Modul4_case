package com.example.shops96.service;

import com.example.shops96.model.Account;
import com.example.shops96.model.Product;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IAccountService extends UserDetailsService {
    Account getAccountLogin(String username, String password);
    List<Account> getAll();
    Account save(Account account);
    Account checkLogin(String usernane, String password);


}
