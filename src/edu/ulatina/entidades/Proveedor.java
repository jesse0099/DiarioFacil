/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class Proveedor extends Persona {
    
    private List<Producto> productos;
    private String empresa;
    private String numeroContacto;

    public Proveedor(String empresa, String numeroContacto, String cedula, String nombre, String apellido, String email) {
        super(cedula, nombre, apellido, email);
        this.empresa = empresa;
        this.numeroContacto = numeroContacto;
         productos = new ArrayList<>();
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.productos);
        hash = 23 * hash + Objects.hashCode(this.empresa);
        hash = 23 * hash + Objects.hashCode(this.numeroContacto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proveedor other = (Proveedor) obj;
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.numeroContacto, other.numeroContacto)) {
            return false;
        }
        if (!Objects.equals(this.productos, other.productos)) {
            return false;
        }
        return true;
    }

            
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
    
    public void addProducto(Producto producto){
        productos.add(producto);
    }
    
    public void delProducto(Producto producto){
        productos.remove(producto);
    }


//
//    @Override
//    public List<Object> read(String parameter, String value) {
//        Class<?> c = this.getClass();
//        try {
//            Field f = c.getDeclaredField(parameter);
//            for(Proveedor.){
//                
//            }
//            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        } catch (NoSuchFieldException ex) {
//            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SecurityException ex) {
//            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//  
//    
    
    
    
}
