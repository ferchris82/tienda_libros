package com.chrisferdev.tienda_libros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chrisferdev.tienda_libros.model.Libro;
import com.chrisferdev.tienda_libros.repository.LibroRepositorio;
import org.springframework.stereotype.Service;

@Service
public class LibroServicioImpl implements ILibroServicio{

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Override
    public List<Libro> listarLibros() {
        return libroRepositorio.findAll();
    }

    @Override
    public Libro buscarLibroPorId(Integer idLibro) {
        Libro libro = libroRepositorio.findById(idLibro).orElse(null);
        return libro;
    }

    @Override
    public void guardarLibro(Libro libro) {
        libroRepositorio.save(libro);
    }

    @Override
    public void eliminarLibro(Libro libro) {
        libroRepositorio.delete(libro);
    }
    
}
