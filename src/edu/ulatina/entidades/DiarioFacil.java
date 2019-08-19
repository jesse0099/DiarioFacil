/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

import java.lang.reflect.Field;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
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
    private static boolean returnedX = false;
    private static String returnedString;
    
    
    private  List<Usuario> clientes;
    private  List<Proveedor> proveedores;
    private List<Categoria> inventario;
    private List<CarritoCompras> carritos;
    private List<Compra> compras;
    private List<Promocion>  promociones;
   
    public DiarioFacil(){
        this.promociones = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.inventario = new ArrayList<>();
        this.carritos = new ArrayList<>();
        this.compras = new ArrayList<>();
    }
    
    public void addPromos(ArrayList<Promocion> promos){
        this.promociones = promos;
    }

    public List<Promocion> getPromociones() {
        return promociones;
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
    
    
    
    
   //<editor-fold defaultstate="collapsed" desc="Otros metodos">
        public List<Producto> searchProductos(String value){
            List<Producto> returned = new ArrayList<>();
            for(Categoria ca: this.inventario){
                ca.getProductos().stream().filter((p) -> (p.getExistencias()>0)).filter((p) -> (p.getNombre().contains(value))).forEachOrdered((p) -> {
                    returned.add(p);
                });
            }
            return returned;
        }
    
        public List<Item> searchCarrito(String value,String carrito,Cliente c){
            List<Item> returned = new ArrayList<>();
            for(CarritoCompras comp : this.carritos){
                if(comp.getNombreCarrito().equals(carrito) && comp.getCliente().getCedula().equals(c.getCedula())){
                    comp.getProductos().stream().filter((ite) -> (ite.getProducto().getNombre().contains(value))).forEachOrdered((ite) -> {
                        returned.add(ite);
                    });
                }
            }
            return returned;
        }
   
        public List<Producto> getProductosFiltrados(){
            List<Producto> returned = new ArrayList<>();
            for(Categoria ca: this.inventario){
                for(Producto p :  ca.getProductos()){
                    if(p.getExistencias()>0){
                        returned.add(p);
                    }
                }
            }
            return returned;
        }    
        
        public boolean agregarPromocionAlCarrito(Promocion promoOriginal,int cantidad,Cliente cliente,String nombreCarro){
            //Buscar el carrito
            for(CarritoCompras car : this.carritos){
                if(car.getNombreCarrito().equals(nombreCarro) && car.getCliente().getCedula().equals(cliente.getCedula())){
                  this.carritos.get(this.carritos.indexOf(car)).create(new Item(cantidad,promoOriginal,-1));
                  return true;
                }
            }
            return false;
        }
     
        public boolean agregarProductoAlCarrito(Producto productoOr,int cantidad,Cliente cliente,String nombreCarro){
            //Buscar el carrito
            for(CarritoCompras car : this.carritos){
                if(car.getNombreCarrito().equals(nombreCarro) && car.getCliente().getCedula().equals(cliente.getCedula())){
                  this.carritos.get(this.carritos.indexOf(car)).create(new Item(cantidad,productoOr,-1));
                  return true;
                }
            }
            return false;
        }
        
        public Promocion getPromocionByName(String name){
            for(Promocion pro: this.promociones){
                if(pro.getNombre().equals(name)){
                    return pro;
                }
            }
            return null;
        }
        
        public Producto getProductoByName(String name){
            for(Categoria ca: this.inventario){
                for(Producto pro : ca.getProductos()){
                    if(pro.getNombre().equals(name)){
                        return pro;
                    }
                }
            }
            return null;
        }
        
        public List<Promocion>  getPromocionesFiltradas(){
            List<Promocion> returned = new ArrayList<>();
            for(Promocion promo :  this.promociones){
                 if(promo.getFechaVencimiento().before(Date.from(Instant.now())) || !promo.isEstado() || !stockDisponible(promo)){
                     //Do nothing
                 }else{
                     returned.add(promo);
                 }
            }
            return returned;
        }
        public List<Promocion>  searchPromociones(String value){
            List<Promocion> returned = new ArrayList<>();
            for(Promocion promo :  this.promociones){
                 if(promo.getFechaVencimiento().before(Date.from(Instant.now())) || !promo.isEstado() || !stockDisponible(promo)){
                     //Do nothing
                 }else{
                     if(promo.getNombre().contains(value)){
                        returned.add(promo);
                     }
                 }
            }
            return returned;
        }
        
        public boolean stockDisponible(Producto p){
            for(Categoria cat  : this.inventario){
                for(Producto pro : cat.getProductos()){
                    if(p.getNombre().equals(pro.getNombre())){
                        if(pro.getExistencias()>0){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        
        public int stockDisponibleCompra(String nombreProducto,int cantidadSolicitada){
            int disponibilidadFinal=-4;
            for(Categoria cat  : this.inventario){
                for(Producto pro : cat.getProductos()){
                    if(nombreProducto.equals(pro.getNombre())){
                        disponibilidadFinal = pro.getExistencias()-cantidadSolicitada;
                    }
                }
            }
            return disponibilidadFinal;
        }
    

        public List<CarritoCompras> carritosCompra(Cliente cliente){
            List<CarritoCompras> returned = new ArrayList<>();
            for(CarritoCompras car : this.carritos){
                if(cliente.getCedula().equals(car.getCliente().getCedula())){
                    returned.add(car);
                }
            }
            return returned;
        }
    
    
        public boolean clienteCarritoRepetido(CarritoCompras nuevoCarrito){
            for (CarritoCompras carr : this.carritos) {
                if(carr.getCliente().getCedula().equals(nuevoCarrito.getCliente().getCedula())){
                    if(carr.getNombreCarrito().equals(nuevoCarrito.getNombreCarrito())){
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean clienteCarritos(Cliente c){
            if(this.carritos.stream().filter(x-> x.getCliente().getCedula().equals(c.getCedula())).count()>0){
                return true;
            }else{
                return false;
            }
        }
    
        public int indexCategoria(String categoria){
            int index=-1;
            for(Categoria c : this.inventario){
                if(c.getCategoria().equals(categoria)){
                    index= this.inventario.indexOf(c);
                }
            }
            return index;
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
         returnedX=false;
        List<Categoria> iterator = this.inventario;
        iterator.stream().forEach((Categoria x)->{
            x.getProductos().stream().forEach((Producto y)->{
                if(y.getNombre().equals(nombre)){
                    returnedX=true;
                }
            });
        });
        return returnedX;
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
     //Revisa repeticiones para el metodo de editar categorias
     public boolean categoriaRepetidaEdit(int index,String nuevaCat){
            List<Categoria> listRevision = new ArrayList<>();
            for (Categoria cat : this.inventario) {
                listRevision.add(cat);
            }
            listRevision.remove(index);
            for(Categoria c : listRevision){
                if(c.getCategoria().equals(nuevaCat)){
                    return true;
                }
            }
            return false;
     }
     
     //Traer la info del carrito seleccionado
     public List<CarritoCompras> carritoSeleccionado(String nombreCarrito,Cliente cliente){
         List<CarritoCompras> returned = new ArrayList<>();
         for(CarritoCompras car : this.carritos){
             if(car.getCliente().getCedula().equals(cliente.getCedula()) && car.getNombreCarrito().equals(nombreCarrito)){
                    returned.add(car);   
             }
         }
         return returned;
     }
     
     //Eliminar producto de un carrito
     public boolean deleteItemCarrito(int index,String nombreCarrito,Cliente c){
         for(CarritoCompras iterator : this.carritos){
             if(iterator.getNombreCarrito().equals(nombreCarrito) && iterator.getCliente().getCedula().equals(c.getCedula())){
                 if(this.carritos.get(this.carritos.indexOf(iterator)).delete(index, new Object())){
                    return true;   
                 }else{
                    return false; 
                 }
             }
         }
         return false;
     }
     //Editar la cantidad de un producto en un carrito
     public boolean editItemCarrito(int index,String nombreCarrito,Cliente c,String producto,int nuevaCantidad,boolean promo){
         for(CarritoCompras iterator: this.carritos){
             if(iterator.getNombreCarrito().equals(nombreCarrito) && iterator.getCliente().getCedula().equals(c.getCedula())){
                 if(promo){
                    if(this.carritos.get(this.carritos.indexOf(iterator)).edit(index,new Item(nuevaCantidad,getPromocionByName(producto),-1))){
                       return true;
                    }else{
                       return false; 
                    }
                 }else{
                    if(this.carritos.get(this.carritos.indexOf(iterator)).edit(index,new Item(nuevaCantidad,getProductoByName(producto),-1))){
                       return true;
                    }else{
                       return false; 
                    } 
                 }
             }
         }
         return false;
     }
     
     //Limpiar el carrito
     public void cleanCarrito(String nombreCarrito,Cliente cliente){
         for(CarritoCompras car : this.carritos){
             if(car.getNombreCarrito().equals(nombreCarrito) && car.getCliente().getCedula().equals(cliente.getCedula())){
                 this.carritos.get(this.carritos.indexOf(car)).cleanCarrito();
             }
         }
     }
    //</editor-fold>

    
    
    public List<Usuario> getClientes() {
        return clientes;
    }
    
    public List<Cliente> getClientes(int x){
        List<Cliente> temp = new ArrayList<>();
        for (Usuario c :  this.clientes) {
            if(c instanceof  Cliente){
                temp.add((Cliente)c);
            }
        }
        return temp;
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

    public List<CarritoCompras> getCarritos() {
        return carritos;
    }

    public void setCarritos(List<CarritoCompras> carritos) {
        this.carritos = carritos;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
    
    
    public void addCarrito(CarritoCompras cr){
        this.carritos.add(cr);
    }
    
    public void addCompra(Compra compra){
        this.compras.add(compra);
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
                this.clientes.add(us);
                return true;
            }else{
                return false;
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
            }
        //</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="Crear un carrito vacio">
            try{
                CarritoCompras carrito = (CarritoCompras)newData;
                if(this.clienteCarritoRepetido(carrito)){
                    return false;
                }else{
                    this.carritos.add(carrito);
                    return true;
                }
            }catch(Exception e){
                System.err.println(""+e.getMessage());
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
            if(cat.getProductos().size()>0){
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
            }else{
                //Edicion de una categoria
                if(categoriaRepetidaEdit(index, cat.getCategoria())){
                    return false;
                }else{
                    for(Producto p : this.inventario.get(index).getProductos()){
                        cat.create(p);
                    }
                    this.inventario.set(index, cat);
                    return true;
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
       //<editor-fold defaultstate="collapsed" desc="Borrar proveedor">
       try{
           Proveedor p  = (Proveedor)data;
           this.proveedores.remove(index);
           return true;
       }catch(Exception e){
           //Nada xd
           niceCasting = false;
       }
       //</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="Borrar un usuario">
       try{
           Usuario us  = (Usuario)data;
           this.clientes.remove(index);
           return true;
       }catch(Exception e){
           niceCasting  = false;
       }
       //</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="Borrar un producto o una categoria">
       try{
           //Decidir si borrar un producto o una categoria
           Categoria cta  = (Categoria)data;
           if(index>-1){
                for (Categoria cat : this.inventario) {
                    if(cat.getCategoria().equals(cta.getCategoria())){
                        for (Producto proc: cat.getProductos()) {
                            if(cat.getProductos().indexOf(proc)==index){
                                //Borrado del producto
                                this.inventario.get(this.inventario.indexOf(cat)).delete(index, data);
                                return true;
                            }
                        }
                    }
                }
           }else{
               //Borrado de una categoria
                for (Categoria cat : this.inventario) {
                   if(cat.getCategoria().equals(cta.getCategoria())){
                        if(cat.getProductos().size()>0){
                            return false;
                        }else{
                            this.inventario.remove(this.inventario.indexOf(cat));
                            return true;   
                        }
                   }
               }
           }
       }catch(Exception e){
           niceCasting  = false;
       }
       //</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="Eliminar carrito">
            try{
                //Implementacion en el futuro
                CarritoCompras car = (CarritoCompras)data;
                for(CarritoCompras c: this.carritos){
                    if(c.getNombreCarrito().equals(car.getNombreCarrito())&& c.getCliente().getCedula().equals(car.getCliente().getCedula())){
                        this.carritos.remove(this.carritos.indexOf(c));
                        return true;
                    }
                }
            }catch(Exception e){
                System.err.println(""+e.getMessage());
                niceCasting = false;
            }
       //</editor-fold>
       return niceCasting;
    }
    
       public void reducirExcistencias(Producto producto, int cantidad){
           this.inventario.stream().forEach((Categoria cat) -> {
               cat.getProductos().stream().filter((pro) -> (producto.getNombre().equals(pro.getNombre()))).forEach((pro) -> {
                   int actual = pro.getExistencias();
                   this.inventario.get(this.inventario.indexOf(cat)).getProductos().get(this.inventario.get(this.inventario.indexOf(cat)).getProductos().indexOf(pro)).setExistencias(actual-cantidad);
               });
        });
        for(Promocion promo : this.promociones){
            if(promo.getNombre().equals(producto.getNombre())){
                int actual = promo.getExistencias();
                this.promociones.get(this.promociones.indexOf(promo)).setExistencias(actual-cantidad);
            }
        }

    }

    //Listado de las categorias
    public List<Categoria>  getCategoria(){
        return this.inventario;
    }
    
}
