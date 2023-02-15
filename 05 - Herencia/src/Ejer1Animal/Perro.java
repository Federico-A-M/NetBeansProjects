

package Ejer1Animal;

/**
 *
 * @author Federico.A.M.
 */
public class Perro extends Animal {

    private String ladrido;

    public Perro(String ladrido) {
        this.ladrido = ladrido;
    }

    public Perro(String ladrido, String nombre, String aliimento, Integer edad, String raza) {
        super(nombre, aliimento, edad, raza);
        this.ladrido = ladrido;
        
        
    }

    public String getLadrido() {
        return ladrido;
    }

    public void setLadrido(String ladrido) {
        this.ladrido = ladrido;
    }

    @Override
    public String toString() {
        return "Perro{" + "ladrido=" + ladrido + '}';
    }






}


        