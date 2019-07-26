/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class CarritoCompras {
    
    private int idCarrito;
    private List<Producto> Productos =new ArrayList<>();
    private List<Integer> cantidad = new ArrayList<>();
    private Date fechaAgregada;

    public CarritoCompras(int idCarrito, Date fechaAgregada) {
        this.idCarrito = idCarrito;
        this.fechaAgregada = fechaAgregada;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public List<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(List<Producto> Productos) {
        this.Productos = Productos;
    }

    public List<Integer> getCantidad() {
        return cantidad;
    }

    public void setCantidad(List<Integer> cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaAgregada() {
        return fechaAgregada;
    }

    public void setFechaAgregada(Date fechaAgregada) {
        this.fechaAgregada = fechaAgregada;
    }
    
    public void addProducto(Producto producto){
         Productos.add(producto);
    }
    
    public void addCantidad(int Cantidad){
        cantidad.add(Cantidad);
    }
    
    public void delProducto(Producto producto){
         Productos.remove(producto);
    }
    
    public void delCantidad(int Cantidad){
         cantidad.remove(Cantidad);
    }
    
    
    public void editCantidad(Integer pos, int cant){
        cantidad.set(pos, cant);
    }
    
    
    
    
}
