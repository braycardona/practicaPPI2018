package com.colsevi.dao.caja.model;

import java.math.BigDecimal;
import java.util.Date;

public class Caja {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column caja.id_caja
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	private Integer id_caja;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column caja.id_establecimiento
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	private Integer id_establecimiento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column caja.id_persona
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	private Integer id_persona;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column caja.fecha_ejecucion
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	private Date fecha_ejecucion;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column caja.estado
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	private String estado;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column caja.valor_inicial
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	private BigDecimal valor_inicial;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column caja.id_caja
	 * @return  the value of caja.id_caja
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public Integer getId_caja() {
		return id_caja;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column caja.id_caja
	 * @param id_caja  the value for caja.id_caja
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public void setId_caja(Integer id_caja) {
		this.id_caja = id_caja;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column caja.id_establecimiento
	 * @return  the value of caja.id_establecimiento
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public Integer getId_establecimiento() {
		return id_establecimiento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column caja.id_establecimiento
	 * @param id_establecimiento  the value for caja.id_establecimiento
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public void setId_establecimiento(Integer id_establecimiento) {
		this.id_establecimiento = id_establecimiento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column caja.id_persona
	 * @return  the value of caja.id_persona
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public Integer getId_persona() {
		return id_persona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column caja.id_persona
	 * @param id_persona  the value for caja.id_persona
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column caja.fecha_ejecucion
	 * @return  the value of caja.fecha_ejecucion
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public Date getFecha_ejecucion() {
		return fecha_ejecucion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column caja.fecha_ejecucion
	 * @param fecha_ejecucion  the value for caja.fecha_ejecucion
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public void setFecha_ejecucion(Date fecha_ejecucion) {
		this.fecha_ejecucion = fecha_ejecucion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column caja.estado
	 * @return  the value of caja.estado
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column caja.estado
	 * @param estado  the value for caja.estado
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column caja.valor_inicial
	 * @return  the value of caja.valor_inicial
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public BigDecimal getValor_inicial() {
		return valor_inicial;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column caja.valor_inicial
	 * @param valor_inicial  the value for caja.valor_inicial
	 * @mbg.generated  Fri Apr 28 18:01:40 COT 2017
	 */
	public void setValor_inicial(BigDecimal valor_inicial) {
		this.valor_inicial = valor_inicial;
	}
}