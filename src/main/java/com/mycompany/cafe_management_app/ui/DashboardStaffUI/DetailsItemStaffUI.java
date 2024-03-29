package com.mycompany.cafe_management_app.ui.DashboardStaffUI;

import com.mycompany.cafe_management_app.controller.DashboardStaffController.DetailsDishFunction;

import com.mycompany.cafe_management_app.model.Dish;
import com.mycompany.cafe_management_app.model.DishDetail;

import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Trung
 */
public class DetailsItemStaffUI extends javax.swing.JPanel {

    private Dish dish;

    private DishDetail dishDetail;
    private DetailsDishFunction detailsDishFunction;

    public DetailsItemStaffUI(DishDetail dishDetail, DetailsDishFunction detailsDishFunction) {
        initComponents();
        this.dishDetail = dishDetail;
//        this.dish = dish;
        this.sizeLabel.setText(dishDetail.getSize());
        
        String totalPrice = String.format("%,.0f", dishDetail.getPrice());
        
        this.priceLabel.setText(totalPrice);
        this.detailsDishFunction = detailsDishFunction;
    }

    public JButton getPriceLabel() {
        return priceLabel;
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

        sizeLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(150, 30));
        setMinimumSize(new java.awt.Dimension(150, 30));
        setPreferredSize(new java.awt.Dimension(150, 30));

        sizeLabel.setForeground(new java.awt.Color(51, 51, 51));
        sizeLabel.setText(".");

        priceLabel.setBackground(new java.awt.Color(255, 255, 255));
        priceLabel.setText(".");
        priceLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priceLabel.setMaximumSize(new java.awt.Dimension(23, 23));
        priceLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeLabel)
                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void priceLabelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_priceLabelActionPerformed
//        String name = dish.getName();
        Double price = Double.parseDouble(priceLabel.getText().replace(",", ""));
        String size = sizeLabel.getText();
        detailsDishFunction.addDishDetail(dishDetail);

    }// GEN-LAST:event_priceLabelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton priceLabel;
    private javax.swing.JLabel sizeLabel;
    // End of variables declaration//GEN-END:variables
}
