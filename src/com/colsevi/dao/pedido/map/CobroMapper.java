package com.colsevi.dao.pedido.map;

import com.colsevi.dao.pedido.model.Cobro;
import com.colsevi.dao.pedido.model.CobroExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CobroMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    int countByExample(CobroExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    int deleteByExample(CobroExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    int deleteByPrimaryKey(Integer id_cobro);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    int insert(Cobro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    int insertSelective(Cobro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    List<Cobro> selectByExample(CobroExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    Cobro selectByPrimaryKey(Integer id_cobro);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    int updateByExampleSelective(@Param("record") Cobro record, @Param("example") CobroExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    int updateByExample(@Param("record") Cobro record, @Param("example") CobroExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    int updateByPrimaryKeySelective(Cobro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cobro
     *
     * @mbggenerated Tue Apr 12 16:28:01 COT 2016
     */
    int updateByPrimaryKey(Cobro record);
}