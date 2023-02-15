package JavaEGG;



/**
 * @author Federico.A.M.
 */
public class t_Ejer18 {

    public static void main(String[] args) {

        


        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {

                    System.out.println(String.format("%s-%s-%s", i, j, k).replace("3", "E"));

                }
            }
        }
    }
}




/*
String.format acepta como primer parametro un String, pero con un formato especifico, donde aparece %s es que va a ser reemplazado por los parametros siguientes, en el orden que se ingresan

Entonces el primer %s se reemplaza por la variable i, el segundo por la j, el tercero por la k

Luego de esto realizo un .replace("3","E") que hace literalmente eso, quita todos los "3" de la cadena y deja un "E"

.replace es un metodo de String.class de java, no es de ninguna api ni nada raro
 */









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
