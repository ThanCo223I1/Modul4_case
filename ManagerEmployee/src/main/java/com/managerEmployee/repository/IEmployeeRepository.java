package com.managerEmployee.repository;

import com.managerEmployee.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
public interface IEmployeeRepository extends PagingAndSortingRepository <Employee, Integer> { }
