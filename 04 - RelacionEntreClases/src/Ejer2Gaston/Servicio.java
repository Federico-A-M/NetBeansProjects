package Ejer2Gaston;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador> listaJugadores = new ArrayList();
    Revolver revolver = new Revolver();

    public void crearJugadores() {
        System.out.println("Cuantos jugadores desea crear ?");
        int cantJugadores = sc.nextInt();
        if (cantJugadores > 6 || cantJugadores < 1) {
            cantJugadores = 6;
        }
        String nombre;
        for (int i = 1; i < cantJugadores + 1; i++) {
            System.out.println("Ingrese el nombre del jugador");
            nombre = sc.next();
            listaJugadores.add(new Jugador(i, nombre));
        }
    }

    public Boolean disparo() {
        System.out.println("El jugador agarra el revolver y aprieta el gatillo");
        boolean x = revolver.mojar();
        revolver.siguienteChorro();
        return x;
    }

    public void iniciarJuego() {
        crearJugadores();
        ronda();
    }

    public void ronda() {
        ronda:
        do {
            for (Jugador jugador : listaJugadores) {
                if (disparo()) {
                    System.out.println(jugador.getNombre() + " se mojo, perdio el juego");
                    System.out.println("Se termino el juego!");
                    break ronda;
                }else {
                    System.out.println(jugador.getNombre() + ", se salvo, se giro el tambor");
                }
            }
        } while (true);
    }
}
