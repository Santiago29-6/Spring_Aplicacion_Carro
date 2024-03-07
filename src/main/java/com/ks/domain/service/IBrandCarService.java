package com.ks.domain.service;

import java.util.List;
import java.util.Optional;

import com.ks.domain.pojo.BrandCarPojo;

public interface IBrandCarService {
    /**
     * Devuelve una lista con todos las marcas de coches
     * @return Lista con marcas de coches
     */
    List<BrandCarPojo> getAll();

    /**
     * Devuelve una marca de coches dada su id
     * @param id Id de la marca corre
     * @return Optional de la marca carro encontrada
     */
    Optional<BrandCarPojo> getBrandCar (Integer id);

    /**
     * Guarda una nueva marca carro
     * @param newBrandCar Marca carro a guardar
     * @return Marca carro guardada
     */
    BrandCarPojo save(BrandCarPojo newBrandCar);

    /**
     * Elimina una marca carro dada su id
     * @param idBrandCar Id de la marca carro a eliminar
     */
    Boolean delete (Integer idBrandCar);
}
