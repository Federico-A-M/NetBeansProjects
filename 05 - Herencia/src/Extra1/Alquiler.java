

package Extra1;

import java.time.LocalDate;


/**
 *el nombre, 
 * documento del cliente, 
 * la fecha de alquiler, 
 * fecha de devolución, 
 * la posición del amarre
 * y el barco que lo ocupará
 */
public class Alquiler {

    private String nombre;
    private Integer DNI;
    
    private LocalDate alquiler;
    private LocalDate devolucion;
    
    private Integer N_amarre;
    private Barco barco;

    
    
    
    public Alquiler() {
    }

    public Alquiler(String nombre, Integer DNI, LocalDate alquiler, LocalDate devolucion, Integer N_amarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.N_amarre = N_amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public LocalDate getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(LocalDate alquiler) {
        this.alquiler = alquiler;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }

    public Integer getN_amarre() {
        return N_amarre;
    }

    public void setN_amarre(Integer N_amarre) {
        this.N_amarre = N_amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    
    
    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", DNI=" + DNI + ", alquiler=" + alquiler + ", devolucion=" + devolucion + ", N_amarre=" + N_amarre + ", barco=" + barco + '}';
    }
    
    
   

        





}


