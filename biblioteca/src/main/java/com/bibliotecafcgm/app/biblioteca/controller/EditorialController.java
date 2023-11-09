package com.bibliotecafcgm.app.biblioteca.controller;

import com.bibliotecafcgm.app.biblioteca.model.Editorial;
import com.bibliotecafcgm.app.biblioteca.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editorial")
public class EditorialController {
    @Autowired
    private EditorialService editorialService;

    @PostMapping("/agregarEditorial")
    public Editorial agregarEditorial(@RequestBody Editorial editorial){
        return editorialService.guardarEditorial(editorial);
    }

    @DeleteMapping("{id}")
    public void eliminarEditorial(@PathVariable Long id){
        editorialService.eliminarEditorial(id);
    }

    @GetMapping("/listarEditorial")
    public List<Editorial> listarEditorial(){
        return editorialService.listarEditorial();
    }

}
