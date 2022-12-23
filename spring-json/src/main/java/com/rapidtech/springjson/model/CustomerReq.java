package com.rapidtech.springjson.model;

import com.rapidtech.springjson.entity.CustomerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerReq {
    private List<CustomerDetail> customers;

    public CustomerReq(CustomerEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
