package Ejer2Electrodomestic;

//resolución (en pulgadas) y sintonizador TDT (booleano),
public final class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean sintonizadorTDT = false;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT, Double precio, String color, char consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    
    
    
/*Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor*/
    public void crearTelevisor() {
        System.out.println("Tipo de producto: Televisor.");
        crearElectrodomestico();

        System.out.println("Resolucion del televisor: ");
        Integer reso = sc.nextInt();
        this.resolucion = reso;

        System.out.println("Posee sintonizador TDT?: Y/N ");
        String carg = sc.next();
        
        if (carg.equalsIgnoreCase("y")) {
            this.sintonizadorTDT = true;
        }
        
    }

    
/*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. 
    
Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.*/
    
    
    @Override
    public void precioFinal(){

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
        
        if (this.resolucion>40) {
            this.precio += (precio*30)/100;
        }
        
        if (sintonizadorTDT) {
            this.precio += 500d;
        }
        
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + ", precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
    
    
    
}

