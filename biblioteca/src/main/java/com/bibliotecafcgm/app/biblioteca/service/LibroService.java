package com.bibliotecafcgm.app.biblioteca.service;

import com.bibliotecafcgm.app.biblioteca.model.Libro;

import java.util.List;

public interface LibroService {

    Libro save (Libro libro);

    List<Libro> listarLibro();

    void eliminarLibro(Libro libro);
}
