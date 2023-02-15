package Ejerc12;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos: 
*/
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        Human p1 = new Human();
        
        System.out.println("Ingrese su nombre");
        String name = scan.next();

        System.out.println("Ingrese el dia");
        int dia = scan.nextInt();

        System.out.println("Ingrese el mes");
        int mes = scan.nextInt();

        System.out.println("Ingrese el año");
        int anio = scan.nextInt();

        Date fechaNacimiento = new Date(); // Creamos el objeto tipo Date

        fechaNacimiento.setDate(dia); // Seteamos el dia
        fechaNacimiento.setMonth(mes-1); // Seteamos el mes
        fechaNacimiento.setYear(anio-1900); // Seteamos el anio

        p1.llenarFecha(fechaNacimiento);
        p1.llenarNombre(name);
        int edad = p1.calcularEdad(anio);
        boolean aux = p1.menorQue(dia);
        
        
        //  p1.mostrarFecha() + Nombre();
        System.out.println(p1);
        
  
    }

}
