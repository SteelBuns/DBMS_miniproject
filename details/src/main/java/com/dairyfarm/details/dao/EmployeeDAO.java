package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee,Integer> {

}
