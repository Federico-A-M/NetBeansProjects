
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 20. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
    número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 **
    * 
 */
public class u_Ejer20 {

    public static void main(String[] args) {



         Scanner leer = new Scanner(System.in);
        
            for(int i=0;i<4;i++){
            System.out.println("Ingresa un numero");
            int num = leer.nextInt();
            while(num<1 || num>20){
                System.out.println("El numero ingresado es incorrecto, ingrese otro numero");
                        num=leer.nextInt();
            }
            System.out.print(num);
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println(" ");
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