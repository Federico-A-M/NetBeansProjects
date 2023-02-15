

package Ejer8;


public class Cadena {

  
        private String Frase;
        private Integer largo;

    public Cadena() {
    }

    public Cadena(String Frase, Integer largo) {
        this.Frase = Frase;
        this.largo = largo;
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Cadena{" + "Frase=" + Frase + ", largo=" + largo + '}';
    }

        
 




}
