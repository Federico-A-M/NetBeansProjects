

package Ejer3;

import java.util.ArrayList;

/**
 *Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
 */

public class Alumno {

        
        private String nombre;
        private ArrayList<Integer> nota;

        
        
    public Alumno() {
        this.nota = new ArrayList();
    }

    public Alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    public void setNotas(Integer nota1,Integer nota2,Integer nota3) {
        this.nota.add(nota1);
        this.nota.add(nota2);
        this.nota.add(nota3);
    }





}


