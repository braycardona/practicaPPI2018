<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
	input[type="file"]{
		display: block;
	}
	.invisibleUpload{
		display: block;
		visibility: hidden;
		width: 0;
		height: 0;
	}

</style>
			
<h2>Productos 
	<a data-toggle="modal" href="#ModalFormulario" onclick="Limpiar();"><i class="fa fa-plus-circle"></i></a>
</h2>
<div class="separator-2"></div>

<a class="btn btn-gray collapsed btn-animated" data-toggle="collapse" href="#collapseContent" 
	aria-expanded="false" aria-controls="collapseContent">Filtros<i class="fa fa-plus"></i></a>
<div class="collapse" id="collapseContent">
	<div class="row">
		<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
			<label>Producto</label>
			<input type="text" class="form-control" id="prodF" name="prodF" value="${prod}"/>
			<input type="hidden" id="prodV" name="filtro" value="${prod}"/>
		</div>
		<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
			<label>Tipo de Producto</label>
			<select class="form-control" id="clasificarF" name="filtro">
				<option value="0">Seleccione</option>
				<c:forEach items="${listaTipo}" var="tipo">
					<option value="${tipo.id_tipo_producto}">${tipo.nombre}</option>	
				</c:forEach>
			</select>
		</div>
		<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
			<label>Venta</label>
			<input type="number" class="form-control" id="ventaF" name="filtro"/>
			<label>Mayor valor</label> <input type="checkbox" id="mayorF" name="filtro"/>
		</div>
		<div class="col-xs-12 col-md-12 col-lg-12"><br/>
			<button class="btn btn-button" onclick="Tabla(1);">Filtrar</button>
		</div>	
		
	</div>
</div>

<div class=" col-xs-12 col-md-12 col-lg-12">
	<div id="tabla"></div>
	<div id="paginacion" class="col-md-12"></div>
</div>

<div class="modal fade modal-dialog-center " id="ModalFormulario" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog  modal-lg">
		<div class="modal-content-wrap">
			<form method="post" action="${pageContext.request.contextPath}/Producto/Admin/Guardar.html?"
				 id="Formulario" data-modal="ModalFormulario" data-tabla="Tabla">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="fa fa-times-circle"></i></button>
						<h4 class="modal-title">Producto</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<input type="hidden" id="id_producto" name="id_producto"/>
							
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
								<section class="panel">
			                          <header class="panel-heading tab-bg-dark-navy-blue">
			                              <ul class="nav nav-tabs">
			                                  <li class="active">
			                                      <a data-toggle="tab" href="#producto">Producto</a>
			                                  </li>
			                                  <li class="">
			                                      <a data-toggle="tab" href="#ingview" id="carga">Ingredientes</a>
			                                  </li>
			                                  <li class="">
			                                      <a data-toggle="tab" href="#Catalog">Cat�logo</a>
			                                  </li>
			                              </ul>
			                          </header>
			                          <div class="panel-body">
			                              <div class="tab-content">
			                                  <div id="producto" class="tab-pane active">
												<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
													<label>* Tipo Producto</label>
													<select class="form-control" id="tipoP" name="tipoP">
														<option value="">Seleccione</option>
														<c:forEach items="${listaTipo}" var="tipo">
															<option value="${tipo.id_tipo_producto}">${tipo.nombre}</option>	
														</c:forEach>
													</select>
												</div>
												
												<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
													<label>* Nombre</label>
													<input type="text" class="form-control" id="nombre" name="nombre"/>
												</div>
												<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
													<label>* Descripci&#243;n</label>
													<input type="text" class="form-control" id="descripcion" name="descripcion"/>
												</div>
												<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
													<label>* Precio de venta</label>
													<input type="number" class="form-control" id="venta" name="venta"/>
												</div>
			                                  
			                                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
													<label>Imagen</label>
													<input type="file" id="fileview" name="fileview" class="invisibleUpload"/> 
													<div id="image">
														<span class="badge bg-warning" id="localImage">local</span>
													</div>
												</div>
			                                  </div>
			                                  <div id="ingview" class="tab-pane">
			                                  	  <input type="hidden" value="0" id="count" name="count"/>
			                                  	  
			                                  	  <div class="col-lg-12">
			                                  	  		<label>* Cantidad Minima</label>
			                                  	  		<input type="number" id="cantidadMin" name="cantidadMin" class="form-control"/>
			                                  	  </div>
				                                  <div class="col-lg-12" style="text-align: right;">
													<button type="button" class="btn btn-primary" id="adicion"> Adicionar</button>
												  </div>
												<div id="IngDynamic" class="col-xs-12 col-sm-12 col-md-12">
													<br/>
													<table class="display table table-bordered table-striped dataTable">
														<thead>
															<tr>
																<th>Ingrediente</th>
																<th>Cantidad</th>
																<th>Unidad Medida</th>
																<th></th>
															</tr>
														</thead>
														<tbody></tbody>
													</table>
												</div>
			                                  </div>
			                                  
			                                  <div id="Catalog" class="tab-pane">
			                                  	<input type="hidden" id="catalogActive" name="catalogActive" />
			                                  	<input type="hidden" id="catalogNoActive" name="catalogNoActive" />
			                                  	<div id="detalleCatalog"></div>
			                                  </div>
			                                  
			                              </div>
			                    	</div>
             					</section>
                			</div>
						</div>
					</div>
					<div class="modal-footer">
						<button class="btn btn-warning" type="button" onclick="validarFormulario();">Guardar</button>
						<button data-dismiss="modal" class="btn btn-gray-transparent" type="button" onclick="Limpiar();">Cerrar</button>
						<button data-dismiss="modal" class="btn btn-danger" type="button" onclick="Eliminar();">Eliminar</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<script type="text/javascript">
	titulos = new Array();
	titulos["id_producto"] = "ID";
	titulos["nombre"] = "Nombre";
	titulos["tipoP"] = "Tipo";
	titulos["ventaf"] = "Venta";
	titulos["cantidadMin"] = "Cantidad Min";
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/JavaScript/producto/productoAdmin.js"></script>
