package com.colsevi.dao.producto.map;

import com.colsevi.dao.producto.model.Producto;
import com.colsevi.dao.producto.model.ProductoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int countByExample(ProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int deleteByExample(ProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int deleteByPrimaryKey(Integer id_producto);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int insert(Producto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int insertSelective(Producto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	List<Producto> selectByExample(ProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	Producto selectByPrimaryKey(Integer id_producto);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int updateByExampleSelective(@Param("record") Producto record,
			@Param("example") ProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int updateByExample(@Param("record") Producto record,
			@Param("example") ProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int updateByPrimaryKeySelective(Producto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table producto
	 * @mbggenerated  Tue Apr 12 16:33:50 COT 2016
	 */
	int updateByPrimaryKey(Producto record);
}