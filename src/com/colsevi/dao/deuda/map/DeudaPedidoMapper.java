package com.colsevi.dao.deuda.map;

import com.colsevi.dao.deuda.model.DeudaPedido;
import com.colsevi.dao.deuda.model.DeudaPedidoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeudaPedidoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    int countByExample(DeudaPedidoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    int deleteByExample(DeudaPedidoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    int deleteByPrimaryKey(Integer id_deuda_pedido);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    int insert(DeudaPedido record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    int insertSelective(DeudaPedido record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    List<DeudaPedido> selectByExample(DeudaPedidoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    DeudaPedido selectByPrimaryKey(Integer id_deuda_pedido);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    int updateByExampleSelective(@Param("record") DeudaPedido record, @Param("example") DeudaPedidoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    int updateByExample(@Param("record") DeudaPedido record, @Param("example") DeudaPedidoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    int updateByPrimaryKeySelective(DeudaPedido record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deuda_pedido
     *
     * @mbggenerated Tue Apr 12 16:30:54 COT 2016
     */
    int updateByPrimaryKey(DeudaPedido record);
}