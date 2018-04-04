jQuery(document).ready(function(){
	Tabla();
	
	$('#Formulario').validate({
		rules: {
			descripcion: {
				required: false,
				minlength: 5,
				maxlength: 120
			},
			valor:{
				required: true,
				maxlength: 100,
				minlength: 1
			},
		}  
     });
	
});

function Tabla(pagina){
	HTabla({
		url: contexto + "/Usuario/tabla.html?",
		Id: "#tabla",
		titulos: titulos,
		pagina:pagina
	});
}

function Limpiar(){
	HLimpiar();
}

function CargarFormulario(Id){
	HCargarFormulario(Id);
}

function validarFormulario(){
	if($('#Formulario').valid())
		enviarFormulario();
}
