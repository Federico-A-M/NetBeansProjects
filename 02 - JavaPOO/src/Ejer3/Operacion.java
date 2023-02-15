

package Ejer3;

import java.util.Scanner;

/**
 *
 * @author Federico.A.M.
 */
public class Operacion {

Scanner sc = new Scanner(System.in).useDelimiter("\n"); 

//Atributos - caracteristicas ejemplos
        private Integer numero1;
        private Integer numero2;
        

//metodo constructor vacio

       public Operacion(){  
       // predefinir un atributo constructor: this.<Atributo2> = <constante>;
}

//metodo constructor con parametros

        public Operacion(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        
    }

//Metodos getters y setters de encapsulamiento = click izquierdo + code -> getters y setters.

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

//------------------------------------------------------>>>>
    
            public void crearOperacion(){
//que le pide al usuario los dos números y los guarda en los atributos del objeto.
                System.out.println("Ingrese el primer valor: ");
                numero1 = sc.nextInt();
                
                System.out.println("Ingrese el segundo valor a operar ");
                numero2 = sc.nextInt();
}
            
            public void sumar(){
//calcular la suma de los números y devolver el resultado al main
            Integer suma = (numero1+numero2);
                System.out.println("La suma de: "+numero1+" + "+numero2+" es "+ suma);

}        
            
            public void restar(){
//calcular la resta de los números y devolver el resultado al main
            Integer rest = (numero1-numero2);
                System.out.println("La resta de: "+numero1+" - "+numero2+" es "+ rest);
}        
            
            public void multiplicar(){
//primero valida que no se haga una multiplicación por cero,
//si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
//error. Si no, se hace la multiplicación y se devuelve el resultado al main    
                if ((numero1*numero2)!=(0)) {
                    int mult = (numero1*numero2);
                    System.out.println("El productor entre: "+numero1+" * "+numero2+" es "+ mult);
                    
                } else {
                    System.out.println("Error: el valor ingresado da cero");
                }
}
            
            public void dividir(){
                
//primero valida que no se haga una división por cero, si fuera a
//pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//al main
                
            
                if ((numero1!=0)||(numero2!=0)) {
                double div = (numero1/numero2);
                System.out.println("la division entre: "+numero1+" / "+numero2+" es "+ div);
                    
                } else {
                System.out.println("Error: no se puede dividir por cero");
                }

} 
    
    
    
    
//    public void sumar(){
//                
//            double Perimetro;
//            
//            Perimetro = ((2*3.14)*Radio);
//            
//            System.out.println("El area del circulo es: " + Perimetro);               
//}    
    
    
    
    
    
    
    
    
}