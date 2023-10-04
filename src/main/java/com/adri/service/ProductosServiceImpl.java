package com.adri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.dao.ProductosDao;
import com.adri.model.Producto;

/**
 * @author Adrian Armesto
 * 
 * @see ProductosServices
 * @see ProductosDao
 * 
 * Clase que implementa la interfaz con los metodos listar, actualizar y obtener el precio
 * 
 * @param actualizar Buscamos al producto por su id, si existe actualizamos su stock y con el save lo guardamos
 * @param obtenerPrecio Buscamos al producto por su id y devolvemos su precio
 * 
 *  */

@Service
public class ProductosServiceImpl implements ProductosServices{

    @Autowired
    ProductosDao dao;

    @Override
    public List<Producto> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(int codigoproducto, int stock) {
        
        Producto producto = dao.findById(codigoproducto).orElse(null);
        if(producto != null){
            producto.setStock(producto.getStock()-stock);
            dao.save(producto);
        }
    }

    @Override
    public double obtenerPrecio(int codigoproducto) {
       Producto producto = dao.findById(codigoproducto).orElse(null);
       if(producto != null) return producto.getPrecioUnitario();
        else return 0;
       

    }

    @Override
    public Producto buscar(int codigoproducto) {
       
        return dao.findById(codigoproducto).orElse(null);
    }

    @Override
    public int buscarStock(int codigoproducto) {
        Producto producto = dao.findById(codigoproducto).orElse(null);
        if(producto != null) return producto.getStock();
        else return 0;

    }
    
}
