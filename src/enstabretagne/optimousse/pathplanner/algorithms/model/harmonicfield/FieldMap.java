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
    
    public static final float OBSTACLE_POTENTIAL=1f;
    public static final float GOAL_POTENTIAL=-1f;

    public static final char OBSTACLE='o';
    public static final char GOAL='g';
    public static final char EXTERIOR='e';
    public static final char VACUUM='v';
    
    private double stepWidth; // in deg
    private double width;
    private double height;
    private char[][] initPlane;
    private float[][] field;
    private float widthNb;
    private float heightNb;
    
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
    
    public float getWidth(){
        return (float) this.width;
    }
    
    public float getHeight(){
        return (float) this.height;
    }
    
    /**
     * V0.1: use only 1 thread
     */
    private void computeMap(){
        setMinMax(border);
        this.width=(maxLon-minLon);
        this.height=(maxLat-minLat);
        this.widthNb=(float) (width/stepWidth);
        this.heightNb=(float) (height/stepWidth);
        initPlane=new char[(int)widthNb][(int)heightNb];
        field=new float[(int)widthNb][(int)heightNb];
        initPlane();
    }
    
    private void initPlane(){
        for(float lon=minLon, x=0; lon<maxLon; lon+=stepWidth, x++){
            for(float lat=(float) (maxLat-stepWidth), y=0; lat>=minLat; lat-=stepWidth, y++){
                Position p=Position.fromDegrees(lat, lon);
                // if !inside container, mark it as EXTERIOR
                if(!isPositionInside(p, border)){
                    initPlane[(int)x][(int)y]=EXTERIOR;
                }else if(isPositionInside(p, goal)){
                    initPlane[(int)x][(int)y]=GOAL;
                }else{
                    boolean inObstacle=false;
                    for(ArrayList<Position> o:obstacles){
                        if(isPositionInside(p, o)){
                            inObstacle=true;
                            break;
                        }
                    }
                    if(inObstacle){
                        initPlane[(int)x][(int)y]=OBSTACLE;
                    }else{
                        initPlane[(int)x][(int)y]=VACUUM;
                    }
                }
            }
        }
    }
    
    /**
     * Directly copy/pasted from WorldWind forum:
     * http://forum.worldwindcentral.com/showthread.php?p=74567
     * @param p
     * @param contour
     * @return 
     */
    public static boolean isPositionInside(Position p, ArrayList<Position> contour){
        boolean result = false;
        Position p1 = contour.get(0);
        for (int i = 1; i < contour.size(); i++)
        {
            Position p2 = contour.get(i);

            if ( ((p2.getLatitude().degrees <= p.getLatitude().degrees
                    && p.getLatitude().degrees < p1.getLatitude().degrees) ||
                    (p1.getLatitude().degrees <= p.getLatitude().degrees
                            && p.getLatitude().degrees < p2.getLatitude().degrees))
                    && (p.getLongitude().degrees < (p1.getLongitude().degrees - p2.getLongitude().degrees)
                    * (p.getLatitude().degrees - p2.getLatitude().degrees)
                    / (p1.getLatitude().degrees - p2.getLatitude().degrees) + p2.getLongitude().degrees) )
                result = !result;

            p1 = p2;
        }
        return result;
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
