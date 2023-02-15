
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
 */
public class SuperRaimond {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        
        int[] vector = new int[6];
        int[] vector2 = new int[1];
        
        System.out.println("Los numeros de quini 6 para hoy son !!!: ");
        
        for (int i = 0; i < 6; i++) {
            
            int numero = (int) (Math.random() * 45);
            
            vector[i] = numero;
            System.out.print(vector[i]+ " ");  
            
        }
        
        
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Y El de la quiniela es !!!: ");
        int cuatronumero = (int) (Math.random() * 9999);
        vector2[0] = cuatronumero;
        System.out.println(vector2[0]);
        
        
        
        
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