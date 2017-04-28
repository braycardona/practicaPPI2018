package com.colsevi.dao.general.model;

import java.util.ArrayList;
import java.util.List;

public class EstablecimientoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public EstablecimientoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
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

		public Criteria andId_direccionIsNull() {
			addCriterion("id_direccion is null");
			return (Criteria) this;
		}

		public Criteria andId_direccionIsNotNull() {
			addCriterion("id_direccion is not null");
			return (Criteria) this;
		}

		public Criteria andId_direccionEqualTo(Integer value) {
			addCriterion("id_direccion =", value, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_direccionNotEqualTo(Integer value) {
			addCriterion("id_direccion <>", value, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_direccionGreaterThan(Integer value) {
			addCriterion("id_direccion >", value, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_direccionGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_direccion >=", value, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_direccionLessThan(Integer value) {
			addCriterion("id_direccion <", value, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_direccionLessThanOrEqualTo(Integer value) {
			addCriterion("id_direccion <=", value, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_direccionIn(List<Integer> values) {
			addCriterion("id_direccion in", values, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_direccionNotIn(List<Integer> values) {
			addCriterion("id_direccion not in", values, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_direccionBetween(Integer value1, Integer value2) {
			addCriterion("id_direccion between", value1, value2, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_direccionNotBetween(Integer value1, Integer value2) {
			addCriterion("id_direccion not between", value1, value2, "id_direccion");
			return (Criteria) this;
		}

		public Criteria andId_telefonoIsNull() {
			addCriterion("id_telefono is null");
			return (Criteria) this;
		}

		public Criteria andId_telefonoIsNotNull() {
			addCriterion("id_telefono is not null");
			return (Criteria) this;
		}

		public Criteria andId_telefonoEqualTo(Integer value) {
			addCriterion("id_telefono =", value, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andId_telefonoNotEqualTo(Integer value) {
			addCriterion("id_telefono <>", value, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andId_telefonoGreaterThan(Integer value) {
			addCriterion("id_telefono >", value, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andId_telefonoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_telefono >=", value, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andId_telefonoLessThan(Integer value) {
			addCriterion("id_telefono <", value, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andId_telefonoLessThanOrEqualTo(Integer value) {
			addCriterion("id_telefono <=", value, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andId_telefonoIn(List<Integer> values) {
			addCriterion("id_telefono in", values, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andId_telefonoNotIn(List<Integer> values) {
			addCriterion("id_telefono not in", values, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andId_telefonoBetween(Integer value1, Integer value2) {
			addCriterion("id_telefono between", value1, value2, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andId_telefonoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_telefono not between", value1, value2, "id_telefono");
			return (Criteria) this;
		}

		public Criteria andNombreIsNull() {
			addCriterion("nombre is null");
			return (Criteria) this;
		}

		public Criteria andNombreIsNotNull() {
			addCriterion("nombre is not null");
			return (Criteria) this;
		}

		public Criteria andNombreEqualTo(String value) {
			addCriterion("nombre =", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreNotEqualTo(String value) {
			addCriterion("nombre <>", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreGreaterThan(String value) {
			addCriterion("nombre >", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreGreaterThanOrEqualTo(String value) {
			addCriterion("nombre >=", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreLessThan(String value) {
			addCriterion("nombre <", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreLessThanOrEqualTo(String value) {
			addCriterion("nombre <=", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreLike(String value) {
			addCriterion("nombre like", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreNotLike(String value) {
			addCriterion("nombre not like", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreIn(List<String> values) {
			addCriterion("nombre in", values, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreNotIn(List<String> values) {
			addCriterion("nombre not in", values, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreBetween(String value1, String value2) {
			addCriterion("nombre between", value1, value2, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreNotBetween(String value1, String value2) {
			addCriterion("nombre not between", value1, value2, "nombre");
			return (Criteria) this;
		}

		public Criteria andDescripcionIsNull() {
			addCriterion("descripcion is null");
			return (Criteria) this;
		}

		public Criteria andDescripcionIsNotNull() {
			addCriterion("descripcion is not null");
			return (Criteria) this;
		}

		public Criteria andDescripcionEqualTo(String value) {
			addCriterion("descripcion =", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotEqualTo(String value) {
			addCriterion("descripcion <>", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionGreaterThan(String value) {
			addCriterion("descripcion >", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
			addCriterion("descripcion >=", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionLessThan(String value) {
			addCriterion("descripcion <", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionLessThanOrEqualTo(String value) {
			addCriterion("descripcion <=", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionLike(String value) {
			addCriterion("descripcion like", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotLike(String value) {
			addCriterion("descripcion not like", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionIn(List<String> values) {
			addCriterion("descripcion in", values, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotIn(List<String> values) {
			addCriterion("descripcion not in", values, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionBetween(String value1, String value2) {
			addCriterion("descripcion between", value1, value2, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotBetween(String value1, String value2) {
			addCriterion("descripcion not between", value1, value2, "descripcion");
			return (Criteria) this;
		}

		public Criteria andHora_inicioIsNull() {
			addCriterion("hora_inicio is null");
			return (Criteria) this;
		}

		public Criteria andHora_inicioIsNotNull() {
			addCriterion("hora_inicio is not null");
			return (Criteria) this;
		}

		public Criteria andHora_inicioEqualTo(String value) {
			addCriterion("hora_inicio =", value, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioNotEqualTo(String value) {
			addCriterion("hora_inicio <>", value, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioGreaterThan(String value) {
			addCriterion("hora_inicio >", value, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioGreaterThanOrEqualTo(String value) {
			addCriterion("hora_inicio >=", value, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioLessThan(String value) {
			addCriterion("hora_inicio <", value, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioLessThanOrEqualTo(String value) {
			addCriterion("hora_inicio <=", value, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioLike(String value) {
			addCriterion("hora_inicio like", value, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioNotLike(String value) {
			addCriterion("hora_inicio not like", value, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioIn(List<String> values) {
			addCriterion("hora_inicio in", values, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioNotIn(List<String> values) {
			addCriterion("hora_inicio not in", values, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioBetween(String value1, String value2) {
			addCriterion("hora_inicio between", value1, value2, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_inicioNotBetween(String value1, String value2) {
			addCriterion("hora_inicio not between", value1, value2, "hora_inicio");
			return (Criteria) this;
		}

		public Criteria andHora_finIsNull() {
			addCriterion("hora_fin is null");
			return (Criteria) this;
		}

		public Criteria andHora_finIsNotNull() {
			addCriterion("hora_fin is not null");
			return (Criteria) this;
		}

		public Criteria andHora_finEqualTo(String value) {
			addCriterion("hora_fin =", value, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finNotEqualTo(String value) {
			addCriterion("hora_fin <>", value, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finGreaterThan(String value) {
			addCriterion("hora_fin >", value, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finGreaterThanOrEqualTo(String value) {
			addCriterion("hora_fin >=", value, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finLessThan(String value) {
			addCriterion("hora_fin <", value, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finLessThanOrEqualTo(String value) {
			addCriterion("hora_fin <=", value, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finLike(String value) {
			addCriterion("hora_fin like", value, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finNotLike(String value) {
			addCriterion("hora_fin not like", value, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finIn(List<String> values) {
			addCriterion("hora_fin in", values, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finNotIn(List<String> values) {
			addCriterion("hora_fin not in", values, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finBetween(String value1, String value2) {
			addCriterion("hora_fin between", value1, value2, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andHora_finNotBetween(String value1, String value2) {
			addCriterion("hora_fin not between", value1, value2, "hora_fin");
			return (Criteria) this;
		}

		public Criteria andEstadoIsNull() {
			addCriterion("estado is null");
			return (Criteria) this;
		}

		public Criteria andEstadoIsNotNull() {
			addCriterion("estado is not null");
			return (Criteria) this;
		}

		public Criteria andEstadoEqualTo(Boolean value) {
			addCriterion("estado =", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoNotEqualTo(Boolean value) {
			addCriterion("estado <>", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoGreaterThan(Boolean value) {
			addCriterion("estado >", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoGreaterThanOrEqualTo(Boolean value) {
			addCriterion("estado >=", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoLessThan(Boolean value) {
			addCriterion("estado <", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoLessThanOrEqualTo(Boolean value) {
			addCriterion("estado <=", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoIn(List<Boolean> values) {
			addCriterion("estado in", values, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoNotIn(List<Boolean> values) {
			addCriterion("estado not in", values, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoBetween(Boolean value1, Boolean value2) {
			addCriterion("estado between", value1, value2, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoNotBetween(Boolean value1, Boolean value2) {
			addCriterion("estado not between", value1, value2, "estado");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table establecimiento
	 * @mbg.generated  Fri Apr 28 17:25:30 COT 2017
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
     * This class corresponds to the database table establecimiento
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 03 21:56:26 COT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}