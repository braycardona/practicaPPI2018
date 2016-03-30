package com.colsevi.dao.ingrediente.map;

import com.colsevi.dao.ingrediente.model.CompraXIngrediente;
import com.colsevi.dao.ingrediente.model.CompraXIngredienteExample;
import com.colsevi.dao.ingrediente.model.CompraXIngredienteKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CompraXIngredienteMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	int countByExample(CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	int deleteByExample(CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	int deleteByPrimaryKey(CompraXIngredienteKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	int insert(CompraXIngrediente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	int insertSelective(CompraXIngrediente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	List<CompraXIngrediente> selectByExample(CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	CompraXIngrediente selectByPrimaryKey(CompraXIngredienteKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	int updateByExampleSelective(@Param("record") CompraXIngrediente record,
			@Param("example") CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	int updateByExample(@Param("record") CompraXIngrediente record,
			@Param("example") CompraXIngredienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	int updateByPrimaryKeySelective(CompraXIngrediente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra_x_ingrediente
	 * @mbggenerated  Sat Mar 26 15:38:43 COT 2016
	 */
	int updateByPrimaryKey(CompraXIngrediente record);
	
	List<Map<String, Object>> SelectDataView(Map<String, Object> map);
}