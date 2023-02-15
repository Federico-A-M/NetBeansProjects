
package Ejer2Gaston;

public class Revolver {
   private Integer posActual;
   private Integer posAgua;

    public Revolver() {
        //Cuando cree un revolver, se va a setear automaticamente ambas posiciones
        this.posActual = (int)(Math.random()*6)+1;
        this.posAgua = (int)(Math.random()*6)+1;
    }

    public Revolver(Integer posActual, Integer posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver - " + "posActual:" + posActual + ", posAgua:" + posAgua + '}';
    }
    
    public Boolean mojar(){
        if (posActual == posAgua) {
            return true;
        } else {
            return false;
        }
    }
    
    public void siguienteChorro(){
        this.posActual++;
        if (posActual == 7) {
            this.posActual = 1;
        }
    }
    
    
   
   
}
