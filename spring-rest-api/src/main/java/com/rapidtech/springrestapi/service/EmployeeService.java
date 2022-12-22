package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAll();
    Optional<Employee>  getById(Long id);
    Optional<Employee> save(Employee model);
    Optional<Employee> update(Long id, Employee model);
    Optional<Employee> delete(Long id);

}
