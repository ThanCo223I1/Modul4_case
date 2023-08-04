package com.demofashion.service;

import com.demofashion.model.Account;
import org.springframework.stereotype.Service;

public interface IAccountService extends ICrudService<Account> {
    Account getAccountLogin(Account account);
}
