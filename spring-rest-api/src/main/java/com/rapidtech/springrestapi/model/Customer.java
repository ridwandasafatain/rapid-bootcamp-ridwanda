package com.rapidtech.springrestapi.model;

import com.rapidtech.springrestapi.entity.CustomerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long id;
    private String fullName;
    private String address;
    private String city;
    private String gender;

    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date dateOfBirth;
    private String dateOfPlace;

    public Customer(CustomerEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
