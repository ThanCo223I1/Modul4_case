package com.example.store_fashion.service;

import com.example.store_fashion.model.Account;
import com.example.store_fashion.model.Role;
import com.example.store_fashion.repository.IAccountRepository;
import com.example.store_fashion.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    IAccountRepository iAccountRepository;
    @Autowired
    IRoleRepository iRoleRepository;

    @Override
    public Account getAccountLogin(Account account) {
        return iAccountRepository.getAccountLogin(account.getUsername(), account.getPassword());
    }

    @Override
    public List<Account> getAll() {
        return (List<Account>) iAccountRepository.findAll();
    }

    // Thêm Account
    public void save(Account account, int idRole, MultipartFile imgFile) {
        String nameFile = imgFile.getOriginalFilename();
        try {
            imgFile.transferTo(new File("/Users/user/Desktop/Modul_4/Store_Fashion/src/main/webapp/WEB-INF/views/"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        account.setAvatar("/images" + nameFile);
        Role role = iRoleRepository.findById(idRole).get();
        account.setRole(role);
        iAccountRepository.save(account);
    }

    // Sửa Account
    public void edit(Account account, int idRole, MultipartFile imgFile) {
        if (imgFile.isEmpty()) {
            String nameFile = imgFile.getOriginalFilename();
            try {
                imgFile.transferTo(new File("/Users/user/Desktop/Modul_4/Store_Fashion/src/main/webapp/WEB-INF/views/"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            account.setAvatar("/images/" + nameFile);
        }
        Role role = iRoleRepository.findById(idRole).get();
        account.setRole(role);
        iAccountRepository.save(account);
    }
    public Account findById(int id) {
        return iAccountRepository.findById(id).get();
    }

    public void save(Account account, int idRole){
        Role role = iRoleRepository.findById(idRole).get();
        account.setRole(role);
        iAccountRepository.save(account);
    }

    public void delete(Account account){
        iAccountRepository.deleteById(account.getId());
    }
    @Override
    public void save(Account account) {
    }
    @Override
    public void edit(Account account) {
    }
    @Override
    public void delete(int id) {
    }


}
