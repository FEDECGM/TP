package com.bibliotecafcgm.app.biblioteca.controller;

import com.bibliotecafcgm.app.biblioteca.model.Prestamo;
import com.bibliotecafcgm.app.biblioteca.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Prestamo")
public class PrestamoController {

    @Autowired
    PrestamoService prestamoService;

    @PostMapping("/prestamo")
    public Prestamo prestar(@RequestBody Prestamo prestamo){
        return prestamoService.Prestar(prestamo);
    }

    @DeleteMapping("{id}")
    public void devolver(@PathVariable Long id){
        prestamoService.DevolverPrestamo(id);
    }


}
