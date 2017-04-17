<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="page-title">Verificar</h1>
<div class="separator-2"></div>

<form action="#" method="post" id="continuar">
	<input type="hidden" id="secuencia" name="secuencia" value="${secuencia}"/>
	
	<div class="col-xs-6">
		<label>Seleccione alg�n cliente</label>
		<input type="text" class="form-control" id="cliente" id="cliente"/>
		<input type="hidden" id="persona" name="persona"/>
	</div>
	
	<div class="col-xs-12 text-right">
		<button type="button" class="btn btn-primary" onclick="Finalizar();">Siguiente</button>
	</div>
	
</form>
				
<script type="text/javascript" src="${pageContext.request.contextPath}/JavaScript/pedido/PedidoWizardStep3.js"></script>
