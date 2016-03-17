package com.colsevi.dao.pago.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeudaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public DeudaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda
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
     * This method corresponds to the database table deuda
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
     * This method corresponds to the database table deuda
     *
     * @mbggenerated Thu Mar 10 16:44:01 COT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda
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
     * This class corresponds to the database table deuda
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

        public Criteria andId_categoria_moduloIsNull() {
            addCriterion("id_categoria_modulo is null");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloIsNotNull() {
            addCriterion("id_categoria_modulo is not null");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloEqualTo(Integer value) {
            addCriterion("id_categoria_modulo =", value, "id_categoria_modulo");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloNotEqualTo(Integer value) {
            addCriterion("id_categoria_modulo <>", value, "id_categoria_modulo");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloGreaterThan(Integer value) {
            addCriterion("id_categoria_modulo >", value, "id_categoria_modulo");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_categoria_modulo >=", value, "id_categoria_modulo");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloLessThan(Integer value) {
            addCriterion("id_categoria_modulo <", value, "id_categoria_modulo");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloLessThanOrEqualTo(Integer value) {
            addCriterion("id_categoria_modulo <=", value, "id_categoria_modulo");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloIn(List<Integer> values) {
            addCriterion("id_categoria_modulo in", values, "id_categoria_modulo");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloNotIn(List<Integer> values) {
            addCriterion("id_categoria_modulo not in", values, "id_categoria_modulo");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloBetween(Integer value1, Integer value2) {
            addCriterion("id_categoria_modulo between", value1, value2, "id_categoria_modulo");
            return (Criteria) this;
        }

        public Criteria andId_categoria_moduloNotBetween(Integer value1, Integer value2) {
            addCriterion("id_categoria_modulo not between", value1, value2, "id_categoria_modulo");
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

        public Criteria andDocumentoEqualTo(Integer value) {
            addCriterion("documento =", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoNotEqualTo(Integer value) {
            addCriterion("documento <>", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoGreaterThan(Integer value) {
            addCriterion("documento >", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("documento >=", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoLessThan(Integer value) {
            addCriterion("documento <", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoLessThanOrEqualTo(Integer value) {
            addCriterion("documento <=", value, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoIn(List<Integer> values) {
            addCriterion("documento in", values, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoNotIn(List<Integer> values) {
            addCriterion("documento not in", values, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoBetween(Integer value1, Integer value2) {
            addCriterion("documento between", value1, value2, "documento");
            return (Criteria) this;
        }

        public Criteria andDocumentoNotBetween(Integer value1, Integer value2) {
            addCriterion("documento not between", value1, value2, "documento");
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

        public Criteria andValor_deudaIsNull() {
            addCriterion("valor_deuda is null");
            return (Criteria) this;
        }

        public Criteria andValor_deudaIsNotNull() {
            addCriterion("valor_deuda is not null");
            return (Criteria) this;
        }

        public Criteria andValor_deudaEqualTo(BigDecimal value) {
            addCriterion("valor_deuda =", value, "valor_deuda");
            return (Criteria) this;
        }

        public Criteria andValor_deudaNotEqualTo(BigDecimal value) {
            addCriterion("valor_deuda <>", value, "valor_deuda");
            return (Criteria) this;
        }

        public Criteria andValor_deudaGreaterThan(BigDecimal value) {
            addCriterion("valor_deuda >", value, "valor_deuda");
            return (Criteria) this;
        }

        public Criteria andValor_deudaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valor_deuda >=", value, "valor_deuda");
            return (Criteria) this;
        }

        public Criteria andValor_deudaLessThan(BigDecimal value) {
            addCriterion("valor_deuda <", value, "valor_deuda");
            return (Criteria) this;
        }

        public Criteria andValor_deudaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valor_deuda <=", value, "valor_deuda");
            return (Criteria) this;
        }

        public Criteria andValor_deudaIn(List<BigDecimal> values) {
            addCriterion("valor_deuda in", values, "valor_deuda");
            return (Criteria) this;
        }

        public Criteria andValor_deudaNotIn(List<BigDecimal> values) {
            addCriterion("valor_deuda not in", values, "valor_deuda");
            return (Criteria) this;
        }

        public Criteria andValor_deudaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valor_deuda between", value1, value2, "valor_deuda");
            return (Criteria) this;
        }

        public Criteria andValor_deudaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valor_deuda not between", value1, value2, "valor_deuda");
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
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table deuda
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
     * This class corresponds to the database table deuda
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