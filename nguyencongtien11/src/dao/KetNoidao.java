/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*; 
/**
 *
 * @author User
 */
public class KetNoidao 
{
    public Connection cn;
    public void KetNoi()
    {
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=nguyencongtien11;user=sa;password=123";
        cn=DriverManager.getConnection(url);
        System.out.println("Connected");
            }catch (Exception e){
        e.printStackTrace();
        }
    }   
    public static void main(String[] args) {
        KetNoidao kn=new KetNoidao();
        kn.KetNoi();
    }
}