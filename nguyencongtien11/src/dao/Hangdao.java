/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Hangbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author quang
 */
public class Hangdao {
    // hàm lấy về tất cả các hàng
    public ArrayList<Hangbean> layHang () {
        try {
            // b1: Ket noi csdl
            KetNoidao kn = new KetNoidao();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select *from Hang";
            
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            ArrayList<Hangbean> ds = new ArrayList<Hangbean>();
            
            while(rs.next()) {
                String MaHang = rs.getString("MaHang");
                String TenHang = rs.getString("TenHang");
                String SoLuong = rs.getString("SoLuong");
                long Gia = rs.getLong("Gia");
                Date NgayNhap = rs.getDate("NgayNhap");
                String MaChiNhanh = rs.getString("MaChiNhanh");        
                ds.add(new Hangbean(MaHang, TenHang, Gia, NgayNhap, MaChiNhanh));
            }
            
            rs.close();
            kn.cn.close();
            return ds;
            
        } catch(Exception e) {
            e.printStackTrace(); return null;
        }
    }
    // hàm lấy hàng theo chi nhánh
    public ArrayList<Hangbean> layHang (String TenChiNhanh) {
        try {
            // b1: Ket noi csdl
            KetNoidao kn = new KetNoidao();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select Hang.* from ChiNhanh, Hang where ChiNhanh.MaChiNhanh = Hang.MaChiNhanh";// câu lệnh sql
            
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            ArrayList<Hangbean> ds = new ArrayList<Hangbean>();
            
            while(rs.next()) {
                String MaHang = rs.getString("MaHang");
                String TenHang = rs.getString("TenHang");
                String SoLuong = rs.getString("SoLuong");
                long Gia = rs.getLong("Gia");
                Date NgayNhap = rs.getDate("NgayNhap");
                String MaChiNhanh = rs.getString("MaChiNhanh");        
                ds.add(new Hangbean(MaHang, TenHang, Gia, NgayNhap, MaChiNhanh));
            }
            
            rs.close();
            kn.cn.close();
            return ds;
            
        } catch(Exception e) {
            e.printStackTrace(); return null;
        }
    }
    
}
