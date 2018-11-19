package com.telran.transactionaldemo.repository;

import com.telran.transactionaldemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
