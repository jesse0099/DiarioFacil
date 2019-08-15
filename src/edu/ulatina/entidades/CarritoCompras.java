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
public class CarritoCompras implements Icrud{
    
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
    
    public CarritoCompras(){this.Productos = new ArrayList<>();};
    
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
    
    @Override
    public boolean create(Object newData) {
       int getCons=-1;
       Item it = (Item)newData;
       //Si es promo
       if(it.getProducto() instanceof Promocion){
            List<Item> checkList = new ArrayList<>();
            for (Item iterator: this.Productos){
                if(iterator.getProducto() instanceof Promocion){
                    checkList.add(iterator);
                }
            }
            if(checkList.stream().filter(x-> x.getProducto().getNombre().equals(it.getProducto().getNombre())).count()>0){
                //La promocion ya ha sido agregada a la lista,solo debe editarse la cantidad
                //Buscando la promo para editarla
                for(Item ite: this.Productos){
                    if(ite.getProducto().getNombre().equals(it.getProducto().getNombre()) && (ite.getProducto() instanceof Promocion)){
                        it.setCantidad(this.Productos.get(this.Productos.indexOf(ite)).getCantidad()+it.getCantidad());
                        it.setConsecutivo(this.Productos.get(this.Productos.indexOf(ite)).getConsecutivo());
                        this.Productos.set(this.Productos.indexOf(ite),it);
                    }
                }
            }else{
                //La promocion no ha sido agregada,debe agregarse sin mas rollo
                getCons= this.Productos.size()+1;
                it.setConsecutivo(getCons);
                this.Productos.add(it);
            }
            return true;
       }else{
           //Si no es promo
            List<Item> checkList = new ArrayList<>();
            for (Item iterator: this.Productos){
                if(!(iterator.getProducto() instanceof Promocion)){
                    checkList.add(iterator);
                }
            }
            if(checkList.stream().filter(x-> x.getProducto().getNombre().equals(it.getProducto().getNombre())).count()>0){
                //El producto ya ha sido agregado,solo toca editar
                //Buscando el producto para editarlo
                for(Item ite: this.Productos){
                    if(ite.getProducto().getNombre().equals(it.getProducto().getNombre()) && !(ite.getProducto() instanceof Promocion)){
                        it.setCantidad(this.Productos.get(this.Productos.indexOf(ite)).getCantidad()+it.getCantidad());
                        it.setConsecutivo(this.Productos.get(this.Productos.indexOf(ite)).getConsecutivo());
                        this.Productos.set(this.Productos.indexOf(ite),it);
                    }
                }
            }else{
                //La promocion no ha sido agregada,debe agregarse sin mas rollo
                getCons= this.Productos.size()+1;
                it.setConsecutivo(getCons);
                this.Productos.add(it);
            }
       }
       return false;
    }

    @Override
    public List<Object> read(String parameter, String value, List<?> data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(int index, Object newData) {
        Item i = (Item) newData;
        i.setConsecutivo(this.Productos.get(index-1).getConsecutivo());
        this.Productos.set(index-1, i);
        return true;
    }

    @Override
    public boolean delete(int index, Object data) {
        this.Productos.remove(index-1);
        int indexInterno=0;
        for(Item i: this.Productos){
            this.Productos.get((this.Productos.indexOf(i))).setConsecutivo(indexInterno+1);
            indexInterno++;
        }
        return true;
    }
    
    public void cleanCarrito(){
        this.Productos.clear();
    }

}
