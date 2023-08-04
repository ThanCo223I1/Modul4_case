package com.example.btchuyendoitiente.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversionController {
    public void chuyenDoiTienTe() {
        @GetMapping("/show")
        public String showCurrencyForm(@RequestParam, Model model){
            return "show";
        }
    }
}
