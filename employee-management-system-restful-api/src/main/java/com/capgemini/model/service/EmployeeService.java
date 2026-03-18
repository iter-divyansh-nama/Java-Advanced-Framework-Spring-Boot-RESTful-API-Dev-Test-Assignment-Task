package com.capgemini.model.service;

import com.capgemini.model.entity.Employee;
import com.capgemini.model.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // =========================
    // CREATE SINGLE
    // =========================
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // =========================
    // CREATE MULTIPLE (BULK)
    // =========================
    public List<Employee> saveAllEmployees(List<Employee> employees) {
        return repository.saveAll(employees);
    }

    // =========================
    // READ ALL
    // =========================
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // =========================
    // READ BY ID
    // =========================
    public Employee getEmployeeById(Long id) {
        Optional<Employee> emp = repository.findById(id);
        return emp.orElse(null);
    }

    // =========================
    // UPDATE
    // =========================
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee emp = getEmployeeById(id);
        if (emp != null) {
            emp.setName(updatedEmployee.getName());
            emp.setEmail(updatedEmployee.getEmail());
            emp.setDepartment(updatedEmployee.getDepartment());
            return repository.save(emp);
        }
        return null;
    }

    // =========================
    // DELETE
    // =========================
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}