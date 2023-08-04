package com.example.store_fashion.filter;

import com.example.store_fashion.model.Account;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter("/cart/*")
public class Filter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpSession httpSession = request.getSession();
        Account account = (Account) httpSession.getAttribute("account");
        if (account != null) {
            chain.doFilter(request, response);
        } else {
            response.sendRedirect("/login");
        }
    }
}
