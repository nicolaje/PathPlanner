/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.views.components.widgets;

import enstabretagne.optimousse.pathplanner.algorithms.model.HarmonicFieldAlgorithm;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Jeremy
 */
public class HarmonicFieldWidget extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form HarmonicFieldWidget
     */
    
    private FieldPanel fieldPanel;
    
    public HarmonicFieldWidget() {
        initComponents();
        fieldPanel=new FieldPanel(fieldContainer.getWidth(), fieldContainer.getHeight());
        fieldContainer.add(fieldPanel);
        fieldContainer.setBackground(Color.red);
        fieldPanel.setVisible(true);
        pack();
    }

    public FieldPanel getFieldPanel(){
        return this.fieldPanel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        convergenceRadioButton = new javax.swing.JRadioButton();
        convergenceSlider = new javax.swing.JSlider();
        nbOfIterationRadioButton = new javax.swing.JRadioButton();
        nbOfIterationSlider = new javax.swing.JSlider();
        fieldContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        convergenceRadioButton.setSelected(true);
        convergenceRadioButton.setText("Convergence :");
        convergenceRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                convergenceRadioButtonStateChanged(evt);
            }
        });
        convergenceRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                convergenceRadioButtonItemStateChanged(evt);
            }
        });
        convergenceRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convergenceRadioButtonActionPerformed(evt);
            }
        });

        convergenceSlider.setPaintLabels(true);

        nbOfIterationRadioButton.setText("Nb. of iterations:");
        nbOfIterationRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nbOfIterationRadioButtonStateChanged(evt);
            }
        });
        nbOfIterationRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nbOfIterationRadioButtonItemStateChanged(evt);
            }
        });

        nbOfIterationSlider.setEnabled(false);

        fieldContainer.setLayout(new javax.swing.BoxLayout(fieldContainer, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convergenceRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convergenceSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nbOfIterationRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nbOfIterationSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(fieldContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(convergenceRadioButton))
                    .addComponent(convergenceSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbOfIterationRadioButton)
                    .addComponent(nbOfIterationSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void convergenceRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convergenceRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convergenceRadioButtonActionPerformed

    private void convergenceRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_convergenceRadioButtonStateChanged

    }//GEN-LAST:event_convergenceRadioButtonStateChanged

    private void nbOfIterationRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nbOfIterationRadioButtonStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nbOfIterationRadioButtonStateChanged

    private void convergenceRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_convergenceRadioButtonItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            convergenceSlider.setEnabled(true);
        }else{
            if(nbOfIterationSlider.isEnabled()){
            convergenceSlider.setEnabled(false);
            }else{
                convergenceRadioButton.setSelected(true);
            }
        }
    }//GEN-LAST:event_convergenceRadioButtonItemStateChanged

    private void nbOfIterationRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nbOfIterationRadioButtonItemStateChanged
      if(evt.getStateChange()==ItemEvent.SELECTED){
            nbOfIterationSlider.setEnabled(true);
        }else{
          if(convergenceSlider.isEnabled()){
            nbOfIterationSlider.setEnabled(false);
          }else{
              nbOfIterationRadioButton.setSelected(true);
          }
        }
    }//GEN-LAST:event_nbOfIterationRadioButtonItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HarmonicFieldWidget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HarmonicFieldWidget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HarmonicFieldWidget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HarmonicFieldWidget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HarmonicFieldWidget().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton convergenceRadioButton;
    private javax.swing.JSlider convergenceSlider;
    private javax.swing.JPanel fieldContainer;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JRadioButton nbOfIterationRadioButton;
    private javax.swing.JSlider nbOfIterationSlider;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        fieldPanel.update(((HarmonicFieldAlgorithm)o));
        fieldPanel.test();
    }
}
