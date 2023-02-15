
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
    solicite números al usuario HASTA que la suma de los números introducidos supere 
    el límite inicial. 
  * 
 */
public class o_ValorLimite {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
                    
        System.out.println("ingrese un valor límite positivo: ");
        int num1 = Leer.nextInt();

        int numA;
        int numB;
        
        do {
            
            System.out.println("ingrese un valor que A y a continuacion un numero B que al sumarse superen al anterior: ");
            numA = Leer.nextInt();
            numB = Leer.nextInt();
            
        } while ((numA+numB)<(num1));

        System.out.println("La suma de "+numA+" mas "+numB+" dio como resultado " + (numA+numB));

    }

}


    // && AND
    // || OR
    // ? : Ternario

//------------------------------>>
  
//do {
            
// System.out.println("Ingresar..");
// <Variable> = Leer.next<dato>();
            
// } while (condicion);

//------------------------------>>

         // while ((condicion)&&(condicion) {
         // System.out.println("etc");
         // }