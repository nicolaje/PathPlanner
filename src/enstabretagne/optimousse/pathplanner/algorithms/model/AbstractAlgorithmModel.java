/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.model;

import enstabretagne.optimousse.pathplanner.StartPathPlanner;
import enstabretagne.optimousse.pathplanner.algorithms.controllers.AbstractAlgorithmController;
import enstabretagne.optimousse.pathplanner.settings.AbstractSettings;
import gov.nasa.worldwind.BasicModel;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;
import gov.nasa.worldwind.globes.EarthFlat;
import gov.nasa.worldwind.layers.LayerList;
import java.util.Observable;

/**
 *
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public abstract class AbstractAlgorithmModel extends Observable {

    protected AbstractSettings settings;
    protected WorldWindowGLCanvas wwd; // pseudo delegate of the view
    protected AbstractAlgorithmController controller; // TODO: really usefyl to have a reference on this?

    public AbstractAlgorithmModel(AbstractSettings settings) {
        this.settings = settings;
        wwd = new WorldWindowGLCanvas();
        wwd.setModel(new BasicModel(new EarthFlat(), new LayerList(StartPathPlanner.l)));
    }

    public WorldWindowGLCanvas getView(){
        return wwd;
    }
    
    public AbstractAlgorithmController getController(){
        return this.controller;
    }
    
    public abstract void generateFile(String pathToTheFile);
}
