
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
    10. Realizar un programa que solo permita introducir frases o palabras de 8 de largo.
    Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
    un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
    imprimir “INCORRECTO”. 
    * Nota: investigar la función Lenght() en Java
 */
public class j_LongitudStrings {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
                    
        System.out.println("Ingresar... ");
        String frase = Leer.nextLine();
        
        
        if (frase.length()>0) { System.out.println("CORRECTO"); } else { System.out.println("CORRECTO"); }
            // el methodo length o longitud es de la forma
            // <variable>.lenght()
        
        
    }

    private static int length(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
