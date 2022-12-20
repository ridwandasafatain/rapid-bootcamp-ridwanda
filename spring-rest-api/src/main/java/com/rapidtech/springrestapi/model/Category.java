package com.rapidtech.springrestapi.model;

import com.rapidtech.springrestapi.entity.CategoryEntity;
import com.rapidtech.springrestapi.repository.CategoryRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private int id;
    private String code;
    private String name;

    public Category(CategoryEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
