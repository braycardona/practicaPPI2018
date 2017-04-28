package com.colsevi.dao.producto.map;

import com.colsevi.dao.producto.model.PreparacionReceta;
import com.colsevi.dao.producto.model.PreparacionRecetaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreparacionRecetaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	long countByExample(PreparacionRecetaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	int deleteByExample(PreparacionRecetaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	int deleteByPrimaryKey(Integer id_preparacion_receta);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	int insert(PreparacionReceta record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	int insertSelective(PreparacionReceta record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	List<PreparacionReceta> selectByExample(PreparacionRecetaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	PreparacionReceta selectByPrimaryKey(Integer id_preparacion_receta);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	int updateByExampleSelective(@Param("record") PreparacionReceta record,
			@Param("example") PreparacionRecetaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	int updateByExample(@Param("record") PreparacionReceta record, @Param("example") PreparacionRecetaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	int updateByPrimaryKeySelective(PreparacionReceta record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table preparacion_receta
	 * @mbg.generated  Fri Apr 28 17:49:43 COT 2017
	 */
	int updateByPrimaryKey(PreparacionReceta record);
}