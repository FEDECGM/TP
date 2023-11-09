package com.bibliotecafcgm.app.biblioteca.service.impl;

import com.bibliotecafcgm.app.biblioteca.model.Editorial;
import com.bibliotecafcgm.app.biblioteca.repository.EditorialRepository;
import com.bibliotecafcgm.app.biblioteca.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialServiceImpl implements EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public Editorial guardarEditorial(Editorial editorial){
        return editorialRepository.save(editorial);
    }

    @Override
    public void eliminarEditorial(Long id){
        Editorial editorial = new Editorial();
        editorial.setId(id);
        editorialRepository.delete(editorial);
    }

    @Override
    public List<Editorial> listarEditorial(){
        return editorialRepository.findAll();
    }
}
