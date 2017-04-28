package com.colsevi.dao.pedido.map;

import com.colsevi.dao.pedido.model.DetallePedido;
import com.colsevi.dao.pedido.model.DetallePedidoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DetallePedidoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	long countByExample(DetallePedidoExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	int deleteByExample(DetallePedidoExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	int deleteByPrimaryKey(Integer id_detalle_pedido);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	int insert(DetallePedido record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	int insertSelective(DetallePedido record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	List<DetallePedido> selectByExample(DetallePedidoExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	DetallePedido selectByPrimaryKey(Integer id_detalle_pedido);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	int updateByExampleSelective(@Param("record") DetallePedido record, @Param("example") DetallePedidoExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	int updateByExample(@Param("record") DetallePedido record, @Param("example") DetallePedidoExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	int updateByPrimaryKeySelective(DetallePedido record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table detalle_pedido
	 * @mbg.generated  Fri Apr 28 17:54:59 COT 2017
	 */
	int updateByPrimaryKey(DetallePedido record);
	List<Map<String, Object>> SelectDataView(Map<String, Object> map);
	List<Map<String, Object>> obtenerDetalle(Map<String, Object> map);
}