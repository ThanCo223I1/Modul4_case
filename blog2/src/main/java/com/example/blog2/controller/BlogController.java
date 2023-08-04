package com.example.blog2.controller;

import com.example.blog2.model.Blog;
import com.example.blog2.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("/showBlogs")
    public String showBlog(Model model) {
        model.addAttribute("blogs", blogService.getBlogs());
        return "showBlog";
    }
    @GetMapping("/editBlog")
    public String showEditBlog(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "editBlog";
    }

    @PostMapping("/editBlog")
    public String showEditBlog(@ModelAttribute Blog blog) {
        blogService.editBlog(blog.getId_blog(),blog);
        return "redirect:/showBlogs";
    }

    @GetMapping("/deleteBlog")
    public String showDeleteBlog(@RequestParam int id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "deleteBlog";
    }
    @PostMapping("/deleteBlog")
    public String deleteBlog(@RequestParam int id){
        blogService.deleteBlog(id);
        return "redirect:/showBlogs";
    }
    @GetMapping("/createBlog")
    public String createBlog(){
        return "createBlog";
    }
    @PostMapping("/createBlog")
    public String createBlog(Blog blog){
        blogService.createBlog(blog);
        return "redirect:/showBlogs";
    }
}
