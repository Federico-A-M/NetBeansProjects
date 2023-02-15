
package Ejer4Cartas;

public class Carta {
     private Integer num;
     private Palo palo;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Carta() {
    }

    public Carta(Integer num, Palo palo) {
        this.num = num;
        this.palo = palo;
    }

    @Override
    public String toString() {
        //return "Carta{" + "num=" + num + ", palo=" + palo + '}';
        return "carta es "+ num + " de "+ palo + "\n";
    }

 
     
}
