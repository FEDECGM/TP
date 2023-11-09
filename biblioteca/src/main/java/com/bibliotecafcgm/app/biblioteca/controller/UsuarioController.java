package com.bibliotecafcgm.app.biblioteca.controller;

import com.bibliotecafcgm.app.biblioteca.model.Usuario;
import com.bibliotecafcgm.app.biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;


    @GetMapping("/listar")
    public List<Usuario> listarUsuario(){
        return usuarioService.listarUsuario();
    }

    @PostMapping("/agregar")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping("{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioService.eliminarUsuario(id);
    }

}
