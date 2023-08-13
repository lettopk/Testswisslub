package com.swisslub.test.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swisslub.test.models.movimiento_detalleModel;
import com.swisslub.test.repositories.movimientoDetalleRepository;

@Service
public class movimientoDetalleService {

    @Autowired
    movimientoDetalleRepository movimientoDetalleRepository;

    public ArrayList<movimiento_detalleModel> obtenerMovimientoDetalle() {
        return (ArrayList<movimiento_detalleModel>) movimientoDetalleRepository.findAll();
    }
    
    public movimiento_detalleModel guardarMovimientoDetalle(movimiento_detalleModel movimiento_detalle) {
        return movimientoDetalleRepository.save(movimiento_detalle);
    }

    public Optional<movimiento_detalleModel> obtenerporId(Integer id) {
        return movimientoDetalleRepository.findById(id);
    }

    public boolean eliminarMovimientoDetalle(Integer id) {
        try {
            movimientoDetalleRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
