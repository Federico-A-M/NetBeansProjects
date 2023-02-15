

package Ejer5Ori;



import java.util.Objects;



/**
 *
 * 
 */                 //Se llama a esta interfas -¿? que compara los objetos entre si
public class Paises implements Comparable<Paises>{

        private String name;

        
        
    public Paises() {
    }

    public Paises(String name) {
        this.name = name;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Se inserta alt+insert equals and has code a la clase para asignar un numero de serie
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        return Objects.equals(this.name, other.name);
    }

    
    
    @Override
    public String toString() {
        return "Paises{" + "name=" + name + '}';
    }

    //el metodo del principio habilita el comparador de objetos entres si, una especie de comparator.
    @Override
    public int compareTo(Paises t) {
            return this.name.compareTo(t.getName());
    }

        
        
}
