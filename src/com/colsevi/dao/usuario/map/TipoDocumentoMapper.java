package com.colsevi.dao.usuario.map;

import com.colsevi.dao.usuario.model.TipoDocumento;
import com.colsevi.dao.usuario.model.TipoDocumentoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipoDocumentoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	long countByExample(TipoDocumentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	int deleteByExample(TipoDocumentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	int deleteByPrimaryKey(Integer id_tipo_documento);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	int insert(TipoDocumento record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	int insertSelective(TipoDocumento record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	List<TipoDocumento> selectByExample(TipoDocumentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	TipoDocumento selectByPrimaryKey(Integer id_tipo_documento);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	int updateByExampleSelective(@Param("record") TipoDocumento record, @Param("example") TipoDocumentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	int updateByExample(@Param("record") TipoDocumento record, @Param("example") TipoDocumentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	int updateByPrimaryKeySelective(TipoDocumento record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_documento
	 * @mbg.generated  Fri Apr 28 17:25:47 COT 2017
	 */
	int updateByPrimaryKey(TipoDocumento record);
}