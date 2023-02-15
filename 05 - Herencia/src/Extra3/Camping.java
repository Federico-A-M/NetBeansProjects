/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

/**
 *
 * @author Vadim
 */
public class Camping extends AlojamientoExtraHotelero{
    protected Integer cant_max;
    protected Integer cant_baños;
    protected Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer cant_max, Integer cant_baños, Boolean restaurante, Boolean privado, Integer metros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros2, nombre, direccion, localidad, gerente);
        this.cant_max = cant_max;
        this.cant_baños = cant_baños;
        this.restaurante = restaurante;
    }

    public Integer getCant_max() {
        return cant_max;
    }

    public void setCant_max(Integer cant_max) {
        this.cant_max = cant_max;
    }

    public Integer getCant_baños() {
        return cant_baños;
    }

    public void setCant_baños(Integer cant_baños) {
        this.cant_baños = cant_baños;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "cant_max=" + cant_max + ", cant_ba\u00f1os=" + cant_baños + ", restaurante=" + restaurante + super.toString() +'}';
    }
    
    
}
