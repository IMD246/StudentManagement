/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

/**
 *
 * @author tduy2
 */
public class TaiKhoan 
{
    private String tenDangNhap;
    private String MatKhau;
    private String tenHienThi;   
    private String Quyen;
    public TaiKhoan(String tenDangNhap, String MatKhau, String tenHienThi,String Quyen) 
    {
        this.tenDangNhap = tenDangNhap;
        this.MatKhau = MatKhau;
        this.tenHienThi = tenHienThi; 
        this.Quyen = Quyen;
    }  

    public TaiKhoan() 
    {
        
    }
    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }  
    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTenHienThi() {
        return tenHienThi;
    }

    public void setTenHienThi(String tenHienThi) {
        this.tenHienThi = tenHienThi;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }   
}
