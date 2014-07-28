/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto2;

import java.io.Serializable;

/**
 *
 * @author Miguel Corona
 */
public class Usuario implements Serializable {
    
    private int id;
    private String nombre;
    private float sueldo;
    
    public Usuario (){
        
    }

    public Usuario(int id, String nombre, float sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
}
