
import bean.hangbean;
import java.rmi.Remote;
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
public interface IDichVu extends Remote{
    public ArrayList<hangbean> getDSHang() throws Exception;
    public ArrayList<hangbean> getDSHangChiNhanh(String chiNhanh) throws Exception;
    public void UpdateSoLuong(String maHang, String soLuong) throws Exception;
}
