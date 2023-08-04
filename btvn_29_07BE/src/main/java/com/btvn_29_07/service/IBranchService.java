package com.btvn_29_07.service;


import com.btvn_29_07.model.Branchss;

import java.util.List;

public interface IBranchService {
    List<Branchss> getAll();
    Branchss save(Branchss branchss);
    Branchss edit(Branchss branchss);
    void delete(int id);
}
