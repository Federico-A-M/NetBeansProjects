
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.   
  * 
  * 11. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
    frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
    “INCORRECTO”.
  * 
 */


public class l_Validarprimeraletra {


    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String frase = leer.nextLine();
        
        
        
        if(frase.toUpperCase().substring(0, 1).equals("A")){
            
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
        
    }
    
}


        // Nota: investigar la función Substring y equals() de Java.
        // substring(int beginIndex) -  
        // equals(String str)Ejemplo:(password.equals(code)
        
        
        
        
        
        
        