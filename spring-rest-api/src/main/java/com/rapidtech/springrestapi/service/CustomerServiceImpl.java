package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.entity.CategoryEntity;
import com.rapidtech.springrestapi.entity.CustomerEntity;
import com.rapidtech.springrestapi.model.Category;
import com.rapidtech.springrestapi.model.Customer;
import com.rapidtech.springrestapi.repository.CustomerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepo repo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Customer> getAll() {
        return this.repo.findAll().stream().map(Customer::new).collect(Collectors.toList());
    }

    @Override
    public Optional<Customer> getById(Long id) {
        if(id==0) {
            return Optional.empty();
        }
        Optional<CustomerEntity> result = this.repo.findById(id);
        return result.map(Customer::new);
    }

    @Override
    public Optional<Customer> save(Customer model) {
        if(model == null) {
            return Optional.empty();
        }
        CustomerEntity entity = new CustomerEntity(model);
        try {
            this.repo.save(entity);
            return Optional.of(new Customer(entity));
        }catch (Exception e){
            log.error("Customer save is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<Customer> update(Long id, Customer model) {
        if(id == 0) {
            return Optional.empty();
        }

        CustomerEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        // copy property
        BeanUtils.copyProperties(model, result);
        try {
            this.repo.save(result);
            return Optional.of(new Customer(result));
        }catch (Exception e){
            log.error("Customer update is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<Customer> delete(Long id) {
        if(id == 0) {
            return Optional.empty();
        }

        CustomerEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        try {
            this.repo.delete(result);
            return Optional.of(new Customer(result));
        }catch (Exception e){
            log.error("Customer delete is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }
}
