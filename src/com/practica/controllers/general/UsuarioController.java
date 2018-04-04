package com.practica.controllers.general;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practica.application.PracticaDao;
import com.practica.controllers.BaseConfigController;
import com.practica.dao.general.model.Usuario;
import com.practica.dao.general.model.UsuarioExample;

@RequestMapping("/Usuario")
public class UsuarioController extends BaseConfigController {
	
	private static final long serialVersionUID = 4256773623052938383L;
	private static Logger logger = Logger.getLogger(UsuarioController.class);

	@RequestMapping
	public String usuario(HttpServletRequest request, ModelMap model){
		return "general/Usuario";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/tabla")
	public void tabla(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		JSONObject opciones = new JSONObject();
//		String Inicio = request.getParameter("Inicio");
//		String Final = request.getParameter("Final");
//		String nombre = request.getParameter("nombreF");
//		String descripcion = request.getParameter("descripcionF");
		
		UsuarioExample usuarioExample = new UsuarioExample();
		usuarioExample.setOrderByClause("id_usuario DESC");
//		tipoExample.setLimit(Inicio + ", " + Final);
		
		UsuarioExample.Criteria criteria = (UsuarioExample.Criteria) usuarioExample.createCriteria();
		
//		if(nombre != null && !nombre.trim().isEmpty()){
//			criteria.andNombreLike("%" + nombre + "%");   
//		}
//		if(descripcion != null && !descripcion.trim().isEmpty()){
//			criteria.andDescripcionLike("%" + descripcion + "%");   
//		}
		
		try{
		opciones.put("datos", ConstruirJson(PracticaDao.getInstance().getUsuarioMapper().selectByExample(usuarioExample)));
		opciones.put("total", PracticaDao.getInstance().getUsuarioMapper().countByExample(usuarioExample));
		}catch(Exception e){
			logger.error(e.getMessage());
		}
		response.setContentType("text/html;charset=ISO-8859-1");
		request.setCharacterEncoding("UTF8");
		
		opciones.writeJSONString(response.getWriter());
	}

	@SuppressWarnings("unchecked")
	public JSONArray ConstruirJson(List<Usuario> listgeneral){

		JSONArray resultado = new JSONArray();
		JSONObject opciones = new JSONObject();
		
		if(listgeneral != null && listgeneral.size() >0){
			for (Usuario bean : listgeneral) {
				opciones = new JSONObject();
				try{
					opciones.put("usuario", bean.getId_usuario());
					opciones.put("persona", bean.getId_persona());
					opciones.put("estado", bean.getEstado());
					opciones.put("usuario", bean.getUsuario());
					resultado.add(opciones);
				}catch(Exception e){
					logger.error(e.getMessage());
					continue;
				}
			}
			
		}
		return resultado;
	}
}
