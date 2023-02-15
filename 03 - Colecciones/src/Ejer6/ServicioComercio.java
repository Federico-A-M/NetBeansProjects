

package Ejer6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioComercio {
static Scanner sc = new Scanner(System.in).useDelimiter("\n");
static HashMap<String, Double> productos = new HashMap();

public static void opciones(){
    
     int num = 0;
     String leer = " ";

        do {
            System.out.println(" "
                    + "\n (1) Agregue otro elemento a la lista."
                    + "\n (2) Modificar precio"
                    + "\n (3) Eliminar producto"
                    + "\n (4) Mostrar productos y precio"
                    + "\n (5) Salir");
            
            num = sc.nextInt();

            switch (num) {
                case 1: // agregar producto
                    do {
                        Productos j = insert();
                        productos.put(j.getProducto(),j.getPrecio()); 

                        System.out.println(" ");
                        System.out.println("Quiere agregar otro producto a la lista ??: Y/N ");
                        leer = sc.next();

                    } while (leer.equalsIgnoreCase("Y"));
                    break;

                case 2: // modificar value
                    modificarValor();
                    break;
                    
                case 3: // eliminar key 
                    System.out.println("Indique el producto a eliminar");
                    leer = sc.next();
                    productos.remove(leer);
                     
                    break;
                case 4: // mostrar key y value
                    mostrar(productos);
                    break;
            }

        } while (!(num == 5));

        System.out.println("Finalizado con exito.");
    
}

    public static Productos insert(){
       
        Productos h = new Productos();

        System.out.println("Producto: ");
        String producto = sc.next().toUpperCase();

        System.out.println("Precio: ");
        Double precio = sc.nextDouble();

        h.setPrecio(precio);
        h.setProducto(producto);

        return h;

    }

    public static void modificarValor(){
        
        System.out.println("Ingrese el producto que quiere modificar: ");
        String aux = sc.next();
        double num = 0.0;
                
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            if (key.equalsIgnoreCase(aux)) {
                System.out.println("modificar EL PRECIO: ");
                num = sc.nextDouble();
                productos.replace(key, num); // entry.setValue(num)
                
            }
            
           
            
            
        }
        
    }

    public static void mostrar(HashMap<String, Double> p) {
        
    //for + cntrl + space --> primera opcion que brinda.
        for (Map.Entry<String, Double> entry : p.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println("key: " + key + ". Value: " + value + ".");
        }

    }
    


}









