/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

/**
 *
 * @author Nvidi
 */
public class Item {
    private Producto producto;
    private int cantidad;
    private int consecutivo;
    
    public Item(){};
    
    public Item(int cantidad,Producto producto,int consecutivo){
        this.producto = producto;
        this.cantidad = cantidad;
        this.consecutivo = consecutivo;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
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
