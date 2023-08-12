package com.swisslub.test.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swisslub.test.models.movimiento_detalleModel;
import com.swisslub.test.repositories.movimiento_detalleRepository;

@Service
public class movimiento_detalleService {
    @Autowired
    movimiento_detalleRepository movimiento_detalleRepository;

    public ArrayList<movimiento_detalleModel> obtenerMovimiento_detalle() {
        return (ArrayList<movimiento_detalleModel>) movimiento_detalleRepository.findAll();
    }

    public movimiento_detalleModel guardarMovimiento_detalle(movimiento_detalleModel movimiento_detalle) {
        return movimiento_detalleRepository.save(movimiento_detalle);
    }

    public Optional<movimiento_detalleModel> obtenerporId(Integer id) {
        return movimiento_detalleRepository.findById(id);
    }

    public boolean eliminarMovimiento_detalle(Integer id) {
        try {
            movimiento_detalleRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
