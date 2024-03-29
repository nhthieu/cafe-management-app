/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.cafe_management_app.ui.DashboardAdminUI;

import com.mycompany.cafe_management_app.model.Staff;
import com.mycompany.cafe_management_app.util.callback.EditEvent;
import com.mycompany.cafe_management_app.util.callback.DeleteEvent;

/**
 *
 * @author namho
 */
public class BillItem extends javax.swing.JPanel {

    /**
     * Creates new form StaffItem
     */
    public BillItem(String index, String time, String received, String returned, String total) {
       initComponents();
       indexLabel.setText(index);
       timeLabel.setText(time);
       receivedAmountLabel.setText(received);
       returnedAmountLabel.setText(returned);
       totalPriceLabel.setText(total);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        indexLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        receivedAmountLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        returnedAmountLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 32));
        setMinimumSize(new java.awt.Dimension(800, 32));
        setPreferredSize(new java.awt.Dimension(800, 32));
        setLayout(null);

        indexLabel.setForeground(new java.awt.Color(51, 51, 51));
        indexLabel.setText(".");
        add(indexLabel);
        indexLabel.setBounds(10, 10, 30, 16);

        timeLabel.setForeground(new java.awt.Color(51, 51, 51));
        timeLabel.setText(".");
        add(timeLabel);
        timeLabel.setBounds(50, 10, 140, 16);

        receivedAmountLabel.setForeground(new java.awt.Color(51, 51, 51));
        receivedAmountLabel.setText(".");
        add(receivedAmountLabel);
        receivedAmountLabel.setBounds(250, 10, 80, 16);

        totalPriceLabel.setForeground(new java.awt.Color(51, 51, 51));
        totalPriceLabel.setText(".");
        add(totalPriceLabel);
        totalPriceLabel.setBounds(590, 10, 90, 16);

        returnedAmountLabel.setForeground(new java.awt.Color(51, 51, 51));
        returnedAmountLabel.setText(".");
        add(returnedAmountLabel);
        returnedAmountLabel.setBounds(420, 10, 90, 16);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel indexLabel;
    private javax.swing.JLabel receivedAmountLabel;
    private javax.swing.JLabel returnedAmountLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
