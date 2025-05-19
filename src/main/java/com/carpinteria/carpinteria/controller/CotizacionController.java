package com.carpinteria.carpinteria.controller;

import com.carpinteria.carpinteria.model.SolicitudCotizacion;
import com.carpinteria.carpinteria.service.CotizacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cotizaciones")
public class CotizacionController {

    private final CotizacionService service;

    public CotizacionController(CotizacionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<SolicitudCotizacion> guardar(@RequestBody SolicitudCotizacion s) {
        return ResponseEntity.ok(service.guardar(s));
    }

    @GetMapping
    public List<SolicitudCotizacion> getAll() {
        return service.obtenerTodas();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        boolean eliminado = service.eliminar(id);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
