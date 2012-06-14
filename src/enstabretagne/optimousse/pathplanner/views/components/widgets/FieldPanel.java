/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.views.components.widgets;

import enstabretagne.optimousse.pathplanner.algorithms.model.harmonicfield.FieldMap;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Jeremy
 */
public class FieldPanel extends JPanel{
    
    private BufferedImage image;
    
    public FieldPanel(int width, int height){
        image= new BufferedImage((int)width, (int)height, BufferedImage.TYPE_INT_RGB);
    }
    
    public void makeImageFromField(FieldMap field){
        // TODO: gradient etc...
        for(int x=0; x<image.getWidth(); x++){
            for(int y=0; y<image.getHeight(); y++){
                
                // val are in [-1; 1]
                float val=field.getField()[(int)((x/image.getWidth())*field.getWidth())][(int)((x/image.getHeight())*(field.getHeight()))];
                val+=1;
                val/=2;
                
                // val now in [0; 1]
                image.getRaster().setPixel(x, y, new int[]{(int)(val*255), 0, 0});
            }
        }
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(image, 0, 0, null);
    }
}
