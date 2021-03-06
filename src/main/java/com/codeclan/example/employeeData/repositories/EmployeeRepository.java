package com.codeclan.example.employeeData.repositories;

import com.codeclan.example.employeeData.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
