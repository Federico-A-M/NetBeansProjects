package JavaEGG;

import java.util.Scanner;

/**
 * @author Federico.A.M. 23. Realizar un algoritmo que rellene un vector de
 * tamaño N con valores aleatorios y le pida al usuario un numero a buscar en el
 * vector. El programa mostrará donde se encuentra el numero y si se encuentra
 * repetido
 *
 */
public class vector_Ejer23 {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una dimension: ");
        int num = sc.nextInt();
        
        int[] vector = new int[num];
           
                
        for (int i = 0; i < num; i++) {
            
            int numeros = (int) (Math.random() * 45);
            
            vector[i] = numeros;
            //System.out.print(vector[i]+ " ");  
            
        }
        
        
        System.out.println("Ingrese un numero del 00 al 45 que quiera verificar si se encuentra en el arreglo ");
        int buscar = sc.nextInt();
        
        boolean logico= false;
        
        for (int i = 0; i < num; i++) {
           
            
            if ((buscar==vector[i])) {
            System.out.println("El numero " + buscar + " se encuentra en la posicion " + vector[i]);
                logico = true;
                break;
                
            } else {
               logico = false;
            
            
          }
        }
        
        if (logico!=true) {
            
            System.out.println("Lo sentimos el numero no se encuentra en la base de datos");
        
        }
        
        
        
        
        
        
        
        
        
    }

}
















// && AND
// || OR
// ? : Ternario
//  do{
//  System.out.println("Ingresar..");
//  <Variable> = Leer.nextdato();
// ------------------------------>>
// while ((condicion)&&(condicion) {
// System.out.println("etc");
// }
// --------------------------------->>>
//  Substring() 
//  substring(int begin, Int end) - <variable>.toUpperCase().substring(int begin, int end).equals(<variable>)
//  frase.toUpperCase().substring(0, 1).equals("..")
//  --------------------------------->>>
//  Lenght()
//  el methodo length - <variable>.lenght(); ejemplo: (variable.length()<8)
//  --------------------------------->>>
//  equals()
//  equals(String str)  <Variable>.equals(<variable>)  Ejemplo:(password.equals(code)
