
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quang
 */
public class Server {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            DichVu dv = new DichVu();
            Naming.bind("rmi://localhost:1099/DichVu", dv);
            System.out.print("Da cho may khach goi den:");
        }catch(Exception tt) {
            tt.printStackTrace();
        }
    }
}
