/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import bean.chitiettaikhoan;
import bean.taikhoanbean;
import java.rmi.*;
import java.util.ArrayList;
/**
 *
 * @author quang
 */
public interface ITinhToan extends Remote{
    public int Cong(int a, int b) throws Exception;
    public int Tru(int a, int b) throws Exception;
    public int Nhan(int a, int b) throws Exception;
    public double Chia(int a, int b) throws Exception;
    public taikhoanbean ktdn (String sotaikhoan, String matkhau) throws Exception;
    
    public long XemSoDu(String sotaikhoan) throws Exception;
    public boolean RutTien (String sotaikhoan, long sotienrut, String ghichu) throws Exception;
    public void NapTien (String sotaikhoan, int sotiennap) throws Exception;
    public void DoiMaPIN (String sotaikhoan, String maPINmoi) throws Exception;
    public void NapTienCTTK (String sotaikhoannhan, int sotiennap) throws Exception;
    public ArrayList<chitiettaikhoan> XemLSGD(String sotaikhoan) throws Exception;
}
