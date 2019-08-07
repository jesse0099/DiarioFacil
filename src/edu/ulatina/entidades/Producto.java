/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

/**
 *
 * @author Daniel
 */
public class Producto {
    
   private String nombre;
   private int codigo;
   private double precio;
   private int existencias;
   private int existenciaMin;

    public Producto(String nombre, int codigo, double precio, int existencias, int existenciaMin) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.existencias = existencias;
        this.existenciaMin = existenciaMin;
    }
    
    public Producto(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public int getExistenciaMin() {
        return existenciaMin;
    }

    public void setExistenciaMin(int existenciaMin) {
        this.existenciaMin = existenciaMin;
    }


    
   
}
