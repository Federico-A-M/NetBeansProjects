

package Ejer2Ruleta;

import java.util.ArrayList;
import java.util.Objects;

/**
 *Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
  Jugadores) y Revolver
 */
public class Juego {

    private ArrayList<Jugador> juego;
    private Revolver pistolita;

    public ArrayList<Jugador> getJuego() {
        return juego;
    }

    public void setJuego(ArrayList<Jugador> juego) {
        this.juego = juego;
    }

    public Revolver getPistolita() {
        return pistolita;
    }

    public void setPistolita(Revolver pistolita) {
        this.pistolita = pistolita;
    }
    
 /*
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.*/   
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        juego = jugadores;
        pistolita = r;
        
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }
        System.out.println(r);
        

        
    }
    
 
    public int inicia(){
        
        Integer aux = (int) (Math.random()*6+1);
//        boolean select = false;
//        
//        for (Jugador jugadore : jugadores) {
//           
//            if (Objects.equals(jugadore.getId(), aux)) {
//                select = true;
//                break;  
//            }
//        }
//        
//        if (select) {
//            
//        }
        return aux;
}    
    
 /*   
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/

    public void ronda(int aux, ArrayList<Jugador> jugadores, Revolver r){
        
        boolean corchaso = false;
        
        do {
            
            for (Jugador jugadore : jugadores) {
              if (Objects.equals(jugadore.getId(), aux)) {
                 jugadore.disparo(r);
                 aux++;
                 corchaso = r.mojar(r);
                 
                  if (corchaso) {
                     jugadore.setMojado(corchaso);
                     break;
                  }
                 
                 if (aux>6) {
                     aux=1;
                }
                 
              }
              
               System.out.println( jugadores.toString()+" "+r.toString()+" "+aux ); 
        }
        } while (corchaso);
        
        
        
        
        
    }


}


