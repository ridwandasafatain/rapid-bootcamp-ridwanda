package com.rapidtech.springrestapi.repository;

import com.rapidtech.springrestapi.entity.EmployeeEntity;
import com.rapidtech.springrestapi.entity.ShipperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepo extends JpaRepository<ShipperEntity, Long> {

}
