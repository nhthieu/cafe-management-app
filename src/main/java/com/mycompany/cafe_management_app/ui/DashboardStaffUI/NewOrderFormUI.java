/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cafe_management_app.ui.DashboardStaffUI;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
/**
 *
 * @author Trung
 */
public class NewOrderFormUI extends javax.swing.JFrame {

    /**
     * Creates new form NewOrderForm
     */
    public JPanel getContainerPayment(){
        return bgPanelPayment;
    }

    public JPanel getContainerDishStaff(){
        return bgscrollPanelDishStaff;
    }

    public JButton getPayCashButton(){
        return payCashButton;
    }

    public JLabel getOptionPaymentLabel(){
        return optionPaymentLabel;
    }

    public void setOptionPaymentLabel(String text){
        optionPaymentLabel.setText(text);
    }

    public JButton getPayCardButton(){
        return payCardButton;
    }

    public JButton getCancelOrderButton(){
        return cancelOrderButton;
    }

    public JButton getAddOrderButton(){
        return addOrderButton;
    }

    public JLabel getTotalPriceLabel(){
        return totalPriceLabel;
    }

    public String getReceivedAmountField(){
        return receivedAmountField.getText();
    }

    public String getStateProceString(){
        return stateProcessing.getText();
    }

    public void setStateProcessing(String text){
        stateProcessing.setText(text);
    }

    public void setReceivedAmountField(String text){
        receivedAmountField.setText(text);
    }

  
    public NewOrderFormUI() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        scrollPanelPayment = new javax.swing.JScrollPane();
        bgPanelPayment = new javax.swing.JPanel();
        optionPaymentLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        addOrderButton = new javax.swing.JButton();
        cancelOrderButton = new javax.swing.JButton();
        receivedAmountField = new javax.swing.JTextField();
        stateProcessing = new javax.swing.JLabel();
        payCashButton = new javax.swing.JButton();
        payCardButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        scrollPanelDishStaff = new javax.swing.JScrollPane();
        bgscrollPanelDishStaff = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(380, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(380, 600));
        jPanel2.setRequestFocusEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(348, 412));
        jPanel4.setPreferredSize(new java.awt.Dimension(348, 412));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setBackground(new java.awt.Color(200, 200, 200));
        jPanel5.setMaximumSize(new java.awt.Dimension(385, 35));
        jPanel5.setMinimumSize(new java.awt.Dimension(385, 35));
        jPanel5.setPreferredSize(new java.awt.Dimension(385, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Inventory Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Size");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Price");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(58, 58, 58)
                .addComponent(jLabel7)
                .addGap(62, 62, 62)
                .addComponent(jLabel8)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);

        scrollPanelPayment.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanelPayment.setForeground(new java.awt.Color(255, 255, 255));
        scrollPanelPayment.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        bgPanelPayment.setBackground(new java.awt.Color(255, 255, 255));
        bgPanelPayment.setMaximumSize(new java.awt.Dimension(600, 800));
        bgPanelPayment.setMinimumSize(new java.awt.Dimension(600, 800));
        bgPanelPayment.setRequestFocusEnabled(false);
        bgPanelPayment.setLayout(new javax.swing.BoxLayout(bgPanelPayment, javax.swing.BoxLayout.Y_AXIS));
        scrollPanelPayment.setViewportView(bgPanelPayment);

        jPanel4.add(scrollPanelPayment);

        optionPaymentLabel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        optionPaymentLabel.setForeground(new java.awt.Color(0, 0, 0));
        optionPaymentLabel.setText("Received:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total Price:");

        totalPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalPriceLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalPriceLabel.setText("0");

        addOrderButton.setBackground(new java.awt.Color(51, 51, 51));
        addOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        addOrderButton.setText("Add");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        cancelOrderButton.setBackground(new java.awt.Color(51, 51, 51));
        cancelOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelOrderButton.setText("Cancel");
        cancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderButtonActionPerformed(evt);
            }
        });

        receivedAmountField.setBackground(new java.awt.Color(255, 255, 255));
        receivedAmountField.setMaximumSize(new java.awt.Dimension(100, 22));
        receivedAmountField.setMinimumSize(new java.awt.Dimension(100, 22));
        receivedAmountField.setOpaque(true);
        receivedAmountField.setPreferredSize(new java.awt.Dimension(100, 22));

        stateProcessing.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stateProcessing.setForeground(new java.awt.Color(0, 0, 0));

        payCashButton.setBackground(new java.awt.Color(51, 51, 51));
        payCashButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        payCashButton.setForeground(new java.awt.Color(255, 255, 255));
        payCashButton.setText("Cash");
        payCashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payCashButtonActionPerformed(evt);
            }
        });

        payCardButton.setBackground(new java.awt.Color(51, 51, 51));
        payCardButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        payCardButton.setForeground(new java.awt.Color(255, 255, 255));
        payCardButton.setText("Card");
        payCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payCardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(optionPaymentLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(receivedAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(stateProcessing)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(payCashButton)
                                .addGap(178, 178, 178)))
                        .addGap(18, 18, 18)
                        .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(payCardButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPriceLabel)
                        .addGap(56, 56, 56)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(totalPriceLabel))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(payCashButton)
                        .addComponent(payCardButton)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receivedAmountField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionPaymentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateProcessing))
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(700, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 600));

        scrollPanelDishStaff.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanelDishStaff.setForeground(new java.awt.Color(255, 255, 255));
        scrollPanelDishStaff.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        bgscrollPanelDishStaff.setBackground(new java.awt.Color(255, 255, 255));
        bgscrollPanelDishStaff.setMaximumSize(new java.awt.Dimension(600, 800));
        bgscrollPanelDishStaff.setMinimumSize(new java.awt.Dimension(600, 800));
        bgscrollPanelDishStaff.setRequestFocusEnabled(false);
        bgscrollPanelDishStaff.setLayout(new javax.swing.BoxLayout(bgscrollPanelDishStaff, javax.swing.BoxLayout.Y_AXIS));
        scrollPanelDishStaff.setViewportView(bgscrollPanelDishStaff);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelDishStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelDishStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void cancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderButtonActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_cancelOrderButtonActionPerformed

    private void payCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payCashButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payCashButtonActionPerformed

    private void payCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payCardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payCardButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewOrderFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrderFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrderFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrderFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrderFormUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderButton;
    private javax.swing.JPanel bgPanelPayment;
    private javax.swing.JPanel bgscrollPanelDishStaff;
    private javax.swing.JButton cancelOrderButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel optionPaymentLabel;
    private javax.swing.JButton payCardButton;
    private javax.swing.JButton payCashButton;
    private javax.swing.JTextField receivedAmountField;
    private javax.swing.JScrollPane scrollPanelDishStaff;
    private javax.swing.JScrollPane scrollPanelPayment;
    private javax.swing.JLabel stateProcessing;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
