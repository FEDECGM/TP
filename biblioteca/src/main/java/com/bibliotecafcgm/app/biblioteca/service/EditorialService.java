package com.bibliotecafcgm.app.biblioteca.service;

import com.bibliotecafcgm.app.biblioteca.model.Editorial;

import java.util.List;

public interface EditorialService {

    Editorial guardarEditorial(Editorial editorial);

    void eliminarEditorial(Long id);

    List<Editorial> listarEditorial();

}
