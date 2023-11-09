package com.bibliotecafcgm.app.biblioteca.service;

import com.bibliotecafcgm.app.biblioteca.model.Categoria;

import java.util.List;

public interface CategoriaService {
    Categoria save (Categoria categoria);

    void deleteCategoria(Categoria categoria);

    List<Categoria> listarCategoria();
}
