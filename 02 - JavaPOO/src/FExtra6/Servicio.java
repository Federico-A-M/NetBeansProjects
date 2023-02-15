/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
 */
package FExtra6;

import java.util.Scanner;

public class Servicio {

    public static Scanner sc = new Scanner(System.in);

    public static Ahorcado crearJuego() {
        Ahorcado j = new Ahorcado();

        System.out.println("Ingrsar palabra: ");
        String palabra = sc.next();

        j.setCantMax(palabra.length()+ ((int) Math.random()*10));
        System.out.println("Cantidad de jugadas máximas: "+j.getCantMax());

        j.setPalabra(Servicio.llenar(palabra));

        return j;
    }

    public static String[] llenar(String p) {

        String Vectorlleno[] = new String[p.length()];

        for (int i = 0; i < p.length(); i++) {

            Vectorlleno[i] = p.substring(i, i + 1);

        }

        return Vectorlleno;
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
     */
    public static void longitud(Ahorcado j) {
        System.out.println("Longitud de la palabra: "+j.getPalabra().length);
    }

    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no.
     */
    public static boolean buscar(Ahorcado j, String letra) {

        for (String palabra : j.getPalabra()) {
            if (palabra.equals(letra)) {
                //System.out.println("Se encontro la letra");
                return true;
            }
        }
        
       // System.out.println("No se encontro la letra");
        return false;
    }

    /*
    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public static boolean encontradas(Ahorcado j, String letra) {

        boolean conf;
        conf = false;

        for (String palabra : j.getPalabra()) {
            if (palabra.equals(letra)) {
                j.setEnc(j.getEnc() + 1);
                conf = true;
            }
        }

        if (conf == true) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
            j.setCantMax(j.getCantMax() - 1);

        }

        System.out.println("Faltan " + (j.getPalabra().length - j.getEnc()) + " letras");

        return conf;
    }

    /*
    Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     */
    public static void intentos(Ahorcado j) {

        System.out.println("Número de oportunidades restantes: "+j.getCantMax());
        System.out.println(" ");

    }

    /*
Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.   
     */
    public static void juego() {

        Ahorcado play = Servicio.crearJuego();

        Servicio.longitud(play);
        String letra;

        do {
            System.out.println("Ingrese letra");
            letra = sc.next();
            boolean vf = Servicio.buscar(play, letra);
            if (vf) {
                Servicio.encontradas(play, letra);
            } else {
                Servicio.encontradas(play, letra);
            }

            Servicio.intentos(play);

        } while (play.getCantMax() > 0 && play.getEnc() != play.getPalabra().length);

        if (true) {
            
        }
        
    }

}
