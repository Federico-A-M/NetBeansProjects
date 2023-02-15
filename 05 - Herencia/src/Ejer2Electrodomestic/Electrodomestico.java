package Ejer2Electrodomestic;

import java.util.Scanner;

/**
 * los siguientes atributos: precio, color, consumo energético (letras entre A y
 * F) y peso.
 */
public class Electrodomestico {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    protected Double precio;
    protected String color;
    protected char consumo;
    protected Integer peso;

    public Electrodomestico() {
        this.precio = 1000d;
    }

    public Electrodomestico(Double precio, String color, char consumo, Integer peso) {
        this.precio = 1000d;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Electrodomestico crearElectrodomestico() {
        // le pide la información al usuario y llena el electrodoméstico, 
        System.out.println("Ingrese el precio del articulo: ");
        Double pesos = sc.nextDouble();
        this.precio = pesos;
        if (precio<1000) {
            this.precio = 1000d;
        }

        // también llama los métodos para comprobar el color y el consumo. Al precio se le da un valor base de $1000.   
        System.out.println("Ingrese el color: ");
        String croma = sc.next();
        this.color = comprobarColor(croma);

        System.out.println("Ingrese el consumo: ");
        String volt = sc.next();
        char letra = volt.toLowerCase().charAt(0);
        this.consumo = comprobarConsumoEnergetico(letra);

        System.out.println("Ingrese el peso: ");
        Integer masa = sc.nextInt();
        this.peso = masa;

        //precioFinal();

        return new Electrodomestico (precio, color, consumo, peso);
    }

    private char comprobarConsumoEnergetico(char letra) {
// comprueba que la letra es correcta, sino es correcta usara la letra F por defecto.

        if (!(letra == 'a') || (!(letra == 'b')) || (!(letra == 'c')) || (!(letra == 'd')) || (!(letra == 'e'))) {
            letra = 'f';
        }
        return letra;

        //Este método se debe invocar al crear el objeto y no será visible.
    }

    private String comprobarColor(String color) {
// comprueba que el color es correcto, y
//si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//está en mayúsculas o en minúsculas. Este método se invocará al crear el
//objeto y no será visible.
        if (!(color.equalsIgnoreCase("negro"))) {
            if ((!(color.equalsIgnoreCase("rojo")))) {
                if ((!(color.equalsIgnoreCase("azul")))) {
                    if ((!(color.equalsIgnoreCase("gris")))) {
                        color = "blanco";
                    }
                }
            }

        }

        return color;
    }

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
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "sc=" + sc + ", precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    
    
    
}
