package com.managerEmployee.repository;

import com.managerEmployee.model.Branch;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBranchRepository extends PagingAndSortingRepository<Branch, Integer> {
}
