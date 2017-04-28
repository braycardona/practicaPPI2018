package com.colsevi.dao.general.model;

public class Establecimiento {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column establecimiento.id_establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	private Integer id_establecimiento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column establecimiento.id_direccion
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	private Integer id_direccion;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column establecimiento.id_telefono
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	private Integer id_telefono;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column establecimiento.nombre
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	private String nombre;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column establecimiento.descripcion
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	private String descripcion;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column establecimiento.hora_inicio
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	private String hora_inicio;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column establecimiento.hora_fin
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	private String hora_fin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column establecimiento.estado
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	private Boolean estado;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column establecimiento.id_establecimiento
	 * @return  the value of establecimiento.id_establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public Integer getId_establecimiento() {
		return id_establecimiento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column establecimiento.id_establecimiento
	 * @param id_establecimiento  the value for establecimiento.id_establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setId_establecimiento(Integer id_establecimiento) {
		this.id_establecimiento = id_establecimiento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column establecimiento.id_direccion
	 * @return  the value of establecimiento.id_direccion
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public Integer getId_direccion() {
		return id_direccion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column establecimiento.id_direccion
	 * @param id_direccion  the value for establecimiento.id_direccion
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setId_direccion(Integer id_direccion) {
		this.id_direccion = id_direccion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column establecimiento.id_telefono
	 * @return  the value of establecimiento.id_telefono
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public Integer getId_telefono() {
		return id_telefono;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column establecimiento.id_telefono
	 * @param id_telefono  the value for establecimiento.id_telefono
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setId_telefono(Integer id_telefono) {
		this.id_telefono = id_telefono;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column establecimiento.nombre
	 * @return  the value of establecimiento.nombre
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column establecimiento.nombre
	 * @param nombre  the value for establecimiento.nombre
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column establecimiento.descripcion
	 * @return  the value of establecimiento.descripcion
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column establecimiento.descripcion
	 * @param descripcion  the value for establecimiento.descripcion
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column establecimiento.hora_inicio
	 * @return  the value of establecimiento.hora_inicio
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public String getHora_inicio() {
		return hora_inicio;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column establecimiento.hora_inicio
	 * @param hora_inicio  the value for establecimiento.hora_inicio
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column establecimiento.hora_fin
	 * @return  the value of establecimiento.hora_fin
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public String getHora_fin() {
		return hora_fin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column establecimiento.hora_fin
	 * @param hora_fin  the value for establecimiento.hora_fin
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column establecimiento.estado
	 * @return  the value of establecimiento.estado
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public Boolean getEstado() {
		return estado;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column establecimiento.estado
	 * @param estado  the value for establecimiento.estado
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}