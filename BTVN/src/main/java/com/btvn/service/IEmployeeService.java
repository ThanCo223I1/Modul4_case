package com.btvn.service;

import com.btvn.model.Employee;

import java.util.List;

public interface IEmployeeService{
    List<Employee> getAll();
    Employee save(Employee employee);
    Employee edit(Employee employee);
    void delete(int id);
    Employee findOne(int id);
}
