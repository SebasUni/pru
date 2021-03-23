<%-- 
    Document   : response
    Created on : 15/03/2021, 05:38:45 PM
    Author     : Tatan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <jsp:useBean id="mybean" scope="session" class="co.edu.unipiloto.NameHander" />
        <jsp:setProperty name="mybean" property="name" />
        <jsp:setProperty name="mybean" property="fechanacimiento" />
        <h1>hello, <jsp:getProperty name="mybean" property="name" />!</h1>
        <h1>la edad es  <jsp:getProperty name="mybean" property="edad" />!</h1>
        
    </body>
</html>
