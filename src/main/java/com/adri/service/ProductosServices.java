package com.adri.service;

import java.util.List;

import com.adri.model.Producto;

public interface ProductosServices {

    List<Producto> listar();
    Producto buscar(int codigoproducto);
    void actualizar(int codigoproducto, int stock);
    double obtenerPrecio(int codigoproducto);
    int buscarStock(int codigoproducto);
}
