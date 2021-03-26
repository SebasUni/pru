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
        <script type="text/javascript" src="calc.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora segun el tutorial</h1>
        <form action="calcservlet" method="POST" >
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
        <h1>Calculadora interfaz</h1>
        <form name="calc">
                <input type="text" name="visor" /><BR />
              <input type="button" value="7" onclick="boton( value )" />
              <input type="button" value="8" onclick="boton( value )" />
              <input type="button" value="9" onclick="boton( value )" />
              <input type="button" value="-" onclick="resta()" /><BR />
              
              <input type="button" value="4" onclick="boton( value )" />
              <input type="button" value="5" onclick="boton( value )" />
              <input type="button" value="6" onclick="boton( value )" />
              <input type="button" value="+" onclick="suma()" /><BR />
              
              <input type="button" value="1" onclick="boton( value )" />
              <input type="button" value="2" onclick="boton( value )" />
              <input type="button" value="3" onclick="boton( value )" />
              <input type="button" value="*" onclick="multiplicacion()" /><BR />
              
              <input type="button" value="0" onclick="boton( value )" />
              <input type="button" value="=" onclick="calcular()" />
              <input type="button" value="c" onclick="borrar()" />
              <input type="button" value="/" onclick="division()" />
         </form>   
        
    </body>
    
</html>
