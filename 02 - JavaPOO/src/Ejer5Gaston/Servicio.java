package Ejer5Gaston;

import java.util.Scanner;

public class Servicio {
    
   Scanner sc = new Scanner(System.in).useDelimiter("\n");
   
    public Cuenta crearCuenta(){
        System.out.println("Ingrese el numero de cuenta");
        Integer numC = sc.nextInt();
        System.out.println("Ingrese el dni el usuario");
        Long dni = sc.nextLong();
        System.out.println("Ingrese el saldo inicial de la cuenta");
        Double saldo = sc.nextDouble();
        Cuenta c1 = new Cuenta(numC, dni, saldo);
        return c1;
    }
    
    public Cuenta crearCuenta2(){
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumCuenta(sc.nextInt());
        System.out.println("Ingrese el dni el usuario");
        c1.setDni(sc.nextLong());
        System.out.println("Ingrese el saldo inicial de la cuenta");
        c1.setSaldoActual(sc.nextDouble());
        return c1;
    }
    
    public void setValores(Cuenta cuenta){
        System.out.println("Ingrese el numero de cuenta");
        cuenta.setNumCuenta(sc.nextInt());
        System.out.println("Ingrese el dni el usuario");
        cuenta.setDni(sc.nextLong());
        System.out.println("Ingrese el saldo inicial de la cuenta");
        cuenta.setSaldoActual(sc.nextDouble());
    }
    
    public void ingresar(Cuenta cuenta){
        System.out.println("Ingrese la cantidad de dinero a depositar");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + sc.nextDouble());
        System.out.println("Saldo Actual: " + cuenta.getSaldoActual());
    }
    
    public void retirar(Cuenta cuenta){
        System.out.println("Cuando desea retirar?");
        Double retirar = sc.nextDouble();
        if (cuenta.getSaldoActual() < retirar) {
            System.out.println("Saldo insuficiente");
            System.out.println("Se retiraron " + cuenta.getSaldoActual() + "$");
            cuenta.setSaldoActual(0.0);
            System.out.println("Saldo Actual: " + cuenta.getSaldoActual());
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar);
            System.out.println("Saldo Actual: " + cuenta.getSaldoActual());
        }
    }
    
    public void retiroRapido(Cuenta cuenta){
        System.out.println("Cuanto desea retirar?");
        Double retirar = sc.nextDouble();
        if ((retirar*100/cuenta.getSaldoActual()) > 20) {
            System.out.println("No puede retirar mas del 20%");
        }else{
            if (cuenta.getSaldoActual() > retirar) {
                System.out.println("Extraccion rapida exitosa!");
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar);
            }else{
                System.out.println("No dispone de esa cantidad de dinero");
            }
                
                
            
        }
    }
    
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("--- CONSULTAR SALDO ---");
        System.out.println("El saldo actual de la cuenta es: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta cuenta){
        System.out.println("--- CONSULTAR DATOS ---");
        System.out.println("Numero de cuenta: " + cuenta.getNumCuenta());
        System.out.println("Dni: " + cuenta.getDni());
        System.out.println("Saldo Actual: " + cuenta.getSaldoActual());
    }
            
}
