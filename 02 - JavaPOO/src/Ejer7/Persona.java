

package Ejer7;

/**
 *
 * @author Federico.A.M.
 */
public class Persona {

        //Atributos - caracteristicas ejemplos
        private String nombre;
        private Integer edad;
        //private Character sexo;
        private String sexo;
        private Integer peso;
        private Integer altura;
        
//metodo constructor vacio

    public Persona() {
        
    }

    public Persona(String nombre, Integer edad, String sexo, Integer peso, Integer altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }



}


