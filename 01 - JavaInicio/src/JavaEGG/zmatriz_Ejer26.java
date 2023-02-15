package JavaEGG;


import java.util.Scanner;

/**
 * @author Federico.A.M. 26. Realice un programa que compruebe si una matriz
 * dada es anti simétrica. Se dice que una matriz A es anti simétrica cuando
 * ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es
 * anti simétrica si A = -AT . La matriz traspuesta de una matriz A se denota
 * por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 */
public class zmatriz_Ejer26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // <tipo_dato> variable = sc.next<tipo_dato>(); 

        //genera random una matriz
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int ran = (int) (Math.random() * 9);
                matriz[i][j] = ran;
            }
        }
        // imprime la primera matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(matriz[i][i]);
        }
        
        System.out.println(" ");
        System.out.println(" ");
        
        
        // Creamos y generamos una matriz transpuesta
        int[][] matrizT = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                matrizT[i][j] = matriz[j][i];
            }
        }
        // mostramos por pantalla
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizT[i][j]+" ");
            }
            System.out.println(matrizT[i][i]);
        }
        
        //si trato de hacerla de [2][2] no la puedo hacer cuadrada, preguntar por que...
        // terminar despues de preguntar si esta bien planteado
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
