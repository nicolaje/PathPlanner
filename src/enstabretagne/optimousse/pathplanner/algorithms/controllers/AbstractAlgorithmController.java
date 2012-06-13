/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.controllers;

import enstabretagne.optimousse.pathplanner.algorithms.model.AbstractAlgorithmModel;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public abstract class AbstractAlgorithmController implements MouseMotionListener, MouseListener{
    protected AbstractAlgorithmModel model;
    protected WorldWindowGLCanvas wwd; // <= the "model"
    
    public AbstractAlgorithmController(AbstractAlgorithmModel model){
        this.model=model;        
        this.wwd=model.getView();
        // register to the input events
        wwd.getInputHandler().addMouseListener(this);
        wwd.getInputHandler().addMouseMotionListener(this);
    }
    
    public AbstractAlgorithmController(WorldWindowGLCanvas wwd){
        this.wwd=wwd;
        
        // register to the input events
        wwd.getInputHandler().addMouseListener(this);
        wwd.getInputHandler().addMouseMotionListener(this);
    }
    
    protected WorldWindowGLCanvas getModel(){
        return wwd;        
    }
    
    public abstract void export(String pathToExport);
}
