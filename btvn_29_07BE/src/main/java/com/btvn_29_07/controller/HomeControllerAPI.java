package com.btvn_29_07.controller;

import com.btvn_29_07.model.Employees;
import com.btvn_29_07.repository.IEmployeeRepository;
import com.btvn_29_07.service.IBranchService;
import com.btvn_29_07.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/home")
public class HomeControllerAPI {
    @Autowired
    IBranchService iBranchService;
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @GetMapping
    public ResponseEntity<List<Employees>> getAllEmployees() {
        List<Employees> employeesList = iEmployeeService.getAll();
        return new ResponseEntity<>(employeesList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employees> createEmployee(@RequestBody Employees employee) {
        Employees employees = iEmployeeService.save(employee);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<Employees> edit(@RequestBody Employees employee) {
        Employees employees = iEmployeeService.edit(employee);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        iEmployeeService.delete(id);
        return "xóa thành công";
    }

    @PostMapping("/detail/{id}")
    public Employees detailEmployee(@PathVariable int id) {
        System.out.println(iEmployeeService.getEmployeeById(10).toString());
        return iEmployeeService.getEmployeeById(id);

    }

    // sắp xếp
    @GetMapping("/sortedByAge")
    public ResponseEntity<List<Employees>> sortedByAge(){
        List<Employees> employeesList = iEmployeeService.getAll();
        employeesList.sort(new Comparator<Employees>() {
            @Override
            public int compare(Employees e1, Employees e2) {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });
    return new ResponseEntity<>(employeesList,HttpStatus.OK);
    }
}
