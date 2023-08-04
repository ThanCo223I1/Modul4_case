package com.example.manageraccount.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public static int count = 0;
    private String username;
    private String password;
    private String img;
    private Date birthday;
    @ManyToOne
    private Role role;

    public Account() {
    }

    public Account( String username, String password, String img, Date birthday, Role role) {
        this.id = count++;
        this.username = username;
        this.password = password;
        this.img = img;
        this.birthday = birthday;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Account.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
