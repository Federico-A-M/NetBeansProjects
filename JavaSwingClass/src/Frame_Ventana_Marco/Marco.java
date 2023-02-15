

package Frame_Ventana_Marco;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*; // el asterisco indica que swing heredara todo de todas las clases e interfaces hasta Object (super clase cosmica)
import java.awt.*;

/**
  * 1) Generamos una clase que hereda de JFrame:::
 */
public class Marco extends JFrame{

    
//    2) generamos un constructor:::
    public Marco(){
        
//    3) Atributos de pantalla:::   

// Establecemos tamaño y locacion manualmente:: ---------------------------------------------------------------------------------->>>>
        
       // setSize(500, 300);
       // setLocation(500, 300); // ubica en coordenadas cartesianas x, y donde localiza la pantalla. (el eje 0,0 es la esquina superior de la pantalla).
       // setBounds(500,300, 250, 250); // Hace lo mismo que los metodos anteriores  en uno solo (x,y , sizeX,SizeY)
        
       // setResizable(false);// Un metodo boolean para permitir o no redimenzionar la ventana.
       // setExtendedState(Frame.MAXIMIZED_BOTH); //Viene con un conjunto de metodos en "frame" que permiten como en el caso, iniciar en pantalla completa. 
        
// Marco Centrado sea donde sea se ejecute:: --------------------------------------------------------------------------------------->>>>

    //invocamos el metodo abstracto toolKit que devuelbe un toolKit  y lo almacena dentro de un objeto.
        Toolkit miPantalla = Toolkit.getDefaultToolkit(); 
        
    //invocamos el metodo dimension que returna un dimension  y lo almacena dentro de un objeto. (analiza la dimension del display principal)
        Dimension tamanioPantalla = miPantalla.getScreenSize();
        int Altura = tamanioPantalla.height;
        int Ancho = tamanioPantalla.width;
        
        setSize(Ancho/2, Altura/2);
        setLocation(Ancho/4, Altura/4);
        
       
// Colocamos lamina sobre ventana:: ---------------------------------------------------------------------------------------------------->>>> 
       
        Layer capa = new Layer();
        add(capa);


// Indicamos titulo de programa:: --------------------------------------------------------------------------------------------------------->>>> 

        setTitle("LibCom");
        
        
// Cambiar icono de programa:: ---------------------------------------------------------------------------------------------------------->>>> 

        Image miIcono = miPantalla.getImage("src/Frame_Ventana_Marco/icon.png"); // se iguala el objeto image al metodo que contiene el objeto ToolKit
        setIconImage(miIcono); 
       
// Decretamos el booleano de visibilidad:: --------------------------------------------------------------------------------------------->>>>
        
        setVisible(true);
        
// Fijamos comportamiento de cierre de ventana:: ---------------------------------------------------------------------------------->>>>        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra y finaliza el compilador.
        //setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);                // Esconde la ventana y sin cerrar el proceso.
        
    }
    
    
    
    
    
}
        





