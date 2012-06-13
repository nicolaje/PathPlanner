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
    
    private AbstractAlgorithmModel model;
    private AbstractAlgorithmController controller;
    
    public AbstractPopUp(AbstractAlgorithmModel model){
        this.model=model;
        System.out.println("model");
        this.controller=model.getController();
        System.out.println("controller");
        model.getView().addMouseListener(new PopListener(this));
        System.out.println("addmouselist");
        buildMenu();
        System.out.println("build");
        model.addObserver(this);
        System.out.println("addobs");
    }
    
    public AbstractAlgorithmModel getModel(){
        return this.model;
    }
    
    public AbstractAlgorithmController getController(){
        return this.controller;
    }
    
    protected abstract void buildMenu();
}
