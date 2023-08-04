package com.btvn.repository;

import com.btvn.model.Branch;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBranchRepository extends PagingAndSortingRepository<Branch, Integer> {
}
