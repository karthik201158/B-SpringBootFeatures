package com.kartheek.caching.simple.service;

import com.kartheek.caching.simple.entity.Employee;
import com.kartheek.caching.simple.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee registerEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Cacheable(value="Employee", key="#id")
    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).get();
    }

}
