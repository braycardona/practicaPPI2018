package com.colsevi.dao.pago.model;

import java.util.ArrayList;
import java.util.List;

public class CobroCategoriaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public CobroCategoriaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
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
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
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

        public Criteria andId_cobro_categoriaIsNull() {
            addCriterion("id_cobro_categoria is null");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaIsNotNull() {
            addCriterion("id_cobro_categoria is not null");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaEqualTo(Integer value) {
            addCriterion("id_cobro_categoria =", value, "id_cobro_categoria");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaNotEqualTo(Integer value) {
            addCriterion("id_cobro_categoria <>", value, "id_cobro_categoria");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaGreaterThan(Integer value) {
            addCriterion("id_cobro_categoria >", value, "id_cobro_categoria");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_cobro_categoria >=", value, "id_cobro_categoria");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaLessThan(Integer value) {
            addCriterion("id_cobro_categoria <", value, "id_cobro_categoria");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaLessThanOrEqualTo(Integer value) {
            addCriterion("id_cobro_categoria <=", value, "id_cobro_categoria");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaIn(List<Integer> values) {
            addCriterion("id_cobro_categoria in", values, "id_cobro_categoria");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaNotIn(List<Integer> values) {
            addCriterion("id_cobro_categoria not in", values, "id_cobro_categoria");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaBetween(Integer value1, Integer value2) {
            addCriterion("id_cobro_categoria between", value1, value2, "id_cobro_categoria");
            return (Criteria) this;
        }

        public Criteria andId_cobro_categoriaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_cobro_categoria not between", value1, value2, "id_cobro_categoria");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cobro_categoria
     *
     * @mbggenerated do_not_delete_during_merge Thu Mar 10 16:44:01 COT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cobro_categoria
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
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