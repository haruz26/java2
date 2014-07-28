/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto2;

/**a
 *
 * @author Miguel Corona
 */
public class ProbarU {

    
    public static void main (String [] args){
    
        try {
            
            Usuario u = new Usuario(0, "Harumi", 68000);
        Persistencia.guardar(u);       
        Persistencia.buscarTodos();       
        Persistencia.buscarPorId(0);
        Persistencia.borrar(0);
        
        } catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        
    }
    
}
