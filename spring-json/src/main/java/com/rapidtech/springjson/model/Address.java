package com.rapidtech.springjson.model;

import com.rapidtech.springjson.entity.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Long id;
    private String name;
    private String address;
    private String village;
    private String district;
    private String city;
    private String province;

    public Address(AddressEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
