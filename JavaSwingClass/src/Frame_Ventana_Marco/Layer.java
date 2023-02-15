

package Frame_Ventana_Marco;

import javax.swing.*;
import java.awt.*;

/**
 *
 * Sobre escribe el methodo abstracto paint component y contiene una infinitud de metodos graficos para laminar.
 */
public class Layer extends JPanel {

    @Override                 // clase Graphics contiene un sin numero de opciones.
    public void paintComponent(Graphics g){
        
        super.paintComponents(g);
        
        g.drawString("Hola Mundo", 100, 100);
        
    }

        





}





