package com.chrisferdev.tienda_libros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chrisferdev.tienda_libros.model.Libro;

public interface LibroRepositorio extends JpaRepository<Libro, Integer>{
    
}
