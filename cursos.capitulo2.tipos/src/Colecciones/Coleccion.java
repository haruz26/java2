/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author Miguel Corona
 */
public class Coleccion {
    
    public static void main (String [] args){
        
        Usuario x = new Usuario();
                x.setId(1);
                x.setEmail("haruz@hotmail.com");
                x.setNombre("Mariel");
                x.setPaterno("Guzman");
                x.setSueldo(85000);
                
        Usuario x1 = new Usuario(2, "Harumi", "Ramirez", "marita@hotmail.com", 45000);
        Usuario x3 = new Usuario(3, "Emi", "Jarquín", "emi@hotmail.com", 60000);
        //Creamos un arratList de tipo Usuario
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(x);
        usuarios.add(x1);
        usuarios.add(x3);
        
        for (Usuario u : usuarios ){
            System.out.println(u);
        }
            
            
    }
    
}
