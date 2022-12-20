package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getAll();
    Optional<Category>  getById(int id);
    Optional<Category> save(Category model);
    Optional<Category> update(Integer id, Category model);
    Optional<Category> delete(Integer id);

}
