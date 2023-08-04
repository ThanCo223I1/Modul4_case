package com.btvn_29_07.service;


import com.btvn_29_07.model.Employees;

import java.util.List;

public interface IEmployeeService {
    List<Employees> getAll();
    Employees save(Employees employees);
    Employees edit(Employees employees);
    void delete(int id);
    Employees getEmployeeById(int id);

}
