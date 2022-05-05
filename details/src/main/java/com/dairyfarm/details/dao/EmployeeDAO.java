package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO extends JpaRepository<Employee,Integer> {

    Optional<List<Employee>> findEmployeeByRole(String role);
}
