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
public class Compra {
    
  private  Cliente cliente;
   private int idCompra;
   private CarritoCompras carritoComprado;
   private Date fechacompra;

    public Compra(Cliente cliente, int idCompra, CarritoCompras carritoComprado, Date fechacompra) {
        this.cliente = cliente;
        this.idCompra = idCompra;
        this.carritoComprado = carritoComprado;
        this.fechacompra = fechacompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public CarritoCompras getCarritoComprado() {
        return carritoComprado;
    }

    public void setCarritoComprado(CarritoCompras carritoComprado) {
        this.carritoComprado = carritoComprado;
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }
    
   
   
}
