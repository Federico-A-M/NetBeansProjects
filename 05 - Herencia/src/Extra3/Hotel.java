/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

import java.util.Comparator;

/**
 *
 * @author Vadim
 */
public class Hotel extends Alojamiento{
    protected Integer cant_habitacines;
    protected Integer cant_camas;
    protected Integer cant_pisos;
    protected Integer precio_habitacion=50;

    public Hotel() {
    }

    public Hotel(Integer cant_habitacines, Integer cant_camas, Integer cant_pisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cant_habitacines = cant_habitacines;
        this.cant_camas = cant_camas;
        this.cant_pisos = cant_pisos;
    }

    public Integer getCant_habitacines() {
        return cant_habitacines;
    }

    public void setCant_habitacines(Integer cant_habitacines) {
        this.cant_habitacines = cant_habitacines;
    }

    public Integer getCant_camas() {
        return cant_camas;
    }

    public void setCant_camas(Integer cant_camas) {
        this.cant_camas = cant_camas;
    }

    public Integer getCant_pisos() {
        return cant_pisos;
    }

    public void setCant_pisos(Integer cant_pisos) {
        this.cant_pisos = cant_pisos;
    }

    public Integer getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(Integer precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public static Comparator<Hotel> comp = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t1.precio_habitacion.compareTo(t.precio_habitacion);
        }
    };      
            
       

    
    
    @Override
    public String toString() {
        return "Hotel{" + "cant_habitacines=" + cant_habitacines + ", cant_camas=" + cant_camas + ", cant_pisos=" + cant_pisos + ", precio_habitacion=" + precio_habitacion + '}';
    }
    
    
}
