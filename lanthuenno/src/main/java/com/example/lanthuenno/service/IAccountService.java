package com.example.lanthuenno.service;

import com.example.lanthuenno.model.Account;

public interface IAccountService extends ICrudService<Account>{
    Account getAccountLogin(Account account);
}
