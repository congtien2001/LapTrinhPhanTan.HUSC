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
 * @author User
 */
public class Hangbean implements Serializable{
    private String MaHang;
    private String TenHang;
    private long Gia;
    private Date NgayNhap;
    private String MaChiNhanh;

    public Hangbean() {
    }

    public Hangbean(String MaHang, String TenHang, long Gia, Date NgayNhap, String MaChiNhanh) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
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
