

package cursos.capitulo2.tipos;


public class tipos {
    //static int algo; (se debe declarar aqui, si no te marca error)
    
     public static void main(String[] args) {
         
         //declaramos un arreglo de enteros
         //int [] arreglo1 = new int [3]; (forma de inicializar un arreglo)
         //System.out.println(arreglo1[0]); (imprimir un solo valor del arreglo)
         
          int [] arreglo1={-20, 7, 8, 54}; //inicializas un arreglo ya incluyendo los valores)
          /*
         for(int i=0; i<arreglo1.length; i++){ //forma vieja de un ciclo for, con las propiedades del arreglo)
             System.out.println(arreglo1[i]); //se imprime la variable que va tomando " i " en el ciclo for
         }*/
        // System.out.println(algo);
         
          for (int x : arreglo1){ //ciclo FOR mejorado 
              System.out.println(x);
          }
          
     }
    
}
