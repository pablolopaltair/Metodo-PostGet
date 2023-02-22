<%@ include file="/vistas/cabecera.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Baja de Alumno</title>
</head>
<body>

   <div>
		<form:form action="registrado" method="post" modelAttribute="usuarioVista">
            <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre"/><br><br>
             
            <form:label path="email">Teléfono: </form:label>
            <form:input path="email"/><br><br>
                 
            <form:button class="boton">Enviar</form:button>
         </form:form>
    </div>

</body>
</html>