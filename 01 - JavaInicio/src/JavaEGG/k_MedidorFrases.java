
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 10. Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
    largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
    un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
    imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java
  * 
 */
public class k_MedidorFrases {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
                    
        System.out.println("Ingresar una Frase o palabra de 8 caracteres:  ");
        String variable = Leer.nextLine();

        if (variable.length()<8) { System.out.println("Es correcto"); } else { System.out.println("Es incorrecto"); }
            // el methodo length o longitud es de la forma
            // <variable>.lenght()
            //Lenght()
    }

}
