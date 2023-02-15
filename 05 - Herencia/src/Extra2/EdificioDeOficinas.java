package Extra2;

import java.util.Scanner;

/**
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y numero de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre.
 *
 *
 * De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
 * edificio,
 *
 * el usuario dirá cuantas personas entran en cada oficina,
 *
 * cuantas oficinas y el numero de piso (suponiendo que en cada piso hay una
 * oficina).
 *
 * Crear el método cantPersonas(), que muestre cuantas personas entrarían en un
 * piso y cuantas en todo el edificio.
 */
public class EdificioDeOficinas extends Edificio {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
    private Integer oficinas;
    private Integer xOficinas;
    private Integer pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer oficinas, Integer xOficinas, Integer pisos) {
        this.oficinas = oficinas;
        this.xOficinas = xOficinas;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(Integer oficinas, Integer xOficinas, Integer pisos, Double Alto, Double Ancho, Double Largo) {
        super(Alto, Ancho, Largo);
        this.oficinas = oficinas;
        this.xOficinas = xOficinas;
        this.pisos = pisos;
    }

    public Integer getOficinas() {
        return oficinas;
    }

    public void setOficinas(Integer oficinas) {
        this.oficinas = oficinas;
    }


    public Integer getxOficinas() {
        return xOficinas;
    }

    public void setxOficinas(Integer xOficinas) {
        this.xOficinas = xOficinas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "oficinas=" + oficinas + ", xOficinas=" + xOficinas + ", pisos=" + pisos + '}';
    }

    @Override
    public void calcularSuperficie() {
        //base * altura / 2
        Double superficie = (this.Ancho * this.Largo);
        System.out.println("La superficie dio " + superficie);
    }

    @Override
    public void calcularVolumen() {
        //V = (l) x (a) x (h), donde V denomina el Volumen del prisma rectangular.
        //mientras que (l) es el largo del prisma, (a) es el ancho y (h) es la altura.
        Double volumen = (this.Alto * this.Ancho * this.Largo);
        System.out.println("El volumen de la estructura es: " + volumen);

    }



    public void crearEdificio() {

        System.out.println("Indique el Alto del  edificio: ");
        Double aux = sc.nextDouble();
        this.Alto = aux;
        
        System.out.println("Indique el Ancho del  edificio: ");
        aux = sc.nextDouble();
        this.Ancho = aux;
        
        System.out.println("Indique el Largo del  edificio: ");
        aux = sc.nextDouble();
        this.Largo = aux;



// cuantas oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).

        System.out.println("Cuantos piso posee el edificio: ");
        Integer aux2  = sc.nextInt();
        this.pisos=aux2;
        this.oficinas=this.pisos;
        
        System.out.println("Cantidad de oficinas: " + this.oficinas);
        
// De esta clase nos interesa saber cuantas personas pueden trabajar en todo el edificio.
//   el usuario dirá cuantas personas entran en cada oficina, 
        System.out.println("Cuantas personas entran por oficina?: ");
        aux2 = sc.nextInt();
        this.xOficinas = aux2;
   
    }
 

    public void cantPersonas(){
        System.out.println("Cantidad de persona por piso" + this.xOficinas);
        System.out.println("Total de personas por edificio"+ this.xOficinas*this.pisos );
    }
// Crear el método cantPersonas(), que muestre cuantas personas entrarían en un
// piso y cuantas en todo el edificio.
    



}
