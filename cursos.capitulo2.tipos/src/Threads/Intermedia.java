/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Threads;


public class Intermedia implements Runnable {
    
    public static void main (String args[]) {
        //Paso1.- Crear el Thread
        Runnable r = new Intermedia();
        
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
            
        //Paso2.- Inicializarlo
        t1.start();
        t2.start();
        t3.start();
        t1.setName("impresion");
        t2.setName("Conexion"); //Se pondra a dormir mientras los demas se agandallan el Run
        t3.setName("Guardar");  
    }

        @Override
        public void run() {
            
            try { 
                if(Thread.currentThread().getName().equals("Conexion"))Thread.sleep(4000);
              if(Thread.currentThread().getName().equals("Guardar"))Thread.sleep(6000);
                if(Thread.currentThread().getName().equals("Impresion"))Thread.sleep(8000);
                
            System.out.println(Thread.currentThread().getName());
            System.out.println("Soy un thread mediano");
            
            }catch(Exception e){}
        }

}
