
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 5. Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
    grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). 
  * 
 */
public class e_MedidorGrados {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
        
                    
        System.out.println("Ingresar los grados actuales ");
        int grados = Leer.nextInt();

        System.out.println("Los grados ingresados en magnitud Fahrenheit son: "+(grados*9/5+32)+"°F");

    }

}
