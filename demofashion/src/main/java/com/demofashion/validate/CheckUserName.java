package com.demofashion.validate;

import com.demofashion.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

//@Component
//public class CheckUserName implements Validator {
//    @Autowired
//    AccountDao accountDao;
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        Account account = (Account) target;
//        Account account1 = accountDao.findByUserName(account.getUsername());
//
//        if (account1 != null){
//            errors.rejectValue("username", "", "username da ton tai");
//        }
//    }
//}