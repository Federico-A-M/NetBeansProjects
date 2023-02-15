/*
Realizar la multiplicacion de un vector por una matriz 

dado un vector 1xN + Matriz 2x3 = Producto de 1(vector)*3(matriz) 1x3

Ej: V=[3,5] + M=[4,8,6] = [3*4+5*2,3*8+5*1,3*6+5*7] = [22,29,53]
                [2,1,7]

*/
package JavaEGG;

import java.util.Scanner;

/**
  * @author Federico.A.M.
 */
public class EJEMPLO_VxM {

    public static void main(String[] args) {


        //Declaracion y creacion de un vector
        //Tipo[].nombreVector = new <tipo>[Tamaño]
        
        //Declarar un arreglo de una dimension 
        int[] vector; 
        // Crear en memoria (construir/dimensionar)con el valor por defecto (cero para todos los enteros)  
        vector = new int[2];    
        //los dos pasos en una linea:
        int[] producto = new int[3]; 

        //declaracion y creacion de una matriz 
        //<Tipo de dato>[][] nombredelamatriz = new <tipo de dato>[Filas][Columnas]
        
        //Declaracion e iniciacion de los valores predeterminados
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};
        
        
        //Declaracion y creacion de arreglos genericos
        //<tipo>[][]... [] nombrearreglo = new tipo [cardinal 1][cardinal 1]...[cardinal N];

        System.out.println("Tngrese los valores del vactor tamaño " + vector.length + ":");    
        Scanner leer = new Scanner(System.in);
        
        // int = 0, porque los subindices de los arreglos en java inician en 0
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]=");
            // accede al valor i del vector
            vector[i] = leer.nextInt();
        }

        // Multiplicar vector por matriz...
        int sum;
        //... para cada columna de la matriz...
        for (int j = 0; j < matriz[0].length; j++) {
            sum = 0;
            //... recorro el vector y multiplico
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i] * matriz[i][j]; 
            }
            producto[j] = sum;
        }

//        ----------------------------------
        
        
        String aux = ""; 

        
        // Mostrar vector con FOR "mejorado"
        System.out.println("* vector");
        // bucle for mejrado (enhanced)
        // for (<tipo de dato> variable inventada: array)
        for (int element: vector) {
            aux = aux + " " + element;
    
        }
        System.out.println(aux);
        
        
        // mostrar la matriz 
        System.out.println("\n* matriz:");
        // para cada fila de la matriz 
        for (int[] fila: matriz ){
            aux = "";
            // para cada elemento de la fila
            for (int elemento: fila ){
                aux += " " + elemento; 
            }
            System.out.println(aux);
        }
        
        //mostrar resultado 
        aux = " ";
        System.out.println("\n* Vector x Matriz: ");    
        for (int elemento: producto) {
            aux += " " + elemento;
        }        
        System.out.println(aux);
        
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