
package edu.ulatina.entidades;

import java.util.Calendar;
import edu.ulatina.entidades.Producto;
import edu.ulatina.entidades.Producto;
import java.util.Date;

public class Promocion extends Producto {
    private double precioPromocional;
    private Date fechaVencimiento;
    private boolean estado;
    private String tipo;
    private int cantidadActivacion;

    public Promocion(double precioPromocional, Date fechaVencimiento, boolean estado, String tipo, int cantidadActivacion, String nombre, int codigo, double precio, int existencias, int existenciaMin) {
        super(nombre, codigo, precio, existencias, existenciaMin);
        this.precioPromocional = precioPromocional;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
        this.tipo = tipo;
        this.cantidadActivacion = cantidadActivacion;
    }
    
    public Promocion(){
        super();
    }
    
    public double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadActivacion() {
        return cantidadActivacion;
    }

    public void setCantidadActivacion(int cantidadActivacion) {
        this.cantidadActivacion = cantidadActivacion;
    }

    public void editarPromocion(double precioPromocional, boolean estado, Date fechaVencimiento){
       if(estado == true){
          setPrecio(precioPromocional);
       }
    }
    
    

    
    
    
    
    
}
