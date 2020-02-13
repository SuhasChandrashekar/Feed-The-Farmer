/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SeedSupplierRole;

import userinterface.BankManagerRole.*;
import Business.WorkQueue.BankLoanWorkRequest;
import Business.WorkQueue.SeedWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    SeedWorkRequest request;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, SeedWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approveJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        rejectjButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(194, 223, 252));

        approveJButton.setText("Ship");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Result");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        rejectjButton1.setText("Cancel");
        rejectjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(approveJButton)
                        .addGap(47, 47, 47)
                        .addComponent(rejectjButton1))
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveJButton)
                    .addComponent(backJButton)
                    .addComponent(rejectjButton1))
                .addContainerGap(709, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SeedSupplierWorkAreaJPanel dwjp = (SeedSupplierWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Shipped");
        JOptionPane.showMessageDialog(null,"Order Shipped","INFO",JOptionPane.INFORMATION_MESSAGE);
        backJButtonActionPerformed(evt);
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void rejectjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectjButton1ActionPerformed
        // TODO add your handling code here:
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Cancelled");
        JOptionPane.showMessageDialog(null,"Order Cancelled","INFO",JOptionPane.INFORMATION_MESSAGE);
        backJButtonActionPerformed(evt);
    }//GEN-LAST:event_rejectjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rejectjButton1;
    private javax.swing.JTextField resultJTextField;
    // End of variables declaration//GEN-END:variables
}
