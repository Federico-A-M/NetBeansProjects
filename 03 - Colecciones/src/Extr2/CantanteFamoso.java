

package Extr2;

/**
 *Esta clase guardará cantantes famosos y
    tendrá como atributos el nombre y discoConMasVentas
 */
public class CantanteFamoso {

        private String nombre;
        private String Disco;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String Disco) {
        this.nombre = nombre;
        this.Disco = Disco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisco() {
        return Disco;
    }

    public void setDisco(String Disco) {
        this.Disco = Disco;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", Disco=" + Disco + '}';
    }
    
      




}


        // En contructor vacio recordar:
        // Se inicializan las colecciones para que no esten en null, si no vacios.
        
       // libros = new ArrayList();
        
       // numeros = new HashSet();
        
       // alumnos = new HashMap();


