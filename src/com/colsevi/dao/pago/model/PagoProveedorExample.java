package com.colsevi.dao.pago.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PagoProveedorExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public PagoProveedorExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
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

		public Criteria andId_pago_proveedorIsNull() {
			addCriterion("id_pago_proveedor is null");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorIsNotNull() {
			addCriterion("id_pago_proveedor is not null");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorEqualTo(Integer value) {
			addCriterion("id_pago_proveedor =", value, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorNotEqualTo(Integer value) {
			addCriterion("id_pago_proveedor <>", value, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorGreaterThan(Integer value) {
			addCriterion("id_pago_proveedor >", value, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_pago_proveedor >=", value, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorLessThan(Integer value) {
			addCriterion("id_pago_proveedor <", value, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorLessThanOrEqualTo(Integer value) {
			addCriterion("id_pago_proveedor <=", value, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorIn(List<Integer> values) {
			addCriterion("id_pago_proveedor in", values, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorNotIn(List<Integer> values) {
			addCriterion("id_pago_proveedor not in", values, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorBetween(Integer value1, Integer value2) {
			addCriterion("id_pago_proveedor between", value1, value2, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_pago_proveedorNotBetween(Integer value1, Integer value2) {
			addCriterion("id_pago_proveedor not between", value1, value2, "id_pago_proveedor");
			return (Criteria) this;
		}

		public Criteria andId_compraIsNull() {
			addCriterion("id_compra is null");
			return (Criteria) this;
		}

		public Criteria andId_compraIsNotNull() {
			addCriterion("id_compra is not null");
			return (Criteria) this;
		}

		public Criteria andId_compraEqualTo(Integer value) {
			addCriterion("id_compra =", value, "id_compra");
			return (Criteria) this;
		}

		public Criteria andId_compraNotEqualTo(Integer value) {
			addCriterion("id_compra <>", value, "id_compra");
			return (Criteria) this;
		}

		public Criteria andId_compraGreaterThan(Integer value) {
			addCriterion("id_compra >", value, "id_compra");
			return (Criteria) this;
		}

		public Criteria andId_compraGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_compra >=", value, "id_compra");
			return (Criteria) this;
		}

		public Criteria andId_compraLessThan(Integer value) {
			addCriterion("id_compra <", value, "id_compra");
			return (Criteria) this;
		}

		public Criteria andId_compraLessThanOrEqualTo(Integer value) {
			addCriterion("id_compra <=", value, "id_compra");
			return (Criteria) this;
		}

		public Criteria andId_compraIn(List<Integer> values) {
			addCriterion("id_compra in", values, "id_compra");
			return (Criteria) this;
		}

		public Criteria andId_compraNotIn(List<Integer> values) {
			addCriterion("id_compra not in", values, "id_compra");
			return (Criteria) this;
		}

		public Criteria andId_compraBetween(Integer value1, Integer value2) {
			addCriterion("id_compra between", value1, value2, "id_compra");
			return (Criteria) this;
		}

		public Criteria andId_compraNotBetween(Integer value1, Integer value2) {
			addCriterion("id_compra not between", value1, value2, "id_compra");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoIsNull() {
			addCriterion("fecha_pago is null");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoIsNotNull() {
			addCriterion("fecha_pago is not null");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoEqualTo(Date value) {
			addCriterion("fecha_pago =", value, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoNotEqualTo(Date value) {
			addCriterion("fecha_pago <>", value, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoGreaterThan(Date value) {
			addCriterion("fecha_pago >", value, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoGreaterThanOrEqualTo(Date value) {
			addCriterion("fecha_pago >=", value, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoLessThan(Date value) {
			addCriterion("fecha_pago <", value, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoLessThanOrEqualTo(Date value) {
			addCriterion("fecha_pago <=", value, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoIn(List<Date> values) {
			addCriterion("fecha_pago in", values, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoNotIn(List<Date> values) {
			addCriterion("fecha_pago not in", values, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoBetween(Date value1, Date value2) {
			addCriterion("fecha_pago between", value1, value2, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andFecha_pagoNotBetween(Date value1, Date value2) {
			addCriterion("fecha_pago not between", value1, value2, "fecha_pago");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoIsNull() {
			addCriterion("valor_pagado is null");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoIsNotNull() {
			addCriterion("valor_pagado is not null");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoEqualTo(BigDecimal value) {
			addCriterion("valor_pagado =", value, "valor_pagado");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoNotEqualTo(BigDecimal value) {
			addCriterion("valor_pagado <>", value, "valor_pagado");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoGreaterThan(BigDecimal value) {
			addCriterion("valor_pagado >", value, "valor_pagado");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("valor_pagado >=", value, "valor_pagado");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoLessThan(BigDecimal value) {
			addCriterion("valor_pagado <", value, "valor_pagado");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoLessThanOrEqualTo(BigDecimal value) {
			addCriterion("valor_pagado <=", value, "valor_pagado");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoIn(List<BigDecimal> values) {
			addCriterion("valor_pagado in", values, "valor_pagado");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoNotIn(List<BigDecimal> values) {
			addCriterion("valor_pagado not in", values, "valor_pagado");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("valor_pagado between", value1, value2, "valor_pagado");
			return (Criteria) this;
		}

		public Criteria andValor_pagadoNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("valor_pagado not between", value1, value2, "valor_pagado");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table pago_proveedor
	 * @mbg.generated  Fri Apr 28 17:35:03 COT 2017
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
     * This class corresponds to the database table pago_proveedor
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 12 16:29:49 COT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}