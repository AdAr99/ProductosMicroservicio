package com.adri.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adri.model.Producto;

public interface ProductosDao extends JpaRepository<Producto,Integer>{
    
}
