/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cafe_management_app.ui.DashboardAdminUI;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author namho
 */
public class DashboardAdminUI extends javax.swing.JFrame {

    /**
     * Creates new form DashboardAdminUI
     */
    private CardLayout cards;
    
     
    private void selectBtn(JButton btn) {
        btn.setBackground(Color.WHITE);
        btn.setForeground(Color.getColor("#333333"));
    }
    
    private void unselectBtn(JButton btn) {
        btn.setForeground(Color.WHITE);
        btn.setBackground(Color.getColor("#333333"));
    }
    
    public DashboardAdminUI() {
        initComponents();
        cards = (CardLayout)(cardLayout.getLayout());
        selectBtn(navItemStaff);   
    }
    
    public JButton getAddStaffBtn() {
        return addStaff;
    }
    public JPanel getContainerListStaff() {
        return bgScrollPanelStaff;
    }
    
    public JPanel getListDishContainer() {
        return bgScrollPanelMenu;
    }
    
    public JPanel getListBillContainer() {
        return bgScrollPanelBill;
    }
    
    public JButton getAddDishBtn() {
        return addDishBtn;
    }
    
    public JPanel getBillContainer() {
        return bgScrollPanelBill;
    }
    
    public JButton getNavItemChart() {
        return navItemChart;
    }
        
    public JPanel getChartContainer() {
        return chartContainer;
    }
    
<<<<<<< Updated upstream
    public JTextField getSearchStaffField() {
        return searchStaffField;
    }
    
    public JTextField getSearchMenuField() {
        return searchMenuField;
    }
    
