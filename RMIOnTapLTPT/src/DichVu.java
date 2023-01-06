
import bean.hangbean;
import dao.hangdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quang
 */
public class DichVu extends UnicastRemoteObject implements IDichVu {
    
    public DichVu() throws RemoteException {
    }
    
    
    @Override
    public ArrayList<hangbean> getDSHang() throws Exception {
        hangdao hdao = new hangdao();
        return hdao.getDSHang();
    }
    
    @Override
    public ArrayList<hangbean> getDSHangChiNhanh(String chiNhanh) {
        hangdao hdao = new hangdao();
        return hdao.getDSHangChiNhanh(chiNhanh);
    }
    
    @Override
    public void UpdateSoLuong(String maHang, String soLuong) {
        hangdao hdao = new hangdao();
        hdao.UpdateSoLuong(maHang, soLuong);
    }
    
}
