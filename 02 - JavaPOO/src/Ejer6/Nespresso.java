
package Ejer6;


/**
  * @author Federico.A.M.
 */
public class Nespresso {

    public static void main(String[] args) {
  
                Service serv = new Service();
                Cafetera maquina = new Cafetera();
                
                
                
                serv.llenarCafetera(maquina);
                serv.servirTaza(maquina);
                serv.vaciarCafetera(maquina);
                serv.agregarCafe(maquina);
                
        


 



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

//------------------------------------>>>

        //Iteracion objeto con constructor vacio
            //<Objeto> cosa1 = new <Objeto>();
        //Iteracion objeto con constructor predefinido
            //<Objeto> cosa2 = new <Objeto>("Atributo", "Atributos", "Atributoss", "Atributosss");
        
        
        //mostrarDatos(Cosa1);
        //mostrarDatos(Cosa2);

//    public static void mostrarDatos(Objeto Cosa1){
//        System.out.println("Se muestran los datos");

//        System.out.println("Atributo: " + cosa1.get<Atributo1>());
//        System.out.println("Atributo: " + cosa1.get<Atributo2>());
//        System.out.println("Atributo: " + cosa1.get<Atributo3>());
//        System.out.println("Atributo: " + cosa1.get<Atributo4>());