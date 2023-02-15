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
public class AlojamientoExtraHotelero extends Alojamiento{
    protected Boolean privado;
    protected Integer metros2;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(Boolean privado, Integer metros2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros2 = metros2;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getMetros2() {
        return metros2;
    }

    public void setMetros2(Integer metros2) {
        this.metros2 = metros2;
    }

    @Override
    public String toString() {
        return "AlojamientoExtraHotelero{" + "privado=" + privado + ", metros2=" + metros2 + super.toString() +'}';
    }
    
    
    
}
