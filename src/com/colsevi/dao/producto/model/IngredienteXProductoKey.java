package com.colsevi.dao.producto.model;

public class IngredienteXProductoKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ingrediente_x_producto.id_ingrediente
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	private Integer id_ingrediente;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ingrediente_x_producto.id_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	private Integer id_producto;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ingrediente_x_producto.id_ingrediente
	 * @return  the value of ingrediente_x_producto.id_ingrediente
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	public Integer getId_ingrediente() {
		return id_ingrediente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ingrediente_x_producto.id_ingrediente
	 * @param id_ingrediente  the value for ingrediente_x_producto.id_ingrediente
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	public void setId_ingrediente(Integer id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ingrediente_x_producto.id_producto
	 * @return  the value of ingrediente_x_producto.id_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	public Integer getId_producto() {
		return id_producto;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ingrediente_x_producto.id_producto
	 * @param id_producto  the value for ingrediente_x_producto.id_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}
}