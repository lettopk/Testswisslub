package com.swisslub.test.models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "movimiento")

public class movimientoModel {
    
    @Id
    private Integer id;

    private int id_empresa;
    private String descripcion;
    private String bodega_origen_codigo;
    private String bodega_destino_codigo;
    private Date fecha_creacion;
    private Date fecha_entrega;
    private String estado;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getBodega_origen_codigo() {
        return bodega_origen_codigo;
    }

    public void setBodega_origen_codigo(String bodega_origen_codigo) {
        this.bodega_origen_codigo = bodega_origen_codigo;
    }
    
    public String getBodega_destino_codigo() {
        return bodega_destino_codigo;
    }

    public void setBodega_destino_codigo(String bodega_destino_codigo) {
        this.bodega_destino_codigo = bodega_destino_codigo;
    }
    
    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    
    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}
