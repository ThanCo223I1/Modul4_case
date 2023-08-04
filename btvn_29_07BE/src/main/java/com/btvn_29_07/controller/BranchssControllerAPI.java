package com.btvn_29_07.controller;

import com.btvn_29_07.model.Branchss;
import com.btvn_29_07.service.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/branch")
public class BranchssControllerAPI {
    @Autowired
    IBranchService iBranchService;

    @GetMapping
    public List<Branchss> getAllBranch(){
        return iBranchService.getAll();
    }
}
