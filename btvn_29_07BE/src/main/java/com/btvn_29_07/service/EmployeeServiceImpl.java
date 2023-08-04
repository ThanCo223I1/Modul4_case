package com.btvn_29_07.service;


import com.btvn_29_07.model.Employees;
import com.btvn_29_07.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Override
    public List<Employees> getAll() {
        return (List<Employees>) iEmployeeRepository.findAll();
    }

    @Override
    public Employees save(Employees employees) {
        return iEmployeeRepository.save(employees);
    }

    @Override
    public Employees edit(Employees employees) {
        return iEmployeeRepository.save(employees);
    }

    @Override
    public void delete(int id) {
        Employees employees = iEmployeeRepository.getEmployeeById(id);
        iEmployeeRepository.delete(employees);
    }

    @Override
    public Employees getEmployeeById(int id) {
        return iEmployeeRepository.getEmployeeById(id);
    }


}
