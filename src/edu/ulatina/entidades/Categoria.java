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
 * @author Nvidi
 */
public class Categoria implements Icrud{
    private String categoria;
    private String descripcion;
    private List<Producto> productos;
    
    //Descripcion de algo importante que quiero pushear 
    public Categoria(String categoria, String descripcion) {
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.productos = new ArrayList<>();
    }
    
    public Categoria(){};
    
    public List<Producto> getProductos() {
        return productos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean create(Object newData) {
        try{
            Producto temp = ((Producto)newData);
            this.productos.add(temp);
            return true; 
        }catch(Exception e){
             System.err.println(""+e.getMessage());
            return false;
        }
    }

    @Override
    public List<Object> read(String parameter, String value, List<?> data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(int index, Object newData) {
       List<Producto> dummyList = new ArrayList<>();
       for(Producto p: this.productos){
           if(this.productos.indexOf(p)!=index){
               dummyList.add(p);
           }
       }
       if(dummyList.stream().filter(x->x.getNombre().equals(((Producto)newData).getNombre())).count()==0){
           this.productos.set(index, (Producto)newData);
           return true;
       }else{
           return false;
       }
    }

    @Override
    public boolean delete(int index, Object data) {
        this.productos.remove(index);
        return true;
    }
    //Clear completo de la lista de productos
    public void clearProductos(){
        this.productos = new ArrayList<>();
    }
    
}
