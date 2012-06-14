/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.controllers;

import enstabretagne.optimousse.pathplanner.algorithms.model.SemiPlanesAlgorithm;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;
import java.awt.event.MouseEvent;

/**
 *
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public class SemiPlanesAlgorithmController extends AbstractAlgorithmController{

    /**
     * @deprecated 
     * @param wwd 
     */
    public SemiPlanesAlgorithmController(WorldWindowGLCanvas wwd){
        super(wwd);
    }
    
    public SemiPlanesAlgorithmController(SemiPlanesAlgorithm model){
        super(model);
    }
    
    @Override
    public void export(String pathToExport) {
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        if(me.isControlDown()){
            
            me.consume(); // stop event propagation
        }
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.isControlDown()){
            
            me.consume(); // stop event propagation
        }
    }

    public void markPressed(){
        throw new UnsupportedOperationException("Not supported yet");
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

    public void undoPressed() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
