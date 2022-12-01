/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package tam;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author User
 */
@Path("dichvuport")
public class DichVuPort {

    private tam_client.DichVu port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DichVuPort
     */
    public DichVuPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method hello
     * @param name resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("hello/")
    public String getHello(@QueryParam("name") String name) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.hello(name);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method Nhan
     * @param a resource URI parameter
     * @param b resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("nhan/")
    public String getNhan(@QueryParam("a")
            @DefaultValue("0") long a, @QueryParam("b")
            @DefaultValue("0") long b) {
        try {
            // Call Web Service Operation
            if (port != null) {
                long result = port.nhan(a, b);
                return new java.lang.Long(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private tam_client.DichVu getPort() {
        try {
            // Call Web Service Operation
            tam_client.DichVu_Service service = new tam_client.DichVu_Service();
            tam_client.DichVu p = service.getDichVuPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
