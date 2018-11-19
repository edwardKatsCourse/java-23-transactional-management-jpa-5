package com.telran.transactionaldemo.service;

import com.telran.transactionaldemo.dto.EmployeeCompanyRequestDTO;
import com.telran.transactionaldemo.dto.EmployeeCompanyResponseDTO;

public interface TogetherService {

    EmployeeCompanyResponseDTO createTogether(EmployeeCompanyRequestDTO requestDTO);
}
