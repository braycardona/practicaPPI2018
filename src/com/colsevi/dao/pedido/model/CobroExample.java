package com.colsevi.dao.pedido.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CobroExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    public CobroExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
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
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
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

        public Criteria andId_cobroIsNull() {
            addCriterion("id_cobro is null");
            return (Criteria) this;
        }

        public Criteria andId_cobroIsNotNull() {
            addCriterion("id_cobro is not null");
            return (Criteria) this;
        }

        public Criteria andId_cobroEqualTo(Integer value) {
            addCriterion("id_cobro =", value, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_cobroNotEqualTo(Integer value) {
            addCriterion("id_cobro <>", value, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_cobroGreaterThan(Integer value) {
            addCriterion("id_cobro >", value, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_cobroGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_cobro >=", value, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_cobroLessThan(Integer value) {
            addCriterion("id_cobro <", value, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_cobroLessThanOrEqualTo(Integer value) {
            addCriterion("id_cobro <=", value, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_cobroIn(List<Integer> values) {
            addCriterion("id_cobro in", values, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_cobroNotIn(List<Integer> values) {
            addCriterion("id_cobro not in", values, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_cobroBetween(Integer value1, Integer value2) {
            addCriterion("id_cobro between", value1, value2, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_cobroNotBetween(Integer value1, Integer value2) {
            addCriterion("id_cobro not between", value1, value2, "id_cobro");
            return (Criteria) this;
        }

        public Criteria andId_deudaIsNull() {
            addCriterion("id_deuda is null");
            return (Criteria) this;
        }

        public Criteria andId_deudaIsNotNull() {
            addCriterion("id_deuda is not null");
            return (Criteria) this;
        }

        public Criteria andId_deudaEqualTo(Integer value) {
            addCriterion("id_deuda =", value, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_deudaNotEqualTo(Integer value) {
            addCriterion("id_deuda <>", value, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_deudaGreaterThan(Integer value) {
            addCriterion("id_deuda >", value, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_deudaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_deuda >=", value, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_deudaLessThan(Integer value) {
            addCriterion("id_deuda <", value, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_deudaLessThanOrEqualTo(Integer value) {
            addCriterion("id_deuda <=", value, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_deudaIn(List<Integer> values) {
            addCriterion("id_deuda in", values, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_deudaNotIn(List<Integer> values) {
            addCriterion("id_deuda not in", values, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_deudaBetween(Integer value1, Integer value2) {
            addCriterion("id_deuda between", value1, value2, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_deudaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_deuda not between", value1, value2, "id_deuda");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroIsNull() {
            addCriterion("id_categoria_cobro is null");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroIsNotNull() {
            addCriterion("id_categoria_cobro is not null");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroEqualTo(Integer value) {
            addCriterion("id_categoria_cobro =", value, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroNotEqualTo(Integer value) {
            addCriterion("id_categoria_cobro <>", value, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroGreaterThan(Integer value) {
            addCriterion("id_categoria_cobro >", value, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_categoria_cobro >=", value, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroLessThan(Integer value) {
            addCriterion("id_categoria_cobro <", value, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroLessThanOrEqualTo(Integer value) {
            addCriterion("id_categoria_cobro <=", value, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroIn(List<Integer> values) {
            addCriterion("id_categoria_cobro in", values, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroNotIn(List<Integer> values) {
            addCriterion("id_categoria_cobro not in", values, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroBetween(Integer value1, Integer value2) {
            addCriterion("id_categoria_cobro between", value1, value2, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andId_categoria_cobroNotBetween(Integer value1, Integer value2) {
            addCriterion("id_categoria_cobro not between", value1, value2, "id_categoria_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroIsNull() {
            addCriterion("fecha_cobro is null");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroIsNotNull() {
            addCriterion("fecha_cobro is not null");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroEqualTo(Date value) {
            addCriterion("fecha_cobro =", value, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroNotEqualTo(Date value) {
            addCriterion("fecha_cobro <>", value, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroGreaterThan(Date value) {
            addCriterion("fecha_cobro >", value, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_cobro >=", value, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroLessThan(Date value) {
            addCriterion("fecha_cobro <", value, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroLessThanOrEqualTo(Date value) {
            addCriterion("fecha_cobro <=", value, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroIn(List<Date> values) {
            addCriterion("fecha_cobro in", values, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroNotIn(List<Date> values) {
            addCriterion("fecha_cobro not in", values, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroBetween(Date value1, Date value2) {
            addCriterion("fecha_cobro between", value1, value2, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andFecha_cobroNotBetween(Date value1, Date value2) {
            addCriterion("fecha_cobro not between", value1, value2, "fecha_cobro");
            return (Criteria) this;
        }

        public Criteria andComentarioIsNull() {
            addCriterion("comentario is null");
            return (Criteria) this;
        }

        public Criteria andComentarioIsNotNull() {
            addCriterion("comentario is not null");
            return (Criteria) this;
        }

        public Criteria andComentarioEqualTo(String value) {
            addCriterion("comentario =", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioNotEqualTo(String value) {
            addCriterion("comentario <>", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioGreaterThan(String value) {
            addCriterion("comentario >", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioGreaterThanOrEqualTo(String value) {
            addCriterion("comentario >=", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioLessThan(String value) {
            addCriterion("comentario <", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioLessThanOrEqualTo(String value) {
            addCriterion("comentario <=", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioLike(String value) {
            addCriterion("comentario like", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioNotLike(String value) {
            addCriterion("comentario not like", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioIn(List<String> values) {
            addCriterion("comentario in", values, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioNotIn(List<String> values) {
            addCriterion("comentario not in", values, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioBetween(String value1, String value2) {
            addCriterion("comentario between", value1, value2, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioNotBetween(String value1, String value2) {
            addCriterion("comentario not between", value1, value2, "comentario");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cobro
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 12 16:28:01 COT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
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