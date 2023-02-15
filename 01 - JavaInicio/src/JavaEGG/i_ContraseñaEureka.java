
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 9. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
    
  * Nota: investigar la función equals() en Java
  * 
 */
public class i_ContraseñaEureka {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
        String password;
        String code=("Eureka");         
        
        System.out.println("Ingresar... ");
        password = Leer.nextLine();
        
        
           
        if (password.equals(code)) { System.out.println("ES CORRECTO"); } else { System.out.println("ES INCORRECTO"); }
          
            //password.equals(code) ---> es el modo correcto de comparar strings
        
            //equals(String str) --> Sirve para comparar si dos cadenas son iguales. 
            //Devuelve true si son iguales y false si no.
            
    }

}
