/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.cafe_management_app.ui;
import com.mycompany.cafe_management_app.controller.DashboardAdminController.DeleteDishFunction;
import com.mycompany.cafe_management_app.controller.DashboardAdminController.DetailsDishFunction;
import com.mycompany.cafe_management_app.controller.DashboardAdminController.EditDishFunction;
import com.mycompany.cafe_management_app.model.Dish;
import javax.swing.JButton;
/**
 *
 * @author namho
 */
public class MenuItem extends javax.swing.JPanel {

    /**
     * Creates new form MenuItem
     */
    private DetailsDishFunction detailsDishFunction;
    private EditDishFunction editDishFunction;
    private DeleteDishFunction deleteDishFunction;
    private Dish dish;
    public MenuItem(Dish dish, DetailsDishFunction detailsDishFunction ,
            EditDishFunction editDishFunction , DeleteDishFunction deleteDishFunction,boolean viewOnly) {
        initComponents();
        this.dish = dish;
        this.nameDish.setText(dish.getName());
        this.detailsDishFunction = detailsDishFunction;
        this.editDishFunction = editDishFunction;
        this.deleteDishFunction = deleteDishFunction;
        editBtn.setVisible(!viewOnly);
        deleteBtn.setVisible(!viewOnly);
    }
    
    public JButton getDetailsBtn() {
        return detailsBtn;
    }
    
    public JButton getEditBtn() {
        return editBtn;
    }
    
    public JButton getDeleteBtn() {
        return deleteBtn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameDish = new javax.swing.JLabel();
        detailsBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 32));
        setMinimumSize(new java.awt.Dimension(800, 32));
        setPreferredSize(new java.awt.Dimension(800, 32));

        nameDish.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameDish.setForeground(new java.awt.Color(51, 51, 51));
        nameDish.setText(".");

        detailsBtn.setBackground(new java.awt.Color(255, 255, 255));
        detailsBtn.setForeground(new java.awt.Color(51, 51, 51));
        detailsBtn.setText("Details");
        detailsBtn.setBorder(null);
        detailsBtn.setBorderPainted(false);
        detailsBtn.setFocusPainted(false);
        detailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setForeground(new java.awt.Color(51, 51, 51));
        editBtn.setText("Edit");
        editBtn.setBorder(null);
        editBtn.setBorderPainted(false);
        editBtn.setFocusPainted(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 51, 51));
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(null);
        deleteBtn.setBorderPainted(false);
        deleteBtn.setFocusPainted(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(nameDish, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(detailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameDish)
                    .addComponent(detailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        editDishFunction.execute(dish, dish.getId());
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        deleteDishFunction.delete(dish);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void detailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsBtnActionPerformed
        // TODO add your handling code here:
        detailsDishFunction.showDetails(dish.getId());
    }//GEN-LAST:event_detailsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton detailsBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel nameDish;
    // End of variables declaration//GEN-END:variables
}
