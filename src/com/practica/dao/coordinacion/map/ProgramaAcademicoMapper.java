package com.practica.dao.coordinacion.map;

import com.practica.dao.coordinacion.model.ProgramaAcademico;
import com.practica.dao.coordinacion.model.ProgramaAcademicoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgramaAcademicoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    long countByExample(ProgramaAcademicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int deleteByExample(ProgramaAcademicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int deleteByPrimaryKey(String codigo_academico);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int insert(ProgramaAcademico record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int insertSelective(ProgramaAcademico record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    List<ProgramaAcademico> selectByExample(ProgramaAcademicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    ProgramaAcademico selectByPrimaryKey(String codigo_academico);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByExampleSelective(@Param("record") ProgramaAcademico record, @Param("example") ProgramaAcademicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByExample(@Param("record") ProgramaAcademico record, @Param("example") ProgramaAcademicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByPrimaryKeySelective(ProgramaAcademico record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table programa_academico
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByPrimaryKey(ProgramaAcademico record);
}