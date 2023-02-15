
package JavaEGG;

import java.util.Scanner;


public class b_sumar_numeros {

    
    public static void main(String[] args) {
        
        System.out.println("indique dos numeros: ");
        Scanner leer = new Scanner (System.in);
        
        int num1, num2;
        
        num1 = leer.nextInt ();
        num2 = leer.nextInt ();
        
        System.out.println("La Suma de los dos numeros es: " + (num1+num2));
        
                            // siempre es un solo parentesis

        
    }
    
}
