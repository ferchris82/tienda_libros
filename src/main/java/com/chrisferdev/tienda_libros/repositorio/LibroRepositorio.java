package com.chrisferdev.tienda_libros.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chrisferdev.tienda_libros.modelo.Libro;

public interface LibroRepositorio extends JpaRepository<Libro, Integer>{
    
}
