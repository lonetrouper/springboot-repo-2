package com.example.springbootcrud.dao;

import java.util.List;

import com.example.springbootcrud.model.Employee;

public interface EmployeeDAO {

  List<Employee> get();

  Employee get(int id);

  void save(Employee employee);

  void delete(int id);
}
