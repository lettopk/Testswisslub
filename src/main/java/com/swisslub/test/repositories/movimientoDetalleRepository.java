package com.swisslub.test.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swisslub.test.models.movimientoModel;
import com.swisslub.test.models.movimiento_detalleModel;

@Repository
public interface movimientoDetalleRepository extends CrudRepository<movimiento_detalleModel, Integer> {
    //public abstract ArrayList<movimiento_detalleModel> findByEstado(String estado);
    //public abstract ArrayList<movimiento_detalleModel> findBymovimiento_id(String movimiento_id);
    
}
