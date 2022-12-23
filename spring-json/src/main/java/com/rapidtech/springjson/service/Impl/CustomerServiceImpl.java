package com.rapidtech.springjson.service.Impl;

import com.rapidtech.springjson.entity.CustomerEntity;
import com.rapidtech.springjson.model.CustomerDetail;
import com.rapidtech.springjson.model.CustomerReq;
import com.rapidtech.springjson.model.CustomerRes;
import com.rapidtech.springjson.repository.CustomerRepo;
import com.rapidtech.springjson.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepo repo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<CustomerDetail> getAll() {
        return repo.findAll().stream().map(CustomerDetail::new).collect(Collectors.toList());
    }

    @Override
    public Optional<CustomerDetail> getById(Long id) {
        if(id==0) {
            return Optional.empty();
        }
        Optional<CustomerEntity> result = this.repo.findById(id);
        return Optional.empty();
    }

    @Override
    public CustomerRes saveAll(CustomerReq request) {
        if(request.getCustomers().isEmpty()){
            return new CustomerRes();
        }
        CustomerRes response = new CustomerRes();
        int countSuccess = 0;
        int countFailed = 0;
        List<CustomerDetail> customerModels = new ArrayList<>();
        for(CustomerDetail model : request.getCustomers()){
            Optional<CustomerDetail> customerDetail = this.save(model);
            if(customerDetail.isPresent()){
                customerModels.add(model);
                countSuccess++;
            } else {
                countFailed++;
            }
        }
        response.setData(customerModels);
        response.setSuccessSave(countSuccess);
        response.setFailedSave(countFailed);
        return response;
//        return new CustomerRes(customerModels, countSuccess, countFailed);
    }

    @Override
    public Optional<CustomerDetail> save(CustomerDetail model) {
        if(model==null) {
            return Optional.empty();
        }
        CustomerEntity entity = new CustomerEntity(model);

        if(!model.getAddress().isEmpty()){
            entity.addAddressList(model.getAddress());
        }

        if(!model.getSchools().isEmpty()){
            entity.addSchoolList(model.getSchools());
        }
        try {
            this.repo.save(entity);
            return Optional.of(new CustomerDetail(entity));
        }catch (Exception e){
            log.error("Customer save is failed!, error{}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<CustomerDetail> update(Long id, CustomerDetail model) {
        if(id==0) {
            return Optional.empty();
        }
        CustomerEntity entity = this.repo.findById(id).orElse(null);
        if(entity == null){
            return Optional.empty();
        }
        BeanUtils.copyProperties(model, entity);
        try {
            this.repo.save(entity);
            return Optional.of(new CustomerDetail(entity));
        }catch (Exception e){
            log.error("Update customer failed, {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<CustomerDetail> delete(Long id) {
        if(id==0) {
            return Optional.empty();
        }
        CustomerEntity result = this.repo.findById(id).orElse(null);
        if(result==null){
            return Optional.empty();
        }
        try{
            this.repo.delete(result);
            return Optional.of(new CustomerDetail(result));
        }catch (Exception e) {
            log.error("Customer delete is failed, {}", e.getMessage());
            return Optional.empty();
        }
    }
}
