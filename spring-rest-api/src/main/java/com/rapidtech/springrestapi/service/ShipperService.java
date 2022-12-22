package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.model.Employee;
import com.rapidtech.springrestapi.model.Shipper;

import java.util.List;
import java.util.Optional;

public interface ShipperService {
    List<Shipper> getAll();
    Optional<Shipper>  getById(Long id);
    Optional<Shipper> save(Shipper model);
    Optional<Shipper> update(Long id, Shipper model);
    Optional<Shipper> delete(Long id);

}
