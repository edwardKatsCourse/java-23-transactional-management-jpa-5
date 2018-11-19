package com.telran.transactionaldemo.service;

import com.telran.transactionaldemo.model.Company;
import com.telran.transactionaldemo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;


    @Override
    public Company create(String name) {
        return companyRepository.save(
                Company.builder()
                        .companyName(name)
                        .build());
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }
}
