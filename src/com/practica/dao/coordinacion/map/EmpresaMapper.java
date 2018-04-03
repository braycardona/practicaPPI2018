package com.practica.dao.coordinacion.map;

import com.practica.dao.coordinacion.model.Empresa;
import com.practica.dao.coordinacion.model.EmpresaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpresaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    long countByExample(EmpresaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int deleteByExample(EmpresaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int deleteByPrimaryKey(String nit_empresa);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int insert(Empresa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int insertSelective(Empresa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    List<Empresa> selectByExample(EmpresaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    Empresa selectByPrimaryKey(String nit_empresa);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByExampleSelective(@Param("record") Empresa record, @Param("example") EmpresaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByExample(@Param("record") Empresa record, @Param("example") EmpresaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByPrimaryKeySelective(Empresa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empresa
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByPrimaryKey(Empresa record);
}