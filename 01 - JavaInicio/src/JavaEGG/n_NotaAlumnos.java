
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
    la nota se pedirá de nuevo hasta que la nota sea correcta. 
  * 
 */
public class n_NotaAlumnos {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
                 
        
        int nota;
        
        do {
            
            System.out.println("Ingresar la nota de lxs alumnxs: ");
            nota = Leer.nextInt();
            
        } while ((nota <= 0)||(nota >= 10));

                     
        System.out.println("La nota es correcta...");
                    
    }

}
        

        


    // && AND
    // || OR
    // ? : Ternario 

  // if <condicion> { <sentencias A> } else { <sentencias B> } 

 
  // while ((condicion logica)&&(condicion logica)) {
  // System.out.println("etc");
  // }


  //do {
            
  // System.out.println("Ingresar la nota de lxs alumnxs: ");
  // nota = Leer.nextInt();
            
  // } while ((nota > 0)&&(nota < 10));