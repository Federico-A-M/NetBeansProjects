package JavaEGG;

import java.util.Scanner;

/**
 * @author Federico.A.M. 22. Realizar un algoritmo que rellene un vector con los
 * 100 primeros números enteros y los muestre por pantalla en orden descendente
 *
 */
public class vector_Ejer22 {

    public static void main(String[] args) {

        int[] vector = new int[100];

        for (int i = 0; i < 100; i++) {

            vector[i] = i;

            //System.out.println(vector[i]);
        }

                                    // --
        for (int i = 99; i >= 0; i= i-1) {

            System.out.println(vector[i]);

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
