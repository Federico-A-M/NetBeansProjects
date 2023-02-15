package Ejer5;

import java.util.Scanner;

/*• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.CHECK

• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.CHECK??

• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.

• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/

public class Service {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        public Cuenta crearCuenta(){
            Cuenta user = new Cuenta();
            System.out.println("Ingese su Dni: ");    
            user.setDNI(sc.nextLong());
            System.out.println("Ingese su numero de cuenta: ");    
            user.setNumeroCuenta(sc.nextInt());
            System.out.println("Ingese su saaldo actual: ");    
            user.setSaldo(sc.nextDouble());
            return user;
            
}

        public void Ingreso(Cuenta S){
            System.out.println("Ingrese un monto que sumar a la cuenta corriente: ");
            double ingreso = sc.nextDouble();
            S.setSaldo(S.getSaldo()+ingreso);
            System.out.println("Su Saldo actual es de: " + S.getSaldo());
        }

        
        
        public void retirar(Cuenta user){
        System.out.println("Cuando desea retirar?");
        Double retirar = sc.nextDouble();
        if (user.getSaldo() < retirar) {
            System.out.println("Saldo insuficiente");
            System.out.println("Se retiraron " + user.getSaldo() + "$");
            user.setSaldo(0.0);
            System.out.println("Saldo Actual: " + user.getSaldo());
        }else{
            user.setSaldo(user.getSaldo() - retirar);
            System.out.println("Saldo Actual: " + user.getSaldo());
        }
    }
    
    public void retiroRapido(Cuenta user){
        System.out.println("Cuanto desea retirar?");
        Double retirar = sc.nextDouble();
        if ((retirar*100/user.getSaldo()) > 20) {
            System.out.println("No puede retirar mas del 20%");
        }else{
            if (user.getSaldo() > retirar) {
                System.out.println("Extraccion rapida exitosa!");
            user.setSaldo(user.getSaldo() - retirar);
            }else{
                System.out.println("No dispone de esa cantidad de dinero");
            }
                
                
            
        }
    }
    
    public void consultarSaldo(Cuenta user){
        System.out.println("--- CONSULTAR SALDO ---");
        System.out.println("El saldo actual de la cuenta es: " + user.getSaldo());
    }
    
    public void consultarDatos(Cuenta user){
        System.out.println("--- CONSULTAR DATOS ---");
        System.out.println("Numero de cuenta: " + user.getNumeroCuenta());
        System.out.println("Dni: " + user.getDNI());
        System.out.println("Saldo Actual: " + user.getSaldo());
    }
            
}

