package com.rapidtech.springrestapi.repository;

import com.rapidtech.springrestapi.entity.CustomerEntity;
import com.rapidtech.springrestapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {
}
