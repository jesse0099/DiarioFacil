/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TEC-HP
 */
public final  class Constantes {
    //<editor-fold defaultstate="collapsed" desc ="Cliente por defecto">
        public static final Cliente CLIENTEDEFAULT= new Cliente("1","Jese","Chavez","1@gmail.com","jeseCliente","12345","Administrador",Date.from(Instant.now()));
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
               
               ADMINSUPERUSUARIO.setPermisos(LPERMISOSUPERUSER);
            }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Usuario logueado">
            public static  Cliente USUARIOLOGUEADO = new Cliente(); 
            public static  Administrador ADMINLOGUEADO = new Administrador(); 
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Categorias por defecto">
            public static final List<Categoria> CATEGORIAS = Arrays.asList(new Categoria[]{new Categoria("Lacteos","Productos derivados de la leche"),new Categoria("Carnes","carnes crudas"),new Categoria("Panaderia","Panaderia"),new Categoria("Bebidas","refrigerados liquidos"),new Categoria("Embutidos","embutidos LMAO")});
            //Productos para un par de categorias
            public static void loadInventory(){
                CATEGORIAS.get(0).create(new Producto("A",0,10.0,10,10));
                CATEGORIAS.get(0).create(new Producto("A1",1,10.0,30,10));
                CATEGORIAS.get(1).create(new Producto("B",2,10.0,30,10));
                CATEGORIAS.get(2).create(new Producto("C",3,10.0,30,10));
            }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Promociones">
            public static final List<Promocion> PROMODEFAULT = new ArrayList<>();
            public static void loadPromociones() throws ParseException{
                SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
                PROMODEFAULT.add(new Promocion(40.2,formatter1.parse("12/8/2019"),true,"Producto A",0,10.0,10,10));
                PROMODEFAULT.add(new Promocion(40.2,formatter1.parse("13/8/2019"),true,"Producto B",0,10.0,10,10));
                PROMODEFAULT.add(new Promocion(40.2,formatter1.parse("14/8/2019"),true,"Producto C",0,10.0,10,10));
                PROMODEFAULT.add(new Promocion(40.2,formatter1.parse("15/8/2019"),true,"Producto D",0,10.0,10,10));
            }
    //</editor-fold>
}
