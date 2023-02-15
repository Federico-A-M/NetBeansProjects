package Ejer5;

import static Ejer5.Comparadores.OrdenarGalaxia;
import static Ejer5.Comparadores.OrdenarHabitable;
import static Ejer5.Comparadores.OrdenarMasa;
import static Ejer5.Comparadores.OrdenarNombre;
import static Ejer5.Comparadores.OrdenarSistema;
import static Ejer5.Comparadores.OrdenarTipo;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.TreeSet; valioza leccion :( no se puede ordenar por atributos, se ordena solo. conviene que sea un solo tipo de atributo objeto.

public class Servicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Planetario> Universo = new ArrayList();

/*pedirá planetas en un bucle, se 
guardará el planeta en el conjunto y después se le preguntará al usuario si quiere 
guardar otro planeta o si quiere salir, si decide salir, se mostrará todos los países 
guardados en el conjunto*/
    public void CrearPlanetario() {
        int num = 0;
        System.out.println("Bienvenidxs a la base de datos del planetario!");
        System.out.println("Descea cargar un nuevo planeta al sistema?: ");
        System.out.println("Y/N");
        String select = sc.next();

        if (select.toUpperCase().charAt(0) == 'Y') {
            LlenarPlanetario();
        }

        System.out.println("");
        System.out.println("Descea recorrer el listado de opciones de la base de datos?");
        System.out.println("Y/N");
        select = sc.next();
        if (select.toUpperCase().charAt(0) == 'Y') {
            
            do {
                System.out.println("Como quiere visualizar la lista? Segun: " 
                        + "\n (1) Por Orden alfabetico segun nombres de los Planetas."
                        + "\n (2) Cantidad de Lunas"
                        + "\n (3) Tipo de composicion"
                        + "\n (4) Masa planetaria"
                        + "\n (5) Sistema que orbita"
                        + "\n (6) Galaxia por orden alfabetico en que se encuentra"
                        + "\n (7) Segun posibilidiad de habitabilidad humana"
                        + "\n (8) Salir"); 
            
            num = sc.nextInt();

            switch (num) {
                case 1:
                    MostrarPlanetario();
                    break;
                case 2:
                    //MostrarLunas();
                    break;
                case 3:
                    MostrarComposicion();
                    break;
                case 4:
                    MostrarMasa();
                    break;
                case 5:
                    MostrarSistema();
                    break;
                case 6:
                    MostrarGalaxia();
                    break;
                case 7:
                    MostrarHabitable();
                    break;
            }
                
            } while (!(num==8));
            
            
            
            
            
        }

        System.out.println("Gracias por utilizar nuestra base de datos!.");
        System.out.println("El sistema se ha cerrado correctamente.");
        
    }

    public void LlenarPlanetario() {
        Integer num = 0;
        String Aux = "";
        Double tamaño;
        tamaño = 0.0;
        String select = " ";

        do {
            System.out.println(" ");
            Planetario planeta = new Planetario();
            System.out.println("Ingrese el nombre del planeta: ");
            Aux = sc.next();
            planeta.setNombre(Aux);

            System.out.println("");
            System.out.println("Posee Satelites?: Y/N ");
            select = sc.next();
            if (select.toUpperCase().charAt(0) == 'Y') {
                System.out.println("Cuantos orbitan?: ");
                num = sc.nextInt();
                for (int i = 0; i < num; i++) {
                    System.out.println("Ingrense el nombre del satelite " + i + ".");
                    Aux = sc.next();
                    planeta.setLuna(Aux);
                }
            }

            System.out.println("");
            System.out.println("Cual es su composicion?: (1)Gaseoso / (2)Rocoso");
            num = sc.nextInt();
            if (num == 1) {
                planeta.setTipo("Gaseoso");
            }
            if (num == 2) {
                planeta.setTipo("Rocoso");
            } else {
                planeta.setTipo("Desconocido");
            }

            System.out.println("");
            System.out.println("Masa planetaria?: ");
            tamaño = sc.nextDouble();
            planeta.setMasa(tamaño);

            System.out.println("");
            System.out.println("Sistema que orbita?: (1)Solar / (2)Exoplaneta / (3)Errante.");
            num = sc.nextInt();
            if (num == 1) {
                planeta.setSistema("Solar");
            }
            if (num == 2) {
                planeta.setSistema("Exoplaneta");
            }
            if (num == 3) {
                planeta.setSistema("Errante");
            } else {
                planeta.setSistema("Desconocido");
            }

            System.out.println("");
            System.out.println("Galaxia en que se encuentra?: ");
            Aux = sc.next();
            planeta.setGalaxia(Aux);

            System.out.println("");
            System.out.println("Es Habitable? Y/N");
            Aux = sc.next();
            if (Aux.toUpperCase().charAt(0) == 'Y') {
                planeta.setHabitable(true);
            }
            if (Aux.toUpperCase().charAt(0) == 'N') {
                planeta.setHabitable(false);
            }
            
            Universo.add(planeta);

            System.out.println("");
            System.out.println("El planeta ha sido cargado a la base de datos con exito!");
            System.out.println("Descea cargar otro cuerpo celeste?... Y/N ");
            Aux = sc.next();

        } while (Aux.toUpperCase().charAt(0) == 'Y');

    }

//-------------------------------------------------->>
    
    public void MostrarPlanetario() {
       Universo.sort(OrdenarNombre);
       Universo.forEach((planetario) -> {
           System.out.println(planetario);
        });
    }

//     public void MostrarLunas() {
//
//    }
     
    public void MostrarComposicion() {
               Universo.sort(OrdenarTipo);
               Universo.forEach((planetario) -> {
                   System.out.println(planetario);
        });
        
    }
     
    public void MostrarMasa() {
       Universo.sort(OrdenarMasa);
       Universo.forEach((planetario) -> {
           System.out.println(planetario);
        });
    }
    
    public void MostrarSistema() {
       Universo.sort(OrdenarSistema);
       Universo.forEach((planetario) -> {
           System.out.println(planetario);
        });
    }    
    
    public void MostrarGalaxia() {
       Universo.sort(OrdenarGalaxia);
       Universo.forEach((planetario) -> {
           System.out.println(planetario);
        });
    }    
    
    public void MostrarHabitable() {
       Universo.sort(OrdenarHabitable);
       Universo.forEach((planetario) -> {
           System.out.println(planetario);
        });
    }    
    
}
