/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagedokter;



import packagehome.*;
import java.sql.*;
import packageLogin.JFrameLogin;
import javax.swing.JOptionPane;


public class JFramehomeDokter extends javax.swing.JFrame {
    
    public Statement st;
    public ResultSet rs;
    Connection cn = packageKoneksi.config.BukaKoneksi();

    /**
     * Creates new form JFramehome
     */
    public JFramehomeDokter() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        panel_lokasi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel_telepon = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_email = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panel_jam = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_home = new rojerusan.RSButtonIconD();
        btn_data = new rojerusan.RSButtonIconD();
        btn_report = new rojerusan.RSButtonIconD();
        btn_user = new rojerusan.RSButtonIconD();
        btn_us = new rojerusan.RSButtonIconD();
        btn_logout = new rojerusan.RSButtonIconD();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clinic.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("STKaiti", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome to Healthy-Connect");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 490, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 180));

        jPanel3.setBackground(new java.awt.Color(124, 192, 192));
        jPanel3.setForeground(new java.awt.Color(124, 192, 192));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_lokasi.setBackground(new java.awt.Color(204, 204, 204));
        panel_lokasi.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        panel_lokasi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconlocation.png"))); // NOI18N
        panel_lokasi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setText("Visit Our Location");
        panel_lokasi.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Jl. Sederhana Pasar 7 Medan");
        panel_lokasi.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        home.add(panel_lokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 240, 60));

        panel_telepon.setBackground(new java.awt.Color(204, 204, 204));
        panel_telepon.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        panel_telepon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/call.png"))); // NOI18N
        panel_telepon.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel11.setText("Give Us A call");
        panel_telepon.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("+62 81262419151");
        panel_telepon.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        home.add(panel_telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 240, 60));

        panel_email.setBackground(new java.awt.Color(204, 204, 204));
        panel_email.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        panel_email.setPreferredSize(new java.awt.Dimension(100, 100));
        panel_email.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/email.png"))); // NOI18N
        panel_email.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel13.setText("Send Us A Message");
        panel_email.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("healthyconnect04@gmail.com");
        panel_email.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        home.add(panel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 240, 60));

        panel_jam.setBackground(new java.awt.Color(204, 204, 204));
        panel_jam.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        panel_jam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/jam.png"))); // NOI18N
        panel_jam.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel15.setText("Opening Hours");
        panel_jam.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("Mon - Sun (24 Hours)");
        panel_jam.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        home.add(panel_jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, 240, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img_home.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -20, -1, 810));

        jPanel3.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 560));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1250, 560));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(165, 165, 165));
        btn_home.setForeground(new java.awt.Color(0, 0, 0));
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/homee.png"))); // NOI18N
        btn_home.setText("Home ");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 51));

        btn_data.setBackground(new java.awt.Color(165, 165, 165));
        btn_data.setForeground(new java.awt.Color(0, 0, 0));
        btn_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/data.png"))); // NOI18N
        btn_data.setText("Clinic Data");
        btn_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dataMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_dataMouseReleased(evt);
            }
        });
        btn_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dataActionPerformed(evt);
            }
        });
        jPanel2.add(btn_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 50));

        btn_report.setBackground(new java.awt.Color(165, 165, 165));
        btn_report.setForeground(new java.awt.Color(0, 0, 0));
        btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        btn_report.setText("Report Clinic");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });
        jPanel2.add(btn_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, 50));

        btn_user.setBackground(new java.awt.Color(165, 165, 165));
        btn_user.setForeground(new java.awt.Color(0, 0, 0));
        btn_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/i_user.png"))); // NOI18N
        btn_user.setText("User Clinic");
        btn_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_userMouseClicked(evt);
            }
        });
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });
        jPanel2.add(btn_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, 50));

        btn_us.setBackground(new java.awt.Color(165, 165, 165));
        btn_us.setForeground(new java.awt.Color(0, 0, 0));
        btn_us.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/us.png"))); // NOI18N
        btn_us.setText("About US");
        btn_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usActionPerformed(evt);
            }
        });
        jPanel2.add(btn_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, 50));

        btn_logout.setBackground(new java.awt.Color(165, 165, 165));
        btn_logout.setForeground(new java.awt.Color(0, 0, 0));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel2.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 200, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1250, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
      JFramehomeDokter homedokter = new JFramehomeDokter();
      homedokter.show();
      
      this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
      JFrameuserclinicdokter userdokter = new JFrameuserclinicdokter();
      userdokter.show();
      
      this.dispose();
    }//GEN-LAST:event_btn_userActionPerformed

    private void btn_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataActionPerformed
        JFrameclinicdataDokter datadokter = new JFrameclinicdataDokter();
        datadokter.show();
        
        this.dispose();
    }//GEN-LAST:event_btn_dataActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
      JFrameLogin login = new JFrameLogin();
      login.show();
      
      this.dispose();
      JOptionPane.showMessageDialog(null, "Logout Success");
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataMouseClicked
//        SubmenuData.setVisible(!SubmenuData.isVisible());
    }//GEN-LAST:event_btn_dataMouseClicked

    private void btn_dataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataMouseReleased
        
    }//GEN-LAST:event_btn_dataMouseReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
     dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btn_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usActionPerformed
      JFrameAboutUsDokter usdokter = new JFrameAboutUsDokter();
      usdokter.show();
      
      this.dispose();
    }//GEN-LAST:event_btn_usActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
      JFramereportclinicdokter reportdokter = new JFramereportclinicdokter();
      reportdokter.show();
      
      this.dispose();
    }//GEN-LAST:event_btn_reportActionPerformed

    private void btn_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_userMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_userMouseClicked

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
            java.util.logging.Logger.getLogger(JFramehomeDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramehomeDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramehomeDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramehomeDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramehomeDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconD btn_data;
    private rojerusan.RSButtonIconD btn_home;
    private rojerusan.RSButtonIconD btn_logout;
    private rojerusan.RSButtonIconD btn_report;
    private rojerusan.RSButtonIconD btn_us;
    private rojerusan.RSButtonIconD btn_user;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel panel_email;
    private javax.swing.JPanel panel_jam;
    private javax.swing.JPanel panel_lokasi;
    private javax.swing.JPanel panel_telepon;
    // End of variables declaration//GEN-END:variables
}
