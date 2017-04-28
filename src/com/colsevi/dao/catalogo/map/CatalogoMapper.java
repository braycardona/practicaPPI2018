package com.colsevi.dao.catalogo.map;

import com.colsevi.dao.catalogo.model.Catalogo;
import com.colsevi.dao.catalogo.model.CatalogoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CatalogoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	long countByExample(CatalogoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	int deleteByExample(CatalogoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	int deleteByPrimaryKey(Integer id_catalogo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	int insert(Catalogo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	int insertSelective(Catalogo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	List<Catalogo> selectByExample(CatalogoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	Catalogo selectByPrimaryKey(Integer id_catalogo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	int updateByExampleSelective(@Param("record") Catalogo record, @Param("example") CatalogoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	int updateByExample(@Param("record") Catalogo record, @Param("example") CatalogoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	int updateByPrimaryKeySelective(Catalogo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table catalogo
	 * @mbg.generated  Fri Apr 28 17:51:33 COT 2017
	 */
	int updateByPrimaryKey(Catalogo record);

	List<Map<String, Object>> ListaCatalogoPosibleProducto(Map<String, Object> map);
}