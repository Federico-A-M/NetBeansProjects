package Ejer2Electrodomestic;

/**
 *
 * @author Federico.A.M.
 */
public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {

    }

    public Lavadora(Integer carga, Double precio, String color, char consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;

    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Lavadora crearLavarropas() {
        System.out.println("Tipo de producto: Lavarropas.");
        crearElectrodomestico();

        System.out.println("Ingrese la carga del lavarropas: ");
        Integer carg = sc.nextInt();
        this.carga = carg;

        return new Lavadora(carga, precio, color, consumo, peso);

    }

    @Override
    public void precioFinal() {

        if (consumo == 'a') {
            this.precio += 1000.0d;
        }
        if (consumo == 'b') {
            this.precio += 800.0d;
        }
        if (consumo == 'c') {
            this.precio += 600.0d;
        }
        if (consumo == 'd') {
            this.precio += 500.0d;
        }
        if (consumo == 'e') {
            this.precio += 300.0d;
        }
        if (consumo == 'f') {
            this.precio += 100.0d;
        }
        //--------------------------------------------------------------<<
        if ((peso >= 1) && (peso < 20)) {
            this.precio += 100.0d;
        }
        if ((peso >= 20) && (peso < 50)) {
            this.precio += 500.0d;
        }
        if ((peso >= 50) && (peso < 80)) {
            this.precio += 800.0d;
        }
        if (peso > 80) {
            this.precio += 1000.0d;
        }
        //--------------------------------------------------------------<<
        if (this.carga > 30) {
            this.precio += 500;
        }

    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + ", precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

}

// En contructor vacio recordar:
// Se inicializan las colecciones para que no esten en null, si no vacios.
// libros = new ArrayList();
// numeros = new HashSet();
// alumnos = new HashMap();

