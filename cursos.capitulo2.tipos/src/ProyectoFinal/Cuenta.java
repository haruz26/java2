/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoFinal;

import java.io.Serializable;

/**
 1. Agragele setters y getters
 2. Agregarle constructor que inicializa los atributos
 3. Sobre escribir el metodo toString
 4. Encapsular
 5. Preparar la clase para ser serializada
 */
public class Cuenta implements Serializable{
 
    private String nombre;
    private int usuario;
    private float saldo;
    
    public Cuenta (){
        
    }

    public Cuenta(String nombre, int usuario, float saldo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.saldo = saldo;
    }
    
    
    
    @Override
    public String toString() {
        return "Cuenta{" + "nombre= " + nombre + ", usuario= " + usuario + ", saldo= " + saldo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
