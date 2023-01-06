/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.hangbean;
import dao.hangdao;
import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class hangbo {
    hangdao hdao = new hangdao();
    
    public ArrayList<hangbean> getDSHang() {
        return hdao.getDSHang();
    }
    
    public ArrayList<hangbean> getDSHangChiNhanh(String chiNhanh) {
        return hdao.getDSHangChiNhanh(chiNhanh);
    }
    
}
