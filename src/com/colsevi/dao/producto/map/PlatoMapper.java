package com.colsevi.dao.producto.map;

import com.colsevi.dao.producto.model.Plato;
import com.colsevi.dao.producto.model.PlatoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	long countByExample(PlatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	int deleteByExample(PlatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	int deleteByPrimaryKey(Integer id_plato);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	int insert(Plato record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	int insertSelective(Plato record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	List<Plato> selectByExample(PlatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	Plato selectByPrimaryKey(Integer id_plato);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	int updateByExampleSelective(@Param("record") Plato record, @Param("example") PlatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	int updateByExample(@Param("record") Plato record, @Param("example") PlatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	int updateByPrimaryKeySelective(Plato record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table plato
	 * @mbg.generated  Sat Jun 03 15:19:42 COT 2017
	 */
	int updateByPrimaryKey(Plato record);
}