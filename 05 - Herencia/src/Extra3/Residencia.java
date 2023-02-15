package ejercicio3extra;

/**
 *
 * @author Vadim
 */
public class Residencia extends AlojamientoExtraHotelero{
    protected Integer cant_habitaciones;
    protected Boolean descuento_gremios;
    protected Boolean campo_deportivo;

    public Residencia() {
    }

    public Residencia(Integer cant_habitaciones, Boolean descuento_gremios, Boolean campo_deportivo, Boolean privado, Integer metros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros2, nombre, direccion, localidad, gerente);
        this.cant_habitaciones = cant_habitaciones;
        this.descuento_gremios = descuento_gremios;
        this.campo_deportivo = campo_deportivo;
    }

    public Integer getCant_habitaciones() {
        return cant_habitaciones;
    }

    public void setCant_habitaciones(Integer cant_habitaciones) {
        this.cant_habitaciones = cant_habitaciones;
    }

    public Boolean getDescuento_gremios() {
        return descuento_gremios;
    }

    public void setDescuento_gremios(Boolean descuento_gremios) {
        this.descuento_gremios = descuento_gremios;
    }

    public Boolean getCampo_deportivo() {
        return campo_deportivo;
    }

    public void setCampo_deportivo(Boolean campo_deportivo) {
        this.campo_deportivo = campo_deportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cant_habitaciones=" + cant_habitaciones + ", descuento_gremios=" + descuento_gremios + ", campo_deportivo=" + campo_deportivo +super.toString() +'}';
    }
    
    
}
