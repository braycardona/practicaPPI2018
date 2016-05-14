package com.colsevi.dao.inventario.map;

import com.colsevi.dao.inventario.model.MovimientoMateria;
import com.colsevi.dao.inventario.model.MovimientoMateriaExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MovimientoMateriaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	int countByExample(MovimientoMateriaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	int deleteByExample(MovimientoMateriaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	int deleteByPrimaryKey(Integer id_movimiento_materia);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	int insert(MovimientoMateria record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	int insertSelective(MovimientoMateria record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	List<MovimientoMateria> selectByExample(MovimientoMateriaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	MovimientoMateria selectByPrimaryKey(Integer id_movimiento_materia);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	int updateByExampleSelective(@Param("record") MovimientoMateria record,
			@Param("example") MovimientoMateriaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	int updateByExample(@Param("record") MovimientoMateria record, @Param("example") MovimientoMateriaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	int updateByPrimaryKeySelective(MovimientoMateria record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table movimiento_materia
	 * @mbggenerated  Tue Apr 26 10:57:42 COT 2016
	 */
	int updateByPrimaryKey(MovimientoMateria record);
	
	List<Map<String, Object>> SelectDataView(Map<String, Object> map);
	
	int CountDataView(Map<String, Object> map);
}