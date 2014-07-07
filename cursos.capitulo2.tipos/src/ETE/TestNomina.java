/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ETE;

/**
 *
 * @author Miguel Corona
 */
public class TestNomina {

    public static void main (String args[]){
        
        Nomina sa = new Nomina(20000, 1);
        Nomina ta = new Nomina(2749.50f, 2);
        
        try{
            
            sa.setSaldo(400000);
            
        } catch (SaldoFueraDeRangoException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
