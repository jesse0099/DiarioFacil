/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author TEC-HP
 */
public class DiarioFacil implements Icrud {
    private static boolean returned = false;
    private static String returnedString;
    
    
    private  List<Usuario> clientes;
    private  List<Proveedor> proveedores;
    private List<Categoria> inventario;
   
    public DiarioFacil(){
        this.clientes = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.inventario = new ArrayList<>();
    }
    
    public void setCategorias(ArrayList<Categoria> categor){
        this.inventario = categor;
    }
    
    public void addInventario(Categoria e){
        this.inventario.add(e);
    }
    
    public List<Categoria> getInventario(){
        return this.inventario;
    }
    
    public List<Producto> getProductos(){
       List<Categoria> iterator = this.inventario;
       List<Producto> returnedList  = new ArrayList<>();
       iterator.stream().forEach((Categoria x)->{
           x.getProductos().stream().forEach((Producto y)->{
               returnedList.add(y);
           });
       });
       return returnedList;
    }
    
    public boolean productoExist(String nombre){
        returned=false;
       List<Categoria> iterator = this.inventario;
       iterator.stream().forEach((Categoria x)->{
           x.getProductos().stream().forEach((Producto y)->{
               if(y.getNombre().equals(nombre)){
                   returned=true;
               }
           });
       });
       return returned;
    }
    
    
    public List<Usuario> getClientes() {
        return clientes;
    }

