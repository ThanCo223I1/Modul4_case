package com.example.quanlyhocsinh.model;

public class Student {
    private int id;
    private int age;
    private String name;
    private String img;

    public Student() {
    }

    public Student(int id, int age, String name, String img) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
