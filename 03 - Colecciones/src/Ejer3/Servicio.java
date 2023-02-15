package Ejer3;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> Estudiantes = new ArrayList(); // Aqui guardamos todos los objetos.

    /**
     * deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
     * información al usuario y ese Alumno se guarda en una lista de tipo Alumno
     * y se le pregunta al usuario si quiere crear otro Alumno o no. *
     */
    public void LlenarLista() {

        String aux = "";

        do {

            System.out.println("Agregue a la lista el alumnado: ");
            Alumno alumnos = GenerarAlumno(); //aca generamos el objeto alumno igualando al metodo invocado.
            Estudiantes.add(alumnos);

            System.out.println("ya termino el listado? presione(no) para salir // presione (si) para salir");
            aux = sc.next();

        } while (aux.toUpperCase().equals("no"));

        
        recorrerColecciones(Estudiantes);
        
        double promedio = 0.0;

        System.out.println(" ");
        System.out.println("Descea promediar la nota final de alguno de los alumnos?: (si) o (no) para salir");
        aux = sc.next();
        if (aux.toUpperCase().equals("si")) {

            promedio = notaFinal(Estudiantes);
            System.out.println("");
            System.out.println("El promedio del alumno dio: " + promedio);

        } else {
            System.out.println("Fin del programa");

        }

    }

    private Alumno GenerarAlumno() {

        Alumno e = new Alumno();
        System.out.println("Nombre del estudiante: ");
        String nombre = sc.next();
        e.setNombre(nombre);

        System.out.println("Ingrese la nota del primer trimestre: ");
        Integer nota1 = sc.nextInt();
        System.out.println("Ingrese la nota del segundo trimestre: ");
        Integer nota2 = sc.nextInt();
        System.out.println("Ingrese la nota del tercer trimestre: ");
        Integer nota3 = sc.nextInt();
        e.setNotas(nota1, nota2, nota3);
        
        return e;
    }

   /* private ArrayList<Integer> LlenarNotas() {

        ArrayList<Integer> nota = new ArrayList();
        System.out.println("Ingrese la nota del primer trimestre: ");
        Integer nota1 = sc.nextInt();
        System.out.println("Ingrese la nota del segundo trimestre: ");
        Integer nota2 = sc.nextInt();
        System.out.println("Ingrese la nota del tercer trimestre: ");
        Integer nota3 = sc.nextInt();

        nota.add(nota1);
        nota.add(nota2);
        nota.add(nota3);

        return nota;
    }*/

    /* Tendremos el siguiente método en la clase Alumno: 
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main. */
    
    public double notaFinal(ArrayList<Alumno> p) {

        double notafinal = 0.0;

        System.out.println("Indique el nombre del estudiante: ");
        String nombre;
        nombre = sc.next();

        for (Alumno aux : p) {

            if (nombre.equals(aux.getNombre())) {
                int nota1 = aux.getNota().get(0);
                int nota2 = aux.getNota().get(1);
                int nota3 = aux.getNota().get(2);
                notafinal = (double) (nota1 + nota2 + nota3) / 3;

                break;
            }

        }

        return notafinal;

    }

    public void recorrerColecciones(ArrayList<Alumno> Estudiante) {

        for (Alumno alumno : Estudiante) {
            System.out.println(alumno);
        }

    }

}
