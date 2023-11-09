package com.bibliotecafcgm.app.biblioteca.service.impl;

import com.bibliotecafcgm.app.biblioteca.model.Libro;
import com.bibliotecafcgm.app.biblioteca.service.LibroService;
import com.bibliotecafcgm.app.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {


    @Autowired
    private LibroRepository libroRepository;
    @Override
    public Libro save(Libro libro){
        return libroRepository.save(libro);

    }

    @Override
    public List<Libro> listarLibro(){
        return libroRepository.findAll();
    }

    @Override
    public void eliminarLibro(Libro libro){
        libroRepository.delete(libro);
    }


}
