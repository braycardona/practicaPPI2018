package com.practica.application;
 
import java.io.IOException;
import java.io.Serializable;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FiltroAutenticacion implements Filter, Serializable{

	private static final long serialVersionUID = -130687285287276931L;
	public static final String INDEX = "/front/index";
	
	public void destroy() { }

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		try{
			HttpServletRequest httpServletRequest =  (HttpServletRequest)servletRequest;
			String uri = httpServletRequest.getRequestURI().substring(httpServletRequest.getContextPath().length());
			String url = uri;
			if (httpServletRequest.getQueryString() != null){
				url += "?" + httpServletRequest.getQueryString();
			}
			
			boolean ExcluirVerficacion= isExcluirVerficacion(uri);
			if(ExcluirVerficacion){
				chain.doFilter(servletRequest, servletResponse);
				return;
			}
			
			SesionUsuario userSession = (SesionUsuario) httpServletRequest.getSession().getAttribute("sesion");
			if(userSession != null){
				boolean validar = validarPermisos(uri, url, userSession);
				if(validar){
					chain.doFilter(servletRequest, servletResponse);
					return;
				}else{
					httpServletRequest.getRequestDispatcher("/").forward(servletRequest, servletResponse);//Ajustar pagina error
				}
			}else{
				httpServletRequest.getRequestDispatcher("/").forward(servletRequest, servletResponse);
			}
			
		}catch (Throwable e) {
			e.printStackTrace();
			((HttpServletRequest)servletRequest).setAttribute("ERROR", "ERROR EN EL SISTEMA");
			((HttpServletRequest)servletRequest).getRequestDispatcher("/").forward(servletRequest, servletResponse);
		}
	}

	private boolean isExcluirVerficacion(String path) {

		if (path.endsWith("jpg")  || path.endsWith("png")  || path.endsWith("gif") || path.endsWith("woff")  ||
			path.endsWith("css") || path.endsWith("js")   ||  path.endsWith("pdf") || path.endsWith("PNG")  || 
			path.startsWith("/login") ||
			path.startsWith("/Usuario") ||
			path.startsWith("/Persona") ||
			path.startsWith("/principalBase") ||
			path.startsWith(INDEX)
			){
			return true;
		}else{		
			return false;
		}
	}

	public boolean validarPermisos(String uri, String url, SesionUsuario user) {
		if(uri.equals("/")){
			return true;
		}
		if (url.startsWith("/principalBase")) {
			return true;
		}
		return false;
	}
	
	public void init(FilterConfig arg0) throws ServletException {}

}