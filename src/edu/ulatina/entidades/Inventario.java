/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Inventario{
    private List<Item> productos;  
    
    public Inventario(){
        this.productos = new ArrayList<>();
    };
    
    public Inventario(List<Item> productos){
        this.productos = productos;
    }
    
    public List<Item> getProductos() {
        return productos;
    }

    public void setProductos(List<Item> productos) {
        this.productos = productos;
    }
}
