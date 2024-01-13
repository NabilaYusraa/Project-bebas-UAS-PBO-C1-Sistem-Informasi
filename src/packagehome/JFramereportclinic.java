/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagehome;



import javax.swing.table.DefaultTableModel;
import java.sql.*;
import packageLogin.JFrameLogin;
import packagehome.JFrameclinicdata;
import packagehome.JFramehome;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JFramereportclinic extends javax.swing.JFrame {
    
    public Statement st;
    public ResultSet rs;
    Connection cn = packageKoneksi.config.BukaKoneksi();

    
    /**
     * Creates new form JFramehome
     */
    public JFramereportclinic() {
        initComponents();
        
        Tampilreportjadwaldokter();
        Tampilreportaktivitasdokter();
        Tampilreportapoteker();
        Tampilreportobat();
        
        
        panelawal.setVisible(true);
        laporanjadwal.setVisible(false);
        laporanaktivitasdokter.setVisible(false);
        laporanapoteker.setVisible(false);
        laporanobat.setVisible(false);
    }
    

    
    
    private void Tampilreportjadwaldokter(){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM jadwal_dokter");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nomor");
            model.addColumn("Date");
            model.addColumn("Keterangan");
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] data = {
                  rs.getString("nomor"),
                  rs.getString("tanggal"),
                  rs.getString("keterangan"),
                };
                model.addRow(data);
                tbl_reportjadwal.setModel(model);
            }
        } catch (Exception e) {
        }
    }
    
     private void Tampilreportaktivitasdokter(){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM aktivitas_dokter");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nomor Regist Pasien");
            model.addColumn("Nama");
            model.addColumn("Tanggal");
            model.addColumn("Resep Obat");
            model.addColumn("Keterangan");
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] data = {
                  rs.getString("no_registp"),
                  rs.getString("nama"),
                  rs.getString("tanggal"),
                  rs.getString("resep_obat"),
                  rs.getString("keterangan"),
                };
                model.addRow(data);
                tbl_reportaktivitas.setModel(model);
            }
        } catch (Exception e) {
        }
    }
     
     
     private void Tampilreportapoteker(){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM apoteker");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Id Pegawai");
            model.addColumn("Nama");
            model.addColumn("Telepon");
            model.addColumn("Alamat");
            model.addColumn("Email");
            model.addColumn("Shift");
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] data = {
                  rs.getString("id"),
                  rs.getString("id_pegawai"),
                  rs.getString("nama"),
                  rs.getString("telepon"),
                  rs.getString("alamat"),
                  rs.getString("email"),
                  rs.getString("shift"),
                };
                model.addRow(data);
                tbl_reportapoteker.setModel(model);
            }
        } catch (Exception e) {
        }
    }
     
     
     private void Tampilreportobat(){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM data_obat");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nomor");
            model.addColumn("Id Obat");
            model.addColumn("Nama Obat");
            model.addColumn("Stok");
            model.addColumn("Harga");
            model.addColumn("Satuan");
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] data = {
                  rs.getString("nomor"),
                  rs.getString("id_obat"),
                  rs.getString("nama_obat"),
                  rs.getString("stok"),
                  rs.getString("harga"),
                  rs.getString("satuan"),
                };
                model.addRow(data);
                tbl_reportobat.setModel(model);
            }
        } catch (Exception e) {
        }
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
        SubmenuReport = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        laporanobat = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_reportobat = new javax.swing.JTable();
        laporanapoteker = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_reportapoteker = new javax.swing.JTable();
        laporanaktivitasdokter = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_reportaktivitas = new javax.swing.JTable();
        laporanjadwal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_reportjadwal = new javax.swing.JTable();
        panelawal = new javax.swing.JPanel();
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

        SubmenuReport.setBackground(new java.awt.Color(0, 102, 102));
        SubmenuReport.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        SubmenuReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Lucida Fax", 0, 13)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/jadwalDokter.png"))); // NOI18N
        label1.setText("Doctor's Schedule Report");
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });
        SubmenuReport.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        label2.setFont(new java.awt.Font("Lucida Fax", 0, 13)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/activitas.png"))); // NOI18N
        label2.setText("Doctor's Activity Report");
        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label2MouseClicked(evt);
            }
        });
        SubmenuReport.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        label3.setFont(new java.awt.Font("Lucida Fax", 0, 13)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/apoteker.png"))); // NOI18N
        label3.setText("Pharmacist Report");
        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label3MouseClicked(evt);
            }
        });
        SubmenuReport.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        label4.setFont(new java.awt.Font("Lucida Fax", 0, 13)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/obat.png"))); // NOI18N
        label4.setText("Drug Report");
        label4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label4MouseClicked(evt);
            }
        });
        SubmenuReport.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jPanel3.add(SubmenuReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 200, 140));

        laporanobat.setBackground(new java.awt.Color(124, 192, 192));
        laporanobat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Drug Report");
        laporanobat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        tbl_reportobat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nomor", "Id Obat", "Nama Obat", "Stok", "Harga", "Satuan"
            }
        ));
        tbl_reportobat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_reportobatMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_reportobat);

        laporanobat.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 820, 370));

        jPanel3.add(laporanobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 550));

        laporanapoteker.setBackground(new java.awt.Color(124, 192, 192));
        laporanapoteker.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Pharmacist's Report");
        laporanapoteker.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        tbl_reportapoteker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Id Pegawai", "Nama", "Telepon", "Alamat", "Email", "shift"
            }
        ));
        tbl_reportapoteker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_reportapotekerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_reportapoteker);

        laporanapoteker.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 1090, 170));

        jPanel3.add(laporanapoteker, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 550));

        laporanaktivitasdokter.setBackground(new java.awt.Color(124, 192, 192));
        laporanaktivitasdokter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Doctor's Activity Report");
        laporanaktivitasdokter.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 210, 40));

        tbl_reportaktivitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nomor Regist", "Nama", "Tanggal", "Resep Obat", "Keterangan"
            }
        ));
        tbl_reportaktivitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_reportaktivitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_reportaktivitas);

        laporanaktivitasdokter.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 1000, 190));

        jPanel3.add(laporanaktivitasdokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 550));

        laporanjadwal.setBackground(new java.awt.Color(124, 192, 192));
        laporanjadwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Doctor's Schedule Report");
        laporanjadwal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        tbl_reportjadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nomor", "Tanggal", "keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_reportjadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_reportjadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_reportjadwal);

        laporanjadwal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 1050, 220));

        jPanel3.add(laporanjadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 550));

        panelawal.setBackground(new java.awt.Color(124, 192, 192));
        panelawal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(panelawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 550));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1250, 550));

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
      JFramehome home = new JFramehome();
      home.show();
      
      this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
       JFrameuserclinic user = new JFrameuserclinic();
      user.show();
      
      this.dispose();
    }//GEN-LAST:event_btn_userActionPerformed

    private void btn_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataActionPerformed
      JFrameclinicdata data = new JFrameclinicdata();
      data.show();
      
      this.dispose();
    }//GEN-LAST:event_btn_dataActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
      JFrameLogin login = new JFrameLogin();
      login.show();
      
      this.dispose();
      JOptionPane.showMessageDialog(null, "Logout Success");
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataMouseClicked

    }//GEN-LAST:event_btn_dataMouseClicked

    private void btn_dataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataMouseReleased
        
    }//GEN-LAST:event_btn_dataMouseReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
     dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btn_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usActionPerformed
      JFrameAboutUs us = new JFrameAboutUs();
      us.show();
      
      this.dispose();
    }//GEN-LAST:event_btn_usActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        SubmenuReport.setVisible(!SubmenuReport.isVisible());
    }//GEN-LAST:event_btn_reportActionPerformed

    private void label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label2MouseClicked
        laporanaktivitasdokter.setVisible(true);
        laporanjadwal.setVisible(false);
        laporanapoteker.setVisible(false);
        laporanobat.setVisible(false);
        SubmenuReport.setVisible(!SubmenuReport.isVisible());
    }//GEN-LAST:event_label2MouseClicked

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
         laporanjadwal.setVisible(true);
         laporanaktivitasdokter.setVisible(false);
         laporanapoteker.setVisible(false);
         laporanobat.setVisible(false);
         SubmenuReport.setVisible(!SubmenuReport.isVisible());
    }//GEN-LAST:event_label1MouseClicked

    private void tbl_reportjadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_reportjadwalMouseClicked
      Tampilreportjadwaldokter();
    }//GEN-LAST:event_tbl_reportjadwalMouseClicked

    private void tbl_reportaktivitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_reportaktivitasMouseClicked
      Tampilreportaktivitasdokter();
    }//GEN-LAST:event_tbl_reportaktivitasMouseClicked

    private void tbl_reportapotekerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_reportapotekerMouseClicked
      Tampilreportapoteker();
    }//GEN-LAST:event_tbl_reportapotekerMouseClicked

    private void label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label3MouseClicked
         laporanapoteker.setVisible(true);
         laporanaktivitasdokter.setVisible(false);
         laporanaktivitasdokter.setVisible(false);
         laporanobat.setVisible(false);
         SubmenuReport.setVisible(!SubmenuReport.isVisible());
    }//GEN-LAST:event_label3MouseClicked

    private void tbl_reportobatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_reportobatMouseClicked
       Tampilreportobat();
    }//GEN-LAST:event_tbl_reportobatMouseClicked

    private void label4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label4MouseClicked
         laporanobat.setVisible(true);
         laporanapoteker.setVisible(false);
         laporanaktivitasdokter.setVisible(false);
         laporanaktivitasdokter.setVisible(false);
         SubmenuReport.setVisible(!SubmenuReport.isVisible());
    }//GEN-LAST:event_label4MouseClicked

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
            java.util.logging.Logger.getLogger(JFramereportclinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramereportclinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramereportclinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramereportclinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramereportclinic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SubmenuReport;
    private rojerusan.RSButtonIconD btn_data;
    private rojerusan.RSButtonIconD btn_home;
    private rojerusan.RSButtonIconD btn_logout;
    private rojerusan.RSButtonIconD btn_report;
    private rojerusan.RSButtonIconD btn_us;
    private rojerusan.RSButtonIconD btn_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JPanel laporanaktivitasdokter;
    private javax.swing.JPanel laporanapoteker;
    private javax.swing.JPanel laporanjadwal;
    private javax.swing.JPanel laporanobat;
    private javax.swing.JPanel panelawal;
    private javax.swing.JTable tbl_reportaktivitas;
    private javax.swing.JTable tbl_reportapoteker;
    private javax.swing.JTable tbl_reportjadwal;
    private javax.swing.JTable tbl_reportobat;
    // End of variables declaration//GEN-END:variables
}
