package com.enggdream.springhybernate.dao;

import java.util.List;

import com.enggdream.springhybernate.model.Employee;
 
public interface EmployeeDao {
 
    Employee findById(int id);
 
    void saveEmployee(Employee employee);
     
    void deleteEmployeeBySsn(String ssn);
     
    List<Employee> findAllEmployees();
 
    Employee findEmployeeBySsn(String ssn);
 
}