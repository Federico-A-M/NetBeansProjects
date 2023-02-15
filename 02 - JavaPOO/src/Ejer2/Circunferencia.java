
package Ejer2;

import java.util.Scanner;

public class Circunferencia {

       
    
        //Atributos - caracteristicas ejemplos
        private double Radio;
      
        // metodo constructor vacio
        public Circunferencia(){  
      }

//------------------------------->>> 
        
        
//metodo constructor con parametros

        public Circunferencia(double Radio) {
        this.Radio=Radio;

    }

//------------------------------->>    
        
//Metodos getters y setters de encapsulamiento = click izquierdo + code -> getters y setters.

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

//---------------------------->>>

    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el Radio de la circunferencia: ");
                setRadio(sc.nextDouble());  
}    
    
    
        public void Area(){
            
            double Area;
            
            Area=(3.14)*((Radio)*(Radio)) ;
            
            System.out.println("El area del circulo es: " + Area);
            
}    
    
            public void Perimetro(){
                
            double Perimetro;
            
            Perimetro = ((2*3.14)*Radio);
            
            System.out.println("El area del circulo es: " + Perimetro);               
}    
    
}

  

