/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.controllers;

import enstabretagne.optimousse.pathplanner.algorithms.model.AbstractAlgorithmModel;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;
import java.awt.event.MouseEvent;

/**
 *
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public class HarmonicAlgorithmController extends AbstractAlgorithmController{

    /**
     * @deprecated
     * @param wwd 
     */
    public HarmonicAlgorithmController(WorldWindowGLCanvas wwd){
        super(wwd);
    }
    
    public HarmonicAlgorithmController(AbstractAlgorithmModel model){
        super(model);
    }
    
    /**
     * At least 1 attractor and 1 enclosure
     * @param pathToExport 
     */
    @Override
    public void export(String pathToExport) {
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        if(me.isControlDown()){
            me.consume();
        }
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}
