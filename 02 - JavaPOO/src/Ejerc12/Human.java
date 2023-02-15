package Ejerc12;

import java.util.Date;

public class Human {

    private String nombre;
    private Date fechaDeNacimiento; // Atributo tipo Date

    public Human(Date fechaDeNacimiento, String nombre) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
    }

    public Human() {

        fechaDeNacimiento = new Date(); // Esto es para que no se cree la fecha en null 

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void llenarFecha(Date fechaNacimiento) {

        this.fechaDeNacimiento = fechaNacimiento; // Lo guardamos en el atributo

    }

    public void llenarNombre(String n) {

        this.nombre = n;

    }

    /*
    A partir de la fecha de nacimiento ingresada.
    Tener en cuenta que para conocer la edad de la persona también se debe
    conocer la fecha actual. 
     */
    public int calcularEdad(int año) {
            int diferencia = año - 2021; // se puede hacer mejor pero paja
            System.out.println("Tiene "+ diferencia +" años de edad.");
            return diferencia;
    }

    /*
    Agregar a la clase el método menorQue(int edad) que recibe como parámetro 
    otra edad y retorna true en caso de que el receptor tenga menor edad que la
    persona que se recibe como parámetro, o false en caso contrario.
     */
    public boolean menorQue(int edad) {
        boolean aux=false;
        if (edad<18) {
                        aux=true;
        }
        return aux;
    }

    public void mostrarFecha() {

        System.out.println("Dia:" + fechaDeNacimiento.getDate() // Mostramos el dia con getDate, no con getDay
                + " Mes:" + fechaDeNacimiento.getMonth() // Mostramos el mes 
                + " Año:" + fechaDeNacimiento.getYear()); // Mostramos el año

    }

    @Override
    public String toString() {
        return "Human{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }

}
