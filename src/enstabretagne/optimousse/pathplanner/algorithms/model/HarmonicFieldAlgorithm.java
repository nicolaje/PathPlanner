/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.model;

import enstabretagne.optimousse.pathplanner.algorithms.controllers.HarmonicAlgorithmController;
import enstabretagne.optimousse.pathplanner.settings.AbstractSettings;
import enstabretagne.optimousse.pathplanner.views.components.popups.HarmonicFieldPopUp;
import gov.nasa.worldwind.geom.Position;
import java.util.ArrayList;

/**
 *
 * @author Jeremy
 */
public class HarmonicFieldAlgorithm extends AbstractAlgorithmModel{

    private ArrayList<Position> border;
    private ArrayList<Position> goal;
    private ArrayList<ArrayList<Position>> obstacles;
    
    public HarmonicFieldAlgorithm(AbstractSettings settings){
        super(settings);
        this.controller=new HarmonicAlgorithmController(this);
        HarmonicFieldPopUp popUp=new HarmonicFieldPopUp(this);
        this.addObserver(popUp);
        this.border=new ArrayList<Position>();
        this.goal=new ArrayList<Position>();
        this.obstacles=new ArrayList<ArrayList<Position>>();
    }
    
    public ArrayList<Position> getBorder(){
        return this.border;
    }
    
    public ArrayList<Position> getGoal(){
        return this.goal;
    }
    
    public ArrayList<ArrayList<Position>> getObstacles(){
        return this.obstacles;
    }
    
    @Override
    public void generateFile(String pathToTheFile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
