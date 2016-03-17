package com.colsevi.dao.usuario.map;

import com.colsevi.dao.usuario.model.Persona;
import com.colsevi.dao.usuario.model.PersonaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	int countByExample(PersonaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	int deleteByExample(PersonaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	int deleteByPrimaryKey(Integer id_persona);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	int insert(Persona record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	int insertSelective(Persona record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	List<Persona> selectByExample(PersonaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	Persona selectByPrimaryKey(Integer id_persona);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	int updateByExampleSelective(@Param("record") Persona record, @Param("example") PersonaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	int updateByExample(@Param("record") Persona record, @Param("example") PersonaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	int updateByPrimaryKeySelective(Persona record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Sat Mar 12 14:21:29 COT 2016
	 */
	int updateByPrimaryKey(Persona record);
}