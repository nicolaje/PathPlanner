/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.controllers;

import enstabretagne.optimousse.pathplanner.algorithms.model.AbstractAlgorithmModel;
import enstabretagne.optimousse.pathplanner.algorithms.model.HarmonicFieldAlgorithm;
import enstabretagne.optimousse.pathplanner.views.components.widgets.HarmonicFieldWidget;
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
            switch(((HarmonicFieldAlgorithm)this.model).getCurrentState()){
                case HarmonicFieldAlgorithm.STATE_ADD_OBSTACLE:
                    ((HarmonicFieldAlgorithm)this.model).mark();
                    break;
                case HarmonicFieldAlgorithm.STATE_IDLE:
                    break;
                case HarmonicFieldAlgorithm.STATE_SET_BORDER:
                    ((HarmonicFieldAlgorithm)this.model).mark();
                    break;
                case HarmonicFieldAlgorithm.STATE_SET_GOAL:
                    ((HarmonicFieldAlgorithm)this.model).mark();
                    break;
                default: System.err.append("Default in Harmonic Controller");
                    break;
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.isControlDown()){
            me.consume();
        }        
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
    
    public void markPressed(){
        
    }
    
    public void setBorderPressed(){
        ((HarmonicFieldAlgorithm)this.model).setCurrentState(HarmonicFieldAlgorithm.STATE_SET_BORDER);
    }
    
    public void setGoal(){
        ((HarmonicFieldAlgorithm)this.model).setCurrentState(HarmonicFieldAlgorithm.STATE_SET_GOAL);
    }
    
    public void setObstacle(){
        ((HarmonicFieldAlgorithm)this.model).setCurrentState(HarmonicFieldAlgorithm.STATE_ADD_OBSTACLE);
    }
    
    public void cleanCurrentSelec(){
        
    }
    
    public void cleanAllSelec(){
        
    }
    
    public void cleanGoal(){
        
    }
    
    public void cleanBorder(){
        
    }
    
    public void cleanObstacles(){
        
    }
    
    public void selectionClose(){
        if(((HarmonicFieldAlgorithm)model).getCurrentSelection().size()>3){
            ((HarmonicFieldAlgorithm)model).close();
        }
    }
    
    public void undo(){
        
    }
    
    public void openPotentialVisualizationWidget(){
        HarmonicFieldWidget w=new HarmonicFieldWidget();
        w.setVisible(true);
        this.model.addObserver(w);
    }
    
    public void openFieldVisualizationWidget(){
        
    }
    
    public void openObstaclesViewer(){
        
    }
}
