
package edu.ulatina.entidades;

import java.util.ArrayList;
import java.util.List;


public class Paquete {
    private List<Producto> productos;
    double precioPromocional;
    private String nombre;
    
    public Paquete(List<Producto> productos,double precioPromocional, String nombre) {
        this.productos = new ArrayList<>();
        for(Producto pro: productos){
            this.productos.add(pro);
        }
        this.precioPromocional = precioPromocional;
        this.nombre = nombre;
    }
    
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }    
    
    public void addProducto(Producto producto){
        this.productos.add(producto);
    }
    
    public void delProducto(Producto producto){
        this.productos.remove(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void editCombo(double precioPromocional, List<Producto> productos){
        
    }
}
