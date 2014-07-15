/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoFinal;

/**
 *
 * @author T107
 */
public class ProyectoFinal {
    
    public static void main (String [] args){
        //Crear la cuenta
        Cuenta c = new Cuenta("nomina", 123, 50000);
        Persistencia p = new Persistencia();
        p.guardar(c);
    }
    
}
