

package Ejer2try;

import java.util.ArrayList;

/**
 *
 * @author Federico.A.M.
 */
public class Algunaclase {

 private ArrayList<Integer> Numeros;

    public Algunaclase() {
    }

    public Algunaclase(ArrayList<Integer> Numeros) {
        this.Numeros = Numeros;
    }

    public ArrayList<Integer> getNumeros() {
        return Numeros;
    }

    public void setNumeros(ArrayList<Integer> Numeros) {
        this.Numeros = Numeros;
    }

    @Override
    public String toString() {
        return "Algunaclase{" + "Numeros=" + Numeros + '}';
    }

      

        





}





       // En contructor vacio recordar:
       // Se inicializan las colecciones para que no esten en null, si no vacios.
        
       // libros = new ArrayList();
        
       // numeros = new HashSet();
        
       // alumnos = new HashMap();


