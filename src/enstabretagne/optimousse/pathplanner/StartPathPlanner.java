/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner;

import enstabretagne.optimousse.pathplanner.controllers.PathPlannerController;
import enstabretagne.optimousse.pathplanner.model.PathPlannerModel;
import enstabretagne.optimousse.pathplanner.views.MainView;
import gov.nasa.worldwind.layers.Earth.BMNGOneImage;
import gov.nasa.worldwind.layers.Earth.BMNGWMSLayer;
import gov.nasa.worldwind.layers.Earth.MSVirtualEarthLayer;
import gov.nasa.worldwind.layers.Layer;
import gov.nasa.worldwind.layers.LayerList;

/**
 * 
 * @author jem
 */
public class StartPathPlanner {

    public static final Layer[] l={new BMNGOneImage(), new BMNGWMSLayer(), new MSVirtualEarthLayer()};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PathPlannerModel model=PathPlannerModel.getInstance();
        PathPlannerController controller=new PathPlannerController();
        MainView mainView=MainView.getInstance(controller);
        model.addObserver(mainView);
    }
}
