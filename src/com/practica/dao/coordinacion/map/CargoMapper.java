package com.practica.dao.coordinacion.map;

import com.practica.dao.coordinacion.model.Cargo;
import com.practica.dao.coordinacion.model.CargoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CargoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    long countByExample(CargoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int deleteByExample(CargoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int deleteByPrimaryKey(String codigo_cargo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int insert(Cargo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int insertSelective(Cargo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    List<Cargo> selectByExample(CargoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    Cargo selectByPrimaryKey(String codigo_cargo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByExampleSelective(@Param("record") Cargo record, @Param("example") CargoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByExample(@Param("record") Cargo record, @Param("example") CargoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByPrimaryKeySelective(Cargo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    int updateByPrimaryKey(Cargo record);
}