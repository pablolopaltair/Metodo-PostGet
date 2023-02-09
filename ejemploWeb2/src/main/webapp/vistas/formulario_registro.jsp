<%@ include file="/vistas/cabecera.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
</head>
<body>

<!-- BLOQUE LISTA EMPLEADOS -->
<div class="listEmpleados">
	<div class="encabezado">
		<h2>FORMULARIO REGISTRO</h2>
	</div>
	<div class="contenido">
	<div>
		<form:form action="registrado" method="post" modelAttribute="usuarioVista">
            <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre"/><br><br>
             
            <form:label path="email">Correo: </form:label>
            <form:input path="email"/><br><br>
                 
            <form:button class="boton">Enviar</form:button>
            </div>
     </div>
        </form:form>
</div>

</body>

<!-- Link Activo NavBar -->
<style>
#form {
  background-color: #2d80cc;
  color: white;
}
</style>
</html>