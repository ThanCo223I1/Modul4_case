package com.example.manageraccount.sevice;

import com.example.manageraccount.dao.AccountDao;
import com.example.manageraccount.dao.RoleDao;
import com.example.manageraccount.model.Account;
import com.example.manageraccount.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
@Service
public class AccountService {
    @Autowired
    AccountDao accountDao;
    @Autowired
    RoleDao roleDao;

    public List<Account> getAll(){
        return accountDao.getAll();
    }


    //thêm
    public void save(Account account, int idRole, MultipartFile imgFile){
        String nameFile = imgFile.getOriginalFilename();
        try {
            imgFile.transferTo(new File("/Users/user/Desktop/Modul_4/managerAccount/src/main/webapp/WEB-INF/img/" + nameFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        account.setImg("/img/"+ nameFile);
        Role role = roleDao.findById(idRole);
        account.setRole(role);
        accountDao.save(account);
    }
    // Sửa
    public void edit(Account account, int idRole, MultipartFile imgFile){
        if (!imgFile.isEmpty()){
            String nameFile = imgFile.getOriginalFilename();
            try {
                imgFile.transferTo(new File("/Users/user/Desktop/Modul_4/managerAccount/src/main/webapp/WEB-INF/img/"+ nameFile));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            account.setImg("/img/" + nameFile);
        }
        Role role = roleDao.findById(idRole);
        account.setRole(role);
        accountDao.edit(account);
    }

    public void delete(int id){
        accountDao.delete(id);
    }

    public Account findById(int id){
        return accountDao.findById(id);
    }

}
