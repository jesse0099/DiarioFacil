/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;


import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TEC-HP
 */
public final  class Constantes {
    //<editor-fold defaultstate="collapsed" desc ="Cliente por defecto">
        public static final Cliente CLIENTEDEFAULT= new Cliente("001-241099-1082x","Jese","Chavez","jesechavez009@gmail.com","jeseCliente","12345","Administrador",Date.from(Instant.now()));
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Proveedor por defecto">
        public static final Proveedor DEFAULTPROV = new Proveedor("Coca-cola","90892833","48393889X","Daniel","Apellido","daniel@gmail.com"); 
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Credenciales_de_super_usuario" >
    public static final Administrador ADMINSUPERUSUARIO = new Administrador("001-241099-1082x","Jese","Chavez","jesechavez009@gmail.com","jese","12345","Administrador",Date.from(Instant.now()));
        //<editor-fold defaultstate="collapsed" desc="Permisos_de_super_usuarios">
            public static final List<Permiso> LPERMISOSUPERUSER= new ArrayList<Permiso>();
        //</editor-fold>
            public static void loadCredentialsSa(){
               //Permiso para ver administrador de productos
               LPERMISOSUPERUSER.add(new Permiso("VPRODUCTO",true));
               //Permiso para editar en el administrador de productos
               LPERMISOSUPERUSER.add(new Permiso("EPRODUCTO",true));
               //Permiso para ver usuarios
               LPERMISOSUPERUSER.add(new Permiso("VUSUARIO",true));
               //Permiso para editar usuarios
               LPERMISOSUPERUSER.add(new Permiso("EUSUARIO",true));
               //Permisos para ver registro de compras
               LPERMISOSUPERUSER.add(new Permiso("VCOMPRAS",true));
               //Permiso para editar registro de compras
               LPERMISOSUPERUSER.add(new Permiso("ECOMPRAS",true));
               //Permiso para aeditar promociones y productos
               LPERMISOSUPERUSER.add(new Permiso("EPROM",true));
               //Permiso para ver promociones y productos
               LPERMISOSUPERUSER.add(new Permiso("VPROM",true));
               //Permiso para ver proveedores
               LPERMISOSUPERUSER.add(new Permiso("VPROV",true));
               //Permiso para editar proveedores 
               LPERMISOSUPERUSER.add(new Permiso("EPROV",true));
            }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Usuario logueado">
            public static  Cliente USUARIOLOGUEADO = new Cliente(); 
            public static  Administrador ADMINLOGUEADO = new Administrador(); 
    //</editor-fold>
}