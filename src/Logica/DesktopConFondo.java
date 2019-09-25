package logica;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class DesktopConFondo extends JDesktopPane {
    
    private Image imagen;
    private File imagen1;
    
    public DesktopConFondo() {
    } 

    public DesktopConFondo(String nombreImagen) {
        if(nombreImagen!=null)
            imagen=new ImageIcon(getClass().getResource(nombreImagen)).getImage();
    }
    
    public DesktopConFondo(Image imagenInicial){
        if(imagenInicial!=null)
            imagen=imagenInicial;
    }
    
    public void setImagen(String nombreImagen){
        if(nombreImagen!=null)
            imagen=new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        else
            imagen=null;
        repaint();
    }
    
    public void setImagen(Image nuevaImagen){
        imagen=nuevaImagen;
        repaint();
    }
    
    public void paint(Graphics g){
        if(imagen!=null){
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        }else
            setOpaque(true);
        super.paint(g);
    }
    
    public void dirImagen(JDesktopPane dtpEscritorio, File nombreImagen){
        cargarImagen(dtpEscritorio, nombreImagen);
    }
    
    public void cargarImagen(JDesktopPane dtpEscritorio, File fileImagen){
        try {
            BufferedImage image = ImageIO.read(fileImagen);
            dtpEscritorio.setBorder(new Logica.PintaImagen(image));
        } catch (Exception e) {}
    }
}
