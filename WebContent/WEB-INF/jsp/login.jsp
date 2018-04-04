<div class="row">
	<div class="col-xs-12 col-md-6">
		<form class="form-horizontal text-left" action="${pageContext.request.contextPath}/login/Ingresar.html" method="post">
			<div class="form-group has-feedback">
				<label for="inputUserName" class="col-sm-3 control-label">Usuario</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="usuario" name="usuario" placeholder="Usuario"/>
					<i class="fa fa-user form-control-feedback"></i>
				</div>
			</div>
			<div class="form-group has-feedback">
				<label for="inputPassword" class="col-sm-3 control-label">Contraseña</label>
				<div class="col-sm-8">
					<input type="password" class="form-control" id="clave" name="clave" placeholder="Contraseña"/>
					<i class="fa fa-lock form-control-feedback"></i>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-3 col-sm-8">
					<button type="submit" class="btn btn-gray-transparent btn-animated">Ingresar <i class="fa fa-user"></i></button>
				</div>
			</div>
		</form>
	</div>
</div>	
	
<script>
	function recuperar(){
		jQuery("#ModalLogin").modal('hide');
		jQuery("#myModal").modal('show');
	}
</script>