
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 16. Escriba un programa que lea 20 números. 
  * Si el número leído es igual a cero se debe 
    salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
  * 
  * El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
  * pero si el número es negativo no debe sumarse. (si es menor a cero)
  * Nota: recordar el uso de la sentencia break
  * 
 */
public class q_CaptureCero {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
                    
        
        //System.out.println("Ir ingresando a continuacion 20 numeros ");
        //int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, num20 = Leer.nextInt();
        int suma = 0;
                
    for (int i = 0; i < 20; i++) {
            
        System.out.println("Ingrese el valor " + (i+1) );
        int num = Leer.nextInt();
        
        
        if (num==0) {
            System.out.println("Atrapamos el numero cero"); 
            break; 
        } else if (num>0){
            suma= (suma+num);} 
        }
        
    
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