package com.ks.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ks.domain.pojo.BrandCarPojo;
import com.ks.domain.repository.IBrandCarRepository;

import lombok.RequiredArgsConstructor;

/**
 * Servicio de marca coche
 */
@RequiredArgsConstructor
@Service
public class BrandCarService implements IBrandCarService{

    private final IBrandCarRepository iBrandCarRepository;

    @Override
    public List<BrandCarPojo> getAll() {
        return iBrandCarRepository.getAll();
    }

    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return iBrandCarRepository.getBrandCar(id);
    }

    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
       return iBrandCarRepository.save(newBrandCar);
    }

    @Override
    public Boolean delete(Integer idBrandCar) {
        try{
            iBrandCarRepository.delete(idBrandCar);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
}
