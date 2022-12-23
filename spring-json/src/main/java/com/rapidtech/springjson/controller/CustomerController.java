package com.rapidtech.springjson.controller;

import com.rapidtech.springjson.entity.CustomerEntity;
import com.rapidtech.springjson.model.CustomerDetail;
import com.rapidtech.springjson.model.CustomerReq;
import com.rapidtech.springjson.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
        List<CustomerDetail> result = service.getAll();
        return ResponseEntity.ok().body(result);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveCustomer(@RequestBody CustomerDetail model){
        Optional<CustomerDetail> result = service.save(model);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/saveAll")
    public ResponseEntity<Object> saveAll(@RequestBody CustomerReq request){
        return ResponseEntity.ok().body(service.saveAll(request));
    }

}
