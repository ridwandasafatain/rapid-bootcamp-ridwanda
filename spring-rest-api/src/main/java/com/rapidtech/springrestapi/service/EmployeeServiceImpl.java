package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.entity.EmployeeEntity;
import com.rapidtech.springrestapi.model.Category;
import com.rapidtech.springrestapi.model.Employee;
import com.rapidtech.springrestapi.repository.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepo repo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo repo){
        this.repo = repo;
    }

    @Override
    public List<Employee> getAll() {
        return this.repo.findAll().stream().map(Employee::new)
                .collect(Collectors.toList());

    }


    @Override
    public Optional<Employee> getById(Long id) {
        if(id == 0) {
            return Optional.empty();
        }
        Optional<EmployeeEntity> result = this.repo.findById(id);
        /*
        if(result.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(new EmployeeModel(result.get()));
         */
        return result.map(Employee::new);

    }

    @Override
    public Optional<Employee> save(Employee model) {
        if(model == null) {
            return Optional.empty();
        }
        EmployeeEntity entity = new EmployeeEntity(model);
        try {
            this.repo.save(entity);
            return Optional.of(new Employee(entity));
        }catch (Exception e){
            log.error("Employee save is failed, error: {}", e.getMessage());
            return Optional.empty();
        }

    }

    @Override
    public Optional<Employee> update(Long id, Employee model) {
        if(id == 0) {
            return Optional.empty();
        }

        EmployeeEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        // copy property
        BeanUtils.copyProperties(model, result);
        try {
            this.repo.save(result);
            return Optional.of(new Employee(result));
        }catch (Exception e){
            log.error("Employee update is failed, error: {}", e.getMessage());
            return Optional.empty();
        }

    }

    @Override
    public Optional<Employee> delete(Long id) {
        if(id == 0) {
            return Optional.empty();
        }

        EmployeeEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        try {
            this.repo.delete(result);
            return Optional.of(new Employee(result));
        }catch (Exception e){
            log.error("Employee delete is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

}

