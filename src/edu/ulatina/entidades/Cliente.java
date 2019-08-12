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
 * @author Nvidi
 */
public class Cliente extends Usuario{
    private List<Producto> preferencias;
    

    public boolean isActivo() {
        return activo;
    }
    
    private boolean activo;

    public Cliente(String cedula, String nombre, String apellido, String email, String nombreUsuario, String contrasena, String rol, Date fechaRegistro) {
        super(cedula, nombre, apellido, email, nombreUsuario, contrasena, rol, fechaRegistro);
         preferencias=new ArrayList<>();
         activo = true;
    }

    public Cliente() {
        
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public boolean getActivo(){
        return this.activo;
    }

    public List<Producto> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(List<Producto> preferencias) {
        this.preferencias = preferencias;
    }
    
    public void addProductos(Producto preferencia){
        this.preferencias.add(preferencia);
    }
}
