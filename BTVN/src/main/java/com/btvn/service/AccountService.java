package com.btvn.service;

import com.btvn.model.Account;
import com.btvn.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    IAccountRepository iAccountRepository;

    public Account checkLogin(String username, String password) {
        Account account = iAccountRepository.findAccountByUsername(username);
        if (account!=null && account.getUsername().equals(username) && account.getPassword().equals(password)){
            return account;
        }else {
            return null;
        }
    }
    @Override
    public Account getAccountLogin(String username, String password) {
        return iAccountRepository.getAccountLogin(username,password);
    }

    @Override
    public List<Account> getAll() {
        return (List<Account>) iAccountRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepository.findAccountByUsername(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(account.getRole());
        return new User(account.getUsername(),account.getPassword(),roles);
    }


    @Override
    public Account save(Account account) {
        iAccountRepository.save(account);
        return account;
    }



    public void edit(Account account) {

    }


    public void delete(int id) {
    }





}
