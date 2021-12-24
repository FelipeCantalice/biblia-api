package com.felipecantalice.biblia.services;

import java.util.List;

import com.felipecantalice.biblia.entities.Capitulo;
import com.felipecantalice.biblia.entities.Verso;
import com.felipecantalice.biblia.exceptions.VersoNotFoundException;
import com.felipecantalice.biblia.repositories.CapituloRepository;
import com.felipecantalice.biblia.repositories.VersoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersoService {
    
    @Autowired
    private VersoRepository versoRepository;

    @Autowired
    private CapituloRepository capituloRepository;

    public List<Verso> findAll() {
        return versoRepository.findAll();
    }

    public Verso findById(Long id) {
        return versoRepository.findById(id).orElseThrow(() -> new VersoNotFoundException(id));
    }

    public Verso save(Verso verso) {
        return versoRepository.save(verso);
    }

    public void delete(Long id) {
        versoRepository.deleteById(id);
    }

    public List<Verso> findByIdWithCapitulo(Long id) {
        Capitulo capitulo = capituloRepository.findById(id).orElseThrow(() -> new VersoNotFoundException(id));
        List<Verso> versos = versoRepository.findByCapitulo(capitulo);
        return versos;
    }
    
}
