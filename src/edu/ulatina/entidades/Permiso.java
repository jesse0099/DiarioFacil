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
public class Permiso {
    
    private String nombrePermiso;
    private boolean estado;
    
    public Permiso(){};
    
    public Permiso(String nombrePermiso, boolean estado) {
        this.nombrePermiso = nombrePermiso;
        this.estado = estado;
    }

    public String getNombrePermiso() {
        return nombrePermiso;
    }

    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
