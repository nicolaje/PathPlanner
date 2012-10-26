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
public class HarmonicFieldPopUp extends AbstractPopUp implements Observer {
    
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
        updateGui();
    }
    
    @Override
    protected void buildMenu() {
        mark = new JMenuItem("Mark");
        mark.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                ((HarmonicAlgorithmController) controller).markPressed();
            }
        });
        
        this.add(mark);
        
        close = new JMenuItem("Close");
        close.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).selectionClose();
            }
        });
        this.add(close);
        
        undo = new JMenuItem("Undo");
        undo.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                ((HarmonicAlgorithmController) controller).undo();
            }
        });
        this.add(undo);
        
        setBorder = new JMenuItem("Set border");
        setBorder.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).setBorderPressed();
            }
        });
        this.add(setBorder);
        
        setGoal = new JMenuItem("Set Goal");
        setGoal.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).setGoal();
            }
        });
        this.add(setGoal);
        
        setObstacle = new JMenuItem("Set Obstacle");
        setObstacle.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).setObstacle();
            }
        });
        this.add(setObstacle);
        
        clean = new JMenuItem("Clean current selection");
        clean.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).cleanCurrentSelec();
            }
        });
        this.add(clean);
        
        cleanAll = new JMenuItem("Clean all selections");
        cleanAll.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).cleanAllSelec();
            }
        });
        this.add(cleanAll);
        
        cleanBorder = new JMenuItem("Clean border");
        cleanBorder.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).cleanBorder();
            }
        });
        this.add(cleanBorder);
        
        cleanGoal = new JMenuItem("Clean Goal");
        cleanGoal.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).cleanGoal();
            }
        });
        this.add(cleanGoal);
        
        cleanObstacles = new JMenuItem("Clean obstacles");
        cleanObstacles.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).cleanObstacles();
            }
        });
        this.add(cleanObstacles);
        
        widgets = new JMenu("Widgets");
        this.add(widgets);
        
        potentialVisualizationWidget = new JMenuItem("Potential Widget");
        potentialVisualizationWidget.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).openPotentialVisualizationWidget();
            }
        });
        widgets.add(potentialVisualizationWidget);
        
        fieldVisualizationWidget = new JMenuItem("Field Widget");
        fieldVisualizationWidget.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).openFieldVisualizationWidget();
            }
        });
        widgets.add(fieldVisualizationWidget);
        
        obstaclesViewer = new JMenuItem("Obstacles Manager");
        obstaclesViewer.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ((HarmonicAlgorithmController) controller).openObstaclesViewer();
            }
        });
        widgets.add(obstaclesViewer);
    }
    
    private void updateGui() {
        updateGui(((HarmonicFieldAlgorithm) this.model).getCurrentState());
    }
    
    private void updateGui(int msg) {
        boolean border = false, cleanB = false, goal = false, obstacles = false;
        if (((HarmonicFieldAlgorithm) model).getBorder().isEmpty()) {
            cleanBorder.setEnabled(false);
            border = true;
        }
        if (((HarmonicFieldAlgorithm) model).getCurrentSelection().isEmpty()) {
            clean.setEnabled(false);
            cleanB = true;
        }
        if (((HarmonicFieldAlgorithm) model).getGoal().isEmpty()) {
            cleanGoal.setEnabled(false);
            goal = true;
        }
        if (((HarmonicFieldAlgorithm) model).getObstacles().isEmpty()) {
            cleanObstacles.setEnabled(false);
            obstacles = true;
        } else if (((HarmonicFieldAlgorithm) model).getObstacles().get(0).isEmpty()) {
            cleanObstacles.setEnabled(false);
            obstacles = true;
        }
        if (border && cleanB && goal && obstacles) {
            cleanAll.setEnabled(false);
        }
        switch (msg) {
            case HarmonicFieldAlgorithm.STATE_ADD_OBSTACLE:
                mark.setEnabled(true);
                setBorder.setEnabled(false);
                setObstacle.setEnabled(false);
                setGoal.setEnabled(false);
                clean.setEnabled(false);
                cleanAll.setEnabled(false);
                cleanBorder.setEnabled(false);
                cleanGoal.setEnabled(false);
                cleanObstacles.setEnabled(false);
                close.setEnabled(true);
                break;
            case HarmonicFieldAlgorithm.STATE_IDLE:
                mark.setEnabled(false);
                setBorder.setEnabled(true);
                setObstacle.setEnabled(true);
                setGoal.setEnabled(true);
                close.setEnabled(false);
                if (((HarmonicFieldAlgorithm) model).getCurrentSelection().isEmpty()) {
                    clean.setEnabled(false);
                } else {
                    clean.setEnabled(true);
                }
                cleanAll.setEnabled(true);
                cleanBorder.setEnabled(true);
                cleanGoal.setEnabled(true);
                cleanObstacles.setEnabled(true);
                break;
            case HarmonicFieldAlgorithm.STATE_SET_BORDER:
                mark.setEnabled(true);
                setBorder.setEnabled(false);
                setObstacle.setEnabled(false);
                setGoal.setEnabled(false);
                clean.setEnabled(false);
                cleanAll.setEnabled(false);
                if (((HarmonicFieldAlgorithm) model).getCurrentSelection().isEmpty()) {
                    cleanBorder.setEnabled(false);
                } else {
                    cleanBorder.setEnabled(true);
                }
                cleanGoal.setEnabled(false);
                cleanObstacles.setEnabled(false);
                close.setEnabled(true);
                break;
            case HarmonicFieldAlgorithm.STATE_SET_GOAL:
                mark.setEnabled(true);
                setBorder.setEnabled(false);
                setObstacle.setEnabled(false);
                setGoal.setEnabled(false);
                clean.setEnabled(false);
                cleanAll.setEnabled(false);
                cleanBorder.setEnabled(false);
                cleanGoal.setEnabled(false);
                cleanObstacles.setEnabled(false);
                close.setEnabled(true);
                break;
            case HarmonicFieldAlgorithm.MARK_POINT:
                if (((HarmonicFieldAlgorithm) model).getCurrentSelection().isEmpty()) {
                    clean.setEnabled(false);
                } else {
                    clean.setEnabled(true);
                }
                break;
            default:
                System.out.println("Hitting Defaults in HF PopUp update");
                break;
        }
    }
    
    @Override
    public void update(Observable model, Object msg) {
        updateGui(((Integer) msg).intValue());
    }
}
