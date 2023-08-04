package com.demofashion.service;
import com.demofashion.model.Account;
import com.demofashion.model.Role;
import com.demofashion.repository.IAccountRepository;
import com.demofashion.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
@Service
public class AccountService implements IAccountService{
    @Autowired
    IAccountRepository iAccountRepository;
    @Autowired
    IRoleRepository iRoleRepository;

    public List<Account> getAll() {
        return (List<Account>) iAccountRepository.findAll();
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

    //thêm
    public void save(Account account, int idRole, MultipartFile imgFile) {
        String nameFile = imgFile.getOriginalFilename();
        try {
            imgFile.transferTo(new File("/Users/user/Desktop/Modul_4/demofashion/src/main/webapp/WEB-INF/views/images/" + nameFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        account.setImage("/images/" + nameFile);
        Role role = iRoleRepository.findById(idRole).get();
        account.setRole(role);
        iAccountRepository.save(account);
    }

    // Sửa
    public void edit(Account account, int idRole, MultipartFile imgFile) {
        if (!imgFile.isEmpty()) {
            String nameFile = imgFile.getOriginalFilename();
            try {
                imgFile.transferTo(new File("/Users/user/Desktop/Modul_4/demofashion/src/main/webapp/WEB-INF/views/images/" + nameFile));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            account.setImage("/images/" + nameFile);
        }
        Role role = iRoleRepository.findById(idRole).get();
        account.setRole(role);
        iAccountRepository.save(account);
    }

    public void delete(Account account) {
        iAccountRepository.deleteById(account.getId());
    }

    public Account findById(int id) {
        return iAccountRepository.findById(id).get();
    }

    public Boolean checkAdmin(String username, String password){
        for (Account account: getAll()) {
            if (username.equals(account.getUsername()) && password.equals(account.getPassword())
            && account.getRole().getId()==1){
                return true;
            }
        }return false;
    }

    public Boolean checkUser(String username , String password){
        for (Account account: getAll()) {
            if (username.equals(account.getUsername())&& password.equals(account.getPassword())
            && account.getRole().getId() == 2){
                return true;
            }
        }return false;
    }

    public void save(Account account, int idRole){
        Role role = iRoleRepository.findById(idRole).get();
        account.setRole(role);
        iAccountRepository.save(account);
    }

    @Override
    public Account getAccountLogin(Account account) {
        return iAccountRepository.getAccountLogin(account.getUsername(),account.getPassword());
    }
}
