package com.example.springbootcrud.service;

import java.util.List;

import com.example.springbootcrud.dao.EmployeeDAO;
import com.example.springbootcrud.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDAO employeeDAO;

  @Transactional
  @Override
  public List<Employee> get() {
    // TODO Auto-generated method stub

    return employeeDAO.get();
  }

  @Transactional
  @Override
  public Employee get(int id) {
    // TODO Auto-generated method stub
    return employeeDAO.get(id);
  }

  @Transactional
  @Override
  public void save(Employee employee) {
    // TODO Auto-generated method stub
    employeeDAO.save(employee);
  }

  @Transactional
  @Override
  public void delete(int id) {
    // TODO Auto-generated method stub
    employeeDAO.delete(id);
  }

}
