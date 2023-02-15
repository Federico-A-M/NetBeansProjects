package Ej5IntroPoo;

public class Main {

    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        
        Cuenta c1 = servicio.crearCuenta();
        
        servicio.ingresar(c1);
        servicio.retirar(c1);
        servicio.retiroRapido(c1);
        servicio.consultarSaldo(c1);
        servicio.consultarDatos(c1);
        
//        Cuenta cuentaVacia = new Cuenta();
//        servicio.setValores(cuentaVacia);
        
    }

}
