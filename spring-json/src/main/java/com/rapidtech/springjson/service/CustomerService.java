package com.rapidtech.springjson.service;

import com.rapidtech.springjson.model.CustomerDetail;
import com.rapidtech.springjson.model.CustomerReq;
import com.rapidtech.springjson.model.CustomerRes;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<CustomerDetail> getAll();
    Optional<CustomerDetail> getById(Long id);
    CustomerRes saveAll(CustomerReq request);
    Optional<CustomerDetail> save(CustomerDetail model);
    Optional<CustomerDetail> update(Long id, CustomerDetail model);
    Optional<CustomerDetail> delete(Long id);
}
