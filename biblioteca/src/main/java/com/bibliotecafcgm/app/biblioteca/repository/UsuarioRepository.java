package com.bibliotecafcgm.app.biblioteca.repository;

import com.bibliotecafcgm.app.biblioteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
