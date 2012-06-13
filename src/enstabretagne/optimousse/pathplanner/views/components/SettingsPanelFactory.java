/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.views.components;

import enstabretagne.optimousse.pathplanner.views.components.HarmonicFieldSettingsPanel;
import enstabretagne.optimousse.pathplanner.views.components.SemiPlaneSettingsPanel;
import enstabretagne.optimousse.pathplanner.views.components.WayPointsSettingsPanel;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import enstabretagne.optimousse.pathplanner.views.components.HarmonicFieldSettingsPanel;
import enstabretagne.optimousse.pathplanner.views.components.SemiPlaneSettingsPanel;
import enstabretagne.optimousse.pathplanner.views.components.WayPointsSettingsPanel;

/**
 * quick&dirty-pseudo factory pattern
 * @author Jeremy Nicola ( jeremy.nicola@gmail.com )
 */
public class SettingsPanelFactory {
    public static enum Algorithm implements ListCellRenderer{
        HARMONIC("Harmonic Field", false),SEMI_PLANE("Semi-Planes", true),WAYPOINTS("Way-Points", true);
        
        private String name;
        private boolean supportMultiTracks;
        
        Algorithm(String s, boolean multitracks){
            name=s;
            supportMultiTracks=multitracks;
        }
        
        @Override
        public String toString(){
            return name;
        }

        public boolean equals(Algorithm a){
            return toString().equals(a.toString());
        }
        
        public boolean isMultitrack(){
            return supportMultiTracks;
        }
        
        // TODO: Add icons so that it talks more
        public Component getListCellRendererComponent(JList jlist, Object o, int i, boolean bln, boolean bln1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
    public static JPanel makePanel(Algorithm a){
        System.out.print("From factory: "+a);
        
        // could be using switch/case on Strings, but only for JDK 1.7, so prefer boring if/else
        if(a.equals(Algorithm.HARMONIC)){
            return new HarmonicFieldSettingsPanel();
        }else if(a.equals(Algorithm.SEMI_PLANE)){
            return new SemiPlaneSettingsPanel();
        }else if(a.equals(Algorithm.WAYPOINTS)){
            return new WayPointsSettingsPanel();
        }else{
            System.out.append("Null ahah!");
            return null; // TODO: android-like toaster
        }
    }
    
    public static Algorithm[] availableAlgorithms(){
        Algorithm[] algorithm={Algorithm.HARMONIC, Algorithm.SEMI_PLANE, Algorithm.WAYPOINTS};
        return algorithm;
    }
}
