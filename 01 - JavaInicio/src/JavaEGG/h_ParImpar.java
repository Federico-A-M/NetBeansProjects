
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 8. Crear un programa que dado un numero determine si es par o impar.
 */
public class h_ParImpar {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
        int num1;
            
        System.out.println("Ingresar dos valoresa comparar: ");
        num1 = Leer.nextInt();
       
       
        if (num1%2==0){ System.out.println("ES PAR"); } else { System.out.println("ES IMPAR"); }


    }

}
