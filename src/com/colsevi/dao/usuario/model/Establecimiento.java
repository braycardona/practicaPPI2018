package com.colsevi.dao.usuario.model;

public class Establecimiento {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column establecimiento.id_establecimiento
     *
     * @mbggenerated Thu Dec 03 21:56:26 COT 2015
     */
    private Integer id_establecimiento;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column establecimiento.nombre
     *
     * @mbggenerated Thu Dec 03 21:56:26 COT 2015
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column establecimiento.descripcion
     *
     * @mbggenerated Thu Dec 03 21:56:26 COT 2015
     */
    private String descripcion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column establecimiento.id_establecimiento
     *
     * @return the value of establecimiento.id_establecimiento
     *
     * @mbggenerated Thu Dec 03 21:56:26 COT 2015
     */
    public Integer getId_establecimiento() {
        return id_establecimiento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column establecimiento.id_establecimiento
     *
     * @param id_establecimiento the value for establecimiento.id_establecimiento
     *
     * @mbggenerated Thu Dec 03 21:56:26 COT 2015
     */
    public void setId_establecimiento(Integer id_establecimiento) {
        this.id_establecimiento = id_establecimiento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column establecimiento.nombre
     *
     * @return the value of establecimiento.nombre
     *
     * @mbggenerated Thu Dec 03 21:56:26 COT 2015
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column establecimiento.nombre
     *
     * @param nombre the value for establecimiento.nombre
     *
     * @mbggenerated Thu Dec 03 21:56:26 COT 2015
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column establecimiento.descripcion
     *
     * @return the value of establecimiento.descripcion
     *
     * @mbggenerated Thu Dec 03 21:56:26 COT 2015
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column establecimiento.descripcion
     *
     * @param descripcion the value for establecimiento.descripcion
     *
     * @mbggenerated Thu Dec 03 21:56:26 COT 2015
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}