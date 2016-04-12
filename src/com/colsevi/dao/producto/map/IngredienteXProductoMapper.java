package com.colsevi.dao.producto.map;

import com.colsevi.dao.producto.model.IngredienteXProductoExample;
import com.colsevi.dao.producto.model.IngredienteXProductoKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.colsevi.dao.producto.model.IngredienteXProducto;

public interface IngredienteXProductoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int countByExample(IngredienteXProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int deleteByExample(IngredienteXProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int deleteByPrimaryKey(IngredienteXProductoKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int insert(IngredienteXProducto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int insertSelective(IngredienteXProducto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	List<IngredienteXProducto> selectByExample(
			IngredienteXProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	IngredienteXProducto selectByPrimaryKey(IngredienteXProductoKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int updateByExampleSelective(@Param("record") IngredienteXProducto record,
			@Param("example") IngredienteXProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int updateByExample(@Param("record") IngredienteXProducto record,
			@Param("example") IngredienteXProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int updateByPrimaryKeySelective(IngredienteXProducto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ingrediente_x_producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int updateByPrimaryKey(IngredienteXProducto record);

	List<Map<String, Object>> SelectDataView(Map<String, Object> map);
}