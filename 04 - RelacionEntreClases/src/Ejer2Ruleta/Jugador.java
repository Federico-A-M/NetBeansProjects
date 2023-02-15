package Ejer2Ruleta;

/**
 * id (representa el número del jugador), nombre (Empezara con Jugador más su
 * ID, “Jugador 1” por ejemplo) y mojado (indica si está mojado o no el
 * jugador). El número de jugadores será decidido por el usuario, pero debe ser
 * entre 1 y 6. Si no está en este rango, por defecto será 6
 */
public class Jugador {

    private Integer id;
    private static Integer idmasmas = 1;
    //-----------------------------------
    private String nombre;
    private Boolean mojado;
    private Revolver revolver;

    public Jugador() {
    }

    public Jugador(String nombre, Boolean mojado) {
        this.id = idmasmas;
        this.nombre = nombre+" "+id; 
        this.mojado = mojado;
        idmasmas++;
        
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "(Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}' + "\n";
    }
    
    /*Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, --el jugador se moja--. El atributo mojado pasa a false y el método
devuelve true, sino false*/
    
    public Revolver disparo(Revolver r){
        
               
        boolean aux = r.mojar(r);
        
        
        r.setPosicion(r.siguienteChorro(r, aux));
        
        
        return r;
    }
    
}


