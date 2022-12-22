package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.entity.PurchaseOrderDetailEntity;
import com.rapidtech.springrestapi.entity.PurchaseOrderEntity;
import com.rapidtech.springrestapi.entity.ShipperEntity;
import com.rapidtech.springrestapi.model.PurchaseOrder;
import com.rapidtech.springrestapi.model.Shipper;
import com.rapidtech.springrestapi.repository.PurchaseOrderDetailRepo;
import com.rapidtech.springrestapi.repository.PurchaseOrderRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PurchaseOrderServiceImpl implements PurchaseOrderService{
    private PurchaseOrderRepo repo;
    private PurchaseOrderDetailRepo detailRepo;

    @Autowired
    public PurchaseOrderServiceImpl(PurchaseOrderRepo repo, PurchaseOrderDetailRepo detailRepo) {
        this.repo = repo;
        this.detailRepo = detailRepo;
    }

    @Override
    public List<PurchaseOrder> getAll() {
        return this.repo.findAll().stream().map(PurchaseOrder::new).collect(Collectors.toList());
    }

    @Override
    public Optional<PurchaseOrder> getById(Long id) {
        if(id==0) {
            return Optional.empty();
        }
        Optional<PurchaseOrderEntity> result = this.repo.findById(id);
        return result.map(PurchaseOrder::new);
    }

    @Override
    public Optional<PurchaseOrder> save(PurchaseOrder model) {
        if(model==null || model.getDetails().isEmpty()) {
            return Optional.empty();
        }
        PurchaseOrderEntity entity = new PurchaseOrderEntity(model);
        entity.addDetailList(model.getDetails());
        try {
            repo.save(entity);
            return Optional.of(model);
        }catch (Exception e){
            log.error("Shipper save if failed, error :{}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<PurchaseOrder> update(Long id, PurchaseOrder model) {
        if(id==0) {
            return Optional.empty();
        }
        PurchaseOrderEntity entity = this.repo.findById(id).orElse(null);
        if(entity==null){
            return Optional.empty();
        }
        BeanUtils.copyProperties(model, entity);
        try {
            this.repo.save(entity);
            return Optional.of(new PurchaseOrder(entity));
        }catch (Exception e){
            log.error("Employee update is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<PurchaseOrder> delete(Long id) {
        if(id == 0) {
            return Optional.empty();
        }

        PurchaseOrderEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        try {
            this.repo.delete(result);
            return Optional.of(new PurchaseOrder(result));
        }catch (Exception e){
            log.error("Employee delete is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }
}
