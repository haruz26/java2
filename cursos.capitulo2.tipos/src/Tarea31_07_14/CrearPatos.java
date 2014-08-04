/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tarea31_07_14;

/**
 *
 * @author Miguel Corona
 */
public class CrearPatos {
    
    public static void main (String args []){
        
        Pato [] patos = new Pato [3];
        patos [0] = new PatoVivo();
        patos [1] = new PatoGoma();
        patos [2] = new PatoJuguete();
        
        for (Pato p : patos){
            
            Servicio c = new Servicio ((HacerCuac)p); //Casting de "p" es de tipo pato y "c" es de hacer cuac
            c.hacerCuac();
            
        }
                      
    }
    
}
