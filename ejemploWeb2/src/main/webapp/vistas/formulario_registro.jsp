<%@ include file="/vistas/cabecera.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- BLOQUE LISTA EMPLEADOS -->
<div class="listEmpleados">
	<div class="encabezado">
		<h2>FORMULARIO REGISTRO</h2>
	</div>
	<div class="contenido">
		<form:form action="registrado" method="post" modelAttribute="usuario">
            <form:label path="nombre">Nombre completo:</form:label>
            <form:input path="nombre"/><br/>
             
            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/><br/>
                 
            <form:button>Enviar</form:button>
        </form:form>
	</div>
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