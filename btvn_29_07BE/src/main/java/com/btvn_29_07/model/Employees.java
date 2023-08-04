package com.btvn_29_07.model;

import javax.persistence.*;

@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String employeeCode;
    private String name;
    private int age;
    private double salary;
    @ManyToOne
    private Branchss branchss;

    public Employees() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Branchss getBranchss() {
        return branchss;
    }

    public void setBranchss(Branchss branchss) {
        this.branchss = branchss;
    }
}
