/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cajero;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel Corona
 */
public class cuenta {
    
    float saldo;
public cuenta(float saldo){
    
    this.saldo = saldo;
    
}
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) throws SaldoNegativoException {
        
        if(saldo<0) throw new SaldoNegativoException();
        this.saldo = saldo;
    }

}