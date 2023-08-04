package com.btvn.service;


import com.btvn.model.Branch;

import java.util.List;

public interface IBranchService {
    List<Branch> getAll();
    Branch save(Branch branch);
    Branch edit(Branch branch);
    void delete(int id);
}
