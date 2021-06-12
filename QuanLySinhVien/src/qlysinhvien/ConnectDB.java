/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author tduy2
 */
public class ConnectDB 
{
    private static Connection con;
    public static Connection getConnect()
    {
        try 
        {                 
            con = DriverManager.getConnection("jdbc:mysql://localhost/quanlysinhvien","root","");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Kết nối thất bại !!"+e);
        }
        return con;
    }
}
