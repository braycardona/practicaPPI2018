package com.colsevi.dao.general.map;

import com.colsevi.dao.general.model.Configuracion;
import com.colsevi.dao.general.model.ConfiguracionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfiguracionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    int countByExample(ConfiguracionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    int deleteByExample(ConfiguracionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    int deleteByPrimaryKey(Integer codigo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    int insert(Configuracion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    int insertSelective(Configuracion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    List<Configuracion> selectByExample(ConfiguracionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    Configuracion selectByPrimaryKey(Integer codigo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    int updateByExampleSelective(@Param("record") Configuracion record, @Param("example") ConfiguracionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    int updateByExample(@Param("record") Configuracion record, @Param("example") ConfiguracionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    int updateByPrimaryKeySelective(Configuracion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table configuracion
     *
     * @mbggenerated Mon Apr 17 16:59:45 COT 2017
     */
    int updateByPrimaryKey(Configuracion record);
}