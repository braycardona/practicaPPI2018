package com.colsevi.dao.producto.model;

public class Ingrediente {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ingrediente.id_ingrediente
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	private Integer id_ingrediente;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ingrediente.id_unidad_medida
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	private Integer id_unidad_medida;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ingrediente.nombre
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	private String nombre;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ingrediente.descripcion
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	private String descripcion;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ingrediente.id_ingrediente
	 * @return  the value of ingrediente.id_ingrediente
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	public Integer getId_ingrediente() {
		return id_ingrediente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ingrediente.id_ingrediente
	 * @param id_ingrediente  the value for ingrediente.id_ingrediente
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	public void setId_ingrediente(Integer id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ingrediente.id_unidad_medida
	 * @return  the value of ingrediente.id_unidad_medida
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	public Integer getId_unidad_medida() {
		return id_unidad_medida;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ingrediente.id_unidad_medida
	 * @param id_unidad_medida  the value for ingrediente.id_unidad_medida
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	public void setId_unidad_medida(Integer id_unidad_medida) {
		this.id_unidad_medida = id_unidad_medida;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ingrediente.nombre
	 * @return  the value of ingrediente.nombre
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ingrediente.nombre
	 * @param nombre  the value for ingrediente.nombre
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ingrediente.descripcion
	 * @return  the value of ingrediente.descripcion
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ingrediente.descripcion
	 * @param descripcion  the value for ingrediente.descripcion
	 * @mbg.generated  Fri Apr 28 13:35:23 COT 2017
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}