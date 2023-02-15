package Ejerc10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Federico.A.M. 
 * 10. Realizar un programa en Java donde se creen dos
 * arreglos: el primero será un arreglo A de 50 números reales, y el segundo B,
 * un arreglo de 20 números, también reales. 
 
 */
public class ArraysMain {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");   

    
//Tipo[].nombreVector = new <tipo>[Tamaño]
        float[] A = new float[51];
        float[] B = new float[21];
    
System.out.println("El programa deberá inicializar el arreglo A con números\n "
                   + "aleatorios y mostrarlo por pantalla.");

        for (int i = 0; i < 51; i++) {
            A[i]+= (Math.random() * 45);
            System.out.println(i);
            System.out.println(A[i]);
        }
        
System.out.println(" ");    
System.out.println(" Luego, el arreglo A se debe ordenar de menor a mayor. ");         
System.out.println("");

        System.out.println(" ");
        Arrays.sort(A);
        for (int i = 0; i < 50; i++) {
            System.out.println(A[i]);
        }


        
System.out.println(" ");    
System.out.println(" copiar los primeros 10 números ordenados al arreglo B de 20 elementos, \n" +
"y rellenar los 10 últimos elementos con el valor 0.5. ");         
System.out.println(" ");
        
        for (int i = 0; i < 21; i++) {
            
            if (i<=10) {
                B[i] += A[i];
            } else {
                B[i] += (0.5);
            }
            
        }
System.out.println(" ");        
System.out.println(" ");    
System.out.println("  Mostrar los dos arreglos resultantes: el ordenado de 50 elementos\n" +
"// y el combinado de 20. ");         
System.out.println("");
            
            System.out.println("Arreglo B: ");
            System.out.println(" ");
            for (int i = 0; i < 21; i++) {
                System.out.println(i);
                System.out.println(B[i]);
            }
            System.out.println(" ");        
            System.out.println("Arreglo A: ");
            System.out.println(" ");
        
            for (int i = 0; i < 51; i++) {
            System.out.println(i);
            System.out.println(A[i]);
            }
     
        
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
