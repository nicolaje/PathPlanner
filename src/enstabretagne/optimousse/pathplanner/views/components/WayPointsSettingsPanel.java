/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HarmonicFieldSettingsPanel.java
 *
 * Created on 8 déc. 2011, 22:05:46
 */
package enstabretagne.optimousse.pathplanner.views.components;

import enstabretagne.optimousse.pathplanner.settings.AbstractSettings;
import enstabretagne.optimousse.pathplanner.settings.ISettings;

/**
 *
 * @author jem
 */
public class WayPointsSettingsPanel extends javax.swing.JPanel implements ISettings{

    private boolean alreadyClicked=false;
    
    /** Creates new form HarmonicFieldSettingsPanel */
    public WayPointsSettingsPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        radiusTextField = new javax.swing.JTextField();

        jLabel1.setText("Default radius of the validation circle :");

        radiusTextField.setText("r (in meters)");
        radiusTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radiusTextFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(radiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(radiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radiusTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radiusTextFieldMouseClicked
        if(!alreadyClicked){
            radiusTextField.setText("");
            alreadyClicked=true;
        }
    }//GEN-LAST:event_radiusTextFieldMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField radiusTextField;
    // End of variables declaration//GEN-END:variables

    public AbstractSettings getSettings() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean areSettingsValid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}