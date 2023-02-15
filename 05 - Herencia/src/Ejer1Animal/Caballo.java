

package Ejer1Animal;

/**
 *
 */
public class Caballo extends Animal{

    private String rellincha;

    public Caballo() {
    }

    public Caballo(String rellincha) {
        this.rellincha = rellincha;
    }

    public Caballo(String rellincha, String nombre, String aliimento, Integer edad, String raza) {
        super(nombre, aliimento, edad, raza);
        this.rellincha = rellincha;
    }

    public String getRellincha() {
        return rellincha;
    }

    public void setRellincha(String rellincha) {
        this.rellincha = rellincha;
    }

    @Override
    public String toString() {
        return "Caballo{" + "rellincha=" + rellincha + '}';
    }

  
    




}




