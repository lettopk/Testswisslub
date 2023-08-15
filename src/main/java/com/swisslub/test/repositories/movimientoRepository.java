package com.swisslub.test.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swisslub.test.models.movimientoModel;
import com.swisslub.test.models.movimiento_detalleModel;

@Repository
public interface movimientoRepository extends CrudRepository<movimientoModel, Integer> {
    
    public abstract ArrayList<movimientoModel> findByEstado(String estado);
}
