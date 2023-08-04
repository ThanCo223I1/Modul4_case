package com.example.shops96.controller;


import com.example.shops96.model.Account;
import com.example.shops96.service.IAccountService;
import com.example.shops96.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApi {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtService jwtService;
    @Autowired
    IAccountService iAccountService;
    @PostMapping("/login")
    public String getLogin(@RequestBody Account account){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(account.getUsername(),account.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtService.createToken(authentication);
        return token;
    }
}
