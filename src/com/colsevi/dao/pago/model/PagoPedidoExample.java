package com.colsevi.dao.pago.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PagoPedidoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    public PagoPedidoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
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
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
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

        public Criteria andId_pago_pedidoIsNull() {
            addCriterion("id_pago_pedido is null");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoIsNotNull() {
            addCriterion("id_pago_pedido is not null");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoEqualTo(Integer value) {
            addCriterion("id_pago_pedido =", value, "id_pago_pedido");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoNotEqualTo(Integer value) {
            addCriterion("id_pago_pedido <>", value, "id_pago_pedido");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoGreaterThan(Integer value) {
            addCriterion("id_pago_pedido >", value, "id_pago_pedido");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_pago_pedido >=", value, "id_pago_pedido");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoLessThan(Integer value) {
            addCriterion("id_pago_pedido <", value, "id_pago_pedido");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoLessThanOrEqualTo(Integer value) {
            addCriterion("id_pago_pedido <=", value, "id_pago_pedido");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoIn(List<Integer> values) {
            addCriterion("id_pago_pedido in", values, "id_pago_pedido");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoNotIn(List<Integer> values) {
            addCriterion("id_pago_pedido not in", values, "id_pago_pedido");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoBetween(Integer value1, Integer value2) {
            addCriterion("id_pago_pedido between", value1, value2, "id_pago_pedido");
            return (Criteria) this;
        }

        public Criteria andId_pago_pedidoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_pago_pedido not between", value1, value2, "id_pago_pedido");
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

        public Criteria andFecha_pagIsNull() {
            addCriterion("fecha_pag is null");
            return (Criteria) this;
        }

        public Criteria andFecha_pagIsNotNull() {
            addCriterion("fecha_pag is not null");
            return (Criteria) this;
        }

        public Criteria andFecha_pagEqualTo(Date value) {
            addCriterion("fecha_pag =", value, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andFecha_pagNotEqualTo(Date value) {
            addCriterion("fecha_pag <>", value, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andFecha_pagGreaterThan(Date value) {
            addCriterion("fecha_pag >", value, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andFecha_pagGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_pag >=", value, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andFecha_pagLessThan(Date value) {
            addCriterion("fecha_pag <", value, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andFecha_pagLessThanOrEqualTo(Date value) {
            addCriterion("fecha_pag <=", value, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andFecha_pagIn(List<Date> values) {
            addCriterion("fecha_pag in", values, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andFecha_pagNotIn(List<Date> values) {
            addCriterion("fecha_pag not in", values, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andFecha_pagBetween(Date value1, Date value2) {
            addCriterion("fecha_pag between", value1, value2, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andFecha_pagNotBetween(Date value1, Date value2) {
            addCriterion("fecha_pag not between", value1, value2, "fecha_pag");
            return (Criteria) this;
        }

        public Criteria andValor_pagoIsNull() {
            addCriterion("valor_pago is null");
            return (Criteria) this;
        }

        public Criteria andValor_pagoIsNotNull() {
            addCriterion("valor_pago is not null");
            return (Criteria) this;
        }

        public Criteria andValor_pagoEqualTo(BigDecimal value) {
            addCriterion("valor_pago =", value, "valor_pago");
            return (Criteria) this;
        }

        public Criteria andValor_pagoNotEqualTo(BigDecimal value) {
            addCriterion("valor_pago <>", value, "valor_pago");
            return (Criteria) this;
        }

        public Criteria andValor_pagoGreaterThan(BigDecimal value) {
            addCriterion("valor_pago >", value, "valor_pago");
            return (Criteria) this;
        }

        public Criteria andValor_pagoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valor_pago >=", value, "valor_pago");
            return (Criteria) this;
        }

        public Criteria andValor_pagoLessThan(BigDecimal value) {
            addCriterion("valor_pago <", value, "valor_pago");
            return (Criteria) this;
        }

        public Criteria andValor_pagoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valor_pago <=", value, "valor_pago");
            return (Criteria) this;
        }

        public Criteria andValor_pagoIn(List<BigDecimal> values) {
            addCriterion("valor_pago in", values, "valor_pago");
            return (Criteria) this;
        }

        public Criteria andValor_pagoNotIn(List<BigDecimal> values) {
            addCriterion("valor_pago not in", values, "valor_pago");
            return (Criteria) this;
        }

        public Criteria andValor_pagoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valor_pago between", value1, value2, "valor_pago");
            return (Criteria) this;
        }

        public Criteria andValor_pagoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valor_pago not between", value1, value2, "valor_pago");
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
     * This class corresponds to the database table pago_pedido
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 12 16:29:49 COT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pago_pedido
     *
     * @mbggenerated Tue Apr 12 16:29:49 COT 2016
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