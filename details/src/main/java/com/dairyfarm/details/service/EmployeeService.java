package com.dairyfarm.details.service;

import com.dairyfarm.details.dao.EmployeeDAO;
import com.dairyfarm.details.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    public Employee addEmployee(Employee employee){
        return employeeDAO.save(employee);
    }
    public List<Employee> findAllEmployee(){
        return employeeDAO.findAll();
    }
    public Optional<Employee> findEmployeeById(Integer id){
        return employeeDAO.findById(id);
    }
    public Employee updateEmployee(Employee employee){
        return employeeDAO.save(employee);
    }
    public void deleteEmployee(Integer id){
        employeeDAO.deleteById(id);
    }



}
