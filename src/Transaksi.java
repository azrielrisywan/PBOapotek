/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Transaksi extends javax.swing.JFrame {
   
    DefaultTableModel model;
    /**
     * Creates new form Transaksi
     */    
    public Transaksi() {
        initComponents();
        String[] judul = {"ID", "Nama Obat"};
        model = new DefaultTableModel(judul, 0);
        listObatTersedia.setModel(model);
        tampilkanDataObat();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tambahbtn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        hapus_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        namaObat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idObatDetailTransaksi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namaObatDetailTransaksi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jumlahObatDetailTransaksi = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelDetailTransaksi = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        listObatTersedia = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        menuBar = new javax.swing.JMenuBar();
        dashboard = new javax.swing.JMenu();
        tambahObat = new javax.swing.JMenu();
        tambahKaryawan = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("APOTEK MAJU TERUS");

        tambahbtn.setText("Tambah");
        tambahbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahbtnActionPerformed(evt);
            }
        });

        edit_btn.setText("Edit");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        hapus_btn.setText("Hapus");
        hapus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_btnActionPerformed(evt);
            }
        });

        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel7.setText("Detail Transaksi");

        namaObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaObatActionPerformed(evt);
            }
        });
        namaObat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaObatKeyReleased(evt);
            }
        });

        jLabel1.setText("Cari");

        idObatDetailTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idObatDetailTransaksiActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Obat Tersedia");

        jLabel3.setText("id");

        jLabel4.setText("nama");

        jLabel5.setText("jumlah");

        jumlahObatDetailTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahObatDetailTransaksiActionPerformed(evt);
            }
        });

        tabelDetailTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabelDetailTransaksi);

        listObatTersedia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listObatTersedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listObatTersediaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listObatTersedia);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        menuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dashboard.setText("Dashboard");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });
        menuBar.add(dashboard);

        tambahObat.setText("Obat");
        tambahObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahObatMouseClicked(evt);
            }
        });
        menuBar.add(tambahObat);

        tambahKaryawan.setText("Karyawan");
        tambahKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahKaryawanMouseClicked(evt);
            }
        });
        menuBar.add(tambahKaryawan);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaObat, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(124, 124, 124)
                        .addComponent(tambahbtn)
                        .addGap(18, 18, 18)
                        .addComponent(edit_btn)
                        .addGap(18, 18, 18)
                        .addComponent(hapus_btn)
                        .addGap(18, 18, 18)
                        .addComponent(reset_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idObatDetailTransaksi)
                                    .addComponent(namaObatDetailTransaksi)
                                    .addComponent(jumlahObatDetailTransaksi)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(namaObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idObatDetailTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(namaObatDetailTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jumlahObatDetailTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tambahbtn)
                                    .addComponent(edit_btn)
                                    .addComponent(hapus_btn)
                                    .addComponent(reset_btn))))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahbtnActionPerformed
        //
    }//GEN-LAST:event_tambahbtnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        //
    }//GEN-LAST:event_edit_btnActionPerformed

    private void hapus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_btnActionPerformed
       // 
    }//GEN-LAST:event_hapus_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_reset_btnActionPerformed

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        Dashboard d = new Dashboard();
        d.setVisible(true);
        d.setDefaultCloseOperation(Dashboard.DISPOSE_ON_CLOSE);
        d.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_dashboardMouseClicked

    private void tambahObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahObatMouseClicked
        // TODO add your handling code here:
        Obat o = new Obat();
        o.setVisible(true);
        o.setDefaultCloseOperation(Obat.DISPOSE_ON_CLOSE);
        o.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_tambahObatMouseClicked

    private void tambahKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahKaryawanMouseClicked
        // TODO add your handling code here:
        Karyawan k = new Karyawan();
        k.setVisible(true);
        k.setDefaultCloseOperation(Karyawan.DISPOSE_ON_CLOSE);
        k.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_tambahKaryawanMouseClicked

    private void namaObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaObatActionPerformed

    private void jumlahObatDetailTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahObatDetailTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahObatDetailTransaksiActionPerformed

    private void namaObatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaObatKeyReleased
        // TODO add your handling code here:
        DefaultTableModel filteredModel = (DefaultTableModel)listObatTersedia.getModel();
        String search = namaObat.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(filteredModel);
        listObatTersedia.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_namaObatKeyReleased

    private void listObatTersediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listObatTersediaMouseClicked
        // TODO add your handling code here:
        int i = listObatTersedia.getSelectedRow();
        
        if(i>-1){
            idObatDetailTransaksi.setText(listObatTersedia.getValueAt(i, 0).toString());
            namaObatDetailTransaksi.setText(listObatTersedia.getValueAt(i, 1).toString());
        }
    }//GEN-LAST:event_listObatTersediaMouseClicked

    private void idObatDetailTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idObatDetailTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idObatDetailTransaksiActionPerformed
    private void reset(){
        //
    }
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
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Transaksi t = new Transaksi();
                t.setVisible(true);
                t.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu dashboard;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton hapus_btn;
    private javax.swing.JTextField idObatDetailTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlahObatDetailTransaksi;
    private javax.swing.JTable listObatTersedia;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField namaObat;
    private javax.swing.JTextField namaObatDetailTransaksi;
    private javax.swing.JButton reset_btn;
    private javax.swing.JTable tabelDetailTransaksi;
    private javax.swing.JMenu tambahKaryawan;
    private javax.swing.JMenu tambahObat;
    private javax.swing.JButton tambahbtn;
    // End of variables declaration//GEN-END:variables

    private void tampilkanDataObat() {
        int row = listObatTersedia.getRowCount();
        for (int a = 0; a<row; a++){
            model.removeRow(0);
        }
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotek", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT id, nama_obat FROM obat");
            while(rs.next()){
                String data []= {rs.getString(1), rs.getString(2)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Obat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
