/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.settings;

import enstabretagne.optimousse.pathplanner.algorithms.model.AbstractAlgorithmModel;
import enstabretagne.optimousse.pathplanner.algorithms.model.HarmonicFieldAlgorithm;

/**
 *
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public class HarmonicFieldSettings extends AbstractSettings{
    
    private boolean isNumberOfMesh;
    private int numberOfMesh;

    @Override
    public AbstractAlgorithmModel getAlgorithm() {
        return new HarmonicFieldAlgorithm(this);
    }
}
