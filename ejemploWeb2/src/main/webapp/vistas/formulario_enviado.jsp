<%@ include file="/vistas/cabecera.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="listEmpleados">
	<div class="encabezado">
        <h2>RESULTADOS FORMULARIO</h2>
    </div>
    <div class="contenido">
        <span>Nombre: </span><span>${usuarioVista.nombre}</span><br/>
        <span>E-mail: </span><span>${usuarioVista.email}</span><br/>
    </div>

</div>

</body>
</html>