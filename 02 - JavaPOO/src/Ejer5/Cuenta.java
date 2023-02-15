package Ejer5;

public class Cuenta {

        private Long DNI;
        private Integer numeroCuenta;
        private Double Saldo;

        
        public Cuenta() {
        
    }

    public Cuenta(Long DNI, Integer numeroCuenta, Double Saldo) {
        this.DNI = DNI;
        this.numeroCuenta = numeroCuenta;
        this.Saldo = 0.0;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }
        



    
    
}



