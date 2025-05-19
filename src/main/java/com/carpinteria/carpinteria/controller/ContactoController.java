package com.carpinteria.carpinteria.controller;

import com.carpinteria.carpinteria.model.Contacto;
import com.carpinteria.carpinteria.service.ContactoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacto")
public class ContactoController {

    private final ContactoService service;

    public ContactoController(ContactoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Contacto> guardar(@RequestBody Contacto contacto) {
        return ResponseEntity.ok(service.guardar(contacto));
    }
}
