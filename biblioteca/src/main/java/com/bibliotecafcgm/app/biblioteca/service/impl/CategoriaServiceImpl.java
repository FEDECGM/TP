package com.bibliotecafcgm.app.biblioteca.service.impl;

import com.bibliotecafcgm.app.biblioteca.model.Categoria;
import com.bibliotecafcgm.app.biblioteca.repository.CategoriaRepository;
import com.bibliotecafcgm.app.biblioteca.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria save(Categoria categoria){
        return  categoriaRepository.save(categoria);
    }

    @Override
    public void deleteCategoria(Categoria categoria){
        categoriaRepository.delete(categoria);
    }

    @Override
    public List<Categoria> listarCategoria(){
        return categoriaRepository.findAll();
    }

}
