package com.swisslub.test.models;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;;

@Entity
@Table(name = "movimiento_detalle")


public class movimiento_detalleModel {
    
    @Id
    private Integer id;

    //(Id de la tabla movimiento.)
    @JsonIgnore
    @JoinColumn(name = "id")	
    private Integer movimiento_id;

    
    
    private String item_codigo;
    private int cantidad_enviada;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovimiento() {
        return movimiento_id;
    }
    
    public void setMovimiento_id(int movimiento_id) {
        this.movimiento_id = movimiento_id;
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
