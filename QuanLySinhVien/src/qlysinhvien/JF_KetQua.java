/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import java.util.logging.Level;
import java.util.logging.Logger;
import qlysinhvien.MonHoc;
import qlysinhvien.KetQua;
import qlysinhvien.SinhVien;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlysinhvien.QLyKetQua;
import qlysinhvien.QLyMonHoc;
import qlysinhvien.QLySinhVien;

/**
 *
 * @author Administrator
 */
public class JF_KetQua extends javax.swing.JFrame {

    QLyKetQua listKQ = new QLyKetQua();
    QLyMonHoc listMH = new QLyMonHoc();

    /**
     * Creates new form JF_KetQua
     */
    public JF_KetQua() {
        initComponents();

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboMSV = new javax.swing.JComboBox<>();
        cboMaMonHoc = new javax.swing.JComboBox<>();
        btnGhiDiem = new javax.swing.JButton();
        btnSuaDiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_info = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnXoaDiem = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cboMaHocKy = new javax.swing.JComboBox<>();
        txtDiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("KẾT QUẢ");

        jLabel2.setText("Mã sinh viên");

        jLabel3.setText("Mã môn học");

        jLabel4.setText("Điểm");

        btnGhiDiem.setText("Ghi điểm");
        btnGhiDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiDiemActionPerformed(evt);
            }
        });

        btnSuaDiem.setText("Sửa điểm");
        btnSuaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDiemActionPerformed(evt);
            }
        });

        table_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Mã môn học", "Mã học kỳ", "Điểm", "Tình trạng"
            }
        ));
        table_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_infoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_info);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnXoaDiem.setText("Xóa Điểm");
        btnXoaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDiemActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm Theo Mã Sinh Viên");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnHienThi.setText("Hiển thị ");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã học kỳ");

        cboMaHocKy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThoat)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(367, 367, 367)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboMaMonHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboMSV, 0, 257, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(58, 58, 58))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(85, 85, 85)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboMaHocKy, 0, 257, Short.MAX_VALUE)
                                        .addComponent(txtDiem)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnGhiDiem)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSuaDiem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnXoaDiem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnHienThi))))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cboMaMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cboMaHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhiDiem)
                    .addComponent(btnSuaDiem)
                    .addComponent(btnXoaDiem)
                    .addComponent(btnTimKiem)
                    .addComponent(btnHienThi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThoat)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        listMH.hienThiList();
        QLySinhVien listSV = new QLySinhVien();
        QLyMonHoc listMH = new QLyMonHoc();
        listSV.hienThiList();
        listMH.hienThiList();
        for (SinhVien sv : listSV.list) {
            cboMSV.addItem(sv.getMaSV());
        }
        for (MonHoc mh : listMH.listMh) {
            cboMaMonHoc.addItem(mh.getTenMonHoc());
        }
        hienThi();
    }//GEN-LAST:event_formWindowOpened

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
        JF_Admin jfad = new JF_Admin();
        jfad.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDiemActionPerformed
        DefaultTableModel dtmodel = (DefaultTableModel) table_info.getModel();
        if (btnXoaDiem.getText() == "Xóa") {
            cboMaMonHoc.setEnabled(false);
            btnXoaDiem.setText("Hủy Chế Độ Xóa");
        } else {
            if (table_info.getSelectedRowCount() > 0) {
                KetQua kq;
                try {
                    int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ? ", "Hộp Thoại", JOptionPane.YES_NO_OPTION);
                    if (r == JOptionPane.YES_OPTION) {
                        kq = new KetQua();
                        kq.setMaSV(cboMSV.getSelectedItem().toString());
                        kq.setMaMonHoc(cboMaMonHoc.getSelectedItem().toString());
                        kq.setMaHocKy(Integer.parseInt(cboMaHocKy.getSelectedItem().toString()));
                        kq.setDiem(Float.parseFloat(txtDiem.getText()));
                        listKQ.xoaKetQua(kq);
                        hienThi();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(JF_QuanLyKhoa.class.getName()).log(Level.SEVERE, null, ex);
                }
                cboMaMonHoc.setEnabled(true);
                btnXoaDiem.setText("Xóa");
            } else {
                JOptionPane.showMessageDialog(this, "Hãy chọn một bảng !");
            }
        }
    }//GEN-LAST:event_btnXoaDiemActionPerformed

    private void btnGhiDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiDiemActionPerformed

        DefaultTableModel tbmodel = (DefaultTableModel) table_info.getModel();
        String tinhTrang = "";
        Boolean ketQua = true;
        KetQua kq = new KetQua();
        kq.setMaSV(cboMSV.getSelectedItem().toString());
        String maMH = listKQ.layMaMH(cboMaMonHoc.getSelectedItem().toString());
        kq.setMaMonHoc(maMH);
        kq.setMaHocKy(Integer.parseInt(cboMaHocKy.getSelectedItem().toString()));
        kq.setDiem(Float.parseFloat(txtDiem.getText()));
        if (Float.parseFloat(txtDiem.getText()) < 5 && Float.parseFloat(txtDiem.getText()) >= 4) {
            tinhTrang = "Can Cai Thien ";
        } else if (Float.parseFloat(txtDiem.getText()) >= 5 && Float.parseFloat(txtDiem.getText()) < 7) {
            tinhTrang = "Trung Binh";
        } else if (Float.parseFloat(txtDiem.getText()) >= 7 && Float.parseFloat(txtDiem.getText()) < 8) {
            tinhTrang = "Kha";
        } else if (Float.parseFloat(txtDiem.getText()) >= 8 && Float.parseFloat(txtDiem.getText()) <= 10) {
            tinhTrang = "Gioi";
        } else {
            tinhTrang = "Rot";
        }
        kq.setTinhTrang(tinhTrang);
        for (int i = 0; i < tbmodel.getRowCount(); i++) {
            if (tbmodel.getValueAt(i, 1).equals(maMH)) {
                ketQua = false;
                break;
            }
        }
        if (ketQua == false) {
            JOptionPane.showMessageDialog(this, "Trùng Mã Môn Học");
        } else {
            listKQ.themKetQua(kq);
            hienThi();
        }
    }//GEN-LAST:event_btnGhiDiemActionPerformed

    private void btnSuaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDiemActionPerformed
        DefaultTableModel dtmodel = (DefaultTableModel) table_info.getModel();
        String tinhTrang = "";
        if (btnSuaDiem.getText() == "Sửa") {

            cboMaMonHoc.setEnabled(false);
            btnSuaDiem.setText("Hủy Chế Độ Sửa");
        } else {
            if (table_info.getSelectedRowCount() > 0) 
            {
                String maMonHoc = listKQ.layMaMH(cboMaMonHoc.getSelectedItem().toString());
                if (Float.parseFloat(txtDiem.getText()) < 5 && Float.parseFloat(txtDiem.getText()) >= 4) 
                {
                    tinhTrang = "Can Cai Thien !!";
                } 
                else if (Float.parseFloat(txtDiem.getText()) >= 5 && Float.parseFloat(txtDiem.getText()) < 7) 
                {
                    tinhTrang = "Trung Binh";
                } 
                else if (Float.parseFloat(txtDiem.getText()) >= 7 && Float.parseFloat(txtDiem.getText()) < 8) 
                {
                    tinhTrang = "Kha";
                } 
                else if (Float.parseFloat(txtDiem.getText()) >= 8 && Float.parseFloat(txtDiem.getText()) <= 10) 
                {
                    tinhTrang = "Gioi";
                } else 
                {
                    tinhTrang = "Rot";
                }
                KetQua kq;
                try {
                    kq = new KetQua(cboMSV.getSelectedItem().toString(),
                            maMonHoc, Integer.parseInt(cboMaHocKy.getSelectedItem().toString()), Float.parseFloat(txtDiem.getText()), tinhTrang);
                    listKQ.suaKetQua(kq);
                    hienThi();
                } catch (Exception ex) {
                    Logger.getLogger(JF_QuanLyKhoa.class.getName()).log(Level.SEVERE, null, ex);
                }
                cboMaMonHoc.setEnabled(true);
                btnSuaDiem.setText("Sửa");
            } else {
                JOptionPane.showMessageDialog(this, "Hãy chọn một bảng !");
            }
        }
    }//GEN-LAST:event_btnSuaDiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        DefaultTableModel dtmodel = (DefaultTableModel) table_info.getModel();
        if (listKQ.timKiem(cboMSV.getSelectedItem().toString(), Integer.parseInt(cboMaHocKy.getSelectedItem().toString())) == false) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy !");
        } else {
            for (KetQua kq : listKQ.list) {
                String[] arr = new String[]{kq.getMaSV(), kq.getMaMonHoc(), String.valueOf(kq.getDiem())};
                dtmodel.addRow(arr);
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed
        hienThi();
    }//GEN-LAST:event_btnHienThiActionPerformed

    private void table_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_infoMouseClicked
        DefaultTableModel dtmodel = (DefaultTableModel) table_info.getModel();
        int row = table_info.getSelectedRow();
        cboMSV.setSelectedItem(table_info.getValueAt(row, 0).toString());
        String tenMonHoc = listKQ.layTenMonHoc(table_info.getValueAt(row, 1).toString());
        cboMaMonHoc.setSelectedItem(tenMonHoc);
        cboMaHocKy.setSelectedItem(table_info.getValueAt(row, 2).toString());
        txtDiem.setText(table_info.getValueAt(row, 3).toString());

    }//GEN-LAST:event_table_infoMouseClicked

    public void hienThi() {
        DefaultTableModel modelTable = (DefaultTableModel) table_info.getModel();
        modelTable.setRowCount(0);
        listKQ.hienThiList();
        try {
            String[] array = new String[]{};
            for (KetQua kq : listKQ.list) {
                array = new String[]{
                    kq.getMaSV(), kq.getMaMonHoc(), String.valueOf(kq.getMaHocKy()), String.valueOf(kq.getDiem()), kq.getTinhTrang()
                };
                modelTable.addRow(array);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "" + ex);
        }
    }

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
            java.util.logging.Logger.getLogger(JF_KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnGhiDiem;
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnSuaDiem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaDiem;
    private javax.swing.JComboBox<String> cboMSV;
    private javax.swing.JComboBox<String> cboMaHocKy;
    private javax.swing.JComboBox<String> cboMaMonHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_info;
    private javax.swing.JTextField txtDiem;
    // End of variables declaration//GEN-END:variables
}
