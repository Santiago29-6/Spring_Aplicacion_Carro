package com.ks.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ks.persistance.entity.BrandCarEntity;

public interface IBrandCarCrudRepository extends JpaRepository<BrandCarEntity,Integer>{
    
    
}