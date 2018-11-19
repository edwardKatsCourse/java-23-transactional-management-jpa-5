package com.telran.transactionaldemo.service;

import com.telran.transactionaldemo.model.Company;

import java.util.List;

public interface CompanyService {

    Company create(String name);
    List<Company> getAllCompanies();
    Company getById(Long id);
}
