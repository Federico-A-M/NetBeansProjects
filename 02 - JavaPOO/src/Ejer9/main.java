
package Ejer9;

public class main {

    public static void main(String[] args) {
        
        
        Matematicas mate = new Matematicas();
        mate.setNum1(Math.random()*10);
        mate.setNum2(Math.random()*10);
        
        System.out.println(ServiciosMatematicas.calcularPotencia(mate));
        System.out.println(ServiciosMatematicas.calcularRaiz(mate));
        System.out.println(ServiciosMatematicas.devolverMayor(mate));
        
    }
    
}
