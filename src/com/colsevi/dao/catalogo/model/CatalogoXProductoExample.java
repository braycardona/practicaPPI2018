package com.colsevi.dao.catalogo.model;

import java.util.ArrayList;
import java.util.List;

public class CatalogoXProductoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public CatalogoXProductoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
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

		public Criteria andId_catalogoIsNull() {
			addCriterion("id_catalogo is null");
			return (Criteria) this;
		}

		public Criteria andId_catalogoIsNotNull() {
			addCriterion("id_catalogo is not null");
			return (Criteria) this;
		}

		public Criteria andId_catalogoEqualTo(Integer value) {
			addCriterion("id_catalogo =", value, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_catalogoNotEqualTo(Integer value) {
			addCriterion("id_catalogo <>", value, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_catalogoGreaterThan(Integer value) {
			addCriterion("id_catalogo >", value, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_catalogoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_catalogo >=", value, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_catalogoLessThan(Integer value) {
			addCriterion("id_catalogo <", value, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_catalogoLessThanOrEqualTo(Integer value) {
			addCriterion("id_catalogo <=", value, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_catalogoIn(List<Integer> values) {
			addCriterion("id_catalogo in", values, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_catalogoNotIn(List<Integer> values) {
			addCriterion("id_catalogo not in", values, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_catalogoBetween(Integer value1, Integer value2) {
			addCriterion("id_catalogo between", value1, value2, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_catalogoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_catalogo not between", value1, value2, "id_catalogo");
			return (Criteria) this;
		}

		public Criteria andId_productoIsNull() {
			addCriterion("id_producto is null");
			return (Criteria) this;
		}

		public Criteria andId_productoIsNotNull() {
			addCriterion("id_producto is not null");
			return (Criteria) this;
		}

		public Criteria andId_productoEqualTo(Integer value) {
			addCriterion("id_producto =", value, "id_producto");
			return (Criteria) this;
		}

		public Criteria andId_productoNotEqualTo(Integer value) {
			addCriterion("id_producto <>", value, "id_producto");
			return (Criteria) this;
		}

		public Criteria andId_productoGreaterThan(Integer value) {
			addCriterion("id_producto >", value, "id_producto");
			return (Criteria) this;
		}

		public Criteria andId_productoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_producto >=", value, "id_producto");
			return (Criteria) this;
		}

		public Criteria andId_productoLessThan(Integer value) {
			addCriterion("id_producto <", value, "id_producto");
			return (Criteria) this;
		}

		public Criteria andId_productoLessThanOrEqualTo(Integer value) {
			addCriterion("id_producto <=", value, "id_producto");
			return (Criteria) this;
		}

		public Criteria andId_productoIn(List<Integer> values) {
			addCriterion("id_producto in", values, "id_producto");
			return (Criteria) this;
		}

		public Criteria andId_productoNotIn(List<Integer> values) {
			addCriterion("id_producto not in", values, "id_producto");
			return (Criteria) this;
		}

		public Criteria andId_productoBetween(Integer value1, Integer value2) {
			addCriterion("id_producto between", value1, value2, "id_producto");
			return (Criteria) this;
		}

		public Criteria andId_productoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_producto not between", value1, value2, "id_producto");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table catalogo_x_producto
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
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
     * This class corresponds to the database table catalogo_x_producto
     *
     * @mbggenerated do_not_delete_during_merge Thu Mar 10 16:31:50 COT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}