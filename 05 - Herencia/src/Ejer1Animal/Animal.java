package Ejer1Animal;

/**
 * Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
 * Crear un método en la clase Animal a través del cual cada clase hija deberá
 * mostrar luego un mensaje por pantalla informando de que se alimenta.
 */
public class Animal {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String aliimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = aliimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAliimento() {
        return alimento;
    }

    public void setAliimento(String aliimento) {
        this.alimento = aliimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", aliimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    public void comer(){
        System.out.println("El animal se alimenta de" + this.alimento);
        
    }
}



