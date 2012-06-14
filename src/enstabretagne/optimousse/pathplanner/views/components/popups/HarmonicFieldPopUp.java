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
import java.util.Observer;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Jeremy
 */
public class HarmonicFieldPopUp extends AbstractPopUp implements Observer{

    private JMenuItem mark;
    private JMenuItem setBorder;
    private JMenuItem setGoal;
    private JMenuItem setObstacle;
    
    private JMenuItem clean;
    private JMenuItem cleanAll;
    private JMenuItem cleanGoal;
    private JMenuItem cleanBorder;
    private JMenuItem cleanObstacles;
    
    private JMenuItem close;
    
    private JMenuItem undo;
    
    private JMenu widgets;
    private JMenuItem potentialVisualizationWidget;
    private JMenuItem fieldVisualizationWidget;
    private JMenuItem obstaclesViewer;
    
    public HarmonicFieldPopUp(HarmonicFieldAlgorithm model) {
        super(model);
    }

    @Override
    protected void buildMenu() {
        mark=new JMenuItem("Mark");
        mark.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ((HarmonicAlgorithmController)controller).markPressed();
            }
        });
        
        this.add(mark);
        
        close=new JMenuItem("Close");
        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).selectionClose();
            }
        });
        this.add(close);
        
        undo=new JMenuItem("Undo");
        undo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ((HarmonicAlgorithmController)controller).undo();
            }
        });
        this.add(undo);
        
        setBorder=new JMenuItem("Set border");
        setBorder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).setBorderPressed();
            }
        });
        this.add(setBorder);
        
        setGoal=new JMenuItem("Set Goal");
        setGoal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).setGoal();
            }
        });
        this.add(setGoal);
        
        setObstacle=new JMenuItem("Set Obstacle");
        setObstacle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).setObstacle();
            }
        });
        this.add(setObstacle);
        
        clean=new JMenuItem("Clean current selection");
        clean.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).cleanCurrentSelec();
            }
        });
        this.add(clean);
        
        cleanAll=new JMenuItem("Clean all selections");
        cleanAll.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).cleanAllSelec();
            }
        });
        this.add(cleanAll);
        
        cleanBorder=new JMenuItem("Clean border");
        cleanBorder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).cleanBorder();
            }
        });
        this.add(cleanBorder);
        
        cleanGoal=new JMenuItem("Clean Goal");
        cleanGoal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).cleanGoal();
            }
        });
        this.add(cleanGoal);
        
        cleanObstacles=new JMenuItem("Clean obstacles");
        cleanObstacles.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).cleanObstacles();
            }
        });
        this.add(cleanObstacles);
        
        widgets=new JMenu("Widgets");
        this.add(widgets);
        
        potentialVisualizationWidget=new JMenuItem("Potential Widget");
        potentialVisualizationWidget.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).openPotentialVisualizationWidget();
            }
        });
        widgets.add(potentialVisualizationWidget);
        
        fieldVisualizationWidget=new JMenuItem("Field Widget");
        fieldVisualizationWidget.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).openFieldVisualizationWidget();
            }
        });
        widgets.add(fieldVisualizationWidget);
        
        obstaclesViewer=new JMenuItem("Obstacles Manager");
        obstaclesViewer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController)controller).openObstaclesViewer();
            }
        });
        widgets.add(obstaclesViewer);
    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
