package com.kartheek.caching.simple.controller;

import com.kartheek.caching.simple.entity.Employee;
import com.kartheek.caching.simple.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveBook(@RequestBody Employee employee) {
        return employeeService.registerEmployee(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee getBook(@PathVariable("id") String id) {
        return employeeService.getEmployeeById(id);
    }

}