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
public class Nomina {
    
    float saldo;
    int idTrabajador;
    
    public Nomina(){
        
    }
    
    public Nomina (float saldo, int idTrabajador){ 
    
        this.idTrabajador = idTrabajador;
        this.saldo = saldo;
    }
   

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) throws SaldoFueraDeRangoException{
        
        if(saldo < 20000 || saldo > 25000) throw new SaldoFueraDeRangoException();
        this.saldo = saldo;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
}
