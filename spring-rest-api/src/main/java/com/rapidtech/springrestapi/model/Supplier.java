package com.rapidtech.springrestapi.model;

import com.rapidtech.springrestapi.entity.SupplierEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    private Long id;
    private String supplierName;
    private String contactName;
    private String address;
    private String city;
    private String country;
    private String postalCode;
    private String phone;

    public Supplier(SupplierEntity entity) {
        BeanUtils.copyProperties(entity,this);
    }
}
