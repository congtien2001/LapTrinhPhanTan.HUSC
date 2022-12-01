<%-- 
    Document   : newjsp
    Created on : Nov 30, 2022, 4:00:09 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	tam.DichVu_Service service = new tam.DichVu_Service();
	tam.DichVu port = service.getDichVuPort();
	 // TODO initialize WS operation arguments here
	long a = 0L;
	long b = 0L;
	// TODO process result here
	long result = port.nhan(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	tam.DichVu_Service service = new tam.DichVu_Service();
	tam.DichVu port = service.getDichVuPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "ha ha";
	// TODO process result here
	java.lang.String result = port.hello(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
