

package Ejer1Adopcion;

public class Mascotas {

    //. Mascotas, que tendrá como atributos: nombre, raza, edad y tamaño

    private String nombre;
    private String especie;
    private Integer edad;
    private Double tamaño;

    public Mascotas() {
    }

    public Mascotas(String nombre, String especie, Integer edad, Double tamaño) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return especie;
    }

    public void setRaza(String especie) {
        this.especie = especie;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", raza=" + especie + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }
       

}


      