package com.rapidtech.springrestapi.repository;

import com.rapidtech.springrestapi.entity.PurchaseOrderDetailEntity;
import com.rapidtech.springrestapi.entity.PurchaseOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderDetailRepo extends JpaRepository<PurchaseOrderDetailEntity, Long> {

}
