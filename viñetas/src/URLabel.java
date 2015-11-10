
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zigic
 */
public class URLabel extends JLabel implements MouseListener {

    private URI url;
    ImageIcon ImgMenos;
    /**
 * Constructor de clase
 */
    public URLabel(){        
        //enlace por default
        try {
            url = new URI("http://www.google.com.bo");
        } catch (URISyntaxException ex) {}
        
        //propiedades de JLabel
//        this.setText("URLabel");
//        this.setToolTipText( url.toString() );
//        this.setSize(34, 18);
//        this.setVisible(true);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.addMouseListener(this);
        ImgMenos = new ImageIcon(getClass().getResource("/images/pregunta.jpg"));
        this.setIcon(ImgMenos);
        this.setSize(200,266);
        this.setVisible(true);
        

    }

    /**
 * Metodo para asignar una direccion web
 * @param url URL de pagina web
 */
    public void setURL( String url )
    {
        try {
            this.url = new URI(url);
            this.setToolTipText( url );
        } catch (URISyntaxException ex) {
            System.err.println( ex.getMessage() );
        }
    }

    /**
 * Retorna la direccion web que este asignado al objeto
 * @return String Direccion URL
 */
    public String getURL()
    {
        return this.url.toString();
    }

   @Override
   protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        Rectangle r;            
//        r = g.getClipBounds();            
//        g.drawLine(0, r.height - getFontMetrics(getFont()).getDescent(), getFontMetrics(getFont())
//                .stringWidth(getText()), r.height - getFontMetrics(getFont()).getDescent());        
  }

    /**
 * Cuando se realice un clic sobre el componente JLabel, se abre el enlace en el navegador
 * predefinido del sistema operativo
 */
    @Override
    public void mouseClicked(MouseEvent e) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if ( desktop != null && desktop.isSupported(Desktop.Action.BROWSE) ) {
            try {
                desktop.browse( url );
            } catch ( Exception ex ) {
                System.err.println( ex.getMessage() );
            }
        }    
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}    

}//--> fin clase