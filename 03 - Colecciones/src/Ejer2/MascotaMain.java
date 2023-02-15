package Ejer2;

import Ejer1.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Después de mostrar los perros, al usuario se le pedirá una raza y se
 * recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el
 * perro está en la lista, se eliminará el perro que ingresó el usuario y se
 * mostrará la lista ordenada. Si el perro no se encuentra en la lista, se le
 * informará al usuario y se mostrará la lista ordenada.
 *
 */
public class MascotaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        
        
        ArrayList<String> raza = new ArrayList();
        String leer = " ";

        do {

            System.out.println("Ingrese la raza: ");
            String razaaux = sc.next();

            raza.add(razaaux);

            System.out.println("Quiere agregar otro chiquito ??: ");
            leer = sc.next();

        } while (leer.equals("si"));

        MostrarPerritos(raza);
        
        System.out.println("elimine un chiquito ");
        String perrito = sc.next();
        RecorrerPerro(raza, perrito);
        raza.sort(Ordenar);

        MostrarPerritos(raza);
        
        
        
        System.out.println("adio");

    }

    
    
    
    public static void MostrarPerritos(ArrayList<String> p) {

        for (String razas : p) {
            System.out.println(razas);
        }

    }

    
    public static void RecorrerPerro(ArrayList<String> p, String pedido){
        Iterator<String> iterador = p.iterator();
        
        boolean noesta = true;
        
        while (iterador.hasNext()){
            
            if (iterador.next().equals(pedido)) {
                iterador.remove();
                noesta = false;
                break;
            } 
            
        }
        
        if (noesta) {
            System.out.println("El chiquito no estaba =) ");
            MostrarPerritos(p);
        }
        
    }
    
    
    public static Comparator<String> Ordenar = new Comparator<String>(){// el señor huevo aca pone cntrl+space y seleccionas compare
        
        @Override
        public int compare(String t, String t1) {
            return t.compareTo(t1);
        }
        
//        @Override
//        
//        public int comparar(String raza1, String raza2){
//            
//            return raza1.compareTo(raza2);
//        }

    };
    
    
    
    
    
}



















//copiar y pegar rapido: cntrl + c(copiamos) y (cltrl + sifht + flechita)

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
