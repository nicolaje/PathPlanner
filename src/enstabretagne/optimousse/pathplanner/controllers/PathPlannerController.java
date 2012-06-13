/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.controllers;

import enstabretagne.optimousse.pathplanner.algorithms.model.AbstractAlgorithmModel;
import enstabretagne.optimousse.pathplanner.model.PathPlannerModel;

/**
 *
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public class PathPlannerController {
    
    public PathPlannerController(){
    }
    
    public void addModel(AbstractAlgorithmModel m){
        PathPlannerModel.getInstance().addModel(m); // TODO do some checking before doing this...
    }
}
