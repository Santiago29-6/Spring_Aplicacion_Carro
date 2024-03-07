package com.ks.persistance.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;

import com.ks.domain.pojo.BrandCarPojo;
import com.ks.persistance.entity.BrandCarEntity;

public interface IBrandCarMapper {
        /**
     * Convierte una entidad a un POJO de marca carro
     * @param marca Entidad a convertir
     * @return POJO convertido
     */
    BrandCarPojo toBrandCarPojo(BrandCarEntity marca);

    /**
     * Covierte un POJO  a una entidad de marca carro
     * @param marcaPojo POJO a convertir
     * @return Entity convertido
     */
    @InheritInverseConfiguration
    BrandCarEntity toBrandCarEntity(BrandCarPojo BrandPojo);

    /**
     * Retorna una lista de marcas coche transformada a POJO de una lista de entidades
     * @param marcasCarro Entidad a transformar
     * @return Lista transformada
     */
    List<BrandCarPojo> toMarcaCarroPojo(List<BrandCarEntity> marcasCarroEntity);
}
