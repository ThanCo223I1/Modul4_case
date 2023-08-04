package com.demofashion.controller.adminManagerProduct;

import com.demofashion.model.Account;
import com.demofashion.model.Product;
import com.demofashion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class adminProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/managerProduct")
    public String showProduct(Model model) {
        model.addAttribute("products",productService.getAll());
        return "admin/managerProduct";
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/admin/createProduct");
        modelAndView.addObject("products", new Product());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product, MultipartFile imgFile){
        if (!imgFile.isEmpty()){
            String nameFile = imgFile.getOriginalFilename();
            try {
                imgFile.transferTo(new File("/Users/user/Desktop/Modul_4/demofashion/src/main/webapp/WEB-INF/views/images/"+ nameFile));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            product.setImage("/images/" + nameFile);
        }
        productService.save(product);
        return "redirect:/admin/managerProduct";
    }

    // Sửa
    @GetMapping("/updateProduct/{id}")
    public ModelAndView showUpdateProduct(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/admin/updateProduct");
        modelAndView.addObject("product",productService.findById(id));
        return modelAndView;
    }
    @PostMapping("/updateProduct/{id}")
    public String updateProduct(@ModelAttribute Product product, MultipartFile imgFile) {
        if (!imgFile.isEmpty()){
            String nameFile = imgFile.getOriginalFilename();
            try {
                imgFile.transferTo(new File("/Users/user/Desktop/Modul_4/demofashion/src/main/webapp/WEB-INF/views/images/"+ nameFile));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            product.setImage("/images/" + nameFile);
        }
        productService.edit(product);
        return "redirect:/admin/managerProduct";
    }

    // xóa sản phẩm
    @GetMapping("/deleteProduct/{id}")
    public ModelAndView showDeleteProduct(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/admin/deleteProduct");
        modelAndView.addObject("product", productService.findById(id));
        return modelAndView;
    }
    @PostMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        productService.delete(id);
        return "redirect:/admin/managerProduct";
    }
}
