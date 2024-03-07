package com.ks.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ks.domain.service.IBrandCarService;
import com.ks.domain.pojo.*;
import java.util.*;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/marcas-carros")
public class BrandCarController {
    /**
     * Servicio de marca carro
     */
    private final IBrandCarService iBrandCarService;

    @GetMapping("/")
    public ResponseEntity<List<BrandCarPojo>> getAll(){
        return ResponseEntity.ok(iBrandCarService.getAll());
        /**
        return ResponseEntity.status(HttpStatus.OK)
        .body(iBrandCarService.getAll()); 

        return new ResponseEntity<>(iBrandCarService.getAll(),HttpStatus.OK);
        */
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandCarPojo> getBrandCar(@PathVariable Integer id){
        return ResponseEntity.of(iBrandCarService.getBrandCar(id));
    }

    public ResponseEntity<BrandCarPojo> save(@RequestBody BrandCarPojo newBrandCarPojo){
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
            .body(iBrandCarService.save(newBrandCarPojo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(null);
        }
    }
}
