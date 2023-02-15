/*
Una compañía de promociones turísticas desea mantener información sobre la
infraestructura de alojamiento para turistas, de forma tal que los clientes puedan
planear sus vacaciones de acuerdo a sus posibilidades. Los alojamientos se
identifican por un nombre, una dirección, una localidad y un gerente encargado
del lugar. La compañía trabaja con dos tipos de alojamientos: Hoteles y
Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco
estrellas. Las características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad
Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio
de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo
“B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles
para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más
limosinas tenga el hotel, más caro será.
El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
16
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. Realizar un programa en el que se representen
todas las relaciones descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento
 */
package ejercicio3extra;

import java.util.ArrayList;
import java.util.Scanner;


public class Alquiler {
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alojamiento> A = new ArrayList();
    
    public void mostrar(ArrayList<Hotel> a){
        for (Hotel alojamiento : a) {
            System.out.println(alojamiento.toString());
        }
    }
    
    
    public void menu(){
        Integer var=0;
        Hotel4estrellas h=new Hotel4estrellas("a","sjncc" , 12, 45, 67, 3, "sdfgh1", "asdfghj", "localidad", "gerente");
        Hotel4estrellas h2=new Hotel4estrellas("b","sdfghj" , 18, 85, 6, 3, "sdfgh2", "asdfghj", "localidad", "gerente");
        Hotel5estrellas h3=new Hotel5estrellas(56, 3, 7, "a","sdfghj" , 18, 85, 6, 3, "sdfgh3", "asdfghj", "localidad", "gerente");
        Hotel5estrellas h4=new Hotel5estrellas(6, 53, 17, "a","sdfghj" , 18, 5, 26, 3, "sdfgh4", "asdfghj", "localidad", "gerente");
        Camping c=new Camping(45, 23,true, false, 67, "nombre", "direccion", "localidad", "gerente");
        Camping c2=new Camping(32, 22,false, true, 5, "nombre", "direccion", "localidad", "gerente");
        Residencia r=new Residencia(45, false, true, true, 45, "nombre", "direccion", "localidad", "gerente");
        Residencia r2=new Residencia(5, true, false, true, 12, "nombre", "direccion", "localidad", "gerente");
        A.add(h);A.add(h2);A.add(h3);A.add(h4);A.add(c);A.add(c2);A.add(r);A.add(r2);
        do{
        System.out.println("Menu");
        System.out.println("1) Todos los alojamientos");
        System.out.println("2) todos los hoteles de más caro a más barato");
        System.out.println("3) todos los campings con restaurante");
        System.out.println("4) todos las residencias que tienen descuento");
        var=sc.nextInt();
    
        switch (var) {
            case 1:
                for (Alojamiento alojamiento : A) {
                    System.out.println(alojamiento);
                }
                break;
            case 2:
                ArrayList<Hotel> a2=new ArrayList();
                for (Alojamiento alojamiento : A) {
                    if (alojamiento instanceof Hotel) {
                        Hotel hh = (Hotel) alojamiento;
                        a2.add(hh);
                    }
                }
                a2.sort(Hotel.comp);
                mostrar(a2);
                break;
            case 3:
                for (Alojamiento alojamiento : A) {
                    if (alojamiento instanceof Camping) {
                        Camping cc = (Camping) alojamiento;
                        if (cc.getRestaurante()){
                            System.out.println(cc.toString());
                        }
                    }
                }
                break;
            case 4:
                for (Alojamiento alojamiento : A) {
                    if (alojamiento instanceof Residencia) {
                        Residencia rr = (Residencia) alojamiento;
                        if(rr.getDescuento_gremios()){
                            System.out.println(rr.toString());
                        }
                    }
                }
                break;
        }
        }while(var<5);
    
    }
}
