package Extr3;

import java.util.HashSet;
import java.util.Scanner;

public class LibreriaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    HashSet<Libreria> Biblioteca = new HashSet();

    
        public void opciones() {

        int num = 0;
        String leer = " ";

        do {
            System.out.println(" "
                    + "\n (1) Guarde un libro."
                    + "\n (2) Prestaciones"
                    + "\n (3) Devoluciones"
                    + "\n (4) Salir");

            num = sc.nextInt();

            switch (num) {
                case 1: // agregar producto
                       guardarlibro();
                    break;
                       
                case 2: 
                       System.out.println("Indique el libro a prestar");
                       leer = sc.next();
                       metodoPrestamo(leer);
                    break;
                       
                       
                case 3: // mostrar lista
                       System.out.println("Indique la devolucion: ");
                       leer = sc.next();
                       metodoDevolucion(leer);
                    break;
            }

        } while (!(num == 4));

        mostrar();

        System.out.println("Fin del programa.");

    }
    
    private Libreria Crear() {

        System.out.println("Ingrese el titulo del libro: ");
        String Titulo = sc.next();
        System.out.println("Nombre del autor: ");
        String Autor = sc.next();
        System.out.println("Numero de ejemplar: ");
        Integer Ejemplar = sc.nextInt();
        System.out.println("Esta prestado: ");
        Integer Prestamo = sc.nextInt();

        return new Libreria(Titulo, Autor, Ejemplar, Prestamo);

    }

    public void guardarlibro() {

        String aux = "";

        do {

            Libreria Libro = Crear();
            Biblioteca.add(Libro);

            System.out.println("Descea guardar un libro mas ? Y/N ");
            aux = sc.next().toUpperCase();

        } while (aux.equals("Y"));

    }

    public void metodoPrestamo(String LibroPrestar) {

        Boolean comprobacion = false;

        for (Libreria libro1 : Biblioteca) {

            if (LibroPrestar.equalsIgnoreCase(libro1.getTitulo())) {
                if (libro1.getEjemplares() > 0) {
                    libro1.setEjemplares(libro1.getEjemplares() - 1);
                    libro1.setPrestamos(libro1.getPrestamos() + 1);
                    comprobacion = true;
                    break;
                }

            }

        }

        if (comprobacion) {
            System.out.println("El libro se ha prestado.");
        } else {
            System.out.println("El libro no se encuentra para prestar");
        }
        
    }

    public void metodoDevolucion(String LibroPrestar) {

        Boolean comprobacion = false;

        for (Libreria libro1 : Biblioteca) {

            if (LibroPrestar.equalsIgnoreCase(libro1.getTitulo())) {
                if (libro1.getEjemplares() > 0) {
                    libro1.setEjemplares(libro1.getEjemplares() + 1);
                    libro1.setPrestamos(libro1.getPrestamos() - 1);
                    comprobacion = true;
                    break;
                }

            }

        }

        if (comprobacion) {
            System.out.println("El libro se ha devuelto.");
        } else {
            System.out.println("El libro no se ha prestado, no se puede devolver.");
        }
        
    }
    
    public void mostrar(){
        
        for (Libreria libreria : Biblioteca) {
            System.out.println(libreria);
        }
        
    }
    
}

