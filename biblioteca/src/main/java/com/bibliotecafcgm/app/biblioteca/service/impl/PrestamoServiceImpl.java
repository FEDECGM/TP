package com.bibliotecafcgm.app.biblioteca.service.impl;
import com.bibliotecafcgm.app.biblioteca.model.Prestamo;
import com.bibliotecafcgm.app.biblioteca.repository.PrestamoRepository;
import com.bibliotecafcgm.app.biblioteca.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamoServiceImpl implements PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public Prestamo Prestar(Prestamo prestamo){
        return prestamoRepository.save(prestamo);
    }

    @Override
    public void DevolverPrestamo (Long id){
        Prestamo prestamo = new Prestamo();
        prestamo.setId(id);



        prestamoRepository.delete(prestamo);
    }
}
