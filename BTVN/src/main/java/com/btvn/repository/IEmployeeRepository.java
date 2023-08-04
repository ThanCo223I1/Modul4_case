package com.btvn.repository;

import com.btvn.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
public interface IEmployeeRepository extends PagingAndSortingRepository <Employee, Integer> { }
