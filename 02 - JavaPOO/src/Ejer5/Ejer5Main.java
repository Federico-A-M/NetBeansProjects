
package Ejer5;


/**
  * @author Federico.A.M.
 */
public class Ejer5Main {

    public static void main(String[] args) {
        
         Service serv = new Service();
         Cuenta User = serv.crearCuenta();
       
         serv.crearCuenta();
         //Mala Sintaxis: serv.ingreso(objet)
//         serv.Ingreso(Cuenta user);
//         serv.Retiro(Cuenta user);

         serv.Ingreso(User);
         serv.retirar(User);
         serv.consultarDatos(User);
         
        


 



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
