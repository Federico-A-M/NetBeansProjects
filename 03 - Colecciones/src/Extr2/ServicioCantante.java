package Extr2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioCantante {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    /*Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista.*/
    ArrayList<CantanteFamoso> mtv = new ArrayList();

    public void llenarLista() {
        CantanteFamoso uno = new CantanteFamoso("Nirvana", "In Utero");
        CantanteFamoso dos = new CantanteFamoso("Green Day", "American Idiot");
        CantanteFamoso tres = new CantanteFamoso("Soda Stereo", "Canción animal");
        CantanteFamoso cuatro = new CantanteFamoso("Cuarteto de Nos", "Raro");
        CantanteFamoso cinco = new CantanteFamoso("Pink Floyd", "Dark Side in de Moon");

        mtv.add(uno);
        mtv.add(dos);
        mtv.add(tres);
        mtv.add(cuatro);
        mtv.add(cinco);

    }
//Luego, se debe mostrar los nombres de cada cantante y su disco con más ventas por pantalla. 

    public void mostrar() {
        for (CantanteFamoso cantanteFamoso : mtv) {
            System.out.println(cantanteFamoso);
        }

    }

    /*Crear un menú que le de la opción al usuario de: 
        agregar un cantante más, 
        mostrar todos los cantantes, 
        eliminar un cantante que el usuario elija 
        salir del programa. 

Al final se deberá mostrar la lista con todos los
cambios. */
    public void opciones() {

        int num = 0;
        String leer = " ";

        do {
            System.out.println(" "
                    + "\n (1) Agregue otro cantante a la lista."
                    + "\n (2) Eliminar un cantante"
                    + "\n (3) Mostrar Lista"
                    + "\n (4) Salir");

            num = sc.nextInt();

            switch (num) {
                case 1: // agregar producto
                    do {
                        CantanteFamoso otro = insert();
                        mtv.add(otro);

                        System.out.println(" ");
                        System.out.println("Quiere agregar otro cantante a la lista ??: Y/N ");
                        leer = sc.next();

                    } while (leer.equalsIgnoreCase("Y"));
                    break;

                case 2: // eliminar catante con iterator
                        delete();
                    break;

                case 3: // mostrar lista
                        mostrar();
                    break;
            }

        } while (!(num == 4));

        mostrar();

        System.out.println("Fin del programa.");

    }

    public CantanteFamoso insert() {

        CantanteFamoso otro = new CantanteFamoso();

        System.out.println("Cantante: ");
        String cantante = sc.next();

        System.out.println("Disco: ");
        String disco = sc.next();

        otro.setNombre(cantante);
        otro.setDisco(disco);

        return otro;

    }

    
    
    public void delete() {

        System.out.println("Indique el producto a eliminar");
        String leer = sc.next();
        
        Iterator<CantanteFamoso> raptor = mtv.iterator();
        
        while (raptor.hasNext()){
               // String aux = raptor.next().getNombre();
               
                           //se me olvida el getNombre del objet
           if (raptor.next().getNombre().equalsIgnoreCase(leer)) {
               raptor.remove();
           }
           
       }

    }

}

// Crear Objeto por parametro --> retorna objeto creado con valores pedidos set
//public <Object> <Argumento>(){
//}
// Crear Objeto por Valor --> no retorna nada
//public void <Argumento>(<Object> Parametro){

       

//}
