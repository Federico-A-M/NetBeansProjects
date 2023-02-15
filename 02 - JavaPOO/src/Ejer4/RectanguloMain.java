
package Ejer4;

import java.util.Scanner;



/**80
  * @author Federico.A.M.
 */
public class RectanguloMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");   
         
        Service crear = new Service();
        
         
        Rectangulo cuad = crear.crearRectangulo();
        
        Service.MedirArea(cuad);
        Service.MedirPerimetro(cuad); 
        Service.DibujarRectangulo(cuad);
        
        System.out.println(cuad);
        
        
               
         
         
         


 



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

//------------------------------------>>>

 //Declaracion y creacion de un vector
        //Tipo[].nombreVector = new <tipo>[Tamaño]

        //declaracion y creacion de una matriz 
        //<Tipo de dato>[][] nombredelamatriz = new <tipo de dato>[Filas][Columnas]
