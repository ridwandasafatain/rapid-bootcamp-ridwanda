package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.model.Category;
import com.rapidtech.springrestapi.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAll();
    Optional<Customer>  getById(int id);
    Optional<Customer> save(Customer model);
    Optional<Customer> update(Integer id, Customer model);
    Optional<Customer> delete(Integer id);

}