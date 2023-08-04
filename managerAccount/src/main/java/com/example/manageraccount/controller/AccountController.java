package com.example.manageraccount.controller;
import com.example.manageraccount.model.Account;
import com.example.manageraccount.sevice.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

@Controller
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping("/showAccount")
    public String showAccount(Model model){
        model.addAttribute("account",accountService.getAll());
      return "showAccount";
    }

    /// thêm
    @GetMapping("/createAccount")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("createAccount");
        modelAndView.addObject("account", new Account());
        return modelAndView;
    }

    @PostMapping("/createAccount")
    public String create(Account account, int idRole, @RequestParam MultipartFile imgFile){
        accountService.save(account,idRole,imgFile);
        return "redirect:/showAccount";
    }

    // Sửa
    @GetMapping("/editAccount/{id}")
    public ModelAndView showEditAccount(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("editAccount");
        modelAndView.addObject("account",accountService.findById(id));
        return modelAndView;
    }
    @PostMapping("/editAccount/{id}")
    public String editAccount(@ModelAttribute Account account, @RequestParam int idRole,@RequestParam MultipartFile imgFile) {
       accountService.edit(account,idRole,imgFile);
       return "redirect:/showAccount";
    }

        @GetMapping("/deleteAccount/{id}")
    public ModelAndView showDeleteAccount(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("deleteAccount");
        modelAndView.addObject("account", accountService.findById(id));
        return modelAndView;
    }
    @PostMapping("/deleteAccount/{id}")
    public String deleteAccount(@PathVariable int id){
        accountService.delete(id);
        return "redirect:/showAccount";
    }


//    @GetMapping("/createAccount")
//    public String showCreateAccount(){
//        return "createAccount";
//    }
//    @PostMapping("/createAccount")
//    public String createAccount(@ModelAttribute Account account, @RequestParam MultipartFile imgfile) throws IOException {
//            String nameimg = imgfile.getOriginalFilename();
//            imgfile.transferTo(new File("/Users/user/Desktop/Modul_4/managerAccount/src/main/webapp/WEB-INF/img/" + nameimg));
//            account.setImg("/" + nameimg);
//            accountService.createAccount(account);
//            return "redirect:/showAccount";
//    }





}
