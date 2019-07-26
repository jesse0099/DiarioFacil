/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.entidades;

import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Nvidi
 */
public interface Icrud {
    
    public boolean create(Object newData);
    public List<Object> read(String parameter,String value,List<?> data);
    public boolean edit(int index,Object newData);
    public boolean delete(int index,Object data);

}
