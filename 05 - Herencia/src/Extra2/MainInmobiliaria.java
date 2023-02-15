package Extra2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El
 * ArrayList debe contener dos polideportivos y dos edificios de oficinas.
 * 
 * Luego, recorrer este array y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio.
 *                                                           Se deberá mostrar la superficie y el  volumen de cada edificio. 
 * 
 * Además de esto, para la clase Polideportivo nos
 * interesa saber cuantos polideportivos son techados y cuantos abiertos. 
 * 
 * 
 * Y para la clase EdificioDeOficinas deberemos llamar al método cantPersonas() y
 * mostrar los resultados de cada edificio de oficinas.
 */
public class MainInmobiliaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Edificio> edilicios = new ArrayList(); 
        
        Polideportivo poli1 = new Polideportivo();
        Polideportivo poli2 = new Polideportivo();
        
        poli1.crearPoli();
        poli1.Techo();
        System.out.println("");
        poli2.crearPoli();
        poli2.Techo();
        System.out.println("");
        EdificioDeOficinas edif1 = new EdificioDeOficinas();
        EdificioDeOficinas edif2 = new EdificioDeOficinas();
        
        edif1.crearEdificio();
        edif2.crearEdificio();
        System.out.println("");
        
        edilicios.add(edif1);
        edilicios.add(edif2);
        edilicios.add(poli1);
        edilicios.add(poli2);
        
        int aux = 1;
        int cont = 0;
        
        for (Edificio edilicio : edilicios) {
            System.out.println("Edificio"+aux);
            System.out.println(edilicio.toString());
            edilicio.calcularSuperficie();
            edilicio.calcularVolumen();
            aux ++;
            
            if (edilicio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edi = (EdificioDeOficinas) edilicio;
                edi.cantPersonas();
               
            }
            
            if (edilicio instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) edilicio;
                if (object.getTechado()) {
                    cont++;
                }
            }
            
        }
        
        System.out.println("La cantidad de polideportivos abiertos fueron: " + (2-cont));
        System.out.println("La cantidad de polideportivos techados dio: "+ cont);
        
        
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
