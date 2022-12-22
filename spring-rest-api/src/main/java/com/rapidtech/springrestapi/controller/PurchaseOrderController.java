package com.rapidtech.springrestapi.controller;

import com.rapidtech.springrestapi.model.PurchaseOrder;
import com.rapidtech.springrestapi.model.ResponseModel;
import com.rapidtech.springrestapi.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchaseOrder")

public class PurchaseOrderController {
    private PurchaseOrderService service;

    @Autowired
    public PurchaseOrderController(PurchaseOrderService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> get(){
        List<PurchaseOrder> result = service.getAll();
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id){
        Optional<PurchaseOrder> result = service.getById(id);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @PostMapping()
    public ResponseEntity<Object> savePurchaseOrder(@RequestBody PurchaseOrder request){
        Optional<PurchaseOrder> result = service.save(request);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> updatePurchaseOrder(@PathVariable("id") Long id, @RequestBody PurchaseOrder request){
        Optional<PurchaseOrder> result = service.update(id, request);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id){
        Optional<PurchaseOrder> result = service.delete(id);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

}
