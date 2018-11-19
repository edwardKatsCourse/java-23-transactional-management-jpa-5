package com.telran.transactionaldemo.dto;

import com.telran.transactionaldemo.model.Company;
import com.telran.transactionaldemo.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class EmployeeCompanyResponseDTO {

    private Company company;
    private Employee employee;
}
