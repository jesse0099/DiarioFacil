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
    private List<Producto> productos;
    

    public Inventario() {
        
        productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    
    public void addProducto(Producto producto){
        productos.add(producto);
    }
    
     public void delProducto(Producto producto){
        productos.remove(producto);
    }
     
    public Producto busqProducto(int codigo){
  
       return productos.get(codigo-1);
        
    }
    
  
}
