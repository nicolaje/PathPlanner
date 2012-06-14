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
    private double width;
    private double height;
    private char[][] initPlane;
    private float[][] field;
    
    private float minLat, maxLat, minLon, maxLon;
    
    ArrayList<Position> border;
    ArrayList<Position> goal;
    ArrayList<ArrayList<Position>> obstacles;
    
    public FieldMap(HarmonicFieldAlgorithm algorithm, float stepWidth){
        this.border=algorithm.getBorder();
        this.stepWidth=stepWidth;
        computeMap();
    }
    
    public float[][] getField(){
        return this.field;
    }
    
    /**
     * V0.1: use only 1 thread
     */
    private void computeMap(){
        setMinMax(border);
        
    }
    
    private void setMinMax(ArrayList<Position> border){
        for(Position p:border){
            if(p.getLatitude().degrees<minLat)minLat=(float) p.getLatitude().degrees;
            if(p.getLatitude().degrees>maxLat)maxLat=(float) p.getLatitude().degrees;
            if(p.getLongitude().degrees<minLon)minLon=(float) p.getLongitude().degrees;
            if(p.getLongitude().degrees>maxLon)maxLon=(float) p.getLongitude().degrees;            
        }
    }
}
