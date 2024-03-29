package Logica;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import javax.swing.border.Border;
public class PintaImagen implements Border{
    private BufferedImage image ;
    public PintaImagen(BufferedImage image ) {
        this.image = image;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        x += ((width-image.getWidth()) / 2);
        y += ((height-image.getHeight()) / 2);
        g.drawImage(image, x, y, null); 
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    public boolean isBorderOpaque() {
        return true; 
    }
}
