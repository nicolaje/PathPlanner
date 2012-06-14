/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.model;

import enstabretagne.optimousse.pathplanner.algorithms.controllers.HarmonicAlgorithmController;
import enstabretagne.optimousse.pathplanner.settings.AbstractSettings;
import enstabretagne.optimousse.pathplanner.views.components.popups.HarmonicFieldPopUp;

/**
 *
 * @author Jeremy
 */
public class HarmonicFieldAlgorithm extends AbstractAlgorithmModel{

    public HarmonicFieldAlgorithm(AbstractSettings settings){
        super(settings);
        this.controller=new HarmonicAlgorithmController(this);
        HarmonicFieldPopUp popUp=new HarmonicFieldPopUp(this);
        this.addObserver(popUp);
    }
    
    @Override
    public void generateFile(String pathToTheFile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
