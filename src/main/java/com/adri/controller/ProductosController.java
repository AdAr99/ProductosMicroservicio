package com.adri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adri.model.Producto;
import com.adri.service.ProductosServices;

@RestController
public class ProductosController {
    
    @Autowired
    ProductosServices service;

    @GetMapping(value = "producto", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> lista(){
        return service.listar();
    }

    @PutMapping(value="producto/{codigoproducto}/{stock}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@PathVariable int codigoproducto, @PathVariable int stock){
            service.actualizar(codigoproducto, stock);
    }

    @GetMapping(value = "producto/{codigoproducto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public double obtenerPrecio(@PathVariable int codigoproducto){
        return service.obtenerPrecio(codigoproducto);
    }

}
