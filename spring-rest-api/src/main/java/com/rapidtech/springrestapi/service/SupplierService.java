package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.model.Shipper;
import com.rapidtech.springrestapi.model.Supplier;

import java.util.List;
import java.util.Optional;

public interface SupplierService {
    List<Supplier> getAll();
    Optional<Supplier>  getById(Long id);
    Optional<Supplier> save(Supplier model);
    Optional<Supplier> update(Long id, Supplier model);
    Optional<Supplier> delete(Long id);

}
