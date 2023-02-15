package JavaEGG;

import java.util.Scanner;

/**
 * @author Federico.A.M.
 *
 * 24. Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 */
public class vector_Ejer24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una dimension: ");
        int num = sc.nextInt();
        int[] vector = new int[num];

        for (int i = 0; i < num; i++) {

            int numeros = (int) (Math.random() * 99999);

            vector[i] = numeros;
            System.out.print(vector[i]+ " ");  
        }

        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;

        for (int i = 0; i < num; i++) {

            if (vector[i] <= 9) {
                uno = uno + 1; 
                
            } else if ((vector[i] <= 99) && (vector[i]>9)) {
                dos = dos + 1;
                    
            } else if ((vector[i] <= 999) && (vector[i]>99)) {
                tres = tres + 1; 
                        
            } else if ((vector[i]<=9999)&&(vector[i]>999)) {
                cuatro = cuatro + 1;
                            
            } else if ((vector[i] <= 99999) && (vector[i]>9999)) {
                cinco = cinco + 1; 
                                
            }
        }

        System.out.println("los numeros de 1 digito fueron "+uno);
        System.out.println("los numeros de 2 digito fueron "+dos);
        System.out.println("los numeros de 3 digito fueron "+tres);
        System.out.println("los numeros de 4 digito fueron "+cuatro);
        System.out.println("los numeros de 5 digito fueron "+cinco);
        
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
