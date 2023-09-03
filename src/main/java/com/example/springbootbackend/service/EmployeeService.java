package com.example.springbootbackend.service;
import com.example.springbootbackend.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employee);

    Map<String, Boolean> deleteEmployee( Long id);

}
