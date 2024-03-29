/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cafe_management_app.ui.DashboardStaffUI;

import com.mycompany.cafe_management_app.model.DishDetail;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class BillDetailsUI extends javax.swing.JFrame {

    /**
     * Creates new form BillDetails
     */
    public void settimeBillLabel(String timeLabel) {
        timeBillLabel.setText(timeLabel);
    }

    public void setmethodBillLabel(String methodLabel) {
        methodBillLabel.setText(methodLabel);
    }

    public void settotalBillLabel(String totalLabel) {
        totalBillLabel.setText(totalLabel);
    }

    public void setreceiveBillLabel(String receiveLabel) {
        receiveBillLabel.setText(receiveLabel);
    }

    public void setreturnBillLabel(String returnLabel) {
        returnBillLabel.setText(returnLabel);
    }

    public BillDetailsUI() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public JPanel getContainer() {
        return bgPanelPayment;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        timeBillLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        scrollPanelPayment = new javax.swing.JScrollPane();
        bgPanelPayment = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        methodBillLabel = new javax.swing.JLabel();
        totalBillLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        receiveBillLabel = new javax.swing.JLabel();
        returnBillLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(385, 510));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Time:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("UTM Ambrose", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("La Cà Coffee");

        timeBillLabel.setBackground(new java.awt.Color(255, 255, 255));
        timeBillLabel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        timeBillLabel.setForeground(new java.awt.Color(0, 0, 0));
        timeBillLabel.setText("18/03/2023");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(385, 360));
        jPanel8.setPreferredSize(new java.awt.Dimension(385, 360));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.Y_AXIS));

        jPanel9.setBackground(new java.awt.Color(200, 200, 200));
        jPanel9.setMaximumSize(new java.awt.Dimension(385, 30));
        jPanel9.setMinimumSize(new java.awt.Dimension(385, 30));
        jPanel9.setPreferredSize(new java.awt.Dimension(385, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Inventory Name");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Size");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Price");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(48, 48, 48)
                .addComponent(jLabel13)
                .addGap(74, 74, 74)
                .addComponent(jLabel14)
                .addGap(60, 60, 60))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel9);

        scrollPanelPayment.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanelPayment.setForeground(new java.awt.Color(255, 255, 255));
        scrollPanelPayment.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        bgPanelPayment.setBackground(new java.awt.Color(255, 255, 255));
        bgPanelPayment.setMaximumSize(new java.awt.Dimension(600, 800));
        bgPanelPayment.setMinimumSize(new java.awt.Dimension(600, 800));
        bgPanelPayment.setRequestFocusEnabled(false);
        bgPanelPayment.setLayout(new javax.swing.BoxLayout(bgPanelPayment, javax.swing.BoxLayout.Y_AXIS));
        scrollPanelPayment.setViewportView(bgPanelPayment);

        jPanel8.add(scrollPanelPayment);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Total Price: ");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Method:");

        methodBillLabel.setBackground(new java.awt.Color(255, 255, 255));
        methodBillLabel.setForeground(new java.awt.Color(0, 0, 0));
        methodBillLabel.setText("cash");

        totalBillLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalBillLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalBillLabel.setText("0");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Receive Amount:");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Return Amount:");

        receiveBillLabel.setBackground(new java.awt.Color(255, 255, 255));
        receiveBillLabel.setForeground(new java.awt.Color(0, 0, 0));
        receiveBillLabel.setText("100000");

        returnBillLabel.setBackground(new java.awt.Color(255, 255, 255));
        returnBillLabel.setForeground(new java.awt.Color(0, 0, 0));
        returnBillLabel.setText("20000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeBillLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(methodBillLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receiveBillLabel)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnBillLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalBillLabel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(timeBillLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(methodBillLabel)
                    .addComponent(jLabel15)
                    .addComponent(totalBillLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(receiveBillLabel)
                    .addComponent(jLabel20)
                    .addComponent(returnBillLabel))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addGap(90, 90, 90)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // /**
    //  * @param args the command line arguments
    //  */
    // public static void main(String args[]) {
    //     /* Set the Nimbus look and feel */
    //     // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    //     // (optional) ">
    //     /*
    //      * If Nimbus (introduced in Java SE 6) is not available, stay with the default
    //      * look and feel.
    //      * For details see
    //      * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    //      */
    //     try {
    //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //             if ("Nimbus".equals(info.getName())) {
    //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                 break;
    //             }
    //         }
    //     } catch (ClassNotFoundException ex) {
    //         java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
    //                 ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
    //                 ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
    //                 ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
    //                 ex);
    //     }
    //     // </editor-fold>
    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new BillDetails().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanelPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel methodBillLabel;
    private javax.swing.JLabel receiveBillLabel;
    private javax.swing.JLabel returnBillLabel;
    private javax.swing.JScrollPane scrollPanelPayment;
    private javax.swing.JLabel timeBillLabel;
    private javax.swing.JLabel totalBillLabel;
    // End of variables declaration//GEN-END:variables
}
