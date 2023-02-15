

package Ejer4Calcular;

/**
 *
 */
public class Rectangulo implements calculosFormas {


    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public void areaRectangulo(Double base, Double altura) {
            System.out.println("El area del rectangulo es: " + base*altura);
    }

    @Override
    public void perimetroRectangulo(Double base, Double altura) {
            System.out.println("El area del rectangulo es: " + (base+altura)*2);
    }

    @Override
    public String toString() {
        return "base: " + base + ", altura: " + altura;
    }

    
    
    
    
    
    
    
    @Override
    public void areaCirculo(Double radio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void perimetroCirculo(Double diametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
      

        





}





       // En contructor vacio recordar:
       // Se inicializan las colecciones para que no esten en null, si no vacios.
        
       // libros = new ArrayList();
        
       // numeros = new HashSet();
        
       // alumnos = new HashMap();


