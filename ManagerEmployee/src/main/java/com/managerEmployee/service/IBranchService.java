package com.managerEmployee.service;


import com.managerEmployee.model.Branch;

import java.util.List;

public interface IBranchService {
    List<Branch> getAll();
    Branch save(Branch branch);
    Branch edit(Branch branch);
    void delete(int id);
}
