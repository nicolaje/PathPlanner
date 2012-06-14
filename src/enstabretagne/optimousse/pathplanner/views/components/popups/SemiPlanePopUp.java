/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.views.components.popups;

import enstabretagne.optimousse.pathplanner.algorithms.controllers.SemiPlanesAlgorithmController;
import enstabretagne.optimousse.pathplanner.algorithms.model.SemiPlanesAlgorithm;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Action;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;


/**
 *
 * @author Jeremy
 */
public class SemiPlanePopUp extends AbstractPopUp implements Observer {
    
    private JMenuItem mark;
    private JMenuItem undo;
    
    public SemiPlanePopUp(SemiPlanesAlgorithm model) {
        super(model);
    }

    @Override
    protected void buildMenu() {
        mark = new JMenuItem("Mark");
        mark.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ((SemiPlanesAlgorithmController)controller).markPressed();
            }
        });
        this.add(mark);
        
        undo=new JMenuItem("Undo");
        undo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ((SemiPlanesAlgorithmController)controller).undoPressed();
            }
        });
        this.add(undo);
    }

    // TODO : set menuitems visible or not!
    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