    public void setClientes(List<Usuario> clientes) {
        this.clientes = clientes;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    public List<Usuario> getAdministradores() {
        return clientes;
    }

    public void setAdministradores(List<Usuario> administradores) {
        this.clientes = administradores;
    }
    
    public void addCategoria(Categoria cat){
        this.inventario.add(cat);
    }
    public boolean login(String user,String contra){
        this.clientes.stream().filter(x-> x.nombreUsuario.equals(user) && x.contrasena.equals(contra)).forEach((Usuario action) -> {
            if(action instanceof Administrador){
                ((Administrador) action).toString();
                Constantes.ADMINLOGUEADO =(Administrador)action;
            }else{
                Constantes.USUARIOLOGUEADO =(Cliente)action;
            }
        });
        return this.clientes.stream().filter(x-> x.nombreUsuario.equals(user) && x.contrasena.equals(contra)).count()>0;
    }
    
    public void deleteProveedor(int index){
        this.proveedores.remove(index);
    }
    
    public void deleteUser(int index){
        this.clientes.remove(index);
    }

    @Override
    public boolean create(Object newData) {
        boolean niceCasting  = true;
       //<editor-fold defaultstate="collapsed" desc="Crear un usuario">
        try{
            Usuario us = (Usuario)newData;
            if(this.clientes.stream().filter(x->x.getCedula().equals(us.getCedula()) || x.getEmail().equals(us.getEmail()) || x.getNombreUsuario().equals(us.getNombreUsuario())).count()==0){
            
            if(us instanceof Cliente){
            this.clientes.add(us);
              //JOptionPane.showMessageDialog(null, "User creado");
            }else if(us instanceof Administrador){
              this.clientes.add(us);
               // JOptionPane.showMessageDialog(null, "Admin creado");
            }
            
            return true;
            }
        }catch(Exception e){
            niceCasting  = false;
            System.err.println(""+e.getMessage());
        }
        //</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="Crear proveedor">
        try{
            Proveedor prov  = (Proveedor)newData;
            if(this.proveedores.stream().filter(x->x.getNombre().equals(prov.getNombre()) || x.getApellido().equals(prov.getApellido())|| x.getCedula().equals(prov.getCedula())|| x.getEmail().equals(prov.getEmail())).count()==0)
            {
                this.proveedores.add(prov);
                return true;
            }
            return false;
        }catch(Exception e){
            niceCasting = false;
            System.err.println(""+e.getMessage());
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Crear producto o una categoria">
            try{
                Categoria cat = (Categoria)newData;
                //Si el objeto trae atado un producto se creara uno
                if(cat.getProductos().size()>0){
                    if(this.getCategoria().stream().filter(x-> x.getCategoria().equals(cat.getCategoria())).count()>0){
                        //Categoria existe en la lista
                        if(this.productoExist(cat.getProductos().get(0).getNombre())){
                            return false;
                        }else{
                            for (Categoria c : this.inventario) {
                                if(c.getCategoria().equals(cat.getCategoria())){
                                    c.create(cat.getProductos().get(0));
                                    return true;
                                }
                            }
                        }
                    }else{
                        return false;
                    }
                }else{
                    //Si el objeto no trae atado ningun producto,entonces se crea una categoria
                    if(this.getCategoria().stream().filter(x-> x.getCategoria().equals(cat.getCategoria())).count()==0){
                        //EL nombre de la categoria se encuentra ocupado
                        this.addCategoria(cat);
                        return true;
                    }else{
                        //El nombre de la categoria esta ocupado
                        return false;
                    }
                }
            }catch(Exception e){
                niceCasting=false;
                System.err.println(""+e.getMessage());
                e.printStackTrace();
            }
        //</editor-fold>
        return niceCasting;
    }

    @Override
    public List<Object> read(String parameter, String value,List<?> data) {
        //Identificar la clase a la que refiere la lista
        List<Object> returned = new ArrayList<>();
        try{
            if(data.size()==0){
                return returned;
            }else{
                //Si no cae en el catch se que es del tipo Proveedor
                Proveedor prov  = (Proveedor)data.get(0);
                
                if(parameter.equals("empresa")){
                    this.proveedores.stream().filter((Proveedor prove) -> prove.getEmpresa().contains(value)).forEach((Proveedor add)->{
                        returned.add(add);
                    });
                   return returned;
                }else if (parameter.equals("numeroContacto")){
                    this.proveedores.stream().filter((Proveedor prove)-> prove.getNumeroContacto().contains(value)).forEach((Proveedor add)->{
                        returned.add(add);
                    });
                    return returned;
                }else if(parameter.equals("productos")){
                    this.proveedores.stream().filter((Proveedor prove)-> prove.getProductos().stream().filter((Producto pro)->pro.getNombre().contains(value)).count()>0).forEach((Proveedor add)->{
                        returned.add(add);
                    });
                    return returned;
                }else if(parameter.equals("nombre")){
                    this.proveedores.stream().filter((Proveedor prove)-> prove.getNombre().contains(value)).forEach(x->{
                        returned.add(x);
                    });
                    return returned;
                }
                
            }
        }catch(Exception ex){
            System.err.println(""+ex.getMessage());
        }
        
        /* Admin*/
        
           try{
            if(data.size()==0){
                return returned;
            }else{
                //Si no cae en el catch se que es del tipo Proveedor
                Usuario user  = (Administrador)data.get(0);
                
                 if(user instanceof Administrador){
                
                if(parameter.equals("cedula")){
                    this.clientes.stream().filter((Usuario x) -> x.getCedula().contains(value)).forEach((Usuario add)->{
                        returned.add(add);
                    });
                   return returned;
                   
                }else if (parameter.equals("email")){
                    this.clientes.stream().filter((Usuario x)-> x.getEmail().contains(value)).forEach((Usuario add)->{
                        returned.add(add);
                    });
                    return returned;
                    
                }else if(parameter.equals("usuario")){
                    this.clientes.stream().filter((Usuario x)-> x.getNombreUsuario().contains(value)).forEach((Usuario add)->{
                        returned.add(add);
                    });
                    return returned;
                    
                }else if(parameter.equals("nombre")){
                    this.clientes.stream().filter((Usuario x)-> x.getNombre().contains(value)).forEach((Usuario add)->{
                        returned.add(add);
                    });
                    return returned;
                }
                
            }/*Filtros para Clientes*/
            }
        }catch(Exception ex){
            System.err.println(""+ex.getMessage());
        }
           
       /*-------------------------------*/
           
                    try{
            if(data.size()==0){
                return returned;
            }else{
                //Si no cae en el catch se que es del tipo Proveedor
                Usuario user  = (Cliente)data.get(0);
                
                 if(user instanceof Cliente){
                
                if(parameter.equals("cedula")){
                    this.clientes.stream().filter((Usuario x) -> x.getCedula().contains(value)).forEach((Usuario add)->{
                        returned.add(add);
                    });
                   return returned;
                   
                }else if (parameter.equals("email")){
                    this.clientes.stream().filter((Usuario x)-> x.getEmail().contains(value)).forEach((Usuario add)->{
                        returned.add(add);
                    });
                    return returned;
                    
                }else if(parameter.equals("usuario")){
                    this.clientes.stream().filter((Usuario x)-> x.getNombreUsuario().contains(value)).forEach((Usuario add)->{
                        returned.add(add);
                    });
                    return returned;
                    
                }else if(parameter.equals("nombre")){
                    this.clientes.stream().filter((Usuario x)-> x.getNombre().contains(value)).forEach((Usuario add)->{
                        returned.add(add);
                    });
                    return returned;
                }
                
            }/*Filtros para Clientes*/
            }
        }catch(Exception ex){
            System.err.println(""+ex.getMessage());
        }
           
       /*-----------------------------*/
       
        
        //Filtros de productos
                //Productos
        try{
            if(data.size()==0){
                return returned;
            }else{
                //Si no cae en el catch se que es del tipo Producto
                Categoria prod  = (Categoria)data.get(0);
                if(parameter.equals("nombre")){
                    this.inventario.forEach(action->{
                        action.getProductos().stream().filter((Producto produ) -> produ.getNombre().contains(value)).forEach((Producto add)->{
                        returned.add(add);
                        });
                    });
                   return returned;
                }else if (parameter.equals("codigo")){
                     this.inventario.forEach(action->{
                        action.getProductos().stream().filter((Producto produ)-> produ.getCodigo()==Integer.parseInt(value)).forEach((Producto add)->{
                        returned.add(add);
                        });
                     });
                    if(returned.isEmpty()){
                        this.getProductos().forEach((p) -> {
                            returned.add(p);
                        });
                    }
                    return returned;
                }else if(parameter.equals("precio")){
                    this.inventario.forEach(action->{
                        action.getProductos().stream().filter((Producto produ)-> produ.getPrecio()==Double.parseDouble(value)).forEach(x->{
                        returned.add(x);
                        });
                    });
                    return returned;
                }
                
            }
        }catch(Exception ex){
            System.err.println(""+ex.getMessage());
        }
        
        return returned;
    }
    //Creo que funciona bien uwu 
    @Override
    public boolean edit(int index,Object newData) {
       boolean infoRepetead= false;
       boolean niceCasting = true;
       //<editor-fold defaultstate="collapsed" desc="Edicion de usuario">
       try{
            if((Usuario)newData instanceof  Cliente){
              /**/
                Cliente client = (Cliente)newData;
                List<Usuario> tempData = new ArrayList<>();
                
                 for (int i = 0; i < this.clientes.size(); i++) {
                     if(this.clientes instanceof Cliente)
                        if(!(i==index))
                            tempData.add(this.clientes.get(i));
                 }   
                     //Chequeando repetidos
                 for(Usuario a  : tempData){
                     if(client.getCedula().equals(a.getCedula()) || client.getNombre().equals(a.getNombre()) || client.getApellido().equals(a.getCedula())|| client.getEmail().equals(a.getEmail()) ||  client.getNombreUsuario().equals(a.getNombreUsuario()) || client.getContrasena().equals(a.getContrasena())){
                         infoRepetead = true;
                     }
                 }
                 if(infoRepetead){
                     //Fallo por repeticion de informacion
                     return false;
                 }else{
                     //Actualizar
                     this.clientes.set(index, client);
                     return true;
                 }
                
               
            }else{
                Administrador admin = (Administrador)newData;
                List<Usuario> tempData = new ArrayList<>();
                
                 for (int i = 0; i < this.clientes.size(); i++) {
                     if(this.clientes instanceof Administrador)
                        if(!(i==index))
                            tempData.add(this.clientes.get(i));
                 }   
                     //Chequeando repetidos
                 for(Usuario a  : tempData){
                     if(admin.getCedula().equals(a.getCedula()) || admin.getNombre().equals(a.getNombre()) || admin.getApellido().equals(a.getCedula())|| admin.getEmail().equals(a.getEmail()) ||  admin.getNombreUsuario().equals(a.getNombreUsuario()) || admin.getContrasena().equals(a.getContrasena())){
                         infoRepetead = true;
                     }
                 }
                 if(infoRepetead){
                     //Fallo por repeticion de informacion
                     return false;
                 }else{
                     //Actualizar
                     this.clientes.set(index, admin);
                     return true;
                 }
            }
       }catch(Exception e){
           //Fallo por casteo erroneo
           niceCasting  = false;
       }
       //</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="Edicion de un proveedor">
       try{
            if((Persona)newData instanceof  Proveedor){
                Proveedor prov = (Proveedor)newData;
                List<Proveedor> tempData = new ArrayList<>();
                 for (int i = 0; i < this.proveedores.size(); i++) {
                     if(!(i==index))
                         tempData.add(this.proveedores.get(i));
                 }   
                     //Chequeando repetidos
                 for(Proveedor p  : tempData){
                     if(prov.getNombre().equals(p.getNombre()) || prov.getApellido().equals(p.getApellido()) || prov.getCedula().equals(p.getCedula())|| prov.getEmail().equals(p.getEmail())){
                         infoRepetead = true;
                         break;
                     }
                 }
                 if(infoRepetead){
                     //Fallo por repeticion de informacion
                     return false;
                 }else{
                     //Actualizar
                     this.proveedores.set(index, prov);
                     return true;
                 }

            }
       }catch(Exception e){
           //Fallo por casteo erroneo
           niceCasting = false;
       }
      //</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="Edicion de productos">
        try{
            //Esta categoria va a tener un producto con la informacion para editar
            //cat representa la nueva categoria del producto si es que se ha realizado un cambio en esta
            Categoria cat = (Categoria)newData;
            //Encontrando la categoria que hace referencia a que el producto tenia anteriormente
            for(Categoria cta: this.inventario){
                for(Producto pro: cta.getProductos()){
                    if((cta.getProductos().size()-1)>=index){
                        if(pro.getNombre().equals(cat.getDescripcion())){
                            //Chequear si se hizo un cambio de categoria
                                Categoria respaldoCat = this.getCategoriaUnica(cta.getCategoria());
                                Producto respaldo =this.inventario.get(this.inventario.indexOf(cta)).getProductos().get(index);
                                respaldoCat.create(respaldo);
                                this.inventario.get(this.inventario.indexOf(cta)).delete(index, newData);
                                if(this.create(newData)){
                                    return true;
                                }else{
                                    this.create(respaldoCat);
                                    return false;
                                }
                        }    
                    }
                }
            }
        }catch(Exception e){
            niceCasting =false;
        }
       //</editor-fold>
       return niceCasting;
    }

    @Override
    public boolean delete(int index,Object data) {
       boolean niceCasting  = true; 
       //Intentar borrar proveedor
       try{
           Proveedor p  = (Proveedor)data;
           this.proveedores.remove(index);
           return true;
       }catch(Exception e){
           //Nada xd
           niceCasting = false;
       }
       //Borrar un usuario
       try{
           Usuario us  = (Usuario)data;
           this.clientes.remove(index);
           return true;
       }catch(Exception e){
           niceCasting  = false;
       }
       
       //Borrar un producto 
       try{
           Categoria cta  = (Categoria)data;
           for (Categoria cat : this.inventario) {
               if(cat.getCategoria().equals(cta.getCategoria())){
                   for (Producto proc: cat.getProductos()) {
                       if(cat.getProductos().indexOf(proc)==index){
                           //Borrado del producto
                           this.inventario.get(this.inventario.indexOf(cat)).delete(index, data);
                       }
                   }
               }
           }
           return true;
       }catch(Exception e){
           niceCasting  = false;
       }
       return niceCasting;
    }
    
    //Obtiene la categoria por el nombre de un producto
    public String getCategoria(String nombreProducto){
        returnedString="";
        inventario.stream().forEach((Categoria x)->{
            x.getProductos().stream().forEach((Producto p)->{
                if(p.getNombre().equals(nombreProducto)){
                   returnedString = x.getCategoria();
                }
            });
        });
        return returnedString;
    }
    //Listado de las categorias
    public List<Categoria>  getCategoria(){
        return this.inventario;
    }
    
    //Una copia de la categoria sin productos
    public Categoria getCategoriaUnica(String nombreCategoria){
        Categoria returnedCat=null;
        for(Categoria cat : this.inventario){
            if(cat.getCategoria().equals(nombreCategoria)){
                returnedCat = new Categoria(cat.getCategoria(),"");
                break;
            }
        }
        return returnedCat;
    }
    
    //El indice de un producto en la categoria
    public int indexInternoProducto(String producto,String categoria){
        for (int i = 0; i < this.inventario.size(); i++) {
            if(this.inventario.get(i).getCategoria().equals(categoria)){
                for (int j = 0; j < this.inventario.get(i).getProductos().size(); j++) {
                    if(this.inventario.get(i).getProductos().get(j).getNombre().equals(producto)){
                        return  j;
                    }
                }
            }
        }
        return -1;
    }
    
}
