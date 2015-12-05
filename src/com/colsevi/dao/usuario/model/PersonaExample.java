package com.colsevi.dao.usuario.model;

import java.util.ArrayList;
import java.util.List;

public class PersonaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    public PersonaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
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
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
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

        public Criteria andTipo_docIsNull() {
            addCriterion("tipo_doc is null");
            return (Criteria) this;
        }

        public Criteria andTipo_docIsNotNull() {
            addCriterion("tipo_doc is not null");
            return (Criteria) this;
        }

        public Criteria andTipo_docEqualTo(Integer value) {
            addCriterion("tipo_doc =", value, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andTipo_docNotEqualTo(Integer value) {
            addCriterion("tipo_doc <>", value, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andTipo_docGreaterThan(Integer value) {
            addCriterion("tipo_doc >", value, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andTipo_docGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipo_doc >=", value, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andTipo_docLessThan(Integer value) {
            addCriterion("tipo_doc <", value, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andTipo_docLessThanOrEqualTo(Integer value) {
            addCriterion("tipo_doc <=", value, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andTipo_docIn(List<Integer> values) {
            addCriterion("tipo_doc in", values, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andTipo_docNotIn(List<Integer> values) {
            addCriterion("tipo_doc not in", values, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andTipo_docBetween(Integer value1, Integer value2) {
            addCriterion("tipo_doc between", value1, value2, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andTipo_docNotBetween(Integer value1, Integer value2) {
            addCriterion("tipo_doc not between", value1, value2, "tipo_doc");
            return (Criteria) this;
        }

        public Criteria andDocumentoIsNull() {
            addCriterion("documento is null");
            return (Criteria) this;
        }

        public Criteria andDocumentoIsNotNull() {
            addCriterion("documento is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentoEqualTo(String value) {
            addCriterion("documento =", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoNotEqualTo(String value) {
            addCriterion("documento <>", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoGreaterThan(String value) {
            addCriterion("documento >", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoGreaterThanOrEqualTo(String value) {
            addCriterion("documento >=", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoLessThan(String value) {
            addCriterion("documento <", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoLessThanOrEqualTo(String value) {
            addCriterion("documento <=", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoLike(String value) {
            addCriterion("documento like", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoNotLike(String value) {
            addCriterion("documento not like", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoIn(List<String> values) {
            addCriterion("documento in", values, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoNotIn(List<String> values) {
            addCriterion("documento not in", values, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoBetween(String value1, String value2) {
            addCriterion("documento between", value1, value2, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoNotBetween(String value1, String value2) {
            addCriterion("documento not between", value1, value2, "documento");
            return (Criteria) this;
        }

        public Criteria andGeneroIsNull() {
            addCriterion("genero is null");
            return (Criteria) this;
        }

        public Criteria andGeneroIsNotNull() {
            addCriterion("genero is not null");
            return (Criteria) this;
        }

        public Criteria andGeneroEqualTo(String value) {
            addCriterion("genero =", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroNotEqualTo(String value) {
            addCriterion("genero <>", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroGreaterThan(String value) {
            addCriterion("genero >", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroGreaterThanOrEqualTo(String value) {
            addCriterion("genero >=", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroLessThan(String value) {
            addCriterion("genero <", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroLessThanOrEqualTo(String value) {
            addCriterion("genero <=", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroLike(String value) {
            addCriterion("genero like", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroNotLike(String value) {
            addCriterion("genero not like", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroIn(List<String> values) {
            addCriterion("genero in", values, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroNotIn(List<String> values) {
            addCriterion("genero not in", values, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroBetween(String value1, String value2) {
            addCriterion("genero between", value1, value2, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroNotBetween(String value1, String value2) {
            addCriterion("genero not between", value1, value2, "genero");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table persona
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 03 21:53:51 COT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table persona
     *
     * @mbggenerated Thu Dec 03 21:53:51 COT 2015
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