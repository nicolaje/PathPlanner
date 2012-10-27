/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.algorithms.model;

import enstabretagne.optimousse.pathplanner.algorithms.controllers.HarmonicAlgorithmController;
import enstabretagne.optimousse.pathplanner.settings.AbstractSettings;
import enstabretagne.optimousse.pathplanner.views.components.popups.HarmonicFieldPopUp;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.layers.LayerList;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Jeremy
 */
public class HarmonicFieldAlgorithm extends AbstractAlgorithmModel {

    public static final int STATE_IDLE = 0;
    public static final int STATE_SET_BORDER = 1;
    public static final int STATE_SET_GOAL = 2;
    public static final int STATE_ADD_OBSTACLE = 3;
    public static final int MARK_POINT = 4;
    public static final int OBSTACLE_ADDED = 5;
    public static final int BORDER_SET = 6;
    public static final int GOAL_SET = 7;
    private int currentState;
    private ArrayList<Position> border;
    private ArrayList<Position> goal;
    private ArrayList<ArrayList<Position>> obstacles;
    private RenderableLayer polyLines;
    private SurfacePolygon borderPoly;
    private SurfacePolygon goalPoly;
    private ArrayList<SurfacePolygon> obstaclesPoly;
    private ArrayList<Position> currentSelection;
    private Polyline currentLine;

    public HarmonicFieldAlgorithm(AbstractSettings settings) {
        super(settings);
        polyLines = new RenderableLayer();
        LayerList l = wwd.getModel().getLayers();
        l.add(polyLines);
        wwd.getModel().setLayers(l);
        this.currentState = STATE_IDLE;
        this.controller = new HarmonicAlgorithmController(this);
        currentSelection = new ArrayList<Position>();
        this.border = new ArrayList<Position>();
        this.goal = new ArrayList<Position>();
        this.obstacles = new ArrayList<ArrayList<Position>>();
//        borderPoly = new Polygon();
//        goalPoly = new Polygon();
//        obstaclesPoly = new ArrayList<Polygon>();
        currentLine = new Polyline();
        currentLine.setFilled(true);
        currentLine.setFollowTerrain(true);
        currentLine.setColor(Color.yellow);
        currentLine.setLineWidth(2);
        currentLine.setPathType(Polyline.ANTIALIAS_NICEST);
        polyLines.addRenderable(currentLine);
        HarmonicFieldPopUp popUp = new HarmonicFieldPopUp(this);
        this.addObserver(popUp);
    }

    public void setCurrentState(int state) {
        currentLine = new Polyline();
        currentSelection = new ArrayList<Position>();
        switch (getCurrentState()) {
            case STATE_IDLE:
                stateIdleTo(state);
                break;
            case STATE_SET_BORDER:
                stateSetBorderTo(state);
                break;
            case STATE_SET_GOAL:
                stateSetGoalTo(state);
                break;
            case STATE_ADD_OBSTACLE:
                stateAddObstacleTo(state);
                break;
        }
        this.currentState = state;
        setChanged();
        notifyObservers(getCurrentState());
        clearChanged();
    }

    private void stateIdleTo(int state) {
        switch (state) {
            case STATE_ADD_OBSTACLE:
                obstacles.add(new ArrayList<Position>());
                break;
            case STATE_SET_BORDER:
                border = new ArrayList<Position>();
                break;
            case STATE_SET_GOAL:
                goal = new ArrayList<Position>();
                break;
        }
    }

    private void stateSetBorderTo(int state) {
        switch (state) {
            case STATE_ADD_OBSTACLE:
                obstacles.add(new ArrayList<Position>());
                break;
            case STATE_IDLE:
                break;
            case STATE_SET_GOAL:
                goal = new ArrayList<Position>();
                break;
        }
    }

    public void close() {
        this.polyLines.removeRenderable(this.currentLine);

        switch (getCurrentState()) {
            case STATE_ADD_OBSTACLE:
                ShapeAttributes o = new BasicShapeAttributes();
                o.setOutlineOpacity(0.7d);
                o.setDrawInterior(true);
                o.setEnableAntialiasing(true);
                o.setEnableLighting(true);
                o.setOutlineStipplePattern((short) 128);
                o.setOutlineMaterial(new Material(Color.RED));
                o.setInteriorMaterial(new Material(Color.RED));
                o.setInteriorOpacity(0.7d);
                SurfacePolygon obstacle = new SurfacePolygon(o, currentSelection);
                polyLines.addRenderable(obstacle);
//                this.obstacles.add(new ArrayList<Position>(currentSelection));
                setCurrentState(STATE_IDLE);
                break;
            case STATE_SET_BORDER:
                if (borderPoly != null) {
                    polyLines.removeRenderable(borderPoly);
                }
                ShapeAttributes a = new BasicShapeAttributes();
                a.setOutlineOpacity(0.7d);
                a.setDrawInterior(true);
                a.setEnableAntialiasing(true);
                a.setEnableLighting(true);
                a.setOutlineStipplePattern((short) 0xDD);
                a.setOutlineMaterial(new Material(Color.ORANGE));
                a.setInteriorMaterial(new Material(Color.ORANGE));
                a.setInteriorOpacity(0.1d);
                borderPoly = new SurfacePolygon(a, currentSelection);
                polyLines.addRenderable(borderPoly);
//                this.border.addAll(currentSelection);
                setCurrentState(STATE_IDLE);
                break;
            case STATE_SET_GOAL:

                // If the goal was previously set
                // clear it
                if (goalPoly != null) {
                    polyLines.removeRenderable(goalPoly);
                }
                ShapeAttributes b = new BasicShapeAttributes();
                b.setOutlineOpacity(1);
                b.setDrawInterior(true);
                b.setEnableAntialiasing(true);
                b.setEnableLighting(true);
                b.setOutlineStipplePattern((short) 0xDD);
                b.setOutlineMaterial(new Material(Color.GREEN));
                b.setInteriorMaterial(new Material(Color.GREEN));
                b.setInteriorOpacity(0.5d);
                goalPoly = new SurfacePolygon(b, currentSelection);
                polyLines.addRenderable(goalPoly);
//                this.goal.addAll(currentSelection);
                setCurrentState(STATE_IDLE);
                break;
        }
    }

    public void cancel() {
    }

    public void mark() {
//        if(wwd.getCurrentPosition()!=null){
//        this.currentSelection.add(wwd.getCurrentPosition());
//        if(currentSelection.size()>2){
//            this.currentLine.setPositions(this.currentSelection);
//        }
//        wwd.redraw();
//        }
        if (wwd.getCurrentPosition() != null) {
            this.currentSelection.add(wwd.getCurrentPosition());
            this.polyLines.removeRenderable(currentLine);
            currentLine = new Polyline(this.currentSelection);
            currentLine.setFollowTerrain(true);
            currentLine.setColor(Color.yellow);
            currentLine.setLineWidth(1);
            currentLine.setPathType(Polyline.LINEAR);
            this.polyLines.addRenderable(currentLine);
            switch (getCurrentState()) {
                case STATE_ADD_OBSTACLE:
                    obstacles.get(obstacles.size() - 1).add(wwd.getCurrentPosition());
                    break;
                case STATE_SET_BORDER:
                    border.add(wwd.getCurrentPosition());
                    break;
                case STATE_SET_GOAL:
                    goal.add(wwd.getCurrentPosition());
                    break;
            }
            setChanged();
            notifyObservers(MARK_POINT);
            clearChanged();
        }
    }

    private void stateSetGoalTo(int state) {
        switch (state) {
            case STATE_SET_BORDER:
                border = new ArrayList<Position>();
                break;
            case STATE_ADD_OBSTACLE:
                obstacles.add(new ArrayList<Position>());
                break;
            case STATE_IDLE:
                break;
        }
    }

    private void stateAddObstacleTo(int state) {
        switch (state) {
            case STATE_SET_BORDER:
                border = new ArrayList<Position>();
                break;
            case STATE_IDLE:
                break;
            case STATE_SET_GOAL:
                goal = new ArrayList<Position>();
                break;
        }
    }

    public int getCurrentState() {
        return this.currentState;
    }

    public ArrayList<Position> getCurrentSelection() {
        return this.currentSelection;
    }

    public ArrayList<Position> getBorder() {
        return this.border;
    }

    public ArrayList<Position> getGoal() {
        return this.goal;
    }

    public ArrayList<ArrayList<Position>> getObstacles() {
        return this.obstacles;
    }

    @Override
    public void generateFile(String pathToTheFile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
