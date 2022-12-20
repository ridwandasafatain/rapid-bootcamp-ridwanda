package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll();
    Optional<Product> getById(Integer id);
    Optional<Product> save(Product model);
    Optional<Product> update(Integer id, Product model);
    Optional<Product> delete(Integer id);

}
