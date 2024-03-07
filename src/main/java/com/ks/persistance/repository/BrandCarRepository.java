package com.ks.persistance.repository;

import com.ks.domain.pojo.BrandCarPojo;
import com.ks.domain.repository.IBrandCarRepository;
import com.ks.persistance.entity.BrandCarEntity;
import com.ks.persistance.mapper.IBrandCarMapper;
import com.ks.persistance.repository.IBrandCarCrudRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * Reposotorio de Marca Carro
 */
@Repository
public class BrandCarRepository implements IBrandCarRepository{
    
    /**
     * CRUD de Marca Carro
     */
    private final IBrandCarCrudRepository iBrandCarCrudRepository;
    /**
     * Mapper de Marca Carro
     */
    private final IBrandCarMapper iBrandCarMapper;

    public BrandCarRepository(IBrandCarCrudRepository iBrandCarCrudRepository, IBrandCarMapper iBrandCarMapper) {
        this.iBrandCarCrudRepository = iBrandCarCrudRepository;
        this.iBrandCarMapper = iBrandCarMapper;
    }
    /**
     * Devuelve una lista con todas las marcas de carros
     * @return Lista con marcas de carros
     */
    @Override
    public List<BrandCarPojo> getAll() {
        return iBrandCarMapper.toMarcaCarroPojo(iBrandCarCrudRepository.findAll());
    }
    /**
     * Devuelve una marca de carro dada su id
     * @param id Id de marca carro 
     * @return Optional del marca carro
     */
    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return iBrandCarCrudRepository.findById(id)
        .map(iBrandCarMapper::toMarcaCarroPojo);
    }
    /**
     * Guarda una nueva marca coche
     * @param newBrandCar Marca coche a guardar
     * @return Marca coche guardada
     */
    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        BrandCarEntity brandCarEntity = iBrandCarMapper.toMarcaCarroPojo(newBrandCar);
        return iBrandCarMapper.toMarcaCarroPojo(iBrandCarCrudRepository.save(brandCarEntity));

    }
    /**
     * Elimina una marca coche dada su id
     * @param idBrandCar Id del marca coche a eliminar
     */
    @Override
    public void delete(Integer idBrandCar) {
        iBrandCarCrudRepository.deleteById(idBrandCar);
    }
    
}
