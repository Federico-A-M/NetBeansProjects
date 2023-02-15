
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 17. Un dispositivo RS232, lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: 
tienen que ser de un máximo de 5 caracteres de largo, el primer 
arácter tiene que ser X y el último tiene que ser una O. 
                    
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
* 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals()
* 
 */
public class s_Ejer17 {

    public static void main(String[] args) {



        Scanner Leer = new Scanner(System.in);
        
        String cadena;
        int buenas = 0, malas = 0;
        
        do {
            System.out.println("Ingrese cadenas: ");
            cadena = Leer.nextLine();

            if (cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O") && cadena.length() <= 5) {
                buenas = buenas + 1;
            } else {
                malas = malas + 1;
            }

        } while (!cadena.equals(("&&&&&")));
        
        System.out.println("Intentos correctos: " + buenas);
        System.out.println("Intentos incorrectas: " + malas);


 



    }

}



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

