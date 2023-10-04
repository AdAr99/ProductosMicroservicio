package com.adri.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    private int codigoproducto;
    private String producto;
    private double preciounitario;
    private int stock;
    
    public Producto() {
    }

    public Producto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public Producto(int codigoproducto, String producto, double preciounitario, int stock) {
        this.codigoproducto = codigoproducto;
        this.producto = producto;
        this.preciounitario = preciounitario;
        this.stock = stock;
    }

    public int getCodigoProducto() {
        return codigoproducto;
    }

    public void setCodigoProducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioUnitario() {
        return preciounitario;
    }

    public void setPrecioUnitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    

    
}
