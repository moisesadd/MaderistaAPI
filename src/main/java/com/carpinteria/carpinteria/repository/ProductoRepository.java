package com.carpinteria.carpinteria.repository;

import com.carpinteria.carpinteria.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {}