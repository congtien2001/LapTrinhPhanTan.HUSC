/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author quang
 */
public class hangbean implements Serializable {
    public String MaHang;
    public String TenHang;
    public String SoLuong;
    public long Gia;
    public Date NgayNhap;
    public String MaChiNhanh;

    public hangbean() {
    }

    public hangbean(String MaHang, String TenHang, String SoLuong, long Gia, Date NgayNhap, String MaChiNhanh) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.NgayNhap = NgayNhap;
        this.MaChiNhanh = MaChiNhanh;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public long getGia() {
        return Gia;
    }

    public void setGia(long Gia) {
        this.Gia = Gia;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getMaChiNhanh() {
        return MaChiNhanh;
    }

    public void setMaChiNhanh(String MaChiNhanh) {
        this.MaChiNhanh = MaChiNhanh;
    }
    
    
    
}
