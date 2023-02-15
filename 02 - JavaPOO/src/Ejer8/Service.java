

package Ejer8;

import java.util.Scanner;

public class Service {
Scanner sc = new Scanner(System.in).useDelimiter("\n");

 
       public void crearFrase(Cadena F){
            //string
        
        System.out.println("Ingrese una frase: ");
        F.setFrase(sc.next());
        F.setLargo((F.getFrase().length())); 
       //Cadena palabras = new Cadena(Frase, largo);
        
       // return palabras;
       }  

       public void contarVocales(Cadena p){
// Método mostrarVocales(), deberá contabilizar la cantidad de vocales
// que tiene la frase ingresada.         
            int A = 0;
            for (int i = 0; i < p.getLargo() ; i++) {
                
                if (p.getFrase().toUpperCase().charAt(i)=='A') {
                    A++;
                }  
            }
            System.out.println(" ");
            System.out.println("La frase tiene "+ A + " vocales A.");
            
            int E = 0;
            for (int i = 0; i < p.getLargo() ; i++) {
                
                if (p.getFrase().toUpperCase().charAt(i)=='E') {
                    E++;
                }  
            }
            System.out.println(" ");
            System.out.println("La frase tiene "+ E + " vocales E.");
            
            int I = 0;
            for (int i = 0; i < p.getLargo() ; i++) {
                
                if (p.getFrase().toUpperCase().charAt(i)=='I') {
                    I++;
                }  
            }
            System.out.println(" ");
            System.out.println("La frase tiene "+ I + " vocales I.");
            
            int O = 0;
            for (int i = 0; i < p.getLargo() ; i++) {
                
                if (p.getFrase().toUpperCase().charAt(i)=='O') {
                    O++;
                }  
            }
            System.out.println(" ");
            System.out.println("La frase tiene "+ O + " vocales O.");
        
                    int U = 0;
            for (int i = 0; i < p.getLargo() ; i++) {
                
                if (p.getFrase().toUpperCase().charAt(i)=='U') {
                    U++;
                }  
            }
            System.out.println(" ");
            System.out.println("La frase tiene "+ U + " vocales U.");
          
        }

       public void invertirFrase(Cadena f){{
// Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
// por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".   
        
        //Se ha usado el metodo append() "Adjuntar" y la clase StringBuilder
		StringBuilder inverso = new StringBuilder();

		for (int i = (f.getLargo() - 1); i >= 0; i--){

			inverso.append(f.getFrase().charAt(i));
		}
                System.out.println(" ");
		System.out.println("Frase al revez: " + inverso);
                System.out.println(" ");
	}
        
//        public void invertirFrase(Cadena f){
//           
//            String Aux = null;
//            
//            for (int i = 0; i < f.getLargo() ; i++) {
//                
//             //Aux += (f.getFrase().substring(f.getLargo()-i, f.getLargo()-i));
//             
//               Aux += Aux.concat()(f.getFrase().substring(f.getLargo()-i, f.getLargo()-i));
//                        
//            }
//            
//            System.out.println(Aux);
//       }
}
        
       public void  vecesRepetido(Cadena f){
//Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
//ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:   

        System.out.println("Escriba una letra para saber cuantas veces se repite en la frase: ");
        
        String select = sc.next();
        char aux = select.charAt(0); // lo toma unicamente de una variable String
        int cont = 0;
        char[] Caracteres = f.getFrase().toCharArray();

        for (int i=0; i < Caracteres.length; i++){
            
            if (Caracteres[i]==aux ) {
                
                cont++;
                
            }
            
            System.out.print("[" + i + "] " + Caracteres[i]);
        
        }
            System.out.println(" ");
            System.out.println("El caracter "+aux+" esta repetido "+cont+" veces.");


       }
                         
       public void  compararLongitud(Cadena f, Cadena e){
//  Método compararLongitud(String frase), deberá comparar la longitud de la frase
//  que compone la clase con otra nueva frase ingresada por el usuario.

           if ( f.getLargo() > e.getLargo() ) {
               System.out.println("La Frase: ["+f.getFrase()+" tiene una longitud superior en "+ (f.getLargo()-e.getLargo()+"]."));
           } else {
               System.out.println("La Frase: ["+e.getFrase()+" tiene una longitud superior en "+ (e.getLargo()-f.getLargo()+"]."));
           }

       }
        
       public void  unirFrases(Cadena f, Cadena e){
// Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
// con una nueva frase ingresada por el usuario y mostrar la frase resultante.    
            System.out.println(" ");
            System.out.println("Ambas frases unidas: ");
            String neo = (f.getFrase().concat(" "+e.getFrase()));
            System.out.println(neo);
             
       }
        
       public void  reemplazar(Cadena f){
// Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
// encuentren en la frase, por algún otro carácter seleccionado por el usuario y
// mostrar la frase resultante.




//       System.out.println(" ");
//       System.out.println("Ingrese un caracter que reemplaze todas las letras A que se encuentren en la frase "); 
//       char car = sc.next().charAt(0);
//       
//            for (int i = 0; i < f.getLargo(); i++) {
//                
//                if ((f.getFrase().toUpperCase().charAt(i)=='A')) {
//                    //f.getFrase().charAt(i)==car;
//                    f.setFrase() = (f.getFrase().replace((char) i, car));//.charAt(i);
//                    
//                }
//  
//            }
//       
//        System.out.println(f.getFrase());

       }
        
       public void reemplazar2(Cadena f){ //ejemplo compañeros
        System.out.println("Ingresar letra a reemplazar");
        System.out.println(f.getFrase().replace("a", sc.next()));
    }
       
       public void  contiene(Cadena f){
// Método contiene(String letra), deberá comprobar si la frase contiene una letra que
// ingresa el usuario y devuelve verdadero si la contiene y falso si no.           

        System.out.println("Ingrese un caracter para comprobar si la frase contiene una letra "); 
        System.out.println("El sistema le dira verdadero o falso en caso de no contenerla.");
        
        CharSequence car;
        car = sc.next().subSequence(0, 1);

        System.out.println(f.getFrase().contains(car));

        }


        
}