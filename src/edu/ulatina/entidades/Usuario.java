/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public abstract class Usuario extends Persona {
    
    
    protected String nombreUsuario;
    protected String contrasena;
    protected String rol;
    protected Date fechaRegistro;

    public Usuario(String cedula, String nombre, String apellido, String email,String nombreUsuario, String contrasena, String rol, Date fechaRegistro) {
        super( cedula, nombre, apellido, email);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
        this.fechaRegistro = fechaRegistro;
    }
    
    public Usuario(){super();};

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
   public boolean login(String contra,String user){
       if(this.contrasena.equals(contra) && this.nombreUsuario.equals(nombre))
           return true;
       else
           return false;
   }
   
   //Metodo de revision de permisos
   public boolean checkCredentials(String modulo,int vista){
       //La vista en 0 indica que solo tiene permiso de ver el modulo
       //La vista en 1 indica que tiene permiso de edicion en el modulo
       if(this instanceof Cliente)
           return false;
       else{
           if(modulo.equals("Proveedores"))
               if(vista==0){
                    return ((Administrador)this).getPermisos().stream().filter(x-> x.getNombrePermiso().equals("VPROV") && x.getEstado()).count()>0;
               }
               else{
                   return ((Administrador)this).getPermisos().stream().filter(x->x.getNombrePermiso().equals("EPROV") && x.getEstado()).count()>0;
               }
       }
       return false;
   }
    
}
