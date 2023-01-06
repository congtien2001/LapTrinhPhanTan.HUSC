/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.hangbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author quang
 */
public class hangdao {
    public ArrayList<hangbean> getDSHang() {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            String sql = "select * from Hang";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            ArrayList<hangbean> ds = new ArrayList<hangbean>();
            
            while(rs.next()) {
                String MaHang = rs.getString("MaHang");
                String TenHang = rs.getString("TenHang");
                String SoLuong = rs.getString("SoLuong");
                long Gia = rs.getLong("Gia");
                Date NgayNhap = rs.getDate("NgayNhap");
                String MaChiNhanh = rs.getString("MaChiNhanh");
                ds.add(new hangbean(MaHang, TenHang, SoLuong, Gia, NgayNhap, MaChiNhanh));
            }
            
            kn.cn.close();
            rs.close();
            
            return ds;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public ArrayList<hangbean> getDSHangChiNhanh(String chiNhanh) {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            String sql = "select * from vGetHang where TenChiNhanh=?";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, chiNhanh);
            ResultSet rs = cmd.executeQuery();
            ArrayList<hangbean> ds = new ArrayList<hangbean>();
            
            while(rs.next()) {
                String MaHang = rs.getString("MaHang");
                String TenHang = rs.getString("TenHang");
                String SoLuong = rs.getString("SoLuong");
                long Gia = rs.getLong("Gia");
                Date NgayNhap = rs.getDate("NgayNhap");
                String MaChiNhanh = rs.getString("MaChiNhanh");
                ds.add(new hangbean(MaHang, TenHang, SoLuong, Gia, NgayNhap, MaChiNhanh));
            }
            
            kn.cn.close();
            rs.close();
            
            return ds;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public void UpdateSoLuong(String maHang, String soLuong) {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            String sql = "update Hang set SoLuong=? where MaHang=?";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, soLuong);
            cmd.setString(2, maHang);
            cmd.executeUpdate();
            
            cmd.close();
            kn.cn.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
