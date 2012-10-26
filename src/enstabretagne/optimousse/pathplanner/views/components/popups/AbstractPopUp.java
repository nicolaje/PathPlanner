/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.views.components.popups;

import enstabretagne.optimousse.pathplanner.algorithms.controllers.AbstractAlgorithmController;
import enstabretagne.optimousse.pathplanner.algorithms.model.AbstractAlgorithmModel;
import java.util.Observer;
import javax.swing.JPopupMenu;

/**
 *
 * @author Jeremy
 */
public abstract class AbstractPopUp extends JPopupMenu implements Observer{
    
    protected AbstractAlgorithmModel model;
    protected AbstractAlgorithmController controller;
    
    public AbstractPopUp(AbstractAlgorithmModel model){
        this.model=model;
        this.controller=model.getController();
        model.getView().addMouseListener(new PopListener(this));
        buildMenu();
        model.addObserver(this);
    }
    
    public AbstractAlgorithmModel getModel(){
        return this.model;
    }
    
    public AbstractAlgorithmController getController(){
        return this.controller;
    }
    
    protected abstract void buildMenu();
}
