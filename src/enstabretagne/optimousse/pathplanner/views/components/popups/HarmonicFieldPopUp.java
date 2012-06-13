/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.views.components.popups;

import enstabretagne.optimousse.pathplanner.algorithms.controllers.HarmonicAlgorithmController;
import enstabretagne.optimousse.pathplanner.algorithms.model.HarmonicFieldAlgorithm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Jeremy
 */
public class HarmonicFieldPopUp extends AbstractPopUp {

    private JMenuItem mark;
    private JMenuItem setBorder;
    private JMenuItem setGoal;
    
    private JMenuItem clean;
    private JMenuItem cleanAll;
    private JMenuItem cleanGoal;
    private JMenuItem cleanBorder;
    private JMenuItem cleanObstacles;
    
    private JMenuItem close;
    
    private JMenuItem undo;
    
    private JMenuItem visualizationWidget;
    
    public HarmonicFieldPopUp(HarmonicFieldAlgorithm model) {
        super(model);
    }

    @Override
    protected void buildMenu() {
        mark=new JMenuItem("Mark");
        mark.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        
        this.add(mark);
        
        undo=new JMenuItem("Undo");
        undo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        this.add(undo);
    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
