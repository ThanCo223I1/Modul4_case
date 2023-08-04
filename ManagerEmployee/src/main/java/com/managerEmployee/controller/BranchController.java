package com.managerEmployee.controller;

import com.managerEmployee.model.Branch;
import com.managerEmployee.service.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
