package com.practica.controllers;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.practica.application.SesionUsuario;

public class BaseConfigController implements Serializable {

	private static final long serialVersionUID = -5638128544265729391L;
	
	public Map<String, Object> getValoresGenericos(HttpServletRequest request){
		Map<String, Object> mapa = new HashMap<String, Object>();
		mapa.put("menu", getMenu(request));
		mapa.put("sesion", getUsuario(request));

		return mapa;
	}
	
	public String getMenu(HttpServletRequest request){
		StringBuilder menu = new StringBuilder();
		
		menu.append("<li class=\"dropdown\">")
			.append("<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" onclick=\"HredireccionarVista('" + request.getContextPath() + "/Usuario.html')\" >Usuario</a>")
		.append("</li>")
		.append("<li class=\"dropdown\">")
			.append("<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" onclick=\"HredireccionarVista('" + request.getContextPath() + "/Persona.html')\" >Persona</a>")
		.append("</li>");
		
		return menu.toString();
	}
	
	public SesionUsuario getUsuario(HttpServletRequest request){
		if(request.getSession() != null && request.getSession().getAttribute("sesion") != null){
			return (SesionUsuario) request.getSession().getAttribute("sesion");
		}
		return null;
	}
	
	public void ResponseJson(HttpServletRequest request, HttpServletResponse response, JSONObject result) throws IOException{
		response.setContentType("text/html;charset=ISO-8859-1");
		request.setCharacterEncoding("UTF8");
		
		result.writeJSONString(response.getWriter());
	}
	
	public void ResponseArray(HttpServletRequest request, HttpServletResponse response, JSONArray result) throws IOException{
		response.setContentType("text/html;charset=ISO-8859-1");
		request.setCharacterEncoding("UTF8");
		
		result.writeJSONString(response.getWriter());
	}

}
