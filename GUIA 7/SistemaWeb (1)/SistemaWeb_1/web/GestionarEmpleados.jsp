<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Empleados</title>
    </head>
    <body>
        <h1>Gestión de Empleados</h1>
        <h2>Listado de Empleados</h2>

        <h1>Conexion: ${mensaje_conexion}</h1>

        <table border="1">
            <thead>
                <tr>
                    <th>ID_Empleado</th>
                    <th>DUI_Empleado</th>
                    <th>ISSS_Empleado</th>
                    <th>nombresEmpleado</th>
                    <th>ApellidosEmpleado</th>
                    <th>fechaNacEmpleado</th>
                    <th>Telefono</th>
                    <th>Correo</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaEmpleados}" var="item">
                    <tr>
                        <td><c:out value="${item.ID_Empleado}" /></td>
                        <td><c:out value="${item.DUI_Empleado}" /></td>
                        <td><c:out value="${item.ISS_Empleado}" /></td>                        
                        <td><c:out value="${item.nombresEmpleados}" /></td>
                        <td><c:out value="${item.ApellidosEmpleado}" /></td>
                        <td><c:out value="${item.fechaNacEmpleado}" /></td>
                        <td><c:out value="${item.Telefono}" /></td>
                        <td><c:out value="${item.Correo}" /></td>                        
                        
                    </tr>
                </c:forEach>
            </tbody>            
        </table>
    </body>
</html>