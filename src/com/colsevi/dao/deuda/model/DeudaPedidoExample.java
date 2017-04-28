package com.colsevi.dao.deuda.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeudaPedidoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public DeudaPedidoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
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

		public Criteria andId_deuda_pedidoIsNull() {
			addCriterion("id_deuda_pedido is null");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoIsNotNull() {
			addCriterion("id_deuda_pedido is not null");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoEqualTo(Integer value) {
			addCriterion("id_deuda_pedido =", value, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoNotEqualTo(Integer value) {
			addCriterion("id_deuda_pedido <>", value, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoGreaterThan(Integer value) {
			addCriterion("id_deuda_pedido >", value, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_deuda_pedido >=", value, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoLessThan(Integer value) {
			addCriterion("id_deuda_pedido <", value, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoLessThanOrEqualTo(Integer value) {
			addCriterion("id_deuda_pedido <=", value, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoIn(List<Integer> values) {
			addCriterion("id_deuda_pedido in", values, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoNotIn(List<Integer> values) {
			addCriterion("id_deuda_pedido not in", values, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoBetween(Integer value1, Integer value2) {
			addCriterion("id_deuda_pedido between", value1, value2, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_deuda_pedidoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_deuda_pedido not between", value1, value2, "id_deuda_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoIsNull() {
			addCriterion("id_pedido is null");
			return (Criteria) this;
		}

		public Criteria andId_pedidoIsNotNull() {
			addCriterion("id_pedido is not null");
			return (Criteria) this;
		}

		public Criteria andId_pedidoEqualTo(Integer value) {
			addCriterion("id_pedido =", value, "id_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoNotEqualTo(Integer value) {
			addCriterion("id_pedido <>", value, "id_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoGreaterThan(Integer value) {
			addCriterion("id_pedido >", value, "id_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_pedido >=", value, "id_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoLessThan(Integer value) {
			addCriterion("id_pedido <", value, "id_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoLessThanOrEqualTo(Integer value) {
			addCriterion("id_pedido <=", value, "id_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoIn(List<Integer> values) {
			addCriterion("id_pedido in", values, "id_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoNotIn(List<Integer> values) {
			addCriterion("id_pedido not in", values, "id_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoBetween(Integer value1, Integer value2) {
			addCriterion("id_pedido between", value1, value2, "id_pedido");
			return (Criteria) this;
		}

		public Criteria andId_pedidoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_pedido not between", value1, value2, "id_pedido");
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

		public Criteria andFecha_registroIsNull() {
			addCriterion("fecha_registro is null");
			return (Criteria) this;
		}

		public Criteria andFecha_registroIsNotNull() {
			addCriterion("fecha_registro is not null");
			return (Criteria) this;
		}

		public Criteria andFecha_registroEqualTo(Date value) {
			addCriterion("fecha_registro =", value, "fecha_registro");
			return (Criteria) this;
		}

		public Criteria andFecha_registroNotEqualTo(Date value) {
			addCriterion("fecha_registro <>", value, "fecha_registro");
			return (Criteria) this;
		}

		public Criteria andFecha_registroGreaterThan(Date value) {
			addCriterion("fecha_registro >", value, "fecha_registro");
			return (Criteria) this;
		}

		public Criteria andFecha_registroGreaterThanOrEqualTo(Date value) {
			addCriterion("fecha_registro >=", value, "fecha_registro");
			return (Criteria) this;
		}

		public Criteria andFecha_registroLessThan(Date value) {
			addCriterion("fecha_registro <", value, "fecha_registro");
			return (Criteria) this;
		}

		public Criteria andFecha_registroLessThanOrEqualTo(Date value) {
			addCriterion("fecha_registro <=", value, "fecha_registro");
			return (Criteria) this;
		}

		public Criteria andFecha_registroIn(List<Date> values) {
			addCriterion("fecha_registro in", values, "fecha_registro");
			return (Criteria) this;
		}

		public Criteria andFecha_registroNotIn(List<Date> values) {
			addCriterion("fecha_registro not in", values, "fecha_registro");
			return (Criteria) this;
		}

		public Criteria andFecha_registroBetween(Date value1, Date value2) {
			addCriterion("fecha_registro between", value1, value2, "fecha_registro");
			return (Criteria) this;
		}

		public Criteria andFecha_registroNotBetween(Date value1, Date value2) {
			addCriterion("fecha_registro not between", value1, value2, "fecha_registro");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table deuda_pedido
	 * @mbg.generated  Fri Apr 28 17:56:27 COT 2017
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table deuda_pedido
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 12 16:30:54 COT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}