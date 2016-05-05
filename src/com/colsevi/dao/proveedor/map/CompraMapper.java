package com.colsevi.dao.proveedor.map;

import com.colsevi.dao.proveedor.model.Compra;
import com.colsevi.dao.proveedor.model.CompraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompraMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	int countByExample(CompraExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	int deleteByExample(CompraExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	int deleteByPrimaryKey(Integer id_compra);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	int insert(Compra record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	int insertSelective(Compra record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	List<Compra> selectByExample(CompraExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	Compra selectByPrimaryKey(Integer id_compra);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	int updateByExampleSelective(@Param("record") Compra record,
			@Param("example") CompraExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	int updateByExample(@Param("record") Compra record,
			@Param("example") CompraExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	int updateByPrimaryKeySelective(Compra record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table compra
	 * @mbggenerated  Tue Apr 12 16:29:08 COT 2016
	 */
	int updateByPrimaryKey(Compra record);
}