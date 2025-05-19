package com.carpinteria.carpinteria.repository;

import com.carpinteria.carpinteria.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {}