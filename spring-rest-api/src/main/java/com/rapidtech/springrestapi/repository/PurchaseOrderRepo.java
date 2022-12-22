package com.rapidtech.springrestapi.repository;

import com.rapidtech.springrestapi.entity.PurchaseOrderEntity;
import com.rapidtech.springrestapi.entity.ShipperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrderEntity, Long> {

}
