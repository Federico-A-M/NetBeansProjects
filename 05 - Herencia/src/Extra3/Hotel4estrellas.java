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
public class Hotel4estrellas extends Hotel{
    protected String gimnasio;
    protected String noombre_restaurante;
    protected Integer cap_restaurante;

    public Hotel4estrellas() {
    }

    public Hotel4estrellas(String gimnasio, String noombre_restaurante, Integer cap_restaurante, Integer cant_habitacines, Integer cant_camas, Integer cant_pisos, String nombre, String direccion, String localidad, String gerente) {
        super(cant_habitacines, cant_camas, cant_pisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.noombre_restaurante = noombre_restaurante;
        this.cap_restaurante = cap_restaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNoombre_restaurante() {
        return noombre_restaurante;
    }

    public void setNoombre_restaurante(String noombre_restaurante) {
        this.noombre_restaurante = noombre_restaurante;
    }

    public Integer getCap_restaurante() {
        return cap_restaurante;
    }

    public void setCap_restaurante(Integer cap_restaurante) {
        this.cap_restaurante = cap_restaurante;
    }

    public void calcular_precio(){
        Integer valorAgregadoxRes=0;
        Integer valorAgregadoxGim=0;
        if (this.gimnasio.equalsIgnoreCase("a")) {
            valorAgregadoxGim=50;
            }else if(this.gimnasio.equalsIgnoreCase("b")){
            valorAgregadoxGim=30;
        }
        if(this.cap_restaurante<30){
            valorAgregadoxRes=10;
        }else if(this.cap_restaurante<=50){
            valorAgregadoxRes=30;
        }else if(this.cap_restaurante>50){
            valorAgregadoxRes=50;
        }
        
        this.precio_habitacion=this.precio_habitacion+this.cant_camas+valorAgregadoxGim+valorAgregadoxRes;
    }
    
    @Override
    public String toString() {
        return "Hotel4estrellas{" + "gimnasio=" + gimnasio + ", noombre_restaurante=" + noombre_restaurante + ", cap_restaurante=" + cap_restaurante + '}';
    }
    
    
    
}
