package com.demofashion.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Date;
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Size(min = 6, message = "nhiều hơn 6 ký tự")
    private String username;
//    @Size(min = 6, message = "nhiều hơn 6 ký tự")
    private String password;
    private String image;
    private Date birthDay;
    @ManyToOne
    private Role role;

    public Account() {
    }

    public Account(int id, String username, String password, String image, Date birthDay, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.image = image;
        this.birthDay = birthDay;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
