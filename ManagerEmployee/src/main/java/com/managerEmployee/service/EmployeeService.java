package com.managerEmployee.service;

import com.managerEmployee.model.Employee;
import com.managerEmployee.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Override
    public List<Employee> getAll() {
        return (List<Employee>) iEmployeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return iEmployeeRepository.save(employee);
    }

    @Override
    public Employee edit(Employee employee) {
        return iEmployeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public Employee findOne(int id) {
        return iEmployeeRepository.findById(id).get();
    }
}
