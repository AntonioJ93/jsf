/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.tarea3_producesfactura_anotaciones.modelo;

/**
 *
 * @author pryet
 */

public class LineaFactura {
    private Producto producto;
    private int cantidad;

    public LineaFactura() {
    }

    public LineaFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
