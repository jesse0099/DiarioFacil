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
    private String nombreCarrito;

    public String getNombreCarrito() {
        return nombreCarrito;
    }

    public void setNombreCarrito(String nombreCarrito) {
        this.nombreCarrito = nombreCarrito;
    }

    public List<Item> getProductos() {
        return Productos;
    }

    public void setProductos(List<Item> Productos) {
        this.Productos = Productos;
    }
    private List<Item> Productos =new ArrayList<>();
    private Date fechaAgregada;
    private Cliente cliente;
    
    public CarritoCompras(Date fechaAgregado,Cliente cliente,String nombreCarrito,int IdCarrito){
        this.Productos = new ArrayList<>();
        this.fechaAgregada = fechaAgregado;
        this.cliente = cliente;
        this.nombreCarrito = nombreCarrito;
        this.idCarrito = IdCarrito;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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

    public Date getFechaAgregada() {
        return fechaAgregada;
    }

    public void setFechaAgregada(Date fechaAgregada) {
        this.fechaAgregada = fechaAgregada;
    }
    
    public void delProducto(Producto producto){
         Productos.remove(producto);
    }

}
