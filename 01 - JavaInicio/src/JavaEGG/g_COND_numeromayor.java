
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 7. Implementar un programa que dado dos números enteros determine cuál es el 
    mayor y lo muestre por pantalla.
  * 
 */
public class g_COND_numeromayor {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
            
        System.out.println("Ingresar dos valores a comparar: ");
        int num1 = Leer.nextInt();
        int num2 = Leer.nextInt();
        
        if(num1>num2){
        System.out.println("El numero mayor es: "+num1);
        }else {
            
        System.out.println("El numero mayor es: "+num2);
        }
        
        

    }

}
