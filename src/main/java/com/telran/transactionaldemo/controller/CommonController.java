package com.telran.transactionaldemo.controller;

import com.telran.transactionaldemo.dto.EmployeeCompanyRequestDTO;
import com.telran.transactionaldemo.dto.EmployeeCompanyResponseDTO;
import com.telran.transactionaldemo.model.Company;
import com.telran.transactionaldemo.model.Employee;
import com.telran.transactionaldemo.service.CompanyService;
import com.telran.transactionaldemo.service.EmployeeService;
import com.telran.transactionaldemo.service.TogetherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommonController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private TogetherService togetherService;

    @PostMapping("/company/{name}")
    public Company create(@PathVariable("name") String companyName) {
        return companyService.create(companyName);
    }

    @GetMapping("/company/{id}")
    public Company getById(@PathVariable("id") Long id) {
        return companyService.getById(id);
    }

    @GetMapping("/company")
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    //-------------------------------------------------------

    @PostMapping("/employee")
    public Employee employee(@RequestParam("name") String name,
                             @RequestParam("companyId") Long companyId) {
        return employeeService.create(name, companyId);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAll();
    }


    //--------------------------------------------------------


    //Request method, creating employee and company together

    @PostMapping("/together")
    public EmployeeCompanyResponseDTO createTogether(@RequestBody EmployeeCompanyRequestDTO requestDTO) {
        return togetherService.createTogether(requestDTO);
    }
}
