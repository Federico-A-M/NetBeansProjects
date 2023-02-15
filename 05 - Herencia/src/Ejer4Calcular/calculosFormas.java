
package Ejer4Calcular;

/**
 * tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.

* 
* Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos.
* 
* 
* Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
* 
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
public interface calculosFormas {
    
    public void areaCirculo(Double radio);
    public void perimetroCirculo(Double diametro);
    
    public void areaRectangulo(Double base, Double altura);
    public void perimetroRectangulo(Double base, Double altura);
    
    
}
