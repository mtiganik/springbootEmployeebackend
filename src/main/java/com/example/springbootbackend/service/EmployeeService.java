package com.example.springbootbackend.service;
import com.example.springbootbackend.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employee);

    Map<String, Boolean> deleteEmployee( Long id);

}
