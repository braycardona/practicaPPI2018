package com.practica.dao.coordinacion.model;

import java.util.ArrayList;
import java.util.List;

public class HojaVidaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public HojaVidaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
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

        public Criteria andId_hoja_vidaIsNull() {
            addCriterion("id_hoja_vida is null");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaIsNotNull() {
            addCriterion("id_hoja_vida is not null");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaEqualTo(Integer value) {
            addCriterion("id_hoja_vida =", value, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaNotEqualTo(Integer value) {
            addCriterion("id_hoja_vida <>", value, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaGreaterThan(Integer value) {
            addCriterion("id_hoja_vida >", value, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_hoja_vida >=", value, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaLessThan(Integer value) {
            addCriterion("id_hoja_vida <", value, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaLessThanOrEqualTo(Integer value) {
            addCriterion("id_hoja_vida <=", value, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaIn(List<Integer> values) {
            addCriterion("id_hoja_vida in", values, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaNotIn(List<Integer> values) {
            addCriterion("id_hoja_vida not in", values, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaBetween(Integer value1, Integer value2) {
            addCriterion("id_hoja_vida between", value1, value2, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_hoja_vidaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_hoja_vida not between", value1, value2, "id_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andId_personaIsNull() {
            addCriterion("id_persona is null");
            return (Criteria) this;
        }

        public Criteria andId_personaIsNotNull() {
            addCriterion("id_persona is not null");
            return (Criteria) this;
        }

        public Criteria andId_personaEqualTo(Integer value) {
            addCriterion("id_persona =", value, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_personaNotEqualTo(Integer value) {
            addCriterion("id_persona <>", value, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_personaGreaterThan(Integer value) {
            addCriterion("id_persona >", value, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_personaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_persona >=", value, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_personaLessThan(Integer value) {
            addCriterion("id_persona <", value, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_personaLessThanOrEqualTo(Integer value) {
            addCriterion("id_persona <=", value, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_personaIn(List<Integer> values) {
            addCriterion("id_persona in", values, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_personaNotIn(List<Integer> values) {
            addCriterion("id_persona not in", values, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_personaBetween(Integer value1, Integer value2) {
            addCriterion("id_persona between", value1, value2, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_personaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_persona not between", value1, value2, "id_persona");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoIsNull() {
            addCriterion("id_prog_academico is null");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoIsNotNull() {
            addCriterion("id_prog_academico is not null");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoEqualTo(String value) {
            addCriterion("id_prog_academico =", value, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoNotEqualTo(String value) {
            addCriterion("id_prog_academico <>", value, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoGreaterThan(String value) {
            addCriterion("id_prog_academico >", value, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoGreaterThanOrEqualTo(String value) {
            addCriterion("id_prog_academico >=", value, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoLessThan(String value) {
            addCriterion("id_prog_academico <", value, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoLessThanOrEqualTo(String value) {
            addCriterion("id_prog_academico <=", value, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoLike(String value) {
            addCriterion("id_prog_academico like", value, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoNotLike(String value) {
            addCriterion("id_prog_academico not like", value, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoIn(List<String> values) {
            addCriterion("id_prog_academico in", values, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoNotIn(List<String> values) {
            addCriterion("id_prog_academico not in", values, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoBetween(String value1, String value2) {
            addCriterion("id_prog_academico between", value1, value2, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andId_prog_academicoNotBetween(String value1, String value2) {
            addCriterion("id_prog_academico not between", value1, value2, "id_prog_academico");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoIsNull() {
            addCriterion("fecha_guardado is null");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoIsNotNull() {
            addCriterion("fecha_guardado is not null");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoEqualTo(Integer value) {
            addCriterion("fecha_guardado =", value, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoNotEqualTo(Integer value) {
            addCriterion("fecha_guardado <>", value, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoGreaterThan(Integer value) {
            addCriterion("fecha_guardado >", value, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("fecha_guardado >=", value, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoLessThan(Integer value) {
            addCriterion("fecha_guardado <", value, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoLessThanOrEqualTo(Integer value) {
            addCriterion("fecha_guardado <=", value, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoIn(List<Integer> values) {
            addCriterion("fecha_guardado in", values, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoNotIn(List<Integer> values) {
            addCriterion("fecha_guardado not in", values, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoBetween(Integer value1, Integer value2) {
            addCriterion("fecha_guardado between", value1, value2, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andFecha_guardadoNotBetween(Integer value1, Integer value2) {
            addCriterion("fecha_guardado not between", value1, value2, "fecha_guardado");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaIsNull() {
            addCriterion("archivo_hoja_vida is null");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaIsNotNull() {
            addCriterion("archivo_hoja_vida is not null");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaEqualTo(String value) {
            addCriterion("archivo_hoja_vida =", value, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaNotEqualTo(String value) {
            addCriterion("archivo_hoja_vida <>", value, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaGreaterThan(String value) {
            addCriterion("archivo_hoja_vida >", value, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaGreaterThanOrEqualTo(String value) {
            addCriterion("archivo_hoja_vida >=", value, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaLessThan(String value) {
            addCriterion("archivo_hoja_vida <", value, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaLessThanOrEqualTo(String value) {
            addCriterion("archivo_hoja_vida <=", value, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaLike(String value) {
            addCriterion("archivo_hoja_vida like", value, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaNotLike(String value) {
            addCriterion("archivo_hoja_vida not like", value, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaIn(List<String> values) {
            addCriterion("archivo_hoja_vida in", values, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaNotIn(List<String> values) {
            addCriterion("archivo_hoja_vida not in", values, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaBetween(String value1, String value2) {
            addCriterion("archivo_hoja_vida between", value1, value2, "archivo_hoja_vida");
            return (Criteria) this;
        }

        public Criteria andArchivo_hoja_vidaNotBetween(String value1, String value2) {
            addCriterion("archivo_hoja_vida not between", value1, value2, "archivo_hoja_vida");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hoja_vida
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 02 22:22:08 COT 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hoja_vida
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
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
}