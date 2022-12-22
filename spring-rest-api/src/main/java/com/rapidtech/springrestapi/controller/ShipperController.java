package com.rapidtech.springrestapi.controller;

import com.rapidtech.springrestapi.model.Shipper;
import com.rapidtech.springrestapi.model.ResponseModel;
import com.rapidtech.springrestapi.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shippers")

public class ShipperController {
    private ShipperService service;

    @Autowired
    public ShipperController(ShipperService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> get(){
        List<Shipper> result = service.getAll();
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id){
        Optional<Shipper> result = service.getById(id);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @PostMapping()
    public ResponseEntity<Object> saveShipper(@RequestBody Shipper request){
        Optional<Shipper> result = service.save(request);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> updateShipper(@PathVariable("id") Long id, @RequestBody Shipper request){
        Optional<Shipper> result = service.update(id, request);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id){
        Optional<Shipper> result = service.delete(id);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

}
