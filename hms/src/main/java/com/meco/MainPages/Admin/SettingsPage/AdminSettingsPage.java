/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.meco.MainPages.Admin.SettingsPage;

import com.meco.MainPages.Admin.CustomerInfoPage.AdminCustomerInfoPage;
import com.meco.MainPages.Admin.HomePage.AdminHomePage;
import com.meco.MainPages.Admin.RoomsPage.AdminRoomsPage;

/**
 *
 * @author ashishkumar
 */
public class AdminSettingsPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    public AdminSettingsPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logOutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        adminHomeBtn = new javax.swing.JMenu();
        adminCustomerInfoPage = new javax.swing.JMenu();
        adminRoomsBtn = new javax.swing.JMenu();
        adminStaffBtn = new javax.swing.JMenu();
        adminSettingsBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logOutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logOutBtn.setText("Log Out");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("AppleGothic", 1, 36)); // NOI18N
        jLabel1.setText("Developer Information");

        jLabel2.setFont(new java.awt.Font("AppleGothic", 0, 24)); // NOI18N
        jLabel2.setText("Ashish Kumar");

        jLabel3.setFont(new java.awt.Font("AppleGothic", 0, 24)); // NOI18N
        jLabel3.setText("Anurag Sharma");

        jLabel4.setFont(new java.awt.Font("AppleGothic", 0, 24)); // NOI18N
        jLabel4.setText("Ashutosh Tewari");

        jLabel5.setFont(new java.awt.Font("AppleGothic", 0, 24)); // NOI18N
        jLabel5.setText("Abhay Singh");

        adminHomeBtn.setText("Home");
        adminHomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminHomeBtnMouseClicked(evt);
            }
        });
        menuBar.add(adminHomeBtn);

        adminCustomerInfoPage.setText("Customer Info");
        adminCustomerInfoPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminCustomerInfoPageMouseClicked(evt);
            }
        });
        menuBar.add(adminCustomerInfoPage);

        adminRoomsBtn.setText("Rooms");
        adminRoomsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminRoomsBtnMouseClicked(evt);
            }
        });
        menuBar.add(adminRoomsBtn);

        adminStaffBtn.setText("Staff");
        adminStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminStaffBtnMouseClicked(evt);
            }
        });
        menuBar.add(adminStaffBtn);

        adminSettingsBtn.setText("Settings");
        adminSettingsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSettingsBtnMouseClicked(evt);
            }
        });
        menuBar.add(adminSettingsBtn);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(213, 213, 213))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminHomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminHomeBtnMouseClicked
        AdminHomePage admin_home_page = new AdminHomePage();
        admin_home_page.setVisible(true);
        admin_home_page.pack();
        admin_home_page.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_adminHomeBtnMouseClicked

    private void adminCustomerInfoPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminCustomerInfoPageMouseClicked
        AdminCustomerInfoPage admin_customer_info_page = new AdminCustomerInfoPage();
        admin_customer_info_page.setVisible(true);
        admin_customer_info_page.pack();
        admin_customer_info_page.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_adminCustomerInfoPageMouseClicked

    private void adminRoomsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminRoomsBtnMouseClicked
        AdminRoomsPage admin_rooms_page = new AdminRoomsPage();
        admin_rooms_page.setVisible(true);
        admin_rooms_page.pack();
        admin_rooms_page.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_adminRoomsBtnMouseClicked

    private void adminStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminStaffBtnMouseClicked
        AdminRoomsPage admin_rooms_page = new AdminRoomsPage();
        admin_rooms_page.setVisible(true);
        admin_rooms_page.pack();
        admin_rooms_page.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_adminStaffBtnMouseClicked

    private void adminSettingsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSettingsBtnMouseClicked
        AdminSettingsPage admin_settings_page = new AdminSettingsPage();
        admin_settings_page.setVisible(true);
        admin_settings_page.pack();
        admin_settings_page.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_adminSettingsBtnMouseClicked

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSettingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSettingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSettingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSettingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSettingsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminCustomerInfoPage;
    private javax.swing.JMenu adminHomeBtn;
    private javax.swing.JMenu adminRoomsBtn;
    private javax.swing.JMenu adminSettingsBtn;
    private javax.swing.JMenu adminStaffBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
