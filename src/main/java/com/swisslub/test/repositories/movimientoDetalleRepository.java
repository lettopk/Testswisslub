package com.swisslub.test.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swisslub.test.models.movimiento_detalleModel;

@Repository
public interface movimientoDetalleRepository extends CrudRepository<movimiento_detalleModel, Integer> {
    
    
}
