package com.practica.dao.coordinacion.model;

public class Cargo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.codigo_cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    private String codigo_cargo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.nombre_cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    private String nombre_cargo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.codigo_cargo
     *
     * @return the value of cargo.codigo_cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public String getCodigo_cargo() {
        return codigo_cargo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.codigo_cargo
     *
     * @param codigo_cargo the value for cargo.codigo_cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public void setCodigo_cargo(String codigo_cargo) {
        this.codigo_cargo = codigo_cargo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.nombre_cargo
     *
     * @return the value of cargo.nombre_cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public String getNombre_cargo() {
        return nombre_cargo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.nombre_cargo
     *
     * @param nombre_cargo the value for cargo.nombre_cargo
     *
     * @mbg.generated Mon Apr 02 22:22:08 COT 2018
     */
    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }
}