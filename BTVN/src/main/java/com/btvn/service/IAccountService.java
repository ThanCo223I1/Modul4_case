package com.btvn.service;

import com.btvn.model.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IAccountService extends UserDetailsService {
    Account getAccountLogin(String username, String password);
    List<Account> getAll();
    Account save(Account account);
    Account checkLogin(String usernane, String password);


}
