package com.colsevi.dao.deuda.model;

import java.math.BigDecimal;
import java.util.Date;

public class DeudaPedido {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column deuda_pedido.id_deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	private Integer id_deuda_pedido;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column deuda_pedido.id_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	private Integer id_pedido;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column deuda_pedido.pendiente
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	private BigDecimal pendiente;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column deuda_pedido.fecha_registro
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	private Date fecha_registro;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column deuda_pedido.observacion
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	private String observacion;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column deuda_pedido.id_deuda_pedido
	 * @return  the value of deuda_pedido.id_deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public Integer getId_deuda_pedido() {
		return id_deuda_pedido;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column deuda_pedido.id_deuda_pedido
	 * @param id_deuda_pedido  the value for deuda_pedido.id_deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public void setId_deuda_pedido(Integer id_deuda_pedido) {
		this.id_deuda_pedido = id_deuda_pedido;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column deuda_pedido.id_pedido
	 * @return  the value of deuda_pedido.id_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public Integer getId_pedido() {
		return id_pedido;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column deuda_pedido.id_pedido
	 * @param id_pedido  the value for deuda_pedido.id_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column deuda_pedido.pendiente
	 * @return  the value of deuda_pedido.pendiente
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public BigDecimal getPendiente() {
		return pendiente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column deuda_pedido.pendiente
	 * @param pendiente  the value for deuda_pedido.pendiente
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public void setPendiente(BigDecimal pendiente) {
		this.pendiente = pendiente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column deuda_pedido.fecha_registro
	 * @return  the value of deuda_pedido.fecha_registro
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public Date getFecha_registro() {
		return fecha_registro;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column deuda_pedido.fecha_registro
	 * @param fecha_registro  the value for deuda_pedido.fecha_registro
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column deuda_pedido.observacion
	 * @return  the value of deuda_pedido.observacion
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public String getObservacion() {
		return observacion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column deuda_pedido.observacion
	 * @param observacion  the value for deuda_pedido.observacion
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
}