package com.rapidtech.springrestapi.model;

import com.rapidtech.springrestapi.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String code;
    private String name;
    private Double price;
    private Integer categoryId;
    private String categoryName;

    public Product(ProductEntity entity){
        /*
        this.id = entity.getId();
        this.code = entity.getCode();
        this.name = entity.getName();
        this.price = entity.getPrice();
        this.categoryId = entity.getCategoryId();*/
        BeanUtils.copyProperties(entity, this);
        if(entity.getCategory() != null) {
            this.categoryName = entity.getCategory().getName();
        }
    }

}
