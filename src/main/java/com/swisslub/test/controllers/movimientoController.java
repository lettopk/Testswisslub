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
import com.swisslub.test.services.movimientoService;

@RestController
@RequestMapping("/movimiento")
public class movimientoController {
    @Autowired
    movimientoService movimientoService;

    @GetMapping
    public ArrayList<movimientoModel> obtenerMovimiento() {
        return movimientoService.obtenerMovimiento();
    }

    @PostMapping
    public movimientoModel guardarMovimiento(@RequestBody movimientoModel movimiento) {
        return this.movimientoService.guardarMovimiento(movimiento);
    }

    @GetMapping (path = "/{id}")
    public Optional<movimientoModel> obtenerMovimientoPorId(@PathVariable("id") Integer id) {
        return this.movimientoService.obtenerporId(id);
    }

    @GetMapping("/query")
    public Optional<movimientoModel> obtenerMovimientoPorEstado(@RequestParam("id") Integer id) {
        return this.movimientoService.obtenerporId(id);
    }
    
    @DeleteMapping (path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id) {
        boolean ok = this.movimientoService.eliminarMovimiento(id);
        if (ok) {
            return "se eliminó el movimiento con id: " + id;
        } else {
            return "No pudo eliminarl el movimiento con id: " + id;
        }
    }
    
}
