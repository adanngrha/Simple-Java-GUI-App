/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/*
@author Adan Nugraha 202031242
*/

import javax.swing.JOptionPane;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Adan Nugraha 202031242
 */
public class Form_Siswa extends javax.swing.JFrame {
    private DefaultTableModel tabmode;
    private ResultSet hasil;
    // membuat objek baru dari class CRUD yang sudah terkoneksi dengan database 
    CRUD aa = new CRUD();
    
    public Form_Siswa() throws SQLException {
        // mengecek sudah login atau belum
        // jika belum login akan di redirect ke form login
        if ("AKTIF".equals(Session.getStatusLogin())) {
            initComponents();
            tampil_database();
        } else {
            // menutup form tanpa keluar dari aplikasi
            dispose();
            // memanggil form login
            LoginForm form = new LoginForm();
            form.setVisible(true);
        }
    }
    
     public void tampil_database(){
        Object [] baris = {"ID","Nama","Alamat"}; 
        tabmode = new DefaultTableModel(null, baris);
        tabel_siswa.setModel(tabmode); 
            try {
                hasil = aa.tampilData(); 
                while (hasil.next()){aa.setID(hasil.getString("id")); 
                aa.setNama(hasil.getString("nama")); 
                aa.setAlamat(hasil.getString("alamat"));
                String[] data = {aa.getID(), aa.getNama(), aa.getAlamat()}; 
                tabmode.addRow(data);}} 
            catch (Exception e) {}}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_siswa = new javax.swing.JTable();

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

        jLabel1.setText("ID");

        jLabel2.setText("NAMA");

        jLabel3.setText("ALAMAT");

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_ubah.setText("UBAH");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        tabel_siswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_siswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_siswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_simpan)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ubah)
                        .addGap(26, 26, 26)
                        .addComponent(btn_hapus)
                        .addGap(18, 18, 18)
                        .addComponent(btn_keluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id)
                            .addComponent(txt_nama)
                            .addComponent(txt_alamat, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_reset)
                    .addComponent(btn_ubah)
                    .addComponent(btn_hapus)
                    .addComponent(btn_keluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void reset_text() {
        txt_id.setText(""); 
        txt_nama.setText(""); 
        txt_alamat.setText("");}
    
    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset_text();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
       if (txt_id.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !"); 
            txt_id.requestFocus();
        } else if (txt_nama.getText().trim().equals("")){ 
            JOptionPane.showMessageDialog(null,"Maaf, Nama belum diisi !"); 
            txt_nama.requestFocus();
        } else if (txt_alamat.getText().trim().equals("")){ 
            JOptionPane.showMessageDialog(null,"Maaf, Alamat belum diisi !"); 
            txt_alamat.requestFocus();
        } else {
            try { aa.setID(txt_id.getText()); 
                aa.setNama(txt_nama.getText()); 
                aa.setAlamat(txt_alamat.getText()); 
                aa.simpanData(aa.getID(), aa.getNama(), aa.getAlamat());
                
                JOptionPane.showMessageDialog(null,  "Data  berhasil  tersimpan"   ,  "Informasi", 
                  JOptionPane.INFORMATION_MESSAGE);
                tampil_database(); 
                reset_text();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,   "Data   gagal   tersimpan"   ,   "Informasi", 
                JOptionPane.INFORMATION_MESSAGE);                   
        }
        }                               
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        if (txt_id.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !"); 
            txt_id.requestFocus();
        } else if (txt_nama.getText().trim().equals("")){ 
            JOptionPane.showMessageDialog(null,"Maaf, Nama belum diisi !"); 
            txt_nama.requestFocus();
        } else if (txt_alamat.getText().trim().equals("")){ 
            JOptionPane.showMessageDialog(null,"Maaf, Alamat belum diisi !"); 
            txt_alamat.requestFocus();
        } else {
            try { aa.setID(txt_id.getText()); 
                aa.setNama(txt_nama.getText()); 
                aa.setAlamat(txt_alamat.getText()); 
                aa.ubahData(aa.getID(), aa.getNama(), aa.getAlamat());
                
            JOptionPane.showMessageDialog(null,  "Data  berhasil  diubah"  ,  "Informasi", 
            JOptionPane.INFORMATION_MESSAGE);  
                tampil_database();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,   "Data   gagal   diubah"   ,   "Informasi", 
                JOptionPane.INFORMATION_MESSAGE);        
            }
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        if (txt_id.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !"); 
            txt_id.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda  yakin  akan  menghapus  data ini ?","Warning",2) == JOptionPane.YES_OPTION){
                   String id = "";
                   try { aa.setID(txt_id.getText()); 
                        aa.hapusData(aa.getID());
                        JOptionPane.showMessageDialog(null, "Data berhasil dihapus" , "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        tampil_database(); 
                        reset_text();
                    } 
                   catch (Exception e) {
                      JOptionPane.showMessageDialog(null,   "Data   gagal   dihapus"   ,   "Informasi", JOptionPane.INFORMATION_MESSAGE);                          
                   }           
        }
    }                            
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
      dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void tabel_siswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_siswaMouseClicked
        try { int row = tabel_siswa.rowAtPoint(evt.getPoint());
            String id = tabel_siswa.getValueAt(row, 0).toString(); 
            String nama = tabel_siswa.getValueAt(row, 1).toString(); 
            String alamat = tabel_siswa.getValueAt(row, 2).toString();
            txt_id.setText(String.valueOf(id)); 
            txt_nama.setText(String.valueOf(nama)); 
            txt_alamat.setText(String.valueOf(alamat));
            } 
        catch (Exception e) {}
    }//GEN-LAST:event_tabel_siswaMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Form_Siswa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Form_Siswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabel_siswa;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
