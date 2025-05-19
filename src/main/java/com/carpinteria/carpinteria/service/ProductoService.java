package com.carpinteria.carpinteria.service;

import com.carpinteria.carpinteria.model.Producto;
import com.carpinteria.carpinteria.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    // Obtener todos los productos
    public List<Producto> obtenerTodos() {
        return repository.findAll();
    }

    // Obtener un producto por ID
    public Producto obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Guardar un nuevo producto
    public Producto guardar(Producto producto) {
        return repository.save(producto);
    }

    // Eliminar un producto por ID
    public boolean eliminar(Long id) {
        Optional<Producto> producto = repository.findById(id);
        if (producto.isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
