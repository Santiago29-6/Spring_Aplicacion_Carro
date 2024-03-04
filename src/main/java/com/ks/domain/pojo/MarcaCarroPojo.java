package com.ks.domain.pojo;

import jakarta.persistence.Entity;
import lombok.*;

/**
 * Pojo de marca carro
 */

@Getter
@Setter
@Entity
public class MarcaCarroPojo {
    /**
     * Id de la marca de carro
     */
    private Integer id;
    /**
     * Descripción de la marca
     */
    private String descript;
}
