package randommathart;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{

    private BufferedImage image;
    private int index;

    public ImagePanel(BufferedImage image, int index) {
       this.image = image;
       this.index = index;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getIndex() {
        return index;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) { 
            g.drawImage(image, 0, 0, null);
        }    
    }

}