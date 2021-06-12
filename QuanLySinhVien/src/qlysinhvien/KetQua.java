/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

/**
 *
 * @author Administrator
 */
public class KetQua {
        private String maSV;
        private String maMonHoc;
        private int maHocKy;
        private float diem;
        private String tinhTrang;

    public KetQua() {
    }

    public KetQua(String maSV, String maMonHoc, int maHocKy, float diem, String tinhTrang) {
        this.maSV = maSV;
        this.maMonHoc = maMonHoc;
        this.maHocKy = maHocKy;
        this.diem = diem;
        this.tinhTrang = tinhTrang;
    }        
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public int getMaHocKy() {
        return maHocKy;
    }

    public void setMaHocKy(int maHocKy) {
        this.maHocKy = maHocKy;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    
}
