package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.model.PurchaseOrder;

import java.util.List;
import java.util.Optional;

public interface PurchaseOrderService {
    List<PurchaseOrder> getAll();
    Optional<PurchaseOrder> getById(Long id);
    Optional<PurchaseOrder> save(PurchaseOrder model);
    Optional<PurchaseOrder> update(Long id, PurchaseOrder model);
    Optional<PurchaseOrder> delete(Long id);

}
