package JavaEGG;

import java.util.Scanner;

/**
 * @author Federico.A.M.
 *
 * 15. Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:
 *
 * MENU 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir Elija opción:
 *
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado
 * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que
 * se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción
 * 5, en vez de salir del programa directamente, se debe mostrar el siguiente
 * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si
 * el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se
 * vuelve a mostrar el menú
 */
public class p_MenuCalculos {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Ingresar dos valores a continuacion: ");
        num1 = Leer.nextInt();
        num2 = Leer.nextInt();

        boolean Final;
        Final = false;

        while (Final != true) {

            System.out.println(" ");
            System.out.println(" ");
            System.out.print("* MENU\n" + "1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir\n" + "5. Salir\n" + "Elija opción: ");

            int select;
            select = Leer.nextInt();

            switch (select) {
                case 1:
                    System.out.println("");
                    System.out.println("La Suma de " + num1 + " mas " + num2 + " es igual a " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("La Resta de " + num1 + " mas menos " + num2 + " es igual a " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("El producto entre " + num1 + " y " + num2 + " es igual a " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("La Razon entre " + num1 + " y " + num2 + " es igual a " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("");
                    System.out.println(" Estas seguro que descea salir ?? (S)=Salir // (N)=Regrsar al menu: ");
                    String Choise = Leer.next();

                    if (Choise.toUpperCase().charAt(0) == 'S') {
                        System.out.println("Gracias por usar nuestro sistema de calculo ");
                        Final = true;

                    }
                    break;    
                default:
                    System.out.println("");
                    System.out.println("La opcion no esparte del menu...");
                    break;
                    
            }
        }

    }
}

