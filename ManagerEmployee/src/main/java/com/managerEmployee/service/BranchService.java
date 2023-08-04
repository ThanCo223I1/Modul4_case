package com.managerEmployee.service;

import com.managerEmployee.model.Branch;
import com.managerEmployee.repository.IBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService implements IBranchService{
    @Autowired
    IBranchRepository iBranchRepository;
    @Override
    public List<Branch> getAll() {
        return (List<Branch>) iBranchRepository.findAll();
    }

    @Override
    public Branch save(Branch branch) {
        return null;
    }

    @Override
    public Branch edit(Branch branch) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
