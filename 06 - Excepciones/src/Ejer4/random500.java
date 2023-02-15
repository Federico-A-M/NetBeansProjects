
package Ejer4;

import java.util.Objects;
import java.util.Scanner;

/**
 4. Escribir un programa en Java que juegue con el usuario a adivinar un número. La 
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene 
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la 
computadora debe decirle al usuario si el número que tiene que adivinar es mayor 
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe 
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado 
adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se 
debe contar el carácter fallido como un intento.
 */
public class random500 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");   
         

        Integer random = (int) (Math.random() * 499)+1;
        Integer intentos = 0;
        int count = 0;
        System.out.println("Intente encontrar el numero random ! ");
        
        try {
            
            while (!Objects.equals(random, intentos)) {  
                System.out.println(random);
                System.out.println("intentos: "+count);
                intentos = sc.nextInt();
                if (intentos<random) {
                    System.out.println("El numero es mayor que el ingresado");
                } else if (intentos>random) {
                    System.out.println("El numero es menor que el ingresado");
                } 
                
                count++;
            }
            
            if (Objects.equals(random, intentos)) {
                System.out.println("Lo has conseguido en " + count + " Intentos!!");
            }
            
            
        } catch (Exception e) {
            System.err.println("Error ingresando datos. Sus intentos fueron: " + (count+1));
        
        } finally {
            System.err.println("Fin del programa");
        }    
 



    }




}






//copiar y pegar rapido: cntrl + c(copiamos) y (cltrl + sifht + flechita)
// Escribir rapido el metodo main: (psvm + tabulador)


/*CLASE STRING
frase.charAt(0) - da como resultado la letra en esa posicion
frase.equals("Hola mundo") - compara y da False o True
frase.compareTo(frase2) - dio 7 ¿¿???
frase.compareToIgnoreCase(frase3) - dio como resultado 0 ¿¿??
frase.concat("!") - suma un simbolo o caracter o numero a una frase
frase.contains("a") - Retorna un TRUE si contiene la letra
frase.endsWith("a") - Saber si termina en un caracter: retorna False o True
frase.startsWith - Saber si empieza en un caracter: retorna False o True
frase.indexOf("a") - haberigua en que posicion se encuentra "a" - devolvio 3
frase.length() - el largo, retorna un numero
frase.replace("o", "a") - reemplaza caracteres por otro o numeros
frase.substring(0, 1) - Retorna la letra en posicion indicada
frase.toUpperCase() - Retorna mayusculas
frase.toLowerCase() - Retorna minusculas

char car=sc.next().charAt(0);
-----------------

Se ha usado el metodo append() "Adjuntar" y la clase StringBuilder, se escribe del modo similar

public void invertirFrase(Cadena f){{
		
		StringBuilder inverso = new StringBuilder();

		for (int i = (f.getLargo() - 1); i >= 0; i--){

			inverso.append(f.getFrase().charAt(i));
		}
                System.out.println(" ");
		System.out.println("Frase al revez: "+inverso);   
	}




-----------------

.valueOF()
String numero = " ";
numero = numero.valueOf(1234);
numero = "1234" en caracteres

-----------------
EN ARRAYS
frase.split(" "," ")
String[] vector = frase.split(" ", 3); // Separamos la frase en dos en el espacio vacio

System.out.println("Frase uno: " + vector[0]);
System.out.println("Frase dos: " + vector[1]);

Frase uno: Hola
Frase dos: Mundo
-----------------

*/



/*CLASE MATH
int numeroAzar = (int) (Math.random() * 10) - Metodo aletorio

Math.abs(numReal) - El valor absoluto de cualquier tipo de numero
Math.abs(numEntero) - El valor absoluto de cualquier tipo de numero
Math.max(num1, num2) - da el mayor numero comparativo
Math.min(num1, num2) - da el menor numero comparativo
Math.pow(num2, 2)) - la potencia de un numero
Math.round(numReal2) - redondeo entero
Math.floor(numReal2) - redondeo con decimal 0
Math.sqrt(num2)) - raiz cuadrada


*/


// && AND
// || OR
// ? : Ternario

//  do{
// ------------------------------>>
            
//  System.out.println("Ingresar..");
//  <Variable> = Leer.nextdato();

// ------------------------------>>

// while ((condicion)&&(condicion) {
// System.out.println("etc");
// }

// --------------------------------->>>

 //Declaracion y creacion de un vector
        //Tipo[].nombreVector = new <tipo>[Tamaño]

        //declaracion y creacion de una matriz 
        //<Tipo de dato>[][] nombredelamatriz = new <tipo de dato>[Filas][Columnas]

//------------------------------------>>>

        //Iteracion objeto con constructor vacio
            //<Objeto> cosa1 = new <Objeto>();
        //Iteracion objeto con constructor predefinido
            //<Objeto> cosa2 = new <Objeto>("Atributo", "Atributos", "Atributoss", "Atributosss");
        
        
        //mostrarDatos(Cosa1);
        //mostrarDatos(Cosa2);
// ------------------------------>>

//METODO IMPRESOR
//    public static void mostrarDatos(Objeto Cosa1){

//        System.out.println("Se muestran los datos");
//        System.out.println("Atributo: " + cosa1.get<Atributo1>());
//}