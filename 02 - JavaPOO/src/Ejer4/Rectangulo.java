

package Ejer4;

/**
 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
 */
public class Rectangulo {


        private Integer Base;
        private Integer Altura;
        


    public Rectangulo() {
    }

    public Rectangulo(Integer Base, Integer Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public Integer getBase() {
        return Base;
    }

    public void setBase(Integer Base) {
        this.Base = Base;
    }

    public Integer getAltura() {
        return Altura;
    }

    public void setAltura(Integer Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "Base=" + Base + ", Altura=" + Altura + '}';
    }

    




}




