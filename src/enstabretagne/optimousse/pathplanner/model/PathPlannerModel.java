/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.model;

import enstabretagne.optimousse.pathplanner.algorithms.model.AbstractAlgorithmModel;
import enstabretagne.optimousse.pathplanner.views.MainView;
import java.util.ArrayList;
import java.util.Observable;

/**
 * Singleton pattern
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public class PathPlannerModel extends Observable {

    private static ArrayList<AbstractAlgorithmModel> modelsList;
    private static PathPlannerModel me;

    public static PathPlannerModel getInstance() {
        if (me == null) {
            me = new PathPlannerModel();
        }
        return me;
    }

    private PathPlannerModel() {
        modelsList = new ArrayList<AbstractAlgorithmModel>();
    }

    public void addModel(final AbstractAlgorithmModel m) {
        modelsList.add(m);
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainView.getMissionTabbedPane().addTab("Mission " + modelsList.size(), m.getView());
            }
        });
        setChanged();
        notifyObservers("Mission Added");
    }
}
