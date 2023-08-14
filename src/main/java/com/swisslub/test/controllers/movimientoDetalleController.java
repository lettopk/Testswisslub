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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.swisslub.test.models.movimientoModel;
import com.swisslub.test.models.movimiento_detalleModel;
import com.swisslub.test.services.movimientoDetalleService;

@RestController
@RequestMapping("/movimientoDetalle")
public class movimientoDetalleController {
    @Autowired
    movimientoDetalleService movimientoDetalleService;

    @Autowired
    com.swisslub.test.services.movimientoService movimientoService;

    @GetMapping
    public ArrayList<movimiento_detalleModel> obtenerMovimientoDetalle() {
        return movimientoDetalleService.obtenerMovimientoDetalle();
    }

    @PostMapping
    public movimiento_detalleModel guardarMovimientoDetalle(@RequestBody movimiento_detalleModel movimiento_detalle) {
        return this.movimientoDetalleService.guardarMovimientoDetalle(movimiento_detalle);
    }
    

    @GetMapping (path = "/{id}")
    public Optional<movimiento_detalleModel> obtenerMovimientoDetallePorId(@PathVariable("id") Integer id) {
        return this.movimientoDetalleService.obtenerporId(id);
    }
    
    //consulta el listado de movimiento por estado
    @GetMapping("/estado")
    @ResponseBody
    public ArrayList<movimientoModel> obtenerMovimientoPorEstado(@RequestParam("estado") String estado) {
        return this.movimientoService.obtenerporEstado(estado);
    
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
