package com.rapidtech.springjson.service.Impl;

import com.rapidtech.springjson.entity.CustomerEntity;
import com.rapidtech.springjson.model.CustomerReq;
import com.rapidtech.springjson.repository.CustomerRepo;
import com.rapidtech.springjson.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepo repo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<CustomerReq> getAll() {
        return repo.findAll().stream().map(CustomerReq::new).collect(Collectors.toList());
    }

    @Override
    public Optional<CustomerReq> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerReq> save(CustomerReq model) {
        if(model==null) {
            return Optional.empty();
        }
        CustomerEntity entity = new CustomerEntity(model);
        try {
            repo.save(entity);
            return Optional.of(model);
        }catch (Exception e){
            log.error("Customer save is failed!, error{}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<CustomerReq> update(Long id, CustomerReq model) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerReq> delete(Long id) {
        return Optional.empty();
    }
}
