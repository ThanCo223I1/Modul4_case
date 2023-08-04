package com.example.blog2.service;

import com.example.blog2.model.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogService {
    static List<Blog> blogs;
    static{
        blogs = new ArrayList<>();
        blogs.add(new Blog("Tiêu Đề 1","Content 1","2000-12-12"));
        blogs.add(new Blog("Tiêu Đề 2","Content 2","2000-12-13"));
        blogs.add(new Blog("Tiêu Đề 3","Content 3","2000-12-14"));
        blogs.add(new Blog("Tiêu Đề 4","Content 4","2000-12-15"));
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public Blog findById(int id) {
        for (Blog blog : blogs) {
            if (blog.getId_blog() == id) {
                return blog;
            }
        }
        return null;
    }

    public int findIndexById(int id) {
        for (int i = 0; i < blogs.size(); i++) {
            if (blogs.get(i).getId_blog() == id) {
                return i;
            }
        }
        return -1;
    }

    public void editBlog(int id, Blog blog){
        int index = findIndexById(id);
        blogs.set(index,blog);
    }

    public void deleteBlog(int id){
        int index = findIndexById(id);
        blogs.remove(index);
    }
    public void createBlog(Blog blog){
        blogs.add(blog);
    }
}
