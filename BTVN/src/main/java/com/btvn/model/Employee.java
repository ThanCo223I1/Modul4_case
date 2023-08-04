package com.btvn.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String employeeCode;
    private int age;
    private double salary;
    @ManyToOne
    private Branch branch;
}
