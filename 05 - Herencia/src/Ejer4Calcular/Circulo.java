

package Ejer4Calcular;


public class Circulo implements calculosFormas {

private Double radio;
private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void areaCirculo(Double radio) {
            System.out.println("El area del circulo es: " + Math.pow(Math.PI*radio, 2));
    }

    @Override
    public void perimetroCirculo(Double diametro) {
            System.out.println("El perimetro del circulo es: " + Math.PI*diametro);
    }

    @Override
    public String toString() {
        return "radio: " + radio + ", diametro: " + diametro;
    }

    
    
    
    
    
    
    
    @Override
    public void areaRectangulo(Double base, Double altura) {

    }

    @Override
    public void perimetroRectangulo(Double base, Double altura) {

    }

      

        





}





       // En contructor vacio recordar:
       // Se inicializan las colecciones para que no esten en null, si no vacios.
        
       // libros = new ArrayList();
        
       // numeros = new HashSet();
        
       // alumnos = new HashMap();


