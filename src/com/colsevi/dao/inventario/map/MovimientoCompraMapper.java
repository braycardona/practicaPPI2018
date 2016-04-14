package com.colsevi.dao.inventario.map;

import com.colsevi.dao.inventario.model.MovimientoCompra;
import com.colsevi.dao.inventario.model.MovimientoCompraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovimientoCompraMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int countByExample(MovimientoCompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int deleteByExample(MovimientoCompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int deleteByPrimaryKey(Integer id_momivimiento_compra);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int insert(MovimientoCompra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int insertSelective(MovimientoCompra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    List<MovimientoCompra> selectByExample(MovimientoCompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    MovimientoCompra selectByPrimaryKey(Integer id_momivimiento_compra);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int updateByExampleSelective(@Param("record") MovimientoCompra record, @Param("example") MovimientoCompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int updateByExample(@Param("record") MovimientoCompra record, @Param("example") MovimientoCompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int updateByPrimaryKeySelective(MovimientoCompra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movimiento_compra
     *
     * @mbggenerated Tue Apr 12 16:32:27 COT 2016
     */
    int updateByPrimaryKey(MovimientoCompra record);
}