package com.btvn_29_07.repository;

import com.btvn_29_07.model.Employees;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEmployeeRepository extends PagingAndSortingRepository<Employees,Integer> {
    Employees getEmployeeById(int id);

}
