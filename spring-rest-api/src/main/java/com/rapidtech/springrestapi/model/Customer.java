package com.rapidtech.springrestapi.model;

import com.rapidtech.springrestapi.entity.CustomerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String fullName;
    private String address;
    private String city;
    private String gender;
    private Date dateOfBirth;
    private String dateOfPlace;

    public Customer(CustomerEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
