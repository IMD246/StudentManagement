/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import java.awt.Dialog;
import javax.swing.JOptionPane;
import qlysinhvien.JF_KetQua;
import qlysinhvien.JF_QuanLyKhoa;
import qlysinhvien.JF_QuanLyMonHoc;
import qlysinhvien.JF_QuanLySinhvien;

/**
 *
 * @author Administrator
 */
public class JF_Admin extends javax.swing.JFrame {

    /**
     * Creates new form JF_Admin
     */
    public JF_Admin() {
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

        jLabel1 = new javax.swing.JLabel();
        btnQuanLyTKSV = new javax.swing.JButton();
        btnKhoa = new javax.swing.JButton();
        btnQuanLyMonHoc = new javax.swing.JButton();
        btnKetQua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnQuanLySV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý sinh viên");

        btnQuanLyTKSV.setBackground(java.awt.SystemColor.textHighlight);
        btnQuanLyTKSV.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyTKSV.setText("Quản Lý Tài Khoản Sinh Viên");
        btnQuanLyTKSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyTKSVActionPerformed(evt);
            }
        });

        btnKhoa.setBackground(java.awt.SystemColor.textHighlight);
        btnKhoa.setForeground(new java.awt.Color(255, 255, 255));
        btnKhoa.setText("Quản lý khoa");
        btnKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaActionPerformed(evt);
            }
        });

        btnQuanLyMonHoc.setBackground(java.awt.SystemColor.textHighlight);
        btnQuanLyMonHoc.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyMonHoc.setText("Quản lý môn học");
        btnQuanLyMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyMonHocActionPerformed(evt);
            }
        });

        btnKetQua.setBackground(java.awt.SystemColor.textHighlight);
        btnKetQua.setForeground(new java.awt.Color(255, 255, 255));
        btnKetQua.setText("Quản lý kết quả");
        btnKetQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetQuaActionPerformed(evt);
            }
        });

        btnThoat.setBackground(java.awt.SystemColor.textHighlight);
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnQuanLySV.setBackground(java.awt.SystemColor.textHighlight);
        btnQuanLySV.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLySV.setText("Quản Lý Thông Tin Sinh Viên");
        btnQuanLySV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLySVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQuanLyMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanLyTKSV, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKetQua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnThoat)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnQuanLySV, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuanLySV, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(btnQuanLyTKSV, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(btnKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int j = JOptionPane.showConfirmDialog(this, "Ban co chac chan thoat?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (j == JOptionPane.YES_OPTION) {
            JF_Login log = new JF_Login();
           // log.show();
            log.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaActionPerformed
        // TODO add your handling code here:
        JF_QuanLyKhoa jKhoa = new JF_QuanLyKhoa();
        jKhoa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKhoaActionPerformed

    private void btnQuanLyTKSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyTKSVActionPerformed

        JF_QuanLyTaiKhoanSinhVien jfql = new JF_QuanLyTaiKhoanSinhVien();
        this.dispose();
        jfql.setVisible(true);
    }//GEN-LAST:event_btnQuanLyTKSVActionPerformed

    private void btnQuanLyMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyMonHocActionPerformed
        JF_QuanLyMonHoc jfqlMH = new JF_QuanLyMonHoc();
         jfqlMH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuanLyMonHocActionPerformed

    private void btnKetQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetQuaActionPerformed
        JF_KetQua jfkq = new JF_KetQua();
        jfkq.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnKetQuaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void btnQuanLySVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLySVActionPerformed
        JF_QuanLySinhvien jfqlsv = new JF_QuanLySinhvien();
        this.dispose();
        jfqlsv.setVisible(true);
    }//GEN-LAST:event_btnQuanLySVActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKetQua;
    private javax.swing.JButton btnKhoa;
    private javax.swing.JButton btnQuanLyMonHoc;
    private javax.swing.JButton btnQuanLySV;
    private javax.swing.JButton btnQuanLyTKSV;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
