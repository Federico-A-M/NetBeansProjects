
package Ejer7;



/**
  * @author Federico.A.M.
 */
public class Ejer7Main {

    public static void main(String[] args) {
   
        
        Service serv = new Service();
        
        //serv.crearPersona();
        Persona human1 = new Persona("Ramon", 24, "H", 47, 180);
        //serv.crearPersona();
        Persona human2 = new Persona("Jose", 29, "H", 81, 163);
        //serv.crearPersona();
        Persona human3 = new Persona("Maria", 17, "M", 52, 140);
        //serv.crearPersona();
        Persona human4 = new Persona("Listorti", 15, "O", 120, 150);
        
        
        int p1 = serv.calcularIMC(human1);
        int p2 = serv.calcularIMC(human2);
        int p3 = serv.calcularIMC(human3);
        int p4 = serv.calcularIMC(human4);
     
        boolean tv1 = serv.mayorEdad(human1);
        boolean tv2 = serv.mayorEdad(human2);
        boolean tv3 = serv.mayorEdad(human3);
        boolean tv4 = serv.mayorEdad(human4);
        
        int PD;
        PD = serv.ContadorPORDEBAJO(p1, p2, p3, p4);
        int PI;
        PI = serv.ContadorPESOIDEAL(p1, p2, p3, p4);
        int SP;
        SP = serv.ContadorSOBREPESO(p1, p2, p3, p4);
        
        
        int MY;
        MY = serv.ContadorMAYOREDAD(tv1, tv2, tv3, tv4);
        int MN;
        MN = serv.ContadorMENOREDAD(tv1, tv2, tv3, tv4);
        
        
        
        System.out.println(" ");
    System.out.println("El porcentaje de personas por debajo de su peso ideal es: "+ ((PD / 4)*100)+" %");
    System.out.println("El porcentaje de personas en su peso ideal es: "+ ((PI / 4)*100)+" %");        
        System.out.println("El porcentaje de personas por debajo de su peso ideal es: "+ ((SP / 4)*100)+" %");
        System.out.println(" ");
    System.out.println("El porcentaje de personas mayores de edad fueron: "+ ((MY / 4)*100)+" %");
    System.out.println("El porcentaje de personas menores de edad son: "+ ((MN / 4)*100)+" %");
        
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