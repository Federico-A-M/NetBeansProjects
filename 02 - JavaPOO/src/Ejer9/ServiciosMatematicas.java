
package Ejer9;

public class ServiciosMatematicas {
        
    public static double devolverMayor(Matematicas mate){
       return Math.max(mate.getNum1(), mate.getNum2());
    }
    
    public static float calcularPotencia(Matematicas mate){
        return Math.round(Math.pow(Math.max(mate.getNum1(),mate.getNum2()), Math.min(mate.getNum1(),mate.getNum2())));
    }
    
    public static double calcularRaiz(Matematicas mate){
        return Math.sqrt(Math.abs(Math.min(mate.getNum1(),mate.getNum2())));
    }        
}
