package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.entity.EmployeeEntity;
import com.rapidtech.springrestapi.entity.ShipperEntity;
import com.rapidtech.springrestapi.model.Employee;
import com.rapidtech.springrestapi.model.Shipper;
import com.rapidtech.springrestapi.repository.ShipperRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ShipperServiceImpl implements ShipperService{
    private ShipperRepo repo;

    @Autowired
    public ShipperServiceImpl(ShipperRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Shipper> getAll() {
        return this.repo.findAll().stream().map(Shipper::new).collect(Collectors.toList());
    }

    @Override
    public Optional<Shipper> getById(Long id) {
        if(id==0) {
            return Optional.empty();
        }
        Optional<ShipperEntity> result = this.repo.findById(id);
        return result.map(Shipper::new);
    }

    @Override
    public Optional<Shipper> save(Shipper model) {
        if(model==null) {
            return Optional.empty();
        }
        ShipperEntity entity = new ShipperEntity(model);
        try {
            this.repo.save(entity);
            return Optional.of(new Shipper(entity));
        }catch (Exception e){
            log.error("Shipper save if failed, error :{}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<Shipper> update(Long id, Shipper model) {
        if(id==0) {
            return Optional.empty();
        }
        ShipperEntity entity = this.repo.findById(id).orElse(null);
        if(entity==null){
            return Optional.empty();
        }
        BeanUtils.copyProperties(model, entity);
        try {
            this.repo.save(entity);
            return Optional.of(new Shipper(entity));
        }catch (Exception e){
            log.error("Employee update is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<Shipper> delete(Long id) {
        if(id == 0) {
            return Optional.empty();
        }

        ShipperEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        try {
            this.repo.delete(result);
            return Optional.of(new Shipper(result));
        }catch (Exception e){
            log.error("Employee delete is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }
}
