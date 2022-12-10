/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static String hello(java.lang.String name) {
        tam.NewWebService_Service service = new tam.NewWebService_Service();
        tam.NewWebService port = service.getNewWebServicePort();
        return port.hello(name);
    }

    private static int cong(int a, int b) {
        tam.NewWebService_Service service = new tam.NewWebService_Service();
        tam.NewWebService port = service.getNewWebServicePort();
        return port.cong(a, b);
    }
    
}
