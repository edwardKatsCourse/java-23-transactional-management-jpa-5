package com.telran.transactionaldemo.service;

import com.telran.transactionaldemo.dto.EmployeeCompanyRequestDTO;
import com.telran.transactionaldemo.dto.EmployeeCompanyResponseDTO;
import com.telran.transactionaldemo.exceptions.TeapotException;
import com.telran.transactionaldemo.model.Company;
import com.telran.transactionaldemo.model.Employee;
import com.telran.transactionaldemo.repository.CompanyRepository;
import com.telran.transactionaldemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TogetherServiceImpl implements TogetherService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    @Transactional(
            propagation = Propagation.REQUIRED,
            noRollbackFor = TeapotException.class)

    public EmployeeCompanyResponseDTO createTogether(EmployeeCompanyRequestDTO requestDTO) {
        //create company

        //Transient
        Company company = new Company();
        company.setCompanyName(requestDTO.getCompanyName());

        //begin transaction
        companyRepository.save(company);
        //commit


        //save
        //company -> Managed

        //create employee -> threw exception

        if (true) {
            throw new RuntimeException();
        }

        Employee employee = new Employee();
        employee.setCompany(company);
        employee.setName(requestDTO.getEmployeeName());

        //begin transaction
        employeeRepository.save(employee); //-> throw new exception
        //commit

        return EmployeeCompanyResponseDTO.builder()
                .company(company)
                .employee(employee)
                .build();
    }
}
