package com.carpinteria.carpinteria.service;

import com.carpinteria.carpinteria.model.SolicitudCotizacion;
import com.carpinteria.carpinteria.repository.SolicitudCotizacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CotizacionService {

    private final SolicitudCotizacionRepository repository;

    public CotizacionService(SolicitudCotizacionRepository repository) {
        this.repository = repository;
    }

    public SolicitudCotizacion guardar(SolicitudCotizacion solicitud) {
        return repository.save(solicitud);
    }

    public List<SolicitudCotizacion> obtenerTodas() {
        return repository.findAll();
    }

    public boolean eliminar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
