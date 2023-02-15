

package FExtra6;

/**
 *Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y 
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:

* Constructores, tanto el vacío como el parametrizado.

 */
public class Ahorcado {

        private String Palabra[];
        private Integer Enc;
        private Integer CantMax;

    public Ahorcado() {
        this.Enc = 0;
    }

    public Ahorcado(String[] Palabra, Integer Enc, Integer CantMax) {
        this.Palabra = Palabra;
        this.Enc = 0;
        this.CantMax = CantMax;
    }

    public String[] getPalabra() {
        return Palabra;
    }

    public void setPalabra(String[] Palabra) {
        this.Palabra = Palabra;
    }

    public Integer getEnc() {
        return Enc;
    }

    public void setEnc(Integer Enc) {
        this.Enc = Enc;
    }

    public Integer getCantMax() {
        return CantMax;
    }

    public void setCantMax(Integer CantMax) {
        this.CantMax = CantMax;
    }

}



