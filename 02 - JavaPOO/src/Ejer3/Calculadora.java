
package Ejer3;

import java.util.Scanner;

/**
  * @author Federico.A.M.
  *     Crear una clase llamada Operacion que tenga como atributos privados el numero1 y
        numero2. A continuación, se deben crear los siguientes métodos:
        
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.16
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
  * 
 */
public class Calculadora {

    public static void main(String[] args) {

            Operacion calc = new Operacion();
            
            calc.crearOperacion();
            calc.sumar();        
            calc.restar();        
            calc.multiplicar();
            calc.dividir(); 

 



    }

//    public static void mostrarDatos(Objeto Cosa1){
//        System.out.println("Se muestran los datos");

//        System.out.println("Atributo: " + cosa1.get<Atributo1>());
//        System.out.println("Atributo: " + cosa1.get<Atributo2>());
//        System.out.println("Atributo: " + cosa1.get<Atributo3>());
//        System.out.println("Atributo: " + cosa1.get<Atributo4>());


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
