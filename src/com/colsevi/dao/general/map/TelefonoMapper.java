package com.colsevi.dao.general.map;

import com.colsevi.dao.general.model.Telefono;
import com.colsevi.dao.general.model.TelefonoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TelefonoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	int countByExample(TelefonoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	int deleteByExample(TelefonoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	int deleteByPrimaryKey(Integer id_telefono);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	int insert(Telefono record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	int insertSelective(Telefono record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	List<Telefono> selectByExample(TelefonoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	Telefono selectByPrimaryKey(Integer id_telefono);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	int updateByExampleSelective(@Param("record") Telefono record,
			@Param("example") TelefonoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	int updateByExample(@Param("record") Telefono record,
			@Param("example") TelefonoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	int updateByPrimaryKeySelective(Telefono record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table telefono
	 * @mbggenerated  Tue Apr 12 16:26:48 COT 2016
	 */
	int updateByPrimaryKey(Telefono record);
}