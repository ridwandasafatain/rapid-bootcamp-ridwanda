package com.rapidtech.springrestapi.repository;

import com.rapidtech.springrestapi.entity.ProductEntity;
import com.rapidtech.springrestapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
