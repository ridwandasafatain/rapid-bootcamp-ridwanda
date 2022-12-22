package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.entity.SupplierEntity;
import com.rapidtech.springrestapi.model.Supplier;
import com.rapidtech.springrestapi.repository.SupplierRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class SupplierServiceImpl implements SupplierService{
    private SupplierRepo repo;

    @Autowired
    public SupplierServiceImpl(SupplierRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Supplier> getAll() {
        return this.repo.findAll().stream().map(Supplier::new).collect(Collectors.toList());
    }

    @Override
    public Optional<Supplier> getById(Long id) {
        if(id==0) {
            return Optional.empty();
        }
        Optional<SupplierEntity> result = this.repo.findById(id);
        return result.map(Supplier::new);
    }

    @Override
    public Optional<Supplier> save(Supplier model) {
        if(model==null) {
            return Optional.empty();
        }
        SupplierEntity entity = new SupplierEntity(model);
        try {
            this.repo.save(entity);
            return Optional.of(new Supplier(entity));
        }catch (Exception e){
            log.error("Supplier save if failed, error :{}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<Supplier> update(Long id, Supplier model) {
        if(id==0) {
            return Optional.empty();
        }
        SupplierEntity entity = this.repo.findById(id).orElse(null);
        if(entity==null){
            return Optional.empty();
        }
        BeanUtils.copyProperties(model, entity);
        try {
            this.repo.save(entity);
            return Optional.of(new Supplier(entity));
        }catch (Exception e){
            log.error("Employee update is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<Supplier> delete(Long id) {
        if(id == 0) {
            return Optional.empty();
        }

        SupplierEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        try {
            this.repo.delete(result);
            return Optional.of(new Supplier(result));
        }catch (Exception e){
            log.error("Employee delete is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }
}
