/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoFinal;

import java.io.*;

public class Persistencia {
    
    Cuenta c;

    public void guardar (Cuenta c){
        
        try {
            //Paso 1.- para guardar
            File f = new File("Archivaldo.xxx");
            //Paso 2.- Encadenamos archivos
            FileOutputStream fos = new FileOutputStream(f);
            //Paso 3.- Creamos el objeto a serializar 
            ObjectOutputStream oos = new ObjectOutputStream (fos);
            
            oos.writeObject(c);
            System.out.println("Guardado con exito");
            
        } catch(Exception e){
            System.out.println(e.getMessage());
            
          }
   
    }   
    
        public Cuenta leer (){
            
            Cuenta c = new Cuenta ();
            
            try {
                
                //Para leer un archivo casi son los mismos pasos
                //Paso 1.- Abrir el archivo
                File f = new File("Archivaldo.xxx");
                //Paso 2.- El sig.renglon indica que ek archivo se leera(Entre el archivo)
                FileInputStream fis = new FileInputStream(f);
                //Paso 3.- Leemos el contenido
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                        c = (Cuenta) ois.readObject();
                
            }catch (Exception e){
                
            }
            
            return c;
        }
    
    @Override
        public String toString() {
        return "Persistencia{" + "c= " + c + '}';
        }

            public Cuenta getC() {
            return c;
            }   

            public void setC(Cuenta c) {
            this.c = c;
            }
    
}
