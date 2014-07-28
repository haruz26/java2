/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto2;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Miguel Corona
 */
public class Persistencia {
    
    public static ArrayList<Usuario> buscarTodos() throws Exception{
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
     //Paso 1.-
        File f = new File("Archivaldo.xxx");
     //Paso 2.- 
        FileInputStream fis = new FileInputStream (f);
     //Paso 3.-
        ObjectInputStream ois = new ObjectInputStream (fis);
     
        usuarios = (ArrayList<Usuario>)ois.readObject();
        
        return usuarios;
    }
    
    public static void guardar(Usuario a) throws Exception{
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
     //Paso 1.-
        File f = new File ("Archivaldo.xxx");
      
            if ( f.exists()){
            
                usuarios = buscarTodos(); 
            }
        FileOutputStream fos = new FileOutputStream(f);
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        usuarios.add(a);
        oos.writeObject(usuarios);
    }
    
    public static Usuario buscarPorId(int id) throws Exception{
        
        Usuario u = new Usuario ();
        u = buscarTodos().get(id);
        return u;
    }
    
    public static void borrar (int id) throws Exception {
        
        ArrayList <Usuario> usuarios = buscarTodos();
        usuarios.remove(id);
            
        File f = new File ("Acrchivaldo.xxx");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oss = new ObjectOutputStream (fos);
        oss.writeObject(usuarios);
        
    }
    
    public static void actualizar (int id, Usuario u ) throws Exception{
        
        ArrayList <Usuario> usuarios = buscarTodos ();
        usuarios.set(id, u);
        File f = new File ("Archivaldo.xxx");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oss = new ObjectOutputStream(fos);
        oss.writeObject(usuarios);
        
    }
}
