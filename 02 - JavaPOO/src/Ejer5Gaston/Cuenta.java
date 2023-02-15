package Ejer5Gaston;

public class Cuenta {
    private Integer numCuenta;
    private Long dni;
    private Double saldoActual;

    public Cuenta() {
    }

    public Cuenta(Integer numCuenta, Long dni, Double saldoActual) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public Integer getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
    
}
