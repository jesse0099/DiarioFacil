/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

import java.lang.reflect.Field;
import java.util.ArrayList;
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
    private  List<Usuario> clientes;
    
    
    private  List<Proveedor> proveedores;
   
    public DiarioFacil(){
        this.clientes = new ArrayList<>();
        this.proveedores = new ArrayList<>();
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
    
    public void addProveedor(Proveedor proveedor){
        this.proveedores.add(proveedor);
    }

    public List<Usuario> getAdministradores() {
        return clientes;
    }

    public void setAdministradores(List<Usuario> administradores) {
        this.clientes = administradores;
    }
    
    public void addAdministrador(Administrador admin){
        this.clientes.add(admin);
    }
    
    public void addCliente(Cliente c){
        this.clientes.add(c);
    }
    
    public boolean addProveedorValidado(Proveedor prov){
        boolean returned = false;
            if(this.proveedores.stream().filter(x->x.getNombre().equals(prov.getNombre()) || x.getApellido().equals(prov.getApellido())|| x.getCedula().equals(prov.getCedula())|| x.getEmail().equals(prov.getEmail())).count()==0)
            {
                this.proveedores.add(prov);
                returned = true;
            }      
        return returned;
    }
    
    public boolean login(String user,String contra){
        this.clientes.stream().filter(x-> x.nombreUsuario.equals(user) && x.contrasena.equals(contra)).forEach((Usuario action) -> {
            if(action instanceof Administrador){
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


    @Override
    public boolean create(Object newData) {
        boolean niceCasting  = true;
        //Crear usuario
        try{
            Usuario us = (Usuario)newData;
            this.clientes.add(us);
            return true;
        }catch(Exception e){
            niceCasting  = false;
            System.err.println(""+e.getMessage());
        }
        //Crear proveedor
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
        return returned;
    }
    //Creo que funciona bien uwu 
    @Override
    public boolean edit(int index,Object newData) {
       boolean infoRepetead= false;
       boolean niceCasting = true;
       //Edit Usuario uwu
       try{
            if((Usuario)newData instanceof  Cliente){
                //<editor-fold defaultstate="collapsed" desc="Edicion de usuarios(Cliente)">
                    Usuario us  = (Usuario)newData;
                    List<Usuario> tempUserData = new ArrayList<>();
                    for (int i = 0; i < this.clientes.size(); i++) {
                        if(!(i==index))
                            tempUserData.add(this.clientes.get(i));
                    }
                    //Chequeo de repetidos recorriendo la lista excepto al objeto que se desea modificar
                    for(Usuario u : tempUserData){
                        if(us.getNombre().equals(u.getNombre()) || us.getCedula().equals(u.getCedula()) || us.getApellido().equals(u.getApellido())|| us.getEmail().equals(u.getEmail()) || us.getNombreUsuario().equals(u.getNombreUsuario())){                           infoRepetead=true;
                           break;
                        }
                    }
                    if(infoRepetead){
                        //Retorno false porque hay informacion importante repetida
                        return false;
                    }else{
                        return true;
                    }
                //</editor-fold>

            }
       }catch(Exception e){
           //Fallo por casteo erroneo
           niceCasting  = false;
       }
       
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
       return niceCasting;
    }
}
