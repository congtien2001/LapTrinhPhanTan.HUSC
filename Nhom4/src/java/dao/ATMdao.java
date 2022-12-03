/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.chitiettaikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author quang
 */
public class ATMdao {
    
    public long XemSoDu(String sotaikhoan) {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            String sql = "select SoTien from TaiKhoan where SoTaiKhoan=?";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, sotaikhoan);
            ResultSet rs = cmd.executeQuery();
            
            long SoDu = 0;
            if(rs.next()) {
                SoDu = rs.getInt("SoTien");
            }
            
            kn.cn.close();
            
            return SoDu;
            
        } catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    
    public boolean RutTien (String sotaikhoan, long sotienrut, String ghichu) {
        if(ghichu.equals("")) ghichu=null;
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            if(XemSoDu(sotaikhoan)>sotienrut) {
                // Thêm dữ liệu vào bảng TaiKhoan
                String sql = "update TaiKhoan set SoTien=? where SoTaiKhoan=?";
                PreparedStatement cmd = kn.cn.prepareStatement(sql);
                cmd.setLong(1, (XemSoDu(sotaikhoan)-sotienrut));
                cmd.setString(2, sotaikhoan);
                cmd.executeUpdate();
                
                // Thêm dữ liệu vào bảng ChiTietTaiKhoan
                sql = "insert into ChiTietTaiKhoan values(?,?,?,?)";
                cmd = kn.cn.prepareStatement(sql);
                java.sql.Date ngaysql = new java.sql.Date(new Date().getTime());
                cmd.setDate(1, ngaysql);
                cmd.setLong(2, sotienrut);
                cmd.setString(3, sotaikhoan);
                cmd.setString(4, ghichu);
                cmd.executeUpdate();
                
                kn.cn.close();
                return true;
            }
            else {
                return false;
            }
            
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void NapTienCTTK (String sotaikhoannhan, int sotiennap) {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            
            String sql = "insert into ChiTietTaiKhoan values(?,?,?,?)";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            java.sql.Date ngaysql = new java.sql.Date(new Date().getTime());
            cmd.setDate(1, ngaysql);
            cmd.setLong(2, sotiennap);
            cmd.setString(3, sotaikhoannhan);
            cmd.setString(4, "danhantien");
            cmd.executeUpdate();
            
            kn.cn.close();

            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void NapTien (String sotaikhoan, int sotiennap) {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            
            String sql = "update TaiKhoan set SoTien=? where SoTaiKhoan=?";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setLong(1, (XemSoDu(sotaikhoan)+sotiennap));
            cmd.setString(2, sotaikhoan);
            cmd.executeUpdate();
            kn.cn.close();

            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void DoiMaPIN (String sotaikhoan, String maPINmoi) {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            String sql = "update TaiKhoan set MatKhau=? where SoTaiKhoan=?";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, maPINmoi);
            cmd.setString(2, sotaikhoan);

            cmd.executeUpdate();
            kn.cn.close();

            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<chitiettaikhoanbean> XemLSGD(String sotaikhoan) {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            String sql = "select * from ChiTietTaiKhoan where SoTaiKhoan=?";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, sotaikhoan);
            ResultSet rs = cmd.executeQuery();
            
            ArrayList<chitiettaikhoanbean> ls = new ArrayList<>();
            
            while(rs.next()) {
                int Id = rs.getInt("Id");
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Date NgayRutTien = (Date) rs.getDate("NgayRutTien");
                int SoTienRutRa = rs.getInt("SoTienRutRa");
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String Ghichu = rs.getString("Ghichu");
                ls.add(new chitiettaikhoanbean(Id, NgayRutTien, SoTienRutRa, SoTaiKhoan, Ghichu));
            }
            
            kn.cn.close();
            
            return ls;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
}
