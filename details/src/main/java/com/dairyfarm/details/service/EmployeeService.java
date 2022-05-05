package com.dairyfarm.details.service;

import com.dairyfarm.details.dao.EmployeeDAO;
import com.dairyfarm.details.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeDAO employeedao;
    @Autowired
    public EmployeeService(EmployeeDAO employeeDAO, EmployeeDAO employeedao) {
        this.employeedao = employeedao;
    }
    public Employee addEmployee(Employee employee){
        return employeedao.save(employee);
    }
    public List<Employee> findAllEmployee(){
        return employeedao.findAll();
    }
    public Optional<Employee> findEmployeeById(Integer id){
        return employeedao.findById(id);
    }
    public Employee updateEmployee(Employee employee){
        return employeedao.save(employee);
    }
    public void deleteEmployee(Integer id){
        employeedao.deleteById(id);
    }


    public Optional<List<Employee>> findEmployeeByRole(String role) {
        return employeedao.findEmployeeByRole(role);
    }
}
