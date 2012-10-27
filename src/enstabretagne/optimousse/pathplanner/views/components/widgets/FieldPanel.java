/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.views.components.widgets;

import enstabretagne.optimousse.pathplanner.algorithms.model.HarmonicFieldAlgorithm;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import potentialfields.core.Plane;

/**
 *
 * @author Jeremy
 */
public class FieldPanel extends JPanel {

    private BufferedImage image;
    private ExecutorService executor;
    private BlockingQueue<Runnable> threadQueue;
    private float width, height;

    public FieldPanel(int width, int height) {
        super();
        this.width = width;
        this.height = height;
        threadQueue = new LinkedBlockingQueue<Runnable>(20);
        executor = new ThreadPoolExecutor(1, 30, 500, TimeUnit.MILLISECONDS, threadQueue, new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                threadQueue.clear();
            }
        });
        setPreferredSize(new Dimension(width, height));
        image = new BufferedImage((int) width, (int) height, BufferedImage.TYPE_INT_RGB);
    }

    public void makeImageFromField(float[][] field) {
        // TODO: gradient etc...
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {

                // val are in [-1; 1]
                float val = 0;//=field.getField()[(int)((x/image.getWidth())*field.getWidth())][(int)((x/image.getHeight())*(field.getHeight()))];
                val += 1;
                val /= 2;

                // val now in [0; 1]
                image.getRaster().setPixel(x, y, new int[]{(int) (val * 255), 0, 0});
            }
        }
        repaint();
    }

    public void update(final HarmonicFieldAlgorithm model) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                Plane p = new Plane(model.getBorder(), model.getGoal(), model.getObstacles());


                System.out.println("width: "+p.getWidth()+", height: "+p.getHeightt());
                if (p.getWidth() > 0 && p.getHeightt() > 0) {
                    
                    // Test ratios
                    float alpha = width / p.getWidth(); // px per lat deg
                    if (p.getHeightt() * alpha > height) { // height will be used as reference
                        alpha = height / p.getHeightt();
                    }
                    Random r = new Random();
                    System.out.println("alpha: "+alpha);
//                horizontal?:;
                    System.out.println("bound X: "+(int) ( image.getWidth()/alpha));
                    System.out.println("bound Y: "+(int) ( image.getHeight()/alpha));
                    for (int x = 0; x < (int) (image.getWidth()/alpha); x++) {
                        for (int y = 0; y < (int) (image.getHeight()/alpha); y++) {
                            image.getRaster().setPixel(x, y, new int[]{r.nextInt(255), r.nextInt(255), r.nextInt(255)});
                        }
                    }
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            repaint();
                        }
                    });
                }
            }
        });
    }

    public void test() {
//        executor.execute(new Runnable() {
//
//            @Override
//            public void run() {
//                
//        Random r=new Random();
//        for(int x=0; x<image.getWidth(); x++){
//            for(int y=0; y<image.getHeight(); y++){
//                image.getRaster().setPixel(x, y, new int[]{r.nextInt(255), r.nextInt(255), r.nextInt(255)});
//            }
//        }
//        SwingUtilities.invokeLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        repaint();
//                    }
//                });
//            }
//        });
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
}
