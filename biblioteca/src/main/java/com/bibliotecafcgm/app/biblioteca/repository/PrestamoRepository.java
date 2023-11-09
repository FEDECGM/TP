package com.bibliotecafcgm.app.biblioteca.repository;

import com.bibliotecafcgm.app.biblioteca.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo,Long> {
}
