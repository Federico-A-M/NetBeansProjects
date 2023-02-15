package Ejer4;

import java.util.Comparator;


public class Utilidades {

    public static Comparator<Peliculas> OrdenarTitulo = new Comparator<Peliculas>() {

        @Override
        public int compare(Peliculas t, Peliculas t1) {
               return t.getTitulo().compareTo(t1.getTitulo());
        }
};
    
    
    public static Comparator<Peliculas> OrdenarTiempodeMayor = new Comparator<Peliculas>(){
        
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        
        }
};


    public static Comparator<Peliculas> OrdenarTiempodeMenor = new Comparator<Peliculas>(){
        
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        
        }
};    
    
    
    public static Comparator<Peliculas> OrdenarDirector = new Comparator<Peliculas>() {

        @Override
        public int compare(Peliculas t, Peliculas t1) {
               return t.getTitulo().compareTo(t1.getTitulo());
        }
};    
    
}
