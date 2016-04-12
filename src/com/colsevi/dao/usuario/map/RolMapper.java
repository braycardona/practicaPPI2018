package com.colsevi.dao.usuario.map;

import com.colsevi.dao.usuario.model.Rol;
import com.colsevi.dao.usuario.model.RolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	int countByExample(RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	int deleteByExample(RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	int deleteByPrimaryKey(Integer id_rol);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	int insert(Rol record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	int insertSelective(Rol record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	List<Rol> selectByExample(RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	Rol selectByPrimaryKey(Integer id_rol);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	int updateByExampleSelective(@Param("record") Rol record,
			@Param("example") RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	int updateByExample(@Param("record") Rol record,
			@Param("example") RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	int updateByPrimaryKeySelective(Rol record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated  Tue Apr 12 16:35:11 COT 2016
	 */
	int updateByPrimaryKey(Rol record);
}