package com.rapidtech.springrestapi.model;

import com.rapidtech.springrestapi.entity.ShipperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipper {
    private Long id;
    private String shipperName;
    private String phone;

    public Shipper(ShipperEntity entity) {
        BeanUtils.copyProperties(entity,this);
    }
}
