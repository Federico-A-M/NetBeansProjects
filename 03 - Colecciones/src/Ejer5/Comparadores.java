

package Ejer5;


import java.util.Comparator;



public class Comparadores {


public static Comparator<Planetario> OrdenarNombre = new Comparator<Planetario>() {
    @Override
    public int compare(Planetario t, Planetario t1) {
        return t.getNombre().compareTo(t1.getNombre());
    }

};

//public static Comparator<Planetario> OrdenarLuna = new Comparator<Planetario>() {
//    @Override
//    public int compare(Planetario t, Planetario t1) {
//        return t.getSatelites().contains()
//    }
//    
//
//};

public static Comparator<Planetario> OrdenarTipo = new Comparator<Planetario>() {
    
    @Override
    public int compare(Planetario t, Planetario t1) {
            return t.getTipo().compareTo(t1.getTipo());
        }


};

public static Comparator<Planetario> OrdenarMasa = new Comparator<Planetario>() {
    
    @Override
    public int compare(Planetario t, Planetario t1) {
        return t.getMasa().compareTo(t1.getMasa());
    }

};

public static Comparator<Planetario> OrdenarSistema = new Comparator<Planetario>() {
    @Override
    public int compare(Planetario t, Planetario t1) {
            return t.getSistema().compareTo(t1.getSistema());
    }


};

public static Comparator<Planetario> OrdenarGalaxia = new Comparator<Planetario>() {
    @Override
    public int compare(Planetario t, Planetario t1) {
        return t.getGalaxia().compareTo(t1.getGalaxia());    
    }
};

public static Comparator<Planetario> OrdenarHabitable = new Comparator<Planetario>() {
    @Override
    public int compare(Planetario t, Planetario t1) {
            return t.getHabitable().compareTo(t1.getHabitable());
                    }
};

}


















