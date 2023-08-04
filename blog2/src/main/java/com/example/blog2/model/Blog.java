package com.example.blog2.model;

public class Blog {
    private int id_blog;
    public static int count = 1;
    private String title_blog;
    private String content_blog;
    private String creation_date;

    public Blog() {
        this.id_blog = count++;
    }

    public Blog(String title_blog, String content_blog, String creation_date) {
        this.id_blog = count++;
        this.title_blog = title_blog;
        this.content_blog = content_blog;
        this.creation_date = creation_date;
    }

    public int getId_blog() {
        return id_blog;
    }

    public void setId_blog(int id_blog) {
        this.id_blog = id_blog;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Blog.count = count;
    }

    public String getTitle_blog() {
        return title_blog;
    }

    public void setTitle_blog(String title_blog) {
        this.title_blog = title_blog;
    }

    public String getContent_blog() {
        return content_blog;
    }

    public void setContent_blog(String content_blog) {
        this.content_blog = content_blog;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }
}
