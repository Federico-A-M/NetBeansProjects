
package Ejer1;


import java.util.Scanner;

/**
  * @author Federico.A.M.
  * 
  * 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
    Autor, Número de páginas, y un constructor con todos los atributos pasados por
    parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
    datos al usuario y luego informar mediante otro método el número de ISBN, el título,
    el autor del libro y el numero de páginas.
 */
public class MainListasLibros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
            


        //Iteracion objeto con constructor vacio
            Libro libro1 = new Libro();
        //Iteracion objeto con constructor predefinido
            Libro libro2 = new Libro(1641896, "El amor en los tiempos de Colera", "Garcia Marquez", 260);
        
        System.out.println("Ingrese el ISBN: ");
            libro1.setISBN(sc.nextInt());
        System.out.println("Ingrese Titulo: ");
            libro1.setTítulo(sc.next());
        System.out.println("Ingrese nombre del Autor: ");
            libro1.setAutor(sc.next());
        System.out.println("Ingrese numero de paginas: ");
            libro1.setPaginas(sc.nextInt());
        
        
      mostrarDatos(libro1);
      mostrarDatos(libro2);
        

    }
    
    
    public static void mostrarDatos(Libro libro1){
        System.out.println("Se muestran los datos");
        System.out.println("ISBN: " + libro1.getISBN());
        System.out.println("TITULO: " + libro1.getTítulo());
        System.out.println("AUTOR: " + libro1.getAutor());
        System.out.println("PAGINAS: " + libro1.getPaginas());
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
