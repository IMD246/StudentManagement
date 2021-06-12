/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;
import qlysinhvien.KetQua;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Administrator
 */
public class QLyKetQua {
    ArrayList<KetQua>list= new ArrayList<KetQua>();
   public java.sql.PreparedStatement ps;
    public Connection con;
    public ResultSet rs;
    public void themKetQua(KetQua kq) 
    {
        try 
        {
            con = ConnectDB.getConnect();
            String sql = "INSERT INTO ketqua VALUES (?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,kq.getMaSV());
            ps.setString(2,kq.getMaMonHoc());
            ps.setInt(3,kq.getMaHocKy()); 
            ps.setFloat(4,kq.getDiem());
            ps.setString(5,kq.getTinhTrang());             
            ps.execute();           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Thêm Không Thành Công !!" + e);
        }
    }
    public void suaKetQua(KetQua kq) {
        try {
            con = ConnectDB.getConnect();
            String sql = "UPDATE ketqua set Diem = ?, tinhTrang = ? " 
                    +"WHERE MaSV = ? AND MaMonHoc = ?";
            ps = con.prepareStatement(sql);
            ps.setFloat(1, kq.getDiem());
            ps.setString(2, kq.getTinhTrang());
            ps.setString(3, kq.getMaSV());
            ps.setString(4,kq.getMaMonHoc());
            ps.execute();
              JOptionPane.showMessageDialog(null,"Đã sửa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa Không Thành Công !!" + e);
        }
    }

    public void xoaKetQua(KetQua kq) {
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "DELETE FROM ketqua WHERE MaSV = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,kq.getMaSV());
            ps.execute();             
        } catch (Exception e) 
        {
            System.out.println("Xóa Không Thành Công !!" + e);
        }
    }  
    public ArrayList<KetQua> hienThiList() {
        list.clear();
        Connection conn = ConnectDB.getConnect();
        Statement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM ketqua";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) 
            {             
                    KetQua kq = new KetQua();
                    kq.setMaSV(rs.getString("MaSV"));
                    kq.setMaMonHoc(rs.getString("MaMonHoc"));
                    kq.setMaHocKy(rs.getInt("MaHocKy"));
                    kq.setDiem(rs.getFloat("Diem"));
                    kq.setTinhTrang(rs.getString("TinhTrang"));
                    list.add(kq);              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<KetQua> hienThiKetQuaTheoMaSVVaTheoHocKi(String maSV , int maHocKy) {
        list.clear();
        Connection conn = ConnectDB.getConnect();   
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM ketqua WHERE MASV = ? AND MaHocKy = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,maSV);
            ps.setInt(2, maHocKy);
            rs = ps.executeQuery();
            while (rs.next()) 
            {             
                    KetQua kq = new KetQua();
                    kq.setMaSV(rs.getString("MaSV"));
                    kq.setMaMonHoc(rs.getString("MaMonHoc"));
                    kq.setMaHocKy(rs.getInt("MaHocKy"));
                    kq.setDiem(rs.getFloat("Diem"));
                    kq.setTinhTrang(rs.getString("TinhTrang"));
                    list.add(kq);              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public String layMaMH(String tenMH){
        String res = "";
        try{
                con = ConnectDB.getConnect();
                String query = "SELECT MaMonHoc FROM monhoc WHERE TenMonHoc = ? ";
                ps = con.prepareStatement(query);
                ps.setString(1, tenMH);
                ps.execute();
                rs = ps.executeQuery();
                if(rs.next())
                {
                    res = rs.getString("MaMonHoc");
                }
        }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,ex);
        }
        return res;
    }
     public String layTenMonHoc(String maMH){
        String res = "";
        try{
                con = ConnectDB.getConnect();
                String query = "SELECT TenMonHoc FROM monhoc WHERE MaMonHoc = ? ";
                ps = con.prepareStatement(query);
                ps.setString(1, maMH);
                ps.execute();
                rs = ps.executeQuery();
                if(rs.next())
                {
                    res = rs.getString("TenMonHoc");
                }
        }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,ex);
        }
        return res;
    }
    public boolean timKiem(String maSinhVien,int maHocKy){
        list.clear();
        Connection conn = ConnectDB.getConnect();      
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM ketqua WHERE MaSinhVien = ? AND MaHocKy = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,maSinhVien);
            ps.setInt(2,maHocKy);
            rs = ps.executeQuery();
            while (rs.next()) 
            {                                                 
                    KetQua kq = new KetQua();
                    kq.setMaSV(rs.getString("MaSV"));
                    kq.setMaMonHoc(rs.getString("MaMonHoc"));
                    kq.setMaHocKy(rs.getInt("MaHocKy")); 
                    kq.setDiem(rs.getFloat("Diem"));
                    kq.setTinhTrang(rs.getString("TinhTrang"));
                    list.add(kq);
                    return true;                   
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Không tìm thấy !"+e);
        }
        return false;
    } 
}
