<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h2><%=request.getAttribute("VariableInicio") %></h2>
        <form action="/appwebj2ee/ServletRespuesta" method="post">
        	<label for="txtNumeroUno">Numero 1</label>
	        <input type="text" id="txtNombre" name="txtNumeroUno">
	        <input type="submit" value="Enviar datos">
	        <label for="txtNumeroDos">Numero 2</label>
	        <input type="text" id="txtNombre" name="txtNumeroDos">
	        <input type="submit" value="Enviar datos">
        </form>
    </body>
</html>
