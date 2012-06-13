/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.utils;

/**
 *
 * @author Jeremy
 */
public class WayPoint {
    protected float lat;
    protected float lon;
    protected float distVal;
    
    public WayPoint(float lat, float lon){
        this.lat=lat;
        this.lon=lon;
    }
    
    public WayPoint(float lat, float lon, float distVal){
        this(lat, lon);
        this.distVal=distVal;
    }
}
