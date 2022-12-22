package com.rapidtech.springrestapi.model;

import com.rapidtech.springrestapi.entity.CustomerEntity;
import com.rapidtech.springrestapi.entity.PurchaseOrderEntity;
import com.rapidtech.springrestapi.entity.ShipperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrder {
    private Long id;
    private String poCode;
    private Long customerId;
    private Long employeeId;
    private Long shipperId;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date poDate;
    private Double totalAmount;
    private List<PurchaseOrderDetail> details;

    public PurchaseOrder(PurchaseOrderEntity entity) {
        BeanUtils.copyProperties(entity,this);
    }
}
