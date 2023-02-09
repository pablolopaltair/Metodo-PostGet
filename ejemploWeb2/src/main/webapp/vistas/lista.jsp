<%@ include file="/vistas/cabecera.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Lista</title>
</head>
<body>

<!-- BLOQUE LISTA EMPLEADOS -->
<div class="listEmpleados">
	<div class="encabezado">
		<h2>LISTADO DE EMPLEADOS</h2>
	</div>
	<div class="contenido">
		<c:forEach items="${miModelo.listado}" var="item">
			${item}<hr>
		</c:forEach>
	</div>
</div>

</body>

<!-- Link Activo NavBar -->
<style>
#list {
  background-color: #2d80cc;
  color: white;
}
</style>
</html>