

package Ejer1Animal;

/**
 *
 */
public class Gato extends Animal {

    private String maulla; 
    private Boolean ronroneo;

    public Gato() {
    }

  
    public Gato(String maulla, Boolean ronroneo, String nombre, String aliimento, Integer edad, String raza) {
        super(nombre, aliimento, edad, raza);
        this.maulla = maulla;
        this.ronroneo = ronroneo;
    }

    public String getMaulla() {
        return maulla;
    }

    public void setMaulla(String maulla) {
        this.maulla = maulla;
    }

    public Boolean getRonroneo() {
        return ronroneo;
    }

    public void setRonroneo(Boolean ronroneo) {
        this.ronroneo = ronroneo;
    }

    @Override
    public String toString() {
        return "Gato{" + "maulla=" + maulla + ", ronroneo=" + ronroneo + '}';
    }

    

    



}


      