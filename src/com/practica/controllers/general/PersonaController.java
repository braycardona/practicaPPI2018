package com.practica.controllers.general;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practica.application.PracticaDao;
import com.practica.controllers.BaseConfigController;
import com.practica.dao.general.model.Persona;
import com.practica.dao.general.model.PersonaExample;

@Controller
@RequestMapping("/Persona")
public class PersonaController extends BaseConfigController {

	private static final long serialVersionUID = -3196753721936013061L;
	private static Logger logger = Logger.getLogger(PersonaController.class);
	
	@RequestMapping
	public String persona(HttpServletRequest request, ModelMap model){
		return "general/Persona";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/tabla")
	public void tabla(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		JSONObject opciones = new JSONObject();
//		String Inicio = request.getParameter("Inicio");
//		String Final = request.getParameter("Final");
//		String nombre = request.getParameter("nombreF");
//		String descripcion = request.getParameter("descripcionF");
		
		PersonaExample personaExample = new PersonaExample();
//		tipoExample.setLimit(Inicio + ", " + Final);
		
		PersonaExample.Criteria criteria = (PersonaExample.Criteria) personaExample.createCriteria();
		
//		if(nombre != null && !nombre.trim().isEmpty()){
//			criteria.andNombreLike("%" + nombre + "%");   
//		}
//		if(descripcion != null && !descripcion.trim().isEmpty()){
//			criteria.andDescripcionLike("%" + descripcion + "%");   
//		}
		
		try{
		opciones.put("datos", ConstruirJson(PracticaDao.getInstance().getPersonaMapper().selectByExample(personaExample)));
		opciones.put("total", PracticaDao.getInstance().getPersonaMapper().countByExample(personaExample));
		}catch(Exception e){
			logger.error(e.getMessage());
		}
		response.setContentType("text/html;charset=ISO-8859-1");
		request.setCharacterEncoding("UTF8");
		
		opciones.writeJSONString(response.getWriter());
	}

	@SuppressWarnings("unchecked")
	public JSONArray ConstruirJson(List<Persona> listgeneral){

		JSONArray resultado = new JSONArray();
		JSONObject opciones = new JSONObject();
		
		if(listgeneral != null && listgeneral.size() >0){
			for (Persona bean : listgeneral) {
				opciones = new JSONObject();
				try{
					opciones.put("id", bean.getCedula());
					opciones.put("cedula", bean.getCedula());
					opciones.put("apellido1", bean.getApellido_1());
					opciones.put("apellido2", bean.getApellido_2());
					opciones.put("cargo", bean.getCodigo_cargo());
					opciones.put("codigo", bean.getCodigo_prog_academico());
					opciones.put("correo", bean.getCorreo());
					opciones.put("direccion", bean.getDireccion());
					opciones.put("nombre", bean.getNombre());
					opciones.put("telefono1", bean.getTelefono_1());
					opciones.put("telefono2", bean.getApellido_2());
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
