/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.model.harmonicfield;

import enstabretagne.optimousse.pathplanner.algorithms.model.HarmonicFieldAlgorithm;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.render.Polyline;
import java.util.ArrayList;

/**
 *
 * @author Jeremy
 */
public class FieldMap {
    

    public static final char OBSTACLE='o';
    public static final char GOAL='g';
    public static final char EXTERIOR='e';
    public static final char VACUUM='v';
    
    private double stepWidth; // in deg
    private char[][] initPlane;
    private float[][] field;
    
    private float minLat, maxLat, minLon, maxLon;
    
    ArrayList<Position> border;
    ArrayList<Position> goal;
    ArrayList<ArrayList<Position>> obstacles;
    
    private FieldMap(HarmonicFieldAlgorithm algorithm){
        this.border=algorithm.getBorder();
    }
    
    public static FieldMap getFieldMono(int interationNb, HarmonicFieldAlgorithm algorithm){
        MonoThreadHarmonicFieldComputer computer=new MonoThreadHarmonicFieldComputer(interationNb, null, null, null)
        return 
    }
    
    public static FieldMap getFieldMono(float cvCrit, HarmonicFieldAlgorithm algorithm){
        
    }
    
    public static FieldMap getFieldMono(HarmonicFieldAlgorithm algorithm){
        
    }
    
    private 
}
