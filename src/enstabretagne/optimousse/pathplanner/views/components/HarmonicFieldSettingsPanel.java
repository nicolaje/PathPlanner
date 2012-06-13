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
import enstabretagne.optimousse.pathplanner.settings.HarmonicFieldSettings;
import java.awt.event.ItemEvent;
import enstabretagne.optimousse.pathplanner.settings.ISettings;
import javax.swing.JCheckBox;

/**
 *
 * @author jem
 */
public class HarmonicFieldSettingsPanel extends javax.swing.JPanel implements ISettings {

    /** Creates new form HarmonicFieldSettingsPanel */
    public HarmonicFieldSettingsPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        iterationsNumberCheckBox = new javax.swing.JCheckBox();
        nbOfIterationsTextField = new javax.swing.JTextField();
        convergenceCriterionCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cvCritetionTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        normalizationCheckBox = new javax.swing.JCheckBox();
        meshSizeCheckBox = new javax.swing.JCheckBox();
        meshNumberCheckBox = new javax.swing.JCheckBox();
        meshSize = new javax.swing.JTextField();
        meshNumber = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Field Computation Settings"));

        iterationsNumberCheckBox.setSelected(true);
        iterationsNumberCheckBox.setText("Max. number of iterations :");
        iterationsNumberCheckBox.setEnabled(false);
        iterationsNumberCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                iterationsNumberCheckBoxItemStateChanged(evt);
            }
        });

        convergenceCriterionCheckBox.setText("Convergence criterion :");
        convergenceCriterionCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                convergenceCriterionCheckBoxItemStateChanged(evt);
            }
        });

        jLabel1.setText("1*10^(-");

        cvCritetionTextField.setText("exp");
        cvCritetionTextField.setEnabled(false);

        jLabel2.setText(")");

        normalizationCheckBox.setText("Normalization");
        normalizationCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                normalizationCheckBoxItemStateChanged(evt);
            }
        });

        meshSizeCheckBox.setSelected(true);
        meshSizeCheckBox.setText("Mesh size (meters):");
        meshSizeCheckBox.setEnabled(false);
        meshSizeCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                meshSizeCheckBoxItemStateChanged(evt);
            }
        });

        meshNumberCheckBox.setText("Max. number of mesh :");
        meshNumberCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                meshNumberCheckBoxItemStateChanged(evt);
            }
        });

        meshNumber.setText("number");
        meshNumber.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iterationsNumberCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nbOfIterationsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(convergenceCriterionCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cvCritetionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(normalizationCheckBox)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meshNumberCheckBox)
                            .addComponent(meshSizeCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(meshSize)
                            .addComponent(meshNumber))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iterationsNumberCheckBox)
                    .addComponent(nbOfIterationsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convergenceCriterionCheckBox)
                    .addComponent(jLabel2)
                    .addComponent(cvCritetionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(normalizationCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meshSizeCheckBox)
                    .addComponent(meshSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meshNumberCheckBox)
                    .addComponent(meshNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iterationsNumberCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_iterationsNumberCheckBoxItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            nbOfIterationsTextField.setText("");
            nbOfIterationsTextField.setEnabled(true);
            convergenceCriterionCheckBox.setEnabled(true);
            if(!convergenceCriterionCheckBox.isSelected()){
                iterationsNumberCheckBox.setEnabled(false);
            }
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            nbOfIterationsTextField.setText("nb. of iterations");
            nbOfIterationsTextField.setEnabled(false);
            convergenceCriterionCheckBox.setEnabled(false);
        }
    }//GEN-LAST:event_iterationsNumberCheckBoxItemStateChanged

    private void convergenceCriterionCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_convergenceCriterionCheckBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cvCritetionTextField.setText("");
            cvCritetionTextField.setEnabled(true);
            iterationsNumberCheckBox.setEnabled(true);
            if(!iterationsNumberCheckBox.isSelected()){
                convergenceCriterionCheckBox.setEnabled(false);
            }
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            cvCritetionTextField.setText("exp");
            cvCritetionTextField.setEnabled(false);
            iterationsNumberCheckBox.setEnabled(false);
        }
    }//GEN-LAST:event_convergenceCriterionCheckBoxItemStateChanged

    private void normalizationCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_normalizationCheckBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_normalizationCheckBoxItemStateChanged

    private void meshNumberCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meshNumberCheckBoxItemStateChanged
        JCheckBox cb = (JCheckBox) evt.getSource();
        if (cb.isSelected()) {
            meshSizeCheckBox.setSelected(false);
            meshSize.setEnabled(false);
            meshNumber.setEnabled(true);
            meshNumberCheckBox.setEnabled(false);
            meshSizeCheckBox.setEnabled(true);
            meshNumber.setText("");
            meshSize.setText("size");
        }
    }//GEN-LAST:event_meshNumberCheckBoxItemStateChanged

    private void meshSizeCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meshSizeCheckBoxItemStateChanged
        JCheckBox cb = (JCheckBox) evt.getSource();
        if (cb.isSelected()) {
            meshNumberCheckBox.setSelected(false);
            meshNumber.setEnabled(false);
            meshSize.setEnabled(true);
            meshSizeCheckBox.setEnabled(false);
            meshNumberCheckBox.setEnabled(true);
            meshSize.setText("");
            meshNumber.setText("number");
        }
    }//GEN-LAST:event_meshSizeCheckBoxItemStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox convergenceCriterionCheckBox;
    private javax.swing.JTextField cvCritetionTextField;
    private javax.swing.JCheckBox iterationsNumberCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField meshNumber;
    private javax.swing.JCheckBox meshNumberCheckBox;
    private javax.swing.JTextField meshSize;
    private javax.swing.JCheckBox meshSizeCheckBox;
    private javax.swing.JTextField nbOfIterationsTextField;
    private javax.swing.JCheckBox normalizationCheckBox;
    // End of variables declaration//GEN-END:variables

    public AbstractSettings getSettings() {
        return new HarmonicFieldSettings();
    }

    @Override
    public boolean areSettingsValid() {

        boolean nbOfIterationSelected = iterationsNumberCheckBox.isSelected();
        boolean goodNbOfIterations = false;
        
        if (nbOfIterationSelected) {
            try {
                Float.parseFloat(nbOfIterationsTextField.getText());
                goodNbOfIterations = true;

            } catch (NumberFormatException n) {
                goodNbOfIterations = false;
            }
        }
        
        boolean convergenceCriterionSelected=convergenceCriterionCheckBox.isSelected();
        boolean goodCVCriterion=false;
        
        if(convergenceCriterionSelected){
            try{
                Float.parseFloat(cvCritetionTextField.getText());
                goodCVCriterion=true;
            }catch(NumberFormatException e){
                goodCVCriterion=false;
            }
        }
        
        boolean meshSizeSelected=meshSizeCheckBox.isSelected();
        boolean goodMeshSize=false;
        
        try{
            Float.parseFloat(meshSize.getText());
            goodMeshSize=true;
        }catch(NumberFormatException n){
            goodMeshSize=false;
        }
        
        boolean maxNumBerOfMeshSelected=meshNumberCheckBox.isSelected();
        boolean goodNumBerOfMesh=false;
        
        try{
            Float.parseFloat(meshNumber.getText());
            goodNumBerOfMesh=true;
        }catch(NumberFormatException n){
            goodNbOfIterations=false;
        }        
        
        // debug
//        System.out.println("Number of it. sel: "+nbOfIterationSelected);
//        System.out.println("Number of it. is good: "+goodNbOfIterations);
//        
//        System.out.println("Cv. crit. sel: "+convergenceCriterionSelected);
//        System.out.println("Cv. crit. sel is good: "+goodCVCriterion);
//        
//        System.out.println("Mesh size selected: "+meshSizeSelected);
//        System.out.println("good mesh size: "+goodMeshSize);
//        
//        System.out.println("Max nb of mesh selected: "+maxNumBerOfMeshSelected);
//        System.out.println("good nb of mesh : "+goodNumBerOfMesh);
        
        return ((maxNumBerOfMeshSelected&&goodNbOfIterations)||(convergenceCriterionSelected&&goodCVCriterion))&&((meshSizeSelected&&goodMeshSize)^(maxNumBerOfMeshSelected&&goodNumBerOfMesh));
    }
}
