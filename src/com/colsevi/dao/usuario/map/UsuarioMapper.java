package com.colsevi.dao.usuario.map;

import com.colsevi.dao.usuario.model.Usuario;
import com.colsevi.dao.usuario.model.UsuarioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    int countByExample(UsuarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    int deleteByExample(UsuarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    int deleteByPrimaryKey(String usuario);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    int insert(Usuario record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    int insertSelective(Usuario record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    List<Usuario> selectByExample(UsuarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    Usuario selectByPrimaryKey(String usuario);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    int updateByExampleSelective(@Param("record") Usuario record, @Param("example") UsuarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    int updateByExample(@Param("record") Usuario record, @Param("example") UsuarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    int updateByPrimaryKeySelective(Usuario record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usuario
     *
     * @mbggenerated Sat Nov 21 14:53:37 COT 2015
     */
    int updateByPrimaryKey(Usuario record);
}