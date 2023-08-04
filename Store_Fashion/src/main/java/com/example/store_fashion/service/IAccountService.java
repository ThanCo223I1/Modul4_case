package com.example.store_fashion.service;

import com.example.store_fashion.model.Account;

public interface IAccountService extends ICrudService<Account>{
    Account getAccountLogin(Account account);
}
