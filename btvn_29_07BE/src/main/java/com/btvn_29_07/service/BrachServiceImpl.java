package com.btvn_29_07.service;


import com.btvn_29_07.model.Branchss;
import com.btvn_29_07.repository.IBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrachServiceImpl implements IBranchService{
    @Autowired
    IBranchRepository iBranchRepository;
    @Override
    public List<Branchss> getAll() {
        return (List<Branchss>) iBranchRepository.findAll();
    }

    @Override
    public Branchss save(Branchss branchss) {
        return null;
    }

    @Override
    public Branchss edit(Branchss branchss) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
