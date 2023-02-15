

package Extra2;

import java.util.Scanner;

/**
 *Clase Polideportivo con su nombre y tipo de instalación que puede ser
  Techado o Abierto, esta clase implementará los dos métodos abstractos y los
  atributos del padre
 */
public class Polideportivo extends Edificio{
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    private Boolean Techado = false;

    public Polideportivo() {
    }

    
    
    
    public Polideportivo(String nombre, Boolean Techado) {
        this.nombre = nombre;
        this.Techado = false;
    }

    public Polideportivo(String nombre, Boolean Techado, Double Alto, Double Ancho, Double Largo) {
        super(Alto, Ancho, Largo);
        this.nombre = nombre;
        this.Techado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return Techado;
    }

    public void setTechado(Boolean Techado) {
        this.Techado = Techado;
    }

        
    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", Techado=" + Techado + '}';
    }

    
    
    
    
    
    
    public void Techo(){
        

        System.out.println("El condominio tiene techo? Y/N");
        String  aux = sc.next();
        this.Techado = aux.equalsIgnoreCase("y");

//        if (aux.equalsIgnoreCase("y")) {
//            this.Techado =  true;
//        }
        
    }
    
    
    @Override
    public void calcularSuperficie() {
    //base * altura / 2
    Double superficie =(this.Ancho*this.Largo);
        System.out.println("La superficie dio "+superficie);
    }

    @Override
    public void calcularVolumen() {
    //V = (l) x (a) x (h), donde V denomina el Volumen del prisma rectangular.
    //mientras que (l) es el largo del prisma, (a) es el ancho y (h) es la altura.
    Double volumen = (this.Alto*this.Ancho*this.Largo);
    System.out.println("El volumen de la estructura es: "+ volumen);
    
    }

    public void crearPoli(){
        System.out.println("Indique el Alto del  edificio: ");
        Double aux = sc.nextDouble();
        this.Alto = aux;
        
        System.out.println("Indique el Ancho del  edificio: ");
        aux = sc.nextDouble();
        this.Ancho = aux;
        
        System.out.println("Indique el Largo del  edificio: ");
        aux = sc.nextDouble();
        this.Largo = aux;

    }    
      

        





}



