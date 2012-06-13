/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.model;

import enstabretagne.optimousse.pathplanner.algorithms.controllers.SemiPlanesAlgorithmController;
import enstabretagne.optimousse.pathplanner.settings.AbstractSettings;
import enstabretagne.optimousse.pathplanner.views.components.popups.SemiPlanePopUp;
import gov.nasa.worldwind.geom.Position;
import java.util.ArrayList;

/**
 *
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public class SemiPlanesAlgorithm extends AbstractAlgorithmModel{

    private ArrayList<Position> path;
    private ArrayList<Position> controlPoints;
    
    public SemiPlanesAlgorithm(AbstractSettings settings){
        super(settings);
        new SemiPlanePopUp(this);
        path=new ArrayList<Position>();
        controlPoints=new ArrayList<Position>();
        this.controller=new SemiPlanesAlgorithmController(this);
    }
    
    public void buildLine(Position p){
        
    }
    
    public void endLine(Position p){
        
    }
    
    @Override
    public void generateFile(String path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
