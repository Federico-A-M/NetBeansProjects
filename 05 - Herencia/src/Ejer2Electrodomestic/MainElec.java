package Ejer2Electrodomestic;

import java.util.ArrayList;

public class MainElec {

    public static void main(String[] args) {

        Lavadora lavadora1 = new Lavadora();
        Electrodomestico lavadora2 = new Lavadora(50, 100d, "azul", 'a', 90);
        
        lavadora1.crearLavarropas(); //esto llamaba a la clase madre pero no al metodo de la clase hija, por que estaba instanciado desde ELECTRODOMESTICO
        System.out.println(lavadora1.toString());
        System.out.println(lavadora2.toString()); // no logro hacer que se aplique el precio final siendo que esta instanciado desde el constructor lleno

        
        System.out.println(" ");
        Televisor tele1 = new Televisor();
        Electrodomestico tele2 = new Televisor(40, true, null, "gris", 'b', 60);
        
        tele1.crearTelevisor();
        
        System.out.println(tele1.toString());
        System.out.println(tele2.toString());

        //-------------------------------------->>
       
        ArrayList<Electrodomestico> lista = new ArrayList();
        lista.add(lavadora1);
        lista.add(lavadora2);
        lista.add(tele1);
        lista.add(tele2);
        
        System.out.println("");
        double finality = 0d;
        for (Electrodomestico electro : lista) {
            electro.precioFinal();
            System.out.println("El precio final de " + electro + " es " + electro.getPrecio());
            finality += electro.getPrecio();
        }
        
        System.out.println("El total de los productos es: " + finality );
        
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
