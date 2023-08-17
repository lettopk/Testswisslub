package com.swisslub.test.models;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;

import jakarta.persistence.*;

@Entity
@Table(name = "movimiento_detalle")


public class movimiento_detalleModel {
    
    @Id
    private Integer id;

    //(Id de la tabla movimiento.)
    
    @ManyToOne()
    @JoinColumn(name = "movimiento_id")	
    private movimientoModel movimiento;

    /*@Transient
    private movimientoModel movimiento_id;*/

    /*public Integer getMovimientoId() {
        return movimiento != null ? movimiento.getId() : null;
    }*/
    
    private String item_codigo;
    private int cantidad_enviada;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public movimientoModel getMovimiento() {
        return movimiento;
    }
    
    public void setMovimiento_id(movimientoModel movimiento) {
        this.movimiento = movimiento;
    }

    public String getItem_codigo() {
        return item_codigo;
    }

    public void setItem_codigo(String item_codigo) {
        this.item_codigo = item_codigo;
    }

    public int getCantidad_enviada() {
        return cantidad_enviada;
    }

    public void setCantidad_enviada(int cantidad_enviada) {
        this.cantidad_enviada = cantidad_enviada;
    }

}
