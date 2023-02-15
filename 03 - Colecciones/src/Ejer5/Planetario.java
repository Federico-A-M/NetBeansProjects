

package Ejer5;

import java.util.ArrayList;

/**
 *
 * @author Federico.A.M.
 */
public class Planetario {

        private String nombre;
        private ArrayList<String> satelites;
        private String tipo; //Gaseoso, rocoso 
        private Double masa; 
        private String sistema; //errante, exoplaneta, solar
        private String galaxia;
        private Boolean habitable;

    public Planetario() {
        this.satelites = new ArrayList();
    }

    public Planetario(String nombre, ArrayList<String> satelites, String tipo, Double masa, String sistema, String galaxia, Boolean habitable) {
        this.nombre = nombre;
        this.satelites = new ArrayList();
        this.tipo = tipo;
        this.masa = masa;
        this.sistema = sistema;
        this.galaxia = galaxia;
        this.habitable = habitable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<String> satelites) {
        this.satelites = satelites;
    }
    
    public void setLuna(String satelites1) {
        this.satelites.add(satelites1);

    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(String galaxia) {
        this.galaxia = galaxia;
    }

    public Boolean getHabitable() {
        return habitable;
    }

    public void setHabitable(Boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString() {
        return "Planetario{" + "nombre=" + nombre + ", satelites=" + satelites + ", tipo=" + tipo + ", masa=" + masa + ", sistema=" + sistema + ", galaxia=" + galaxia + ", habitable=" + habitable + '}';
    }


    
    
    
    String setNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}


        // En contructor vacio recordar:
        // Se inicializan las colecciones para que no esten en null, si no vacios.
        
       // libros = new ArrayList();
        
       // numeros = new HashSet();
        
       // alumnos = new HashMap();


