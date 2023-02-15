
package JavaEGG;

import java.util.Scanner;


public class a_HolaMundo {

    
    public static void main(String[] args) {

        //se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //se crea una variable cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        //muestra un mensaje por pantalla 
        System.out.println("Ingre su nombre: ");
        //leemos el nombre de la persona en la variable nombre.
        nombre = leer.next();
        //mostramos el nombre por consola con un saludo personalizado
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy en java!");        
        
        
        
    }
    
}
