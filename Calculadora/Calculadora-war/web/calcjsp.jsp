<%-- 
    Document   : calcjsp
    Created on : 25/03/2021, 05:40:46 PM
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
        <form action="calcservlet" method="POST">
            <input type="text" name="t1">
               <select name="operacion" id="oper">
          <option value="+">+</option>
          <option value="-">-</option>
          <option value="*">*</option>
          <option value="/">/</option>
          <option value="%">%</option>
          <option value="^">^</option>
        </select>
            <input type="text" name="t2">
            <input type="submit" value="add">
     
        </form> 
          
    </body>
    
</html>
