package com.managerEmployee.service;

import com.managerEmployee.model.Employee;

import java.util.List;

public interface IEmployeeService{
    List<Employee> getAll();
    Employee save(Employee employee);
    Employee edit(Employee employee);
    void delete(int id);
    Employee findOne(int id);
}
