/*
 * Clase Principal Main que gestiona nuestra apliación
 */
package linkia_c7;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author DMORENOAR
 */
public class LINKIA_C7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Principal ventanaPrincipal = new Principal();
        
        
        ventanaPrincipal.setVisible(true);
        //ventanaPrincipal.isResizable();
        
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setTitle("Registrador de Pokemons");
        
    }
    
}
