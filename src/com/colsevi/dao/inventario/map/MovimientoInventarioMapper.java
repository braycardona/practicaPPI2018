package com.colsevi.dao.inventario.map;

import com.colsevi.dao.inventario.model.MovimientoInventario;
import com.colsevi.dao.inventario.model.MovimientoInventarioExample;
import com.colsevi.dao.inventario.model.MovimientoInventarioKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovimientoInventarioMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	long countByExample(MovimientoInventarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	int deleteByExample(MovimientoInventarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	int deleteByPrimaryKey(MovimientoInventarioKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	int insert(MovimientoInventario record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	int insertSelective(MovimientoInventario record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	List<MovimientoInventario> selectByExample(MovimientoInventarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	MovimientoInventario selectByPrimaryKey(MovimientoInventarioKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	int updateByExampleSelective(@Param("record") MovimientoInventario record,
			@Param("example") MovimientoInventarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	int updateByExample(@Param("record") MovimientoInventario record,
			@Param("example") MovimientoInventarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	int updateByPrimaryKeySelective(MovimientoInventario record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_inventario
	 * @mbg.generated  Fri Apr 28 17:53:03 COT 2017
	 */
	int updateByPrimaryKey(MovimientoInventario record);
}