

package Ejer4;

import java.util.Scanner;

/**
    *Service"" incluirá un método para crear el
    rectángulo con los datos del Rectángulo dados por el usuario. 
 */
public class Service {


    Scanner sc = new Scanner(System.in).useDelimiter("\n");

// Crear un objeto desde el Service y entregarlo al Main (Toma los atributos de la clase iteradora)
    public Rectangulo crearRectangulo(){
    Rectangulo cuad = new Rectangulo();
            System.out.println("Defina la base de un rectangulo: ");
            cuad.setBase(sc.nextInt());
            System.out.println("Defina una altura: ");
            cuad.setAltura(sc.nextInt());
        return cuad;

}
    
// Crea funciones que retorna variables por valor o referencia.
    
    
    

// y un método para calcular el perímetro del rectángulo.    
   public static void MedirPerimetro(Rectangulo cuad){
               Integer perimetro = ((cuad.getAltura())^2)+((cuad.getAltura())^2) ;     
               System.out.println("El Perimetro del rectangulo es: "+perimetro);
               
               
       
}
//También incluirá un método para calcular la superficie(area) del rectángulo   
   public static void MedirArea(Rectangulo cuad){
                Integer superficie = (cuad.getAltura())*(cuad.getAltura()) ; 
                System.out.println("La superficie del rectangulo es: "+ superficie);
}    
/*Por último, tendremos un método que dibujará el
  rectángulo mediante asteriscos usando la base y la altura.
*/

    public static void DibujarRectangulo(Rectangulo cuad){

        int A = (cuad.getAltura());
        int B = (cuad.getBase());
        
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B-1; j++) {
                
                if ((j==0) || (i==0) || (i==A)) {
                    
                    System.out.print("*");
                    
                } else {
                    
                    System.out.print(" ");
                    
                }
              
            }
            System.out.println("*");
        }
        
                       
}    
    
    
}



