package com.bibliotecafcgm.app.biblioteca.service.impl;

import com.bibliotecafcgm.app.biblioteca.model.Usuario;
import com.bibliotecafcgm.app.biblioteca.repository.UsuarioRepository;
import com.bibliotecafcgm.app.biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listarUsuario(){
        return usuarioRepository.findAll();
    }

    @Override
    public void eliminarUsuario(Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuarioRepository.delete(usuario);
    }

}
