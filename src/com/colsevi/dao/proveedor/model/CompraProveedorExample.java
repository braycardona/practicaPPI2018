package com.colsevi.dao.proveedor.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraProveedorExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public CompraProveedorExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andId_compra_proveedorIsNull() {
			addCriterion("id_compra_proveedor is null");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorIsNotNull() {
			addCriterion("id_compra_proveedor is not null");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorEqualTo(Integer value) {
			addCriterion("id_compra_proveedor =", value, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorNotEqualTo(Integer value) {
			addCriterion("id_compra_proveedor <>", value, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorGreaterThan(Integer value) {
			addCriterion("id_compra_proveedor >", value, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_compra_proveedor >=", value, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorLessThan(Integer value) {
			addCriterion("id_compra_proveedor <", value, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorLessThanOrEqualTo(Integer value) {
			addCriterion("id_compra_proveedor <=", value, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorIn(List<Integer> values) {
			addCriterion("id_compra_proveedor in", values, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorNotIn(List<Integer> values) {
			addCriterion("id_compra_proveedor not in", values, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorBetween(Integer value1, Integer value2) {
			addCriterion("id_compra_proveedor between", value1, value2, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compra_proveedorNotBetween(Integer value1, Integer value2) {
			addCriterion("id_compra_proveedor not between", value1, value2, "id_compra_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorIsNull() {
			addCriterion("id_proveedor is null");
			return (Criteria) this;
		}

		public Criteria andId_proveedorIsNotNull() {
			addCriterion("id_proveedor is not null");
			return (Criteria) this;
		}

		public Criteria andId_proveedorEqualTo(Integer value) {
			addCriterion("id_proveedor =", value, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorNotEqualTo(Integer value) {
			addCriterion("id_proveedor <>", value, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorGreaterThan(Integer value) {
			addCriterion("id_proveedor >", value, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_proveedor >=", value, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorLessThan(Integer value) {
			addCriterion("id_proveedor <", value, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorLessThanOrEqualTo(Integer value) {
			addCriterion("id_proveedor <=", value, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorIn(List<Integer> values) {
			addCriterion("id_proveedor in", values, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorNotIn(List<Integer> values) {
			addCriterion("id_proveedor not in", values, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorBetween(Integer value1, Integer value2) {
			addCriterion("id_proveedor between", value1, value2, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_proveedorNotBetween(Integer value1, Integer value2) {
			addCriterion("id_proveedor not between", value1, value2, "id_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoIsNull() {
			addCriterion("id_establecimiento is null");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoIsNotNull() {
			addCriterion("id_establecimiento is not null");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoEqualTo(Integer value) {
			addCriterion("id_establecimiento =", value, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoNotEqualTo(Integer value) {
			addCriterion("id_establecimiento <>", value, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoGreaterThan(Integer value) {
			addCriterion("id_establecimiento >", value, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_establecimiento >=", value, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoLessThan(Integer value) {
			addCriterion("id_establecimiento <", value, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoLessThanOrEqualTo(Integer value) {
			addCriterion("id_establecimiento <=", value, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoIn(List<Integer> values) {
			addCriterion("id_establecimiento in", values, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoNotIn(List<Integer> values) {
			addCriterion("id_establecimiento not in", values, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoBetween(Integer value1, Integer value2) {
			addCriterion("id_establecimiento between", value1, value2, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andId_establecimientoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_establecimiento not between", value1, value2, "id_establecimiento");
			return (Criteria) this;
		}

		public Criteria andValorIsNull() {
			addCriterion("valor is null");
			return (Criteria) this;
		}

		public Criteria andValorIsNotNull() {
			addCriterion("valor is not null");
			return (Criteria) this;
		}

		public Criteria andValorEqualTo(BigDecimal value) {
			addCriterion("valor =", value, "valor");
			return (Criteria) this;
		}

		public Criteria andValorNotEqualTo(BigDecimal value) {
			addCriterion("valor <>", value, "valor");
			return (Criteria) this;
		}

		public Criteria andValorGreaterThan(BigDecimal value) {
			addCriterion("valor >", value, "valor");
			return (Criteria) this;
		}

		public Criteria andValorGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("valor >=", value, "valor");
			return (Criteria) this;
		}

		public Criteria andValorLessThan(BigDecimal value) {
			addCriterion("valor <", value, "valor");
			return (Criteria) this;
		}

		public Criteria andValorLessThanOrEqualTo(BigDecimal value) {
			addCriterion("valor <=", value, "valor");
			return (Criteria) this;
		}

		public Criteria andValorIn(List<BigDecimal> values) {
			addCriterion("valor in", values, "valor");
			return (Criteria) this;
		}

		public Criteria andValorNotIn(List<BigDecimal> values) {
			addCriterion("valor not in", values, "valor");
			return (Criteria) this;
		}

		public Criteria andValorBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("valor between", value1, value2, "valor");
			return (Criteria) this;
		}

		public Criteria andValorNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("valor not between", value1, value2, "valor");
			return (Criteria) this;
		}

		public Criteria andFecha_compraIsNull() {
			addCriterion("fecha_compra is null");
			return (Criteria) this;
		}

		public Criteria andFecha_compraIsNotNull() {
			addCriterion("fecha_compra is not null");
			return (Criteria) this;
		}

		public Criteria andFecha_compraEqualTo(Date value) {
			addCriterion("fecha_compra =", value, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_compraNotEqualTo(Date value) {
			addCriterion("fecha_compra <>", value, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_compraGreaterThan(Date value) {
			addCriterion("fecha_compra >", value, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_compraGreaterThanOrEqualTo(Date value) {
			addCriterion("fecha_compra >=", value, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_compraLessThan(Date value) {
			addCriterion("fecha_compra <", value, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_compraLessThanOrEqualTo(Date value) {
			addCriterion("fecha_compra <=", value, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_compraIn(List<Date> values) {
			addCriterion("fecha_compra in", values, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_compraNotIn(List<Date> values) {
			addCriterion("fecha_compra not in", values, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_compraBetween(Date value1, Date value2) {
			addCriterion("fecha_compra between", value1, value2, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_compraNotBetween(Date value1, Date value2) {
			addCriterion("fecha_compra not between", value1, value2, "fecha_compra");
			return (Criteria) this;
		}

		public Criteria andIvaIsNull() {
			addCriterion("iva is null");
			return (Criteria) this;
		}

		public Criteria andIvaIsNotNull() {
			addCriterion("iva is not null");
			return (Criteria) this;
		}

		public Criteria andIvaEqualTo(Integer value) {
			addCriterion("iva =", value, "iva");
			return (Criteria) this;
		}

		public Criteria andIvaNotEqualTo(Integer value) {
			addCriterion("iva <>", value, "iva");
			return (Criteria) this;
		}

		public Criteria andIvaGreaterThan(Integer value) {
			addCriterion("iva >", value, "iva");
			return (Criteria) this;
		}

		public Criteria andIvaGreaterThanOrEqualTo(Integer value) {
			addCriterion("iva >=", value, "iva");
			return (Criteria) this;
		}

		public Criteria andIvaLessThan(Integer value) {
			addCriterion("iva <", value, "iva");
			return (Criteria) this;
		}

		public Criteria andIvaLessThanOrEqualTo(Integer value) {
			addCriterion("iva <=", value, "iva");
			return (Criteria) this;
		}

		public Criteria andIvaIn(List<Integer> values) {
			addCriterion("iva in", values, "iva");
			return (Criteria) this;
		}

		public Criteria andIvaNotIn(List<Integer> values) {
			addCriterion("iva not in", values, "iva");
			return (Criteria) this;
		}

		public Criteria andIvaBetween(Integer value1, Integer value2) {
			addCriterion("iva between", value1, value2, "iva");
			return (Criteria) this;
		}

		public Criteria andIvaNotBetween(Integer value1, Integer value2) {
			addCriterion("iva not between", value1, value2, "iva");
			return (Criteria) this;
		}

		public Criteria andPagadoIsNull() {
			addCriterion("pagado is null");
			return (Criteria) this;
		}

		public Criteria andPagadoIsNotNull() {
			addCriterion("pagado is not null");
			return (Criteria) this;
		}

		public Criteria andPagadoEqualTo(Boolean value) {
			addCriterion("pagado =", value, "pagado");
			return (Criteria) this;
		}

		public Criteria andPagadoNotEqualTo(Boolean value) {
			addCriterion("pagado <>", value, "pagado");
			return (Criteria) this;
		}

		public Criteria andPagadoGreaterThan(Boolean value) {
			addCriterion("pagado >", value, "pagado");
			return (Criteria) this;
		}

		public Criteria andPagadoGreaterThanOrEqualTo(Boolean value) {
			addCriterion("pagado >=", value, "pagado");
			return (Criteria) this;
		}

		public Criteria andPagadoLessThan(Boolean value) {
			addCriterion("pagado <", value, "pagado");
			return (Criteria) this;
		}

		public Criteria andPagadoLessThanOrEqualTo(Boolean value) {
			addCriterion("pagado <=", value, "pagado");
			return (Criteria) this;
		}

		public Criteria andPagadoIn(List<Boolean> values) {
			addCriterion("pagado in", values, "pagado");
			return (Criteria) this;
		}

		public Criteria andPagadoNotIn(List<Boolean> values) {
			addCriterion("pagado not in", values, "pagado");
			return (Criteria) this;
		}

		public Criteria andPagadoBetween(Boolean value1, Boolean value2) {
			addCriterion("pagado between", value1, value2, "pagado");
			return (Criteria) this;
		}

		public Criteria andPagadoNotBetween(Boolean value1, Boolean value2) {
			addCriterion("pagado not between", value1, value2, "pagado");
			return (Criteria) this;
		}

		public Criteria andMotivoIsNull() {
			addCriterion("motivo is null");
			return (Criteria) this;
		}

		public Criteria andMotivoIsNotNull() {
			addCriterion("motivo is not null");
			return (Criteria) this;
		}

		public Criteria andMotivoEqualTo(String value) {
			addCriterion("motivo =", value, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoNotEqualTo(String value) {
			addCriterion("motivo <>", value, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoGreaterThan(String value) {
			addCriterion("motivo >", value, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoGreaterThanOrEqualTo(String value) {
			addCriterion("motivo >=", value, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoLessThan(String value) {
			addCriterion("motivo <", value, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoLessThanOrEqualTo(String value) {
			addCriterion("motivo <=", value, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoLike(String value) {
			addCriterion("motivo like", value, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoNotLike(String value) {
			addCriterion("motivo not like", value, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoIn(List<String> values) {
			addCriterion("motivo in", values, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoNotIn(List<String> values) {
			addCriterion("motivo not in", values, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoBetween(String value1, String value2) {
			addCriterion("motivo between", value1, value2, "motivo");
			return (Criteria) this;
		}

		public Criteria andMotivoNotBetween(String value1, String value2) {
			addCriterion("motivo not between", value1, value2, "motivo");
			return (Criteria) this;
		}

		public Criteria andPendienteIsNull() {
			addCriterion("pendiente is null");
			return (Criteria) this;
		}

		public Criteria andPendienteIsNotNull() {
			addCriterion("pendiente is not null");
			return (Criteria) this;
		}

		public Criteria andPendienteEqualTo(BigDecimal value) {
			addCriterion("pendiente =", value, "pendiente");
			return (Criteria) this;
		}

		public Criteria andPendienteNotEqualTo(BigDecimal value) {
			addCriterion("pendiente <>", value, "pendiente");
			return (Criteria) this;
		}

		public Criteria andPendienteGreaterThan(BigDecimal value) {
			addCriterion("pendiente >", value, "pendiente");
			return (Criteria) this;
		}

		public Criteria andPendienteGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("pendiente >=", value, "pendiente");
			return (Criteria) this;
		}

		public Criteria andPendienteLessThan(BigDecimal value) {
			addCriterion("pendiente <", value, "pendiente");
			return (Criteria) this;
		}

		public Criteria andPendienteLessThanOrEqualTo(BigDecimal value) {
			addCriterion("pendiente <=", value, "pendiente");
			return (Criteria) this;
		}

		public Criteria andPendienteIn(List<BigDecimal> values) {
			addCriterion("pendiente in", values, "pendiente");
			return (Criteria) this;
		}

		public Criteria andPendienteNotIn(List<BigDecimal> values) {
			addCriterion("pendiente not in", values, "pendiente");
			return (Criteria) this;
		}

		public Criteria andPendienteBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("pendiente between", value1, value2, "pendiente");
			return (Criteria) this;
		}

		public Criteria andPendienteNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("pendiente not between", value1, value2, "pendiente");
			return (Criteria) this;
		}

		public Criteria andObservacionIsNull() {
			addCriterion("observacion is null");
			return (Criteria) this;
		}

		public Criteria andObservacionIsNotNull() {
			addCriterion("observacion is not null");
			return (Criteria) this;
		}

		public Criteria andObservacionEqualTo(String value) {
			addCriterion("observacion =", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionNotEqualTo(String value) {
			addCriterion("observacion <>", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionGreaterThan(String value) {
			addCriterion("observacion >", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionGreaterThanOrEqualTo(String value) {
			addCriterion("observacion >=", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionLessThan(String value) {
			addCriterion("observacion <", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionLessThanOrEqualTo(String value) {
			addCriterion("observacion <=", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionLike(String value) {
			addCriterion("observacion like", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionNotLike(String value) {
			addCriterion("observacion not like", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionIn(List<String> values) {
			addCriterion("observacion in", values, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionNotIn(List<String> values) {
			addCriterion("observacion not in", values, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionBetween(String value1, String value2) {
			addCriterion("observacion between", value1, value2, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionNotBetween(String value1, String value2) {
			addCriterion("observacion not between", value1, value2, "observacion");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table compra_proveedor
	 * @mbggenerated  Tue Dec 06 00:34:33 COT 2016
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	protected String limit;
	
	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table compra_proveedor
     *
     * @mbggenerated do_not_delete_during_merge Tue Oct 18 21:04:26 COT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}