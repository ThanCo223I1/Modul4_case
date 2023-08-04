package com.btvn.controller;

import com.btvn.model.Branch;
import com.btvn.service.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/branch")
public class BranchController {
    @Autowired
    IBranchService iBranchService;

    @GetMapping
    public List<Branch> getAllBranch(){
        return iBranchService.getAll();
    }
}
