<%-- 
    Document   : MostrarJSP
    Created on : 05/12/2022, 18:12:21
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de clientes</h1>
        <%
        List<Cliente> listaClientes = (List) request.getSession().getAttribute("ListaClientes");
        int cont=1;
        for (Cliente cli : listaClientes){%>
        <p><b>Cliente N<%=cont%></b></p>
        <p>Dni: <%=cli.getDni()%></p>
        <p>Nombre: <%=cli.getNombre()%></p>
        <p>Apellido: <%=cli.getApellido()%></p>
        <p>Telefono: <%=cli.getTelefono()%></p>
        
        <% cont= cont+1;%>
        
     %>}%>       
    </body>
</html>
