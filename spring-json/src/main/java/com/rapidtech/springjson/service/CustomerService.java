package com.rapidtech.springjson.service;

import com.rapidtech.springjson.model.CustomerReq;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<CustomerReq> getAll();
    Optional<CustomerReq> getById(Long id);
    Optional<CustomerReq> save(CustomerReq model);
    Optional<CustomerReq> update(Long id, CustomerReq model);
    Optional<CustomerReq> delete(Long id);
}
