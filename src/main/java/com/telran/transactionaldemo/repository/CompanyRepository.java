package com.telran.transactionaldemo.repository;

import com.telran.transactionaldemo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
