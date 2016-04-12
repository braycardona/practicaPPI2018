package com.colsevi.dao.proveedor.model;

import java.util.Date;

public class CompraXIngrediente extends CompraXIngredienteKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column compra_x_ingrediente.id_unidad_peso
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	private Integer id_unidad_peso;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column compra_x_ingrediente.fecha_vencimiento
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	private Date fecha_vencimiento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column compra_x_ingrediente.cantidad
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	private Integer cantidad;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column compra_x_ingrediente.id_unidad_peso
	 * @return  the value of compra_x_ingrediente.id_unidad_peso
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	public Integer getId_unidad_peso() {
		return id_unidad_peso;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column compra_x_ingrediente.id_unidad_peso
	 * @param id_unidad_peso  the value for compra_x_ingrediente.id_unidad_peso
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	public void setId_unidad_peso(Integer id_unidad_peso) {
		this.id_unidad_peso = id_unidad_peso;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column compra_x_ingrediente.fecha_vencimiento
	 * @return  the value of compra_x_ingrediente.fecha_vencimiento
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column compra_x_ingrediente.fecha_vencimiento
	 * @param fecha_vencimiento  the value for compra_x_ingrediente.fecha_vencimiento
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column compra_x_ingrediente.cantidad
	 * @return  the value of compra_x_ingrediente.cantidad
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column compra_x_ingrediente.cantidad
	 * @param cantidad  the value for compra_x_ingrediente.cantidad
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}