
package JavaEGG;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
@author Federico.A.M.

Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/

public class d_Frase_May_Min {

           
            
    public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in);  
        
        String frase;
            
        System.out.println("Ingrese a continuación una frase: ");
        frase = leer.nextLine();
                       //se le agrega linea para que lea la linea entera     
        
        System.out.println("La frase en minuscula es: "+ toLowerCase(frase));
        System.out.println("La frase en mayuscula es: "+ toUpperCase(frase));
                                                        // se tiene que importar 
                                                        //la herramienta en forma nativa
        
        
        
        
        
    }

}
