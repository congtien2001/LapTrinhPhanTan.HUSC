/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author quang
 */
public class KetNoi {
    public Connection cn;
    
    public void KetNoi() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=OnTapLTPT;user=sa;password=123";
            cn = DriverManager.getConnection(url);
            System.out.println("Connected");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
