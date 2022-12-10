/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class ChiNhanhbean implements Serializable{
    private String MaChiNhanh;
    private String TenChiNhanh;
    private String DiaChi;

    public ChiNhanhbean() {
    }

    public ChiNhanhbean(String MaChiNhanh, String TenChiNhanh, String DiaChi) {
        this.MaChiNhanh = MaChiNhanh;
        this.TenChiNhanh = TenChiNhanh;
        this.DiaChi = DiaChi;
    }

    public String getMaChiNhanh() {
        return MaChiNhanh;
    }

    public void setMaChiNhanh(String MaChiNhanh) {
        this.MaChiNhanh = MaChiNhanh;
    }

    public String getTenChiNhanh() {
        return TenChiNhanh;
    }

    public void setTenChiNhanh(String TenChiNhanh) {
        this.TenChiNhanh = TenChiNhanh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
}
