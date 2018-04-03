package com.practica.application;

public class SesionUsuario {
	
    private String  ide_usuario;
    private Integer ide_persona;
    private Integer nombre;
	
    public String getIde_usuario() {
		return ide_usuario;
	}
	public void setIde_usuario(String ide_usuario) {
		this.ide_usuario = ide_usuario;
	}
	public Integer getIde_persona() {
		return ide_persona;
	}
	public void setIde_persona(Integer ide_persona) {
		this.ide_persona = ide_persona;
	}
	public Integer getNombre() {
		return nombre;
	}
	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}
    
}