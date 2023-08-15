package com.swisslub.test.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swisslub.test.models.movimientoModel;
import com.swisslub.test.models.movimiento_detalleModel;

@Repository
public interface movimientoDetalleRepository extends CrudRepository<movimiento_detalleModel, Integer> {
    
    //List<movimiento_detalleModel> findByEstado(String estado);

    List<movimiento_detalleModel> findByMovimientoId(Integer movimientoId);
    
}
