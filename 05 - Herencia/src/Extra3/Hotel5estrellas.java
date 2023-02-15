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
public class Hotel5estrellas extends Hotel4estrellas{
    protected Integer can_salones;
    protected Integer cant_suites;
    protected Integer cant_limosinas;

    public Hotel5estrellas() {
    }

    public Hotel5estrellas(Integer can_salones, Integer cant_suites, Integer cant_limosinas, String gimnasio, String noombre_restaurante, Integer cap_restaurante, Integer cant_habitacines, Integer cant_camas, Integer cant_pisos, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, noombre_restaurante, cap_restaurante, cant_habitacines, cant_camas, cant_pisos, nombre, direccion, localidad, gerente);
        this.can_salones = can_salones;
        this.cant_suites = cant_suites;
        this.cant_limosinas = cant_limosinas;
    }



    public Integer getCan_salones() {
        return can_salones;
    }

    public void setCan_salones(Integer can_salones) {
        this.can_salones = can_salones;
    }

    public Integer getCant_suites() {
        return cant_suites;
    }

    public void setCant_suites(Integer cant_suites) {
        this.cant_suites = cant_suites;
    }

    public Integer getCant_limosinas() {
        return cant_limosinas;
    }

    public void setCant_limosinas(Integer cant_limosinas) {
        this.cant_limosinas = cant_limosinas;
    }

    @Override
    public void calcular_precio(){
        super.calcular_precio();
        this.precio_habitacion+=15*this.cant_limosinas;
    }
    
    @Override
    public String toString() {
        return "Hotel5estrellas{" + "can_salones=" + can_salones + ", cant_suites=" + cant_suites + ", cant_limosinas=" + cant_limosinas + '}';
    }
    
    
}
