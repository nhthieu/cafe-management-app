/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cafe_management_app.ui.DashboardStaffUI;

import com.mycompany.cafe_management_app.controller.DashboardStaffController;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author namho
 */
public class DashboardStaffUI extends javax.swing.JFrame {

    public javax.swing.JButton getCheckInOutButton() {
        return checkInOutButton;
    }

    public javax.swing.JPanel getPanelCheckIn() {
        return panelCheckIn;
    }

    public JPanel getContainerListBill() {
        return bgScrollPanelOrder;
    }

    public JButton getAddOrderBtn() {
        return addOrder;
    }

    /**
     * Creates new form DashboardAdminUI
     */
    CardLayout cards;

    private void selectBtn(JButton btn) {
        btn.setBackground(Color.WHITE);
        btn.setForeground(Color.getColor("#333333"));
    }

    private void unselectBtn(JButton btn) {
        btn.setForeground(Color.WHITE);
        btn.setBackground(Color.getColor("#333333"));
    }

    public DashboardStaffUI() {
        initComponents();
        cards = (CardLayout) (cardLayout.getLayout());
        selectBtn(navItemOrder);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        navItemOrder = new javax.swing.JButton();
        navItemMenu = new javax.swing.JButton();
        navItemCheckIn = new javax.swing.JButton();
        cardLayout = new javax.swing.JPanel();
        panelOrder = new javax.swing.JPanel();
        bgOrderPage = new com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage();
        headerOrderPage = new javax.swing.JPanel();
        addOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        revenuLabel = new javax.swing.JLabel();
        contentOrderPage = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        scrollPanelStaff = new javax.swing.JScrollPane();
        bgScrollPanelOrder = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        bgMenuPage = new com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage();
        headerMenuPage = new javax.swing.JPanel();
        contentMenuPage = new javax.swing.JPanel();
        scrollPanelMenu = new javax.swing.JScrollPane();
        bgScrollPanelMenu = new javax.swing.JPanel();
        panelCheckIn = new javax.swing.JPanel();
        bgPage1 = new com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage();
        checkInOutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(180, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(180, 127));
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WorkSpace");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setMaximumSize(new java.awt.Dimension(180, 32));
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 32));
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        navItemOrder.setBackground(new java.awt.Color(51, 51, 51));
        navItemOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        navItemOrder.setForeground(new java.awt.Color(255, 255, 255));
        navItemOrder.setText("Order");
        navItemOrder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        navItemOrder.setBorderPainted(false);
        navItemOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navItemOrder.setFocusPainted(false);
        navItemOrder.setMaximumSize(new java.awt.Dimension(39, 35));
        navItemOrder.setMinimumSize(new java.awt.Dimension(39, 35));
        navItemOrder.setPreferredSize(new java.awt.Dimension(39, 35));
        navItemOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navItemOrderMouseClicked(evt);
            }
        });
        navItemOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navItemOrderActionPerformed(evt);
            }
        });
        jPanel2.add(navItemOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 190, -1));

        navItemMenu.setBackground(new java.awt.Color(51, 51, 51));
        navItemMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        navItemMenu.setForeground(new java.awt.Color(255, 255, 255));
        navItemMenu.setText("Menu");
        navItemMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        navItemMenu.setBorderPainted(false);
        navItemMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navItemMenu.setFocusPainted(false);
        navItemMenu.setPreferredSize(new java.awt.Dimension(49, 35));
        navItemMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navItemMenuMouseClicked(evt);
            }
        });
        navItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navItemMenuActionPerformed(evt);
            }
        });
        jPanel2.add(navItemMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 190, -1));

        navItemCheckIn.setBackground(new java.awt.Color(51, 51, 51));
        navItemCheckIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        navItemCheckIn.setForeground(new java.awt.Color(255, 255, 255));
        navItemCheckIn.setText("Check In");
        navItemCheckIn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        navItemCheckIn.setBorderPainted(false);
        navItemCheckIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navItemCheckIn.setFocusPainted(false);
        navItemCheckIn.setPreferredSize(new java.awt.Dimension(49, 35));
        navItemCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navItemCheckInMouseClicked(evt);
            }
        });
        navItemCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navItemCheckInActionPerformed(evt);
            }
        });
        jPanel2.add(navItemCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 160, 190, -1));

        jPanel1.add(jPanel2);

        cardLayout.setBackground(new java.awt.Color(255, 255, 255));
        cardLayout.setPreferredSize(new java.awt.Dimension(820, 600));
        cardLayout.setLayout(new java.awt.CardLayout());

        panelOrder.setBackground(new java.awt.Color(255, 255, 255));
        panelOrder.setLayout(null);

        bgOrderPage.setLayout(new javax.swing.BoxLayout(bgOrderPage, javax.swing.BoxLayout.Y_AXIS));

        headerOrderPage.setBackground(new java.awt.Color(255, 255, 255));
        headerOrderPage.setMaximumSize(new java.awt.Dimension(820, 32));
        headerOrderPage.setMinimumSize(new java.awt.Dimension(820, 32));
        headerOrderPage.setPreferredSize(new java.awt.Dimension(820, 32));

        addOrder.setBackground(new java.awt.Color(250, 250, 250));
        addOrder.setForeground(new java.awt.Color(0, 0, 0));
        addOrder.setText("New Order +");
        addOrder.setActionCommand("addStaffBtn");
        addOrder.setAutoscrolls(true);
        addOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addOrder.setFocusPainted(false);
        addOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Orders Today !");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Revenu today:");

        revenuLabel.setForeground(new java.awt.Color(0, 153, 102));
        revenuLabel.setText("300 000");

        javax.swing.GroupLayout headerOrderPageLayout = new javax.swing.GroupLayout(headerOrderPage);
        headerOrderPage.setLayout(headerOrderPageLayout);
        headerOrderPageLayout.setHorizontalGroup(
            headerOrderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerOrderPageLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(revenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(addOrder)
                .addGap(17, 17, 17))
        );
        headerOrderPageLayout.setVerticalGroup(
            headerOrderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerOrderPageLayout.createSequentialGroup()
                .addGroup(headerOrderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(revenuLabel)
                    .addComponent(addOrder))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        bgOrderPage.add(headerOrderPage);

        contentOrderPage.setBackground(new java.awt.Color(255, 255, 255));
        contentOrderPage.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Time");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total Price");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Receive Amount");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Return Amount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel7)
                .addGap(86, 86, 86)
                .addComponent(jLabel8)
                .addGap(61, 61, 61)
                .addComponent(jLabel9)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addComponent(jLabel8)
                .addComponent(jLabel9))
        );

        contentOrderPage.add(jPanel3);
        jPanel3.setBounds(0, 0, 820, 20);

        scrollPanelStaff.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanelStaff.setForeground(new java.awt.Color(255, 255, 255));
        scrollPanelStaff.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanelStaff.setViewportView(bgScrollPanelOrder);

        bgScrollPanelOrder.setBackground(new java.awt.Color(255, 255, 255));
        bgScrollPanelOrder.setMaximumSize(new java.awt.Dimension(800, 800));
        bgScrollPanelOrder.setRequestFocusEnabled(false);
        bgScrollPanelOrder.setLayout(new javax.swing.BoxLayout(bgScrollPanelOrder, javax.swing.BoxLayout.Y_AXIS));
        scrollPanelStaff.setViewportView(bgScrollPanelOrder);

        contentOrderPage.add(scrollPanelStaff);
        scrollPanelStaff.setBounds(0, 17, 820, 550);

        bgOrderPage.add(contentOrderPage);

        panelOrder.add(bgOrderPage);
        bgOrderPage.setBounds(0, 0, 820, 600);

        cardLayout.add(panelOrder, "cardStaff");

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setLayout(null);

        bgMenuPage.setLayout(new javax.swing.BoxLayout(bgMenuPage, javax.swing.BoxLayout.Y_AXIS));

        headerMenuPage.setMaximumSize(new java.awt.Dimension(820, 32));
        headerMenuPage.setMinimumSize(new java.awt.Dimension(820, 32));
        headerMenuPage.setOpaque(false);
        headerMenuPage.setPreferredSize(new java.awt.Dimension(820, 32));

        javax.swing.GroupLayout headerMenuPageLayout = new javax.swing.GroupLayout(headerMenuPage);
        headerMenuPage.setLayout(headerMenuPageLayout);
        headerMenuPageLayout.setHorizontalGroup(
            headerMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        headerMenuPageLayout.setVerticalGroup(
            headerMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        bgMenuPage.add(headerMenuPage);

        contentMenuPage.setAutoscrolls(true);
        contentMenuPage.setOpaque(false);

        scrollPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        scrollPanelMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanelMenu.setOpaque(false);

        bgScrollPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        bgScrollPanelMenu.setLayout(new javax.swing.BoxLayout(bgScrollPanelMenu, javax.swing.BoxLayout.Y_AXIS));
        scrollPanelMenu.setViewportView(bgScrollPanelMenu);

        javax.swing.GroupLayout contentMenuPageLayout = new javax.swing.GroupLayout(contentMenuPage);
        contentMenuPage.setLayout(contentMenuPageLayout);
        contentMenuPageLayout.setHorizontalGroup(
            contentMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelMenu)
        );
        contentMenuPageLayout.setVerticalGroup(
            contentMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        bgMenuPage.add(contentMenuPage);

        panelMenu.add(bgMenuPage);
        bgMenuPage.setBounds(0, 0, 820, 600);

        cardLayout.add(panelMenu, "cardMenu");

        panelCheckIn.setOpaque(false);
        panelCheckIn.setLayout(null);

        bgPage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkInOutButton.setBackground(new java.awt.Color(0, 0, 255));
        checkInOutButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkInOutButton.setForeground(new java.awt.Color(255, 255, 255));
        checkInOutButton.setText("Check in");
        checkInOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInOutButtonActionPerformed(evt);
            }
        });
        bgPage1.add(checkInOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 160, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Time Keeping");
        bgPage1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\CafeManagementApp\\src\\main\\java\\com\\mycompany\\cafe_management_app\\asset\\image\\checkInOutBG.png")); // NOI18N
        jLabel5.setText("jLabel5");
        bgPage1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelCheckIn.add(bgPage1);
        bgPage1.setBounds(0, 0, 820, 600);

        cardLayout.add(panelCheckIn, "cardCheckIn");

        jPanel1.add(cardLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrderActionPerformed

    private void navItemOrderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_navItemOrderActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_navItemOrderActionPerformed

    private void navItemOrderMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_navItemOrderMouseClicked
        cards.show(cardLayout, "cardStaff");
        selectBtn(navItemOrder);
        unselectBtn(navItemMenu);
        unselectBtn(navItemCheckIn);
    }// GEN-LAST:event_navItemOrderMouseClicked

    private void navItemMenuMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_navItemMenuMouseClicked
        cards.show(cardLayout, "cardMenu");
        selectBtn(navItemMenu);
        unselectBtn(navItemOrder);
        unselectBtn(navItemCheckIn);
    }// GEN-LAST:event_navItemMenuMouseClicked

    private void navItemMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_navItemMenuActionPerformed
    }// GEN-LAST:event_navItemMenuActionPerformed

    private void navItemCheckInMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_navItemCheckInMouseClicked
        cards.show(cardLayout, "cardCheckIn");
        selectBtn(navItemCheckIn);
        unselectBtn(navItemOrder);
        unselectBtn(navItemMenu);

    }// GEN-LAST:event_navItemCheckInMouseClicked

    private void navItemCheckInActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_navItemCheckInActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_navItemCheckInActionPerformed

    private void checkInOutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkinButtonActionPerformed
        if (checkInOutButton.getText().equals("Check in")) {
            checkInOutButton.setText("Check out");
            checkInOutButton.setBackground(new java.awt.Color(255, 0, 51));
        }
    }// GEN-LAST:event_checkinButtonActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrder;
    private com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage bgMenuPage;
    private com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage bgOrderPage;
    private com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage bgPage1;
    private javax.swing.JPanel bgScrollPanelMenu;
    private javax.swing.JPanel bgScrollPanelOrder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cardLayout;
    private javax.swing.JButton checkInOutButton;
    private javax.swing.JPanel contentMenuPage;
    private javax.swing.JPanel contentOrderPage;
    private javax.swing.JPanel headerMenuPage;
    private javax.swing.JPanel headerOrderPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton navItemCheckIn;
    private javax.swing.JButton navItemMenu;
    private javax.swing.JButton navItemOrder;
    private javax.swing.JPanel panelCheckIn;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelOrder;
    private javax.swing.JLabel revenuLabel;
    private javax.swing.JScrollPane scrollPanelMenu;
    private javax.swing.JScrollPane scrollPanelStaff;
    // End of variables declaration//GEN-END:variables

}

