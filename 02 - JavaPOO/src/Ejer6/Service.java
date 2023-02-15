package Ejer6;

import java.util.Scanner;

/*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
     */
    public void llenarCafetera(Cafetera maquina) {
        System.out.println("Descea llenar al maximo posible la cafetera? S/N");
        String letra = sc.next();
        
        while ("S".equals(letra.toUpperCase())){
        if ((maquina.getCantidadActual()) < 9) {

            maquina.setCantidadActual(maquina.getCapacidadMaxima());
            System.out.println("La maquina ahora esta en su maxima capacidad");
            break;
        } else {
            System.out.println("La maquina esta en su maxima capacidad");
            break;
        }

    }
        
    }
    /*
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
     */
    public void servirTaza(Cafetera maquina) {

        System.out.println("Ingrese el tamaño de la taza que descea llenar: (1)pequeña, (2)media, (3)Grande ");
        int num = sc.nextInt();
        

        if ((maquina.getCantidadActual())== 9){
            num = 3;
        }else if ((maquina.getCantidadActual()>3)&&((maquina.getCantidadActual()< 7))){ 
            num=2;    
        }else{
            num=1;
        }

        switch (num) {

            case 1:
                System.out.println("Su taza mini esta lista =)");
                break;
            case 2:
                System.out.println("Su taza medium esta lista =)");
                break;
            case 3:
                System.out.println("Su taza premium esta lista =)");
                break;
            default:
                System.out.println("Disculpe, le podemos ofrecer la cantidad minima dispuesta");
                break;
        }

    }


    /*
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
     */
    public void vaciarCafetera(Cafetera maquina) {
        System.out.println("Descea vaciar la cafetera? S/N");
        String letra = sc.next();
        
        if ("S".equals(letra.toUpperCase())) {

            maquina.setCantidadActual(maquina.getCantidadActual()-maquina.getCantidadActual());
            System.out.println("La maquina esta ahora en " + maquina.getCantidadActual());
            
        } else {
            System.out.println("La maquina continua teniendo " + maquina.getCantidadActual() + " bar.");
            
        }
        
        if ((maquina.getCantidadActual()) > 0) {

            

        }

    }

    /*
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
     */
    public void agregarCafe(Cafetera maquina) {
        System.out.println("Quiere agregar una cantidad de cafe ???");
        int sumar = sc.nextInt();
        
        if ((maquina.getCantidadActual()+sumar)<=9) {
            maquina.setCantidadActual(maquina.getCantidadActual()+sumar);
        } else {
            System.out.println("Esa cantidad es demasiado cafe");
        }
        
        
        
    }

}

// Crear Objeto por parametro --> retorna objeto creado con valores pedidos set
//public <Object> <Argumento>(){
// Crear Objeto por Valor --> no retorna nada
        //public void <Argumento>(<Object> Parametro){
