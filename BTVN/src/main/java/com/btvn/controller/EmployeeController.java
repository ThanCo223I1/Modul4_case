package com.btvn.controller;

import com.btvn.model.Employee;
import com.btvn.repository.IEmployeeRepository;
import com.btvn.service.IBranchService;
import com.btvn.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    IBranchService iBranchService;
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employeeList = iEmployeeService.getAll();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee employees = iEmployeeService.save(employee);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<Employee> edit(@RequestBody Employee employee) {
        Employee employees = iEmployeeService.edit(employee);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        iEmployeeService.delete(id);
    }

    @GetMapping("/{id}")
    public Employee detailEmployee(@PathVariable int id) {
        return iEmployeeService.findOne(id);

    }

    // sắp xếp
//    @GetMapping("/sortedByAge")
//    public ResponseEntity<List<Employee>> sortByAge(){
//        List<Employee> employeesList = iEmployeeService.getAll();
//        employeesList.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return Integer.compare(e1.getAge(), e2.getAge());
//            }
//        });
//        return new ResponseEntity<>(employeesList,HttpStatus.OK);
//    }
}
