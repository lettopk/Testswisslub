package com.swisslub.test.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.swisslub.test.models.movimientoModel;
import com.swisslub.test.models.movimiento_detalleModel;
import com.swisslub.test.repositories.movimientoDetalleRepository;
import com.swisslub.test.services.movimientoDetalleService;

@RestController
@RequestMapping("/movimientoDetalle")
public class movimientoDetalleController {
    @Autowired
    movimientoDetalleService movimientoDetalleService;

    @Autowired
    com.swisslub.test.services.movimientoService movimientoService;

    @Autowired
    movimientoDetalleRepository movimientoDetalleRepository;

    @GetMapping
    public ArrayList<movimiento_detalleModel> obtenerMovimientoDetalle() {
        return movimientoDetalleService.obtenerMovimientoDetalle();
    }

    //_________________________
    @PostMapping
    public movimiento_detalleModel guardarMovimientoDetalle(@RequestBody movimiento_detalleModel movimiento_detalle) {
        return this.movimientoDetalleService.guardarMovimientoDetalle(movimiento_detalle);
    }

    @GetMapping (path = "/{id}")
    public Optional<movimiento_detalleModel> obtenerMovimientoDetallePorId(@PathVariable("id") Integer id) {
        return this.movimientoDetalleService.obtenerporId(id);
    }
    
    
    /*@GetMapping("/estado1/{estado}")
    public ResponseEntity<List<movimiento_detalleModel>> getByEstado(@PathVariable String estado) {
        List<movimiento_detalleModel> movimientoDetalles = movimientoDetalleService.getByEstado(estado);
        return ResponseEntity.ok(movimientoDetalles);
    }*/
    
    @GetMapping("/movimientoId/{movimientoId}")
    public ResponseEntity<List<movimiento_detalleModel>> getByMovimientoId(@PathVariable Integer movimientoId) {
        List<movimiento_detalleModel> movimientoDetalles = movimientoDetalleService.getByMovimientoId(movimientoId);
        return ResponseEntity.ok(movimientoDetalles);
    }

    @DeleteMapping (path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id) {
        boolean ok = this.movimientoDetalleService.eliminarMovimientoDetalle(id);
        if (ok) {
            return "se eliminó el movimiento con id: " + id;
        } else {
            return "No pudo eliminarl el movimiento con id: " + id;
        }
    }

    
}