    public JButton getLogOutBtn() {
        return logOutBtn;
=======
    public JButton getSearchBtn() {
        return searchBtn;
    }
    
     public JButton getSearchMenuBtn() {
        return searchMenuBtn;
>>>>>>> Stashed changes
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        navItemStaff = new javax.swing.JButton();
        navItemMenu = new javax.swing.JButton();
        navItemBill = new javax.swing.JButton();
        navItemChart = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        cardLayout = new javax.swing.JPanel();
        panelStaff = new javax.swing.JPanel();
        bgStaffPage = new com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage();
        headerStaffPage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addStaff = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
<<<<<<< Updated upstream
        searchStaffField = new javax.swing.JTextField();
=======
        searchBtn = new javax.swing.JButton();
>>>>>>> Stashed changes
        contentStaffPage = new javax.swing.JPanel();
        scrollPanelStaff = new javax.swing.JScrollPane();
        bgScrollPanelStaff = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        bgMenuPage = new com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage();
        headerMenuPage = new javax.swing.JPanel();
        addDishBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
<<<<<<< Updated upstream
        searchMenuField = new javax.swing.JTextField();
=======
        searchMenuBtn = new javax.swing.JButton();
>>>>>>> Stashed changes
        contentMenuPage = new javax.swing.JPanel();
        scrollPanelMenu = new javax.swing.JScrollPane();
        bgScrollPanelMenu = new javax.swing.JPanel();
        panelBill = new javax.swing.JPanel();
        bgMenuPage1 = new com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage();
        headerBillPage = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        contentBillPage = new javax.swing.JPanel();
        scrollPanelBill = new javax.swing.JScrollPane();
        bgScrollPanelBill = new javax.swing.JPanel();
        panelChart = new javax.swing.JPanel();
        chartContainer = new com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage();

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
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

        navItemStaff.setBackground(new java.awt.Color(51, 51, 51));
        navItemStaff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        navItemStaff.setForeground(new java.awt.Color(255, 255, 255));
        navItemStaff.setText("Staff");
        navItemStaff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        navItemStaff.setBorderPainted(false);
        navItemStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navItemStaff.setFocusPainted(false);
        navItemStaff.setMaximumSize(new java.awt.Dimension(39, 35));
        navItemStaff.setMinimumSize(new java.awt.Dimension(39, 35));
        navItemStaff.setPreferredSize(new java.awt.Dimension(39, 35));
        navItemStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navItemStaffMouseClicked(evt);
            }
        });
        navItemStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navItemStaffActionPerformed(evt);
            }
        });
        jPanel2.add(navItemStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 190, -1));

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

        navItemBill.setBackground(new java.awt.Color(51, 51, 51));
        navItemBill.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        navItemBill.setForeground(new java.awt.Color(255, 255, 255));
        navItemBill.setText("Bill");
        navItemBill.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        navItemBill.setBorderPainted(false);
        navItemBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navItemBill.setFocusPainted(false);
        navItemBill.setPreferredSize(new java.awt.Dimension(49, 35));
        navItemBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navItemBillMouseClicked(evt);
            }
        });
        jPanel2.add(navItemBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 160, 190, -1));

        navItemChart.setBackground(new java.awt.Color(51, 51, 51));
        navItemChart.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        navItemChart.setForeground(new java.awt.Color(255, 255, 255));
        navItemChart.setText("Chart");
        navItemChart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        navItemChart.setBorderPainted(false);
        navItemChart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navItemChart.setFocusPainted(false);
        navItemChart.setPreferredSize(new java.awt.Dimension(49, 35));
        navItemChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navItemChartActionPerformed(evt);
            }
        });
        jPanel2.add(navItemChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 190, -1));

        logOutBtn.setBackground(new java.awt.Color(51, 51, 51));
        logOutBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logOutBtn.setText("Log Out");
        logOutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logOutBtn.setBorderPainted(false);
        logOutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutBtn.setFocusPainted(false);
        logOutBtn.setPreferredSize(new java.awt.Dimension(49, 35));
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        jPanel2.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 140, -1));

        jPanel1.add(jPanel2);

        cardLayout.setBackground(new java.awt.Color(255, 255, 255));
        cardLayout.setPreferredSize(new java.awt.Dimension(820, 600));
        cardLayout.setLayout(new java.awt.CardLayout());

        panelStaff.setBackground(new java.awt.Color(255, 255, 255));
        panelStaff.setLayout(null);

        bgStaffPage.setLayout(new javax.swing.BoxLayout(bgStaffPage, javax.swing.BoxLayout.Y_AXIS));

        headerStaffPage.setBackground(new java.awt.Color(255, 255, 255));
        headerStaffPage.setMaximumSize(new java.awt.Dimension(820, 32));
        headerStaffPage.setMinimumSize(new java.awt.Dimension(820, 32));
        headerStaffPage.setPreferredSize(new java.awt.Dimension(820, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Phone Number");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Date of Birth");

        addStaff.setBackground(new java.awt.Color(255, 255, 255));
        addStaff.setForeground(new java.awt.Color(51, 51, 51));
        addStaff.setText("new Staff +");
        addStaff.setActionCommand("addStaffBtn");
        addStaff.setBorder(null);
        addStaff.setBorderPainted(false);
        addStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStaff.setFocusPainted(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Salary");

        searchStaffField.setBackground(new java.awt.Color(255, 255, 255));
        searchStaffField.setForeground(new java.awt.Color(153, 153, 153));
        searchStaffField.setText("search staff name");
        searchStaffField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchStaffField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchStaffFieldMouseClicked(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn.setForeground(new java.awt.Color(51, 51, 51));
        searchBtn.setText("search");
        searchBtn.setToolTipText("");
        searchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerStaffPageLayout = new javax.swing.GroupLayout(headerStaffPage);
        headerStaffPage.setLayout(headerStaffPageLayout);
        headerStaffPageLayout.setHorizontalGroup(
            headerStaffPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerStaffPageLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< Updated upstream
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(searchStaffField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
>>>>>>> Stashed changes
                .addComponent(addStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        headerStaffPageLayout.setVerticalGroup(
            headerStaffPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerStaffPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerStaffPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerStaffPageLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
<<<<<<< Updated upstream
                        .addComponent(searchStaffField))
=======
                        .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> Stashed changes
                    .addGroup(headerStaffPageLayout.createSequentialGroup()
                        .addGroup(headerStaffPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(addStaff)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        bgStaffPage.add(headerStaffPage);

        contentStaffPage.setBackground(new java.awt.Color(255, 255, 255));
        contentStaffPage.setMaximumSize(new java.awt.Dimension(820, 568));
        contentStaffPage.setMinimumSize(new java.awt.Dimension(820, 568));
        contentStaffPage.setPreferredSize(new java.awt.Dimension(820, 568));

        scrollPanelStaff.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanelStaff.setForeground(new java.awt.Color(255, 255, 255));
        scrollPanelStaff.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        bgScrollPanelStaff.setBackground(new java.awt.Color(255, 255, 255));
        bgScrollPanelStaff.setLayout(new javax.swing.BoxLayout(bgScrollPanelStaff, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 818, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        bgScrollPanelStaff.add(jPanel3);

        scrollPanelStaff.setViewportView(bgScrollPanelStaff);

        javax.swing.GroupLayout contentStaffPageLayout = new javax.swing.GroupLayout(contentStaffPage);
        contentStaffPage.setLayout(contentStaffPageLayout);
        contentStaffPageLayout.setHorizontalGroup(
            contentStaffPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelStaff)
        );
        contentStaffPageLayout.setVerticalGroup(
            contentStaffPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelStaff, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        bgStaffPage.add(contentStaffPage);

        panelStaff.add(bgStaffPage);
        bgStaffPage.setBounds(0, 0, 820, 600);

        cardLayout.add(panelStaff, "cardStaff");

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setLayout(null);

        bgMenuPage.setLayout(new javax.swing.BoxLayout(bgMenuPage, javax.swing.BoxLayout.Y_AXIS));

        headerMenuPage.setMaximumSize(new java.awt.Dimension(820, 32));
        headerMenuPage.setMinimumSize(new java.awt.Dimension(820, 32));
        headerMenuPage.setOpaque(false);
        headerMenuPage.setPreferredSize(new java.awt.Dimension(820, 32));

        addDishBtn.setBackground(new java.awt.Color(255, 255, 255));
        addDishBtn.setForeground(new java.awt.Color(51, 51, 51));
        addDishBtn.setText("New dish +");
        addDishBtn.setToolTipText("");
        addDishBtn.setActionCommand("addInventoryBtn");
        addDishBtn.setBorder(null);
        addDishBtn.setBorderPainted(false);
        addDishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDishBtnActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Dish name");

<<<<<<< Updated upstream
        searchMenuField.setBackground(new java.awt.Color(255, 255, 255));
        searchMenuField.setForeground(new java.awt.Color(153, 153, 153));
        searchMenuField.setText("search dish name");
        searchMenuField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchMenuField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMenuFieldMouseClicked(evt);
            }
        });
=======
        searchMenuBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchMenuBtn.setForeground(new java.awt.Color(51, 51, 51));
        searchMenuBtn.setText("search");
        searchMenuBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
>>>>>>> Stashed changes

        javax.swing.GroupLayout headerMenuPageLayout = new javax.swing.GroupLayout(headerMenuPage);
        headerMenuPage.setLayout(headerMenuPageLayout);
        headerMenuPageLayout.setHorizontalGroup(
            headerMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerMenuPageLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< Updated upstream
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                .addComponent(searchMenuField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(addDishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 538, Short.MAX_VALUE)
                .addComponent(searchMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addDishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> Stashed changes
                .addGap(16, 16, 16))
        );
        headerMenuPageLayout.setVerticalGroup(
            headerMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerMenuPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDishBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< Updated upstream
                    .addComponent(searchMenuField, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
=======
                    .addComponent(searchMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
>>>>>>> Stashed changes
                .addContainerGap())
        );

        addDishBtn.getAccessibleContext().setAccessibleName("addInventoryBtn");

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
            .addComponent(scrollPanelMenu)
        );

        bgMenuPage.add(contentMenuPage);

        panelMenu.add(bgMenuPage);
        bgMenuPage.setBounds(0, 0, 820, 600);

        cardLayout.add(panelMenu, "cardMenu");

        panelBill.setBackground(new java.awt.Color(255, 255, 255));
        panelBill.setLayout(null);

        bgMenuPage1.setLayout(new javax.swing.BoxLayout(bgMenuPage1, javax.swing.BoxLayout.Y_AXIS));

        headerBillPage.setMaximumSize(new java.awt.Dimension(820, 32));
        headerBillPage.setMinimumSize(new java.awt.Dimension(820, 32));
        headerBillPage.setOpaque(false);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Received amount");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Time");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Return amount");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Total price");

        javax.swing.GroupLayout headerBillPageLayout = new javax.swing.GroupLayout(headerBillPage);
        headerBillPage.setLayout(headerBillPageLayout);
        headerBillPageLayout.setHorizontalGroup(
            headerBillPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerBillPageLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        headerBillPageLayout.setVerticalGroup(
            headerBillPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerBillPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerBillPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bgMenuPage1.add(headerBillPage);

        contentBillPage.setAutoscrolls(true);
        contentBillPage.setOpaque(false);

        scrollPanelBill.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanelBill.setForeground(new java.awt.Color(255, 255, 255));
        scrollPanelBill.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanelBill.setOpaque(false);

        bgScrollPanelBill.setBackground(new java.awt.Color(255, 255, 255));
        bgScrollPanelBill.setLayout(new javax.swing.BoxLayout(bgScrollPanelBill, javax.swing.BoxLayout.Y_AXIS));
        scrollPanelBill.setViewportView(bgScrollPanelBill);

        javax.swing.GroupLayout contentBillPageLayout = new javax.swing.GroupLayout(contentBillPage);
        contentBillPage.setLayout(contentBillPageLayout);
        contentBillPageLayout.setHorizontalGroup(
            contentBillPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelBill)
        );
        contentBillPageLayout.setVerticalGroup(
            contentBillPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        bgMenuPage1.add(contentBillPage);

        panelBill.add(bgMenuPage1);
        bgMenuPage1.setBounds(0, 0, 820, 600);

        cardLayout.add(panelBill, "cardBill");

        panelChart.setBackground(new java.awt.Color(255, 255, 255));
        panelChart.setLayout(null);

        chartContainer.setLayout(new javax.swing.BoxLayout(chartContainer, javax.swing.BoxLayout.PAGE_AXIS));
        panelChart.add(chartContainer);
        chartContainer.setBounds(0, 0, 0, 0);

        cardLayout.add(panelChart, "cardChart");

        jPanel1.add(cardLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void navItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navItemMenuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_navItemMenuActionPerformed

    private void navItemMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navItemMenuMouseClicked
        // TODO add your handling code here:
         cards.show(cardLayout, "cardMenu");
         selectBtn(navItemMenu);
         unselectBtn(navItemStaff);
         unselectBtn(navItemBill);
         unselectBtn(navItemChart);
    }//GEN-LAST:event_navItemMenuMouseClicked

    private void navItemStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navItemStaffMouseClicked
        // TODO add your handling code here:
        cards.show(cardLayout, "cardStaff");
        selectBtn(navItemStaff);
        unselectBtn(navItemMenu );
        unselectBtn(navItemBill);
        unselectBtn(navItemChart);
    }//GEN-LAST:event_navItemStaffMouseClicked

    private void addDishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDishBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDishBtnActionPerformed

    private void navItemBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navItemBillMouseClicked
        // TODO add your handling code here:
        cards.show(cardLayout, "cardBill");
        selectBtn(navItemBill);
        unselectBtn(navItemMenu );
        unselectBtn(navItemStaff);
        unselectBtn(navItemChart);
    }//GEN-LAST:event_navItemBillMouseClicked

    private void navItemChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navItemChartActionPerformed
        // TODO add your handling code here:
        cards.show(cardLayout, "cardChart");
        selectBtn(navItemChart);
        unselectBtn(navItemMenu );
        unselectBtn(navItemStaff);
        unselectBtn(navItemBill);
    }//GEN-LAST:event_navItemChartActionPerformed

<<<<<<< Updated upstream
    private void searchStaffFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchStaffFieldMouseClicked
        // TODO add your handling code here:
        searchStaffField.setText("");
        searchStaffField.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_searchStaffFieldMouseClicked

    private void searchMenuFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenuFieldMouseClicked
        // TODO add your handling code here:
        searchMenuField.setText("");
        searchMenuField.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_searchMenuFieldMouseClicked

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void navItemStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navItemStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navItemStaffActionPerformed
=======
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchBtnActionPerformed
>>>>>>> Stashed changes
    

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
            java.util.logging.Logger.getLogger(DashboardAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdminUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDishBtn;
    private javax.swing.JButton addStaff;
    private com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage bgMenuPage;
    private com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage bgMenuPage1;
    private javax.swing.JPanel bgScrollPanelBill;
    private javax.swing.JPanel bgScrollPanelMenu;
    private javax.swing.JPanel bgScrollPanelStaff;
    private com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage bgStaffPage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cardLayout;
    private com.mycompany.cafe_management_app.ui.DashboardAdminUI.BgPage chartContainer;
    private javax.swing.JPanel contentBillPage;
    private javax.swing.JPanel contentMenuPage;
    private javax.swing.JPanel contentStaffPage;
    private javax.swing.JPanel headerBillPage;
    private javax.swing.JPanel headerMenuPage;
    private javax.swing.JPanel headerStaffPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton navItemBill;
    private javax.swing.JButton navItemChart;
    private javax.swing.JButton navItemMenu;
    private javax.swing.JButton navItemStaff;
    private javax.swing.JPanel panelBill;
    private javax.swing.JPanel panelChart;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelStaff;
    private javax.swing.JScrollPane scrollPanelBill;
    private javax.swing.JScrollPane scrollPanelMenu;
    private javax.swing.JScrollPane scrollPanelStaff;
<<<<<<< Updated upstream
    private javax.swing.JTextField searchMenuField;
    private javax.swing.JTextField searchStaffField;
=======
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchMenuBtn;
>>>>>>> Stashed changes
    // End of variables declaration//GEN-END:variables

}
