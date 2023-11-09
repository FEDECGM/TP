package com.bibliotecafcgm.app.biblioteca.controller;

import com.bibliotecafcgm.app.biblioteca.model.Categoria;
import com.bibliotecafcgm.app.biblioteca.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;


    @PostMapping("/agregar")
    public Categoria crearCategoria(@RequestBody Categoria categoria){
        return categoriaService.save(categoria);
    }

    @DeleteMapping("{id}")
    public void eliminarCategoria(@PathVariable Long id){
        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoriaService.deleteCategoria(categoria);
    }

    @GetMapping("/listar")
    public List<Categoria> listarCategorias(){
        return categoriaService.listarCategoria();
    }


}
