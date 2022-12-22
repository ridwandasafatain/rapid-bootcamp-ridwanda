package com.rapidtech.springrestapi.repository;

import com.rapidtech.springrestapi.entity.ShipperEntity;
import com.rapidtech.springrestapi.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends JpaRepository<SupplierEntity, Long> {

}
