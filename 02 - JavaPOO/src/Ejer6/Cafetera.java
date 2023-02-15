

package Ejer6;

import java.util.Scanner;


public class Cafetera {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");  
        

        //Atributos - caracteristicas ejemplos
        private Integer capacidadMaxima;
        private Integer cantidadActual;

    public Cafetera() {
        
        capacidadMaxima = 9; // 9 bares de presion / 12 revienta
        cantidadActual = 2;
    }

        
  
    public Cafetera(Integer capacidadMaxima, Integer cantidadActual) {
        this.capacidadMaxima = capacidadMaxima; // 9 bares de presion / 12 revienta
        this.cantidadActual = cantidadActual;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "sc=" + sc + ", capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }



}


