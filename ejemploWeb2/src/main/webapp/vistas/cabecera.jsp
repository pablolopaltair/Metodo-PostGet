<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<div class="topnav">
  <a id="index" class="active" href="/ejemploWeb">Index</a> 
  <a id="list" href="/ejemploWeb/lista">Lista</a>
  <a id="form" href="/ejemploWeb/formulario">Formulario</a>
  <a id="menu" href="/ejemploWeb/gestion-portatiles">Gestion Portatiles</a>
</div>


<!--  CSS -->
<style>
 body{
 background-color: #404040;
 font-family: arial;

 padding: 10px;}

 
 .listEmpleados {
  width: 70%;
  background-color:#697682;
  border-radius: 25px;
  margin: auto;
  font-family: arial;
  color: white;
  margin-bottom: 25px;
  box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;}

  
  .encabezado{
  background-color:#2d80cc;
  padding: 2px;
  border-radius: 25px 25px 0px 0px;
  text-align: center;}
  
  .contenido {
  padding: 20px;
  text-align: center;
  }
  
  
  
  .introTexto{
  padding: 5px;
  border-radius: 5px;
  box-shadow: none;
  box-sizing: border-box;	
  border: none;
  text-decoration: none;
  width: 30%;
  }
  
    .introTexto: focus{
  padding: 5px;
  border-radius: 5px;
  box-shadow: none;
  box-sizing: border-box;	
  border: none;
  text-decoration: none;
  width: 30%;
  border: none;
  }
  
  .boton{
  border-radius: 10px;
  background-color: #2d80cc; 
  border: none;
  padding: 10px; 
  color: white;
  }
  .boton:hover{
  border-radius: 10px;
  background-color: #419ef2; 
  border: none;
  padding: 10px; 
  color: white;
  }
  
  p {
  color:white;}
  
  
  
  /*NAVBAR ESITLO*/
  /* Add a black background color to the top navigation */
.topnav {
  background-color: #697682;
  overflow: hidden;
  border-radius: 15px;
  margin-bottom: 30px;
  box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;
  
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #7b8996;
  color: white;
}

/* Add a color to the active/current link */
.topnav a:active {
  background-color: #2d80cc;
  color: white;
}
</style>