
package JavaEGG;

import java.util.Scanner;

public class c_Ingresenombre {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        
        String name;
        
        name = leer.next();
      
        System.out.println("Hola mundo soy " + name);
    }
    
}
