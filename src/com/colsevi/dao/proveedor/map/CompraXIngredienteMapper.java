package com.colsevi.dao.proveedor.map;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.colsevi.dao.proveedor.model.CompraXIngrediente;
import com.colsevi.dao.proveedor.model.CompraXIngredienteExample;
import com.colsevi.dao.proveedor.model.CompraXIngredienteKey;

public interface CompraXIngredienteMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	long countByExample(CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	int deleteByExample(CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	int deleteByPrimaryKey(CompraXIngredienteKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	int insert(CompraXIngrediente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	int insertSelective(CompraXIngrediente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	List<CompraXIngrediente> selectByExample(CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	CompraXIngrediente selectByPrimaryKey(CompraXIngredienteKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	int updateByExampleSelective(@Param("record") CompraXIngrediente record,
			@Param("example") CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	int updateByExample(@Param("record") CompraXIngrediente record,
			@Param("example") CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	int updateByPrimaryKeySelective(CompraXIngrediente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbg.generated  Fri Apr 28 17:43:32 COT 2017
	 */
	int updateByPrimaryKey(CompraXIngrediente record);

	List<Map<String, Object>> SelectDataView(Map<String, Object> map);
}