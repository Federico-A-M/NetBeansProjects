
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 6. Escribir un programa que lea un número entero por teclado y muestre por pantalla 
    el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
    Math.sqrt()
 */

public class f_Calculos {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
                    
        System.out.println("Ingresar un numero entero: ");
        int num1 = Leer.nextInt();
        
        System.out.println("El doble del numero ingresado es igual a: "+(num1*2));
        System.out.println("El doble del numero ingresado es igual a: "+(num1*3));
        System.out.println("El doble del numero ingresado es igual a: "+(Math.sqrt(num1)));



    }

}
