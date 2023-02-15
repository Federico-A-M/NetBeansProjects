
package Frame_Ventana_Marco;

import java.util.Scanner;
import javax.swing.*;

/**
  * https://www.youtube.com/watch?v=7q2VBGIKeYc&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=55&ab_channel=pildorasinformaticas
 */
public class Ejemplos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");   
         
// Caracteristicas de los Frame: 

//Nacen invisibles: Se necesitan el metodo setVisible para hacerlos visibles.

//Nacen con tamaño inutil: Se necesita setSize para darles tamaño. (null point 1x1)

//Se le debe decir que debe hacer el programa si cierra un frame.

// import javax.swing.*; --> importa todo el paquete grafico.

        Marco marco1= new Marco(); //hereda de la clase miMarco heredada.
        
        marco1.setVisible(true);
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra y finaliza el compilador.
        //marco1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // esconde la ventana y sigue el proceso.

        

    }

}







