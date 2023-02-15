
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 25. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la 
    muestre ordenada por sus columnas
  *  
 */
public class zmatriz_Ejer25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
  
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int numeros = (int) (Math.random() * 9);
            matriz[i][j]= numeros;
            }             
        }

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(matriz[i][i]);
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