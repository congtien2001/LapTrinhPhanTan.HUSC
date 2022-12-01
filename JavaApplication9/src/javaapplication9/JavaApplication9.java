/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author User
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(hello("Hung"));
        System.out.println(nhan(3, 4));
    }

    private static String hello(java.lang.String name) {
        tam.DichVu_Service service = new tam.DichVu_Service();
        tam.DichVu port = service.getDichVuPort();
        return port.hello(name);
    }

    private static long nhan(long a, long b) {
        tam.DichVu_Service service = new tam.DichVu_Service();
        tam.DichVu port = service.getDichVuPort();
        return port.nhan(a, b);
    }
    
}
