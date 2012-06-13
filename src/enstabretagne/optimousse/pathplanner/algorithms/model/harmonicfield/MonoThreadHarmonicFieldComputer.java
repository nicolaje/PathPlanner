/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.model.harmonicfield;

import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.render.Polyline;
import java.util.ArrayList;

/**
 *
 * @author Jeremy
 */
public class MonoThreadHarmonicFieldComputer {

    private float minLat, maxLat, minLon, maxLon;
    private int widthNb, heightNb;
    private char[][] initPlane;
    
    public MonoThreadHarmonicFieldComputer(ArrayList<Position> border, ArrayList<Position> goal, ArrayList<ArrayList<Position>> obstacles){
        minLat=maxLat=minLon=maxLon=0;
        setMinMax(border);
        this.widthNb=(int)(maxLon-minLon);
        this.heightNb=(int)(maxLat-minLat);
        initPlane=new char[widthNb][heightNb];
    }
    
    public MonoThreadHarmonicFieldComputer(int iterationNb, ArrayList<Position> border, ArrayList<Position> goal, ArrayList<ArrayList<Position>> obstacles){
        this(border, goal, obstacles);
        
    }
    
    public MonoThreadHarmonicFieldComputer(float cvCriterion, ArrayList<Position> border, ArrayList<Position> goal, ArrayList<ArrayList<Position>> obstacles){
        this(border, goal, obstacles);
    }
    
    private void setMinMax(ArrayList<Position> border){
        
    }
    
    public FieldMap getMap(){
        
    }
}
