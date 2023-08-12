package com.swisslub.test.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swisslub.test.models.movimientoModel;
import com.swisslub.test.models.movimiento_detalleModel;
import com.swisslub.test.services.movimiento_detalleService;

@RestController
@RequestMapping("/movimiento_detalle")
public class movimiento_detalleController {
    @Autowired
    movimiento_detalleService movimiento_detalleService;

    @GetMapping
    public ArrayList<movimiento_detalleModel> obtenerMovimiento_detalle() {
        return movimiento_detalleService.obtenerMovimiento_detalle();
    }

    @PostMapping
    public movimiento_detalleModel guardarMovimiento_detalle(@RequestBody movimiento_detalleModel movimiento_detalle) {
        return this.movimiento_detalleService.guardarMovimiento_detalle(movimiento_detalle);
    }

    @GetMapping (path = "/{id}")
    public Optional<movimiento_detalleModel> obtenerMovimiento_detallePorId(@PathVariable("id") Integer id) {
        return this.movimiento_detalleService.obtenerporId(id);
    }

    @GetMapping("/query")
    public Optional<movimiento_detalleModel> obtenerMovimiento_detallePorEstado(@RequestParam("id") Integer id) {
        return this.movimiento_detalleService.obtenerporId(id);
    }
    
    @DeleteMapping (path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id) {
        boolean ok = this.movimiento_detalleService.eliminarMovimiento_detalle(id);
        if (ok) {
            return "se eliminó el movimiento con id: " + id;
        } else {
            return "No pudo eliminarl el movimiento con id: " + id;
        }
    }
    
}
