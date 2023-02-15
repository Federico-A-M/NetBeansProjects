package Ejer4;

import static Ejer4.Utilidades.OrdenarDirector;
import static Ejer4.Utilidades.OrdenarTiempodeMayor;
import static Ejer4.Utilidades.OrdenarTiempodeMenor;
import static Ejer4.Utilidades.OrdenarTitulo;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCine {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Peliculas> videoteca = new ArrayList();
//Nota: recordar el uso del Comparator para ordenar colecciones con objetos.

    public void llenarPelis() {

        String aux = "";

        do {
            Peliculas pelicula = new Peliculas();

            System.out.println("Ingrese el nombre del director de cine: ");
            aux = sc.next();
            pelicula.setDirector(aux);

            System.out.println("Ingrese el nombre del Film: ");
            aux = sc.next();
            pelicula.setTitulo(aux);

            System.out.println("Ingrese la duracion: ");
            Double tiempo = sc.nextDouble();
            pelicula.setDuracion(tiempo);

            videoteca.add(pelicula);

            System.out.println("Descea cargar un nuevo film a la base de datos?: ");
            aux = sc.next();

        } while (aux.equals("si"));

    }

    public void opciones() {
        String aux = "";
        System.out.println("Descea mostrar la lista de peliculas ? Y/N ");
        aux = sc.next();
        int num = 0;
        
        if (aux.toUpperCase().equals("Y")) {

            do {
                System.out.println("Como quiere visualizar la lista?Segun: Peliculas(1) / Largometraje(2) \n"
                    + "/ De larga a corta duracion(3) // de menor a mayor duracion (4) \n"
                    + " Titulos Alfabeticamente (5) // Direcctores (6) // Saliir (7)");

            
            num = sc.nextInt();

            switch (num) {
                case 1:
                    MostrarPelis();
                    break;
                case 2:
                    PelisLargas();
                    break;
                case 3:
                    PelisTiempoDescendente();
                    break;
                case 4:
                    PelisTiempoAscendente();
                    break;
                case 5:
                    OrdenTitulos();
                    break;
                case 6:
                    OrdenDirectores();
                    break;
                default:
                    System.out.println("No existe un valor válido");
            }
                
            } while (!(num==7));
            
            

        } else {
            System.out.println(" Gracias por utilizar nuestra app ! ");
        }
    }

//• Mostrar en pantalla todas las películas.
    public void MostrarPelis() {
        System.out.println("Las peliculas de la lista son: ");
        for (Peliculas peliculas : videoteca) {
            System.out.println(peliculas.getTitulo());

        }
    }


//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void PelisLargas() {
        for (int i = 0; i < videoteca.size(); i++) {
            
            if ((videoteca.get(i).getDuracion()) >= 60.00) {
                System.out.println(videoteca.get(i));
            }
            
        }
        
        
    }

//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.
    public void PelisTiempoDescendente() {

        videoteca.sort(OrdenarTiempodeMayor);
        for (Peliculas peliculas : videoteca) {
            System.out.println(peliculas);
        }
    }

//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
    public void PelisTiempoAscendente() {

        videoteca.sort(OrdenarTiempodeMenor);
        for (Peliculas peliculas : videoteca) {
            System.out.println(peliculas);
        }

    }

//• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
    public void OrdenTitulos() {

        videoteca.sort(OrdenarTitulo);

        for (Peliculas peliculas : videoteca) {
            System.out.println(peliculas);
        }

    }

//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void OrdenDirectores() {

        videoteca.sort(OrdenarDirector);

        for (Peliculas peliculas : videoteca) {
            System.out.println(peliculas);
        }
    }

}
