package com.telran.transactionaldemo.service;

import com.telran.transactionaldemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create(String name, Long companyId);
    List<Employee> getAll();
}
