package com.colsevi.dao.inventario.map;

import com.colsevi.dao.inventario.model.Inventario;
import com.colsevi.dao.inventario.model.InventarioExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface InventarioMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int countByExample(InventarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int deleteByExample(InventarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int deleteByPrimaryKey(Integer id_inventario);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int insert(Inventario record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int insertSelective(Inventario record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    List<Inventario> selectByExample(InventarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    Inventario selectByPrimaryKey(Integer id_inventario);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int updateByExampleSelective(@Param("record") Inventario record, @Param("example") InventarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int updateByExample(@Param("record") Inventario record, @Param("example") InventarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int updateByPrimaryKeySelective(Inventario record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventario
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int updateByPrimaryKey(Inventario record);
    
    List<Map<String, Object>> SelectDataView(Map<String, Object> map);
    List<Map<String, Object>> CargarInv(Map<String, Object> map);
    List<Map<String, Object>> CargarInvIngrediente(Map<String, Object> map);
    int CountDataView(Map<String, Object> map);
}