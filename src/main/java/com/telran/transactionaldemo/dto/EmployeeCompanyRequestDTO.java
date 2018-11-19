package com.telran.transactionaldemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeCompanyRequestDTO {

    private String companyName;
    private String employeeName;
}
