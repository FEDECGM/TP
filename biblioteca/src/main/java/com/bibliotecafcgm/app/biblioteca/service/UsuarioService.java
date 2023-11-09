package com.bibliotecafcgm.app.biblioteca.service;

import com.bibliotecafcgm.app.biblioteca.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario guardarUsuario(Usuario usuario);

    void eliminarUsuario(Long id);

    List<Usuario> listarUsuario();


}
