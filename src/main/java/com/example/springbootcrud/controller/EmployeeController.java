package com.example.springbootcrud.controller;

import java.util.List;

import com.example.springbootcrud.model.Employee;
import com.example.springbootcrud.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employee")
  public List<Employee> get() {
    return employeeService.get();
  }

  @PostMapping("/employee")
  public Employee save(@RequestBody Employee employeeObj) {
    employeeService.save(employeeObj);
    return employeeObj;
  }

  @GetMapping("/employee/{id}")
  public ResponseEntity<Employee> get(@PathVariable int id) {
    Employee employeeObj = employeeService.get(id);
    if (employeeObj == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    return ResponseEntity.ok(employeeObj);
  }

  @DeleteMapping("/employee/{id}")
  public String delete(@PathVariable int id) {
    employeeService.delete(id);
    return "Deleted Successfully";
  }
}
