
package Ejer2;


/**
 * @author Federico.A.M.
 * 
 * 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
    de tipo real. A continuación, se deben crear los siguientes métodos:
    * 
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
public class Circulos {

    public static void main(String[] args) {
               
      
        Circunferencia circulo = new Circunferencia();
        circulo.crearCircunferencia();
        circulo.Area();
        circulo.Perimetro(); 
        
   
    }

}

        
        
        
//        System.out.println("Ingrese el Radio: ");
//            circulo.setRadio(sc.nextDouble());
//        
//        
//            //Funcion o subprograma creado fuera del sistema main.
//            mostrarDatos(circulo);
//        
        

        






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
