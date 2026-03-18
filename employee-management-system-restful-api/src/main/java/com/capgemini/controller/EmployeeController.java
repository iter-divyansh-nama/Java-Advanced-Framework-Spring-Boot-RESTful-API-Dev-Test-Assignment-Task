package com.capgemini.controller;

import com.capgemini.model.entity.Employee;
import com.capgemini.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // =========================
    // CREATE SINGLE EMPLOYEE
    // =========================
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // =========================
    // CREATE MULTIPLE EMPLOYEES (BULK)
    // =========================
    @PostMapping("/bulk")
    public List<Employee> createEmployees(@RequestBody List<Employee> employees) {
        return employeeService.saveAllEmployees(employees);
    }

    // =========================
    // GET ALL EMPLOYEES
    // =========================
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // =========================
    // GET EMPLOYEE BY ID
    // =========================
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // =========================
    // UPDATE EMPLOYEE
    // =========================
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    // =========================
    // DELETE EMPLOYEE
    // =========================
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}