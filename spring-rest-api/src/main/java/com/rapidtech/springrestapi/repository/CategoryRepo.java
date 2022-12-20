package com.rapidtech.springrestapi.repository;

import com.rapidtech.springrestapi.entity.CategoryEntity;
import com.rapidtech.springrestapi.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer> {

}
