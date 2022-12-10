/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import bean.chitiettaikhoan;
import bean.taikhoanbean;
import dao.ATMdao;
import dao.dangnhapdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
/**
 *
 * @author quang
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{

    public TinhToan() throws RemoteException {
    }

   
    @Override
    public int Cong(int a, int b) throws Exception {
        int s= a+b;
        System.out.println("Tong: " + s);
        return s;
    }

    @Override
    public int Tru(int a, int b) throws Exception {
        int s= a-b;
        System.out.println("Hieu: " + s);
        return s;
    }
    
    @Override
    public int Nhan(int a, int b) throws Exception {
        int s= a*b;
        System.out.println("Tich: " + s);
        return s;
    }
    
    @Override
    public double Chia(int a, int b) throws Exception {
        double s= a/b;
        System.out.println("Thuong: " + s);
        return s;
    }

    dangnhapdao dn = new dangnhapdao();
    @Override
    public taikhoanbean ktdn(String sotaikhoan, String matkhau) throws Exception {
        return dn.ktdn(sotaikhoan, matkhau);
    }
    
    ATMdao atm = new ATMdao();
    @Override
    public long XemSoDu(String sotaikhoan) throws Exception{
        return atm.XemSoDu(sotaikhoan);
    }
    
    
    @Override
    public boolean RutTien (String sotaikhoan, long sotienrut, String ghichu) throws Exception{
        return atm.RutTien(sotaikhoan, sotienrut, ghichu);
    }
    
    @Override
    public void NapTien (String sotaikhoan, int sotiennap) {
        atm.NapTien(sotaikhoan, sotiennap);
    }
    
    @Override
    public void DoiMaPIN (String sotaikhoan, String maPINmoi) {
        atm.DoiMaPIN(sotaikhoan, maPINmoi);
    }
    
    @Override
    public void NapTienCTTK (String sotaikhoannhan, int sotiennap) {
        atm.NapTienCTTK(sotaikhoannhan, sotiennap);
    }
    
    @Override
    public ArrayList<chitiettaikhoan> XemLSGD(String sotaikhoan) {
        return atm.XemLSGD(sotaikhoan);
    }
    
}
