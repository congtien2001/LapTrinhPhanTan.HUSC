/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.chitiettaikhoanbean;
import bean.taikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class chitiettaikhoandao {  
    
    public ArrayList<chitiettaikhoanbean> getchitiet(String SoTaiKhoan) throws Exception{
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            String sql = "select * from ChiTietTaiKhoan where SoTaiKhoan=? ";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, SoTaiKhoan);        
            ResultSet rs = cmd.executeQuery();
            
            
            ArrayList<chitiettaikhoanbean> ds= new ArrayList<chitiettaikhoanbean>();
            while(rs.next()) {
                long Id  = rs.getLong("Id");
                Date NgayRutTien = rs.getDate("NgayRutTien");
                String HoTen = rs.getString("HoTen");
                long SoTien = rs.getLong("SoTien");
                String soTaiKhoan = rs.getString("SoTaiKhoan");
                String ghichu = rs.getString("ghichu");
                ds.add(new chitiettaikhoanbean(0, NgayRutTien, 0, soTaiKhoan, ghichu));
                
                
            }
            
            rs.close();
            kn.cn.close();
            return ds ;
    }
}

