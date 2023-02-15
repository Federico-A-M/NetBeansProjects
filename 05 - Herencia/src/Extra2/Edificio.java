

package Extra2;

/**
 *
 * @author Federico.A.M.
 */
public abstract class Edificio {

    protected Double Alto;
    protected Double Ancho;
    protected Double Largo;

    public Edificio() {
    }

    public Edificio(Double Alto, Double Ancho, Double Largo) {
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Largo = Largo;
    }

    
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();

      

        





}





       // En contructor vacio recordar:
       // Se inicializan las colecciones para que no esten en null, si no vacios.
        
       // libros = new ArrayList();
        
       // numeros = new HashSet();
        
       // alumnos = new HashMap();


