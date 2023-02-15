package Ejerc11;

import java.util.Date;
import java.util.Scanner;

/**
 * @author Federico.A.M.
 *
 * 11. Clase Date: En este ejercicio deberemos instanciar en el main, una fecha
 * usando la clase Date, para esto vamos a tener que crear 3 variables(Atributos), dia, mes
 * y anio que se le pedirán al usuario para poner en el constructor del objeto Date. 
 */
public class Ejer11Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");   

    
        int dia = 0;
        do {
             System.out.println("Ingrese el dia");
             dia = sc.nextInt();
                    
        } while (dia > 99);
        
        int mes = 0;
        do {
            System.out.println("Ingrese el mes");
            mes = sc.nextInt();  
            
        } while (mes > 12);
        
        
        System.out.println("Ingrese el año");
        int anio = sc.nextInt(); 
        
/*
116: ¿porque 116? Esto es el año, tenemos que tener en cuenta que inicialmente empieza en 1900 
y lo que hace es sumarle el valor que le demos 1900+116 = 2016. Si ponemos 2016 en realidad, 
sería el año 3916.
        
5: este es el mes, pero si es el 5 ¿No debería ser Mayo? 
No, porque empieza en 0 por lo que el 5 seria el sexto mes, en este caso Junio.
*/

        Date fecha = new Date(anio-1900, mes-1, dia);
        System.out.println(fecha);
                
//Uno que genera la hora actual simplemente                
        System.out.println("Genera la fecha actual");
        Date fechaActual = new Date();
        System.out.println(fechaActual);  
/*    
mostrar cuantos años hay entre esa fecha y la fecha actual, que se puede conseguir
instanciando un objeto Date con constructor vacío.    
*/
        int aniodif = ((fechaActual.getYear())-(fecha.getYear()));
        //Date fechaDiferencia = new Date(aniodif-1900);
        System.out.println("La diferencia de años es de " + aniodif+" años.");

        
        
        
        
    }

}



























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
