<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8" />
	<title>Inicial</title>
	<c:import url="/WEB-INF/jsp/plantilla/estilos_genericos.jsp" />
	<style type="text/css">
		
.stepwizard-step p {
    margin-top: 10px;    
}

.process-row {
    display: table-row;
}

.process {
    display: table;     
    position: relative;
    text-align: center;
    margin: 0px auto;
}

.process-step button[disabled] {
    opacity: 1 !important;
    filter: alpha(opacity=100) !important;
}

.process-step {    
    display: table-cell;
    text-align: center;
    position: relative;
}

.process-step p {
    margin-top:10px;
    
}

.btn-circle {
  width: 140px;
  height: 140px;
  text-align: center;
  padding: 6px 0;
  font-size: 12px;
  line-height: 1.428571429;
  border-radius: 50%;
  background-color: white;
}

.btn-circle > i{
	color: #BDBDBD;
}

.btn-cicle-time{
	width: 100px !important;
	height: 100px !important;
}

.stepSpacing{
	width: 150px;
    border: 1px solid white;
    display: block;
    height: 0px;
    position: relative;
    float: left;
}

.stepTitle{
    text-transform: uppercase;
    margin: 10px 0px;
    font-weight: 600;
    font-size: 19px;
    line-height: 30px;
    color: white;
}

.stepText {
    clear: both;
    color: white;
}

.title-content{
    font-size: 45px;
    line-height: 52px;
    padding-bottom: 80px;
    padding-top: 60px;
    color: white;
}

.descriptionText{
	display: inline-block;
    text-transform: uppercase;
    top: calc(50% + 10px);
    white-space: nowrap;
    color: white;
    font-weight: 100;
    font-size: 45px;
    line-height: 52px;
}

.timeText{
	padding-top: 80px;
}
.timeIcon{
	display: inline-block;
}
	</style>
</head>
<body>
	<section class="page-wrapper" style="text-aling:center;">
		<c:import url="/WEB-INF/jsp/plantilla/menu.jsp"></c:import>
		<c:import url="/WEB-INF/jsp/plantilla/encabezado.jsp"></c:import>
		
			<c:import url="/WEB-INF/jsp/login.jsp" />
			
		<c:import url="/WEB-INF/jsp/plantilla/pie_pagina.jsp"></c:import>
	</section>
	<c:import url="/WEB-INF/jsp/plantilla/javascript_genericos.jsp"></c:import>
</body>
</html>