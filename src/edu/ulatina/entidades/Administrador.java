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
public class Administrador extends Usuario{
   
    private List<Permiso> permisos;

    public Administrador(){
        super();
    };
    
    public Administrador(String cedula, String nombre, String apellido, String email, String nombreUsuario, String contrasena, String rol, Date fechaRegistro) {
        super(cedula, nombre, apellido, email, nombreUsuario, contrasena, rol, fechaRegistro);
         permisos=new ArrayList<>();
    }

     
    @Override
    public boolean login(String contra,String user){
      return super.login(contra, user);
    }

    public List<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }
       
    public void addPermisos(Permiso permiso){
        permisos.add(permiso);
    }
    
    public void delPermisos(Permiso permiso){
        permisos.remove(permiso);
    }
    //Metodo de revision de permisos
    public boolean checkCredentials(String Permiso){
       //La vista en 0 indica que solo tiene permiso de ver el modulo
       //La vista en 1 indica que tiene permiso de edicion en el modulo

        if((this).getPermisos().stream().filter(x-> x.getNombrePermiso().equals(Permiso) && x.getEstado()).count()>0)
            return true;
        else
            return false;
   }
    
}
