package com.ks.persistance.mapper;

import java.util.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import com.ks.domain.pojo.MarcaCarroPojo;
import com.ks.persistance.entity.MarcaCarroEntity;
/**
 * Mapper que trasforma objetos de MarcaCarro a POJOS o entidades
 */
@Mapper(componentModel = "spring")
public interface IMarcaCarroMapper {
    /**
     * Convierte una entidad a un POJO de marca carro
     * @param marca Entidad a convertir
     * @return POJO convertido
     */
    MarcaCarroPojo toMarcaCarroPojo(MarcaCarroEntity marca);

    /**
     * Covierte un POJO  a una entidad de marca carro
     * @param marcaPojo POJO a convertir
     * @return Entity convertido
     */
    @InheritInverseConfiguration
    MarcaCarroEntity toMarcaCarroEntity(MarcaCarroPojo marcaPojo);

    /**
     * Retorna una lista de marcas coche transformada a POJO de una lista de entidades
     * @param marcasCarro Entidad a transformar
     * @return Lista transformada
     */
    List<MarcaCarroPojo> toMarcaCarroPojo(List<MarcaCarroEntity>marcasCarro);
}
