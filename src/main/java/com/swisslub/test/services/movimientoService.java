package com.swisslub.test.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swisslub.test.models.movimientoModel;
import com.swisslub.test.repositories.movimientoRepository;

@Service
public class movimientoService {
    @Autowired
    movimientoRepository movimientoRepository;

    public ArrayList<movimientoModel> obtenerMovimiento() {
        return (ArrayList<movimientoModel>) movimientoRepository.findAll();
    }

    public movimientoModel guardarMovimiento(movimientoModel movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public Optional<movimientoModel> obtenerporId(Integer id) {
        return movimientoRepository.findById(id);
    }

    public ArrayList<movimientoModel> obtenerporEstado(String estado) {
        return movimientoRepository.findByEstado(estado);
    }

    public boolean eliminarMovimiento(Integer id) {
        try {
            movimientoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
