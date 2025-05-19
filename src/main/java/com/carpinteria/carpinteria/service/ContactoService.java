package com.carpinteria.carpinteria.service;

import com.carpinteria.carpinteria.model.Contacto;
import com.carpinteria.carpinteria.repository.ContactoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactoService {

    private final ContactoRepository repository;

    public ContactoService(ContactoRepository repository) {
        this.repository = repository;
    }

    public Contacto guardar(Contacto contacto) {
        return repository.save(contacto);
    }
}
