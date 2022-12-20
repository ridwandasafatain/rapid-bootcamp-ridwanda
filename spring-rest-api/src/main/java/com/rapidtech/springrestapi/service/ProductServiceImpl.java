package com.rapidtech.springrestapi.service;

import com.rapidtech.springrestapi.entity.ProductEntity;
import com.rapidtech.springrestapi.model.Product;
import com.rapidtech.springrestapi.repository.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService{
    private ProductRepo repo;

    @Autowired
    public ProductServiceImpl(ProductRepo repo){
        this.repo = repo;
    }

    @Override
    public List<Product> getAll() {
        return this.repo.findAll().stream().map(Product::new)
                .collect(Collectors.toList());

    }

    @Override
    public Optional<Product> getById(Integer id) {
        if(id == 0) {
            return Optional.empty();
        }
        Optional<ProductEntity> result = this.repo.findById(id);
        /*
        if(result.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(new ProductModel(result.get()));
         */
        return result.map(Product::new);

    }

    @Override
    public Optional<Product> save(Product model) {
        if(model == null) {
            return Optional.empty();
        }
        ProductEntity entity = new ProductEntity(model);
        try {
            this.repo.save(entity);
            return Optional.of(new Product(entity));
        }catch (Exception e){
            log.error("Product save is failed, error: {}", e.getMessage());
            return Optional.empty();
        }

    }

    @Override
    public Optional<Product> update(Integer id, Product model) {
        if(id == 0) {
            return Optional.empty();
        }

        ProductEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        // copy property
        BeanUtils.copyProperties(model, result);
        try {
            this.repo.save(result);
            return Optional.of(new Product(result));
        }catch (Exception e){
            log.error("Product update is failed, error: {}", e.getMessage());
            return Optional.empty();
        }

    }

    @Override
    public Optional<Product> delete(Integer id) {
        if(id == 0) {
            return Optional.empty();
        }

        ProductEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        try {
            this.repo.delete(result);
            return Optional.of(new Product(result));
        }catch (Exception e){
            log.error("Product delete is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

}

