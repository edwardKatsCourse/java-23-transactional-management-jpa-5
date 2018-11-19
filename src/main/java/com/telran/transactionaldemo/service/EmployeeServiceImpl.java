package com.telran.transactionaldemo.service;

import com.telran.transactionaldemo.model.Employee;
import com.telran.transactionaldemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee create(String name, Long companyId) {
        return employeeRepository.save(
                Employee.builder()
                        .name(name)
                        .company(companyService.getById(companyId))
                        .build()
        );
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

}
