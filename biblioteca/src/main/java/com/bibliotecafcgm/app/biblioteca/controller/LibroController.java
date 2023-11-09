package com.bibliotecafcgm.app.biblioteca.controller;

import com.bibliotecafcgm.app.biblioteca.model.Libro;
import com.bibliotecafcgm.app.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping("/agregar")
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @GetMapping("/saludar")
    public String saludo() {
        return "Hola como estas";
    }

    @GetMapping("/listarLibros")
    public List<Libro> listarLibros(){
        return libroService.listarLibro();
    }
    @DeleteMapping("{id}")
    public void eliminarLibro(Long id){
        Libro libro = new Libro();
        libro.setId(id);
        libroService.eliminarLibro(libro);
    }


}
