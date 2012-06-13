/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.settings;

import enstabretagne.optimousse.pathplanner.algorithms.model.AbstractAlgorithmModel;
import enstabretagne.optimousse.pathplanner.algorithms.model.SemiPlanesAlgorithm;

/**
 *
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public class SemiPlanesSettings extends AbstractSettings{

    @Override
    public AbstractAlgorithmModel getAlgorithm() {
        return new SemiPlanesAlgorithm(this);
    }
    
}
