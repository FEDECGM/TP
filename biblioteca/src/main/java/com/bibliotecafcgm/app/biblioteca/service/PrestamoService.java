package com.bibliotecafcgm.app.biblioteca.service;

import com.bibliotecafcgm.app.biblioteca.model.Libro;
import com.bibliotecafcgm.app.biblioteca.model.Prestamo;
import com.bibliotecafcgm.app.biblioteca.model.Usuario;

public interface PrestamoService {

    Prestamo Prestar(Prestamo prestamo);

    void DevolverPrestamo(Long id);

}
