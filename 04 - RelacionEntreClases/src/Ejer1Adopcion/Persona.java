

package Ejer1Adopcion;

import java.util.ArrayList;

public class Persona {

// Persona con atributos: nombre, apellido, edad, documento y Mascotas.

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private ArrayList<Mascotas> mascotas;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, ArrayList<Mascotas> mascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascotas = mascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", mascotas=" + mascotas + '}';
    }

    
    
}

