package com.practica.controllers.general;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/Persona")
public class PersonaController {

	@RequestMapping
	public ModelAndView persona(HttpServletRequest request, ModelMap model){
		return new ModelAndView("/");
	}
	
	
	
}
