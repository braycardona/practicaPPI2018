package com.colsevi.dao.catalogo.map;

import com.colsevi.dao.catalogo.model.CatalogoXProductoExample;
import com.colsevi.dao.catalogo.model.CatalogoXProductoKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CatalogoXProductoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbggenerated  Tue Apr 12 16:35:47 COT 2016
	 */
	int countByExample(CatalogoXProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbggenerated  Tue Apr 12 16:35:47 COT 2016
	 */
	int deleteByExample(CatalogoXProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbggenerated  Tue Apr 12 16:35:47 COT 2016
	 */
	int deleteByPrimaryKey(CatalogoXProductoKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbggenerated  Tue Apr 12 16:35:47 COT 2016
	 */
	int insert(CatalogoXProductoKey record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbggenerated  Tue Apr 12 16:35:47 COT 2016
	 */
	int insertSelective(CatalogoXProductoKey record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbggenerated  Tue Apr 12 16:35:47 COT 2016
	 */
	List<CatalogoXProductoKey> selectByExample(CatalogoXProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbggenerated  Tue Apr 12 16:35:47 COT 2016
	 */
	int updateByExampleSelective(@Param("record") CatalogoXProductoKey record,
			@Param("example") CatalogoXProductoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo_x_producto
	 * @mbggenerated  Tue Apr 12 16:35:47 COT 2016
	 */
	int updateByExample(@Param("record") CatalogoXProductoKey record,
			@Param("example") CatalogoXProductoExample example);
	
	int deleteDetalleProd(Map<String, Object> map);
	int deleteDetalleCat(Map<String, Object> map);
}