package com.practica.dao.general.model;

public class Usuario {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usuario.id_usuario
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	private Integer id_usuario;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usuario.id_persona
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	private Integer id_persona;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usuario.usuario
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	private String usuario;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usuario.clave
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	private String clave;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usuario.estado
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	private String estado;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usuario.id_usuario
	 * @return  the value of usuario.id_usuario
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public Integer getId_usuario() {
		return id_usuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usuario.id_usuario
	 * @param id_usuario  the value for usuario.id_usuario
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usuario.id_persona
	 * @return  the value of usuario.id_persona
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public Integer getId_persona() {
		return id_persona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usuario.id_persona
	 * @param id_persona  the value for usuario.id_persona
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usuario.usuario
	 * @return  the value of usuario.usuario
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usuario.usuario
	 * @param usuario  the value for usuario.usuario
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usuario.clave
	 * @return  the value of usuario.clave
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usuario.clave
	 * @param clave  the value for usuario.clave
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usuario.estado
	 * @return  the value of usuario.estado
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usuario.estado
	 * @param estado  the value for usuario.estado
	 * @mbg.generated  Mon Apr 02 23:15:32 COT 2018
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
}