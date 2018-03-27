package com.colsevi.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController extends BaseConfigController{

	private static final long serialVersionUID = -9194726703842278303L;
	private static Logger logger = Logger.getLogger(HelloController.class);

	@RequestMapping("/")
	public ModelAndView profile(HttpServletRequest request){
		if(getUsuario(request) != null && getUsuario(request).getPersona() != null){
			return new ModelAndView("inicialApp","col",getValoresGenericos(request));
		}else{
			return new ModelAndView("front/index");
		}
	}
}
