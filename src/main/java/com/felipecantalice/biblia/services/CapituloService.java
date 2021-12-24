package com.felipecantalice.biblia.services;

import java.util.List;

import com.felipecantalice.biblia.entities.Capitulo;
import com.felipecantalice.biblia.exceptions.CapituloNotFoundException;
import com.felipecantalice.biblia.repositories.CapituloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapituloService {

    @Autowired
    private CapituloRepository capituloRepository;

    public List<Capitulo> findAll() {
        return capituloRepository.findAll();
    }

    public Capitulo findById(Long id) {
        return capituloRepository.findById(id).orElseThrow(() -> new CapituloNotFoundException(id));
    }

    public Capitulo save(Capitulo capitulo) {
        return capituloRepository.save(capitulo);
    }

    public void delete(Long id) {
        capituloRepository.deleteById(id);
    }

    public List<Capitulo> findByIdWithLivro(Long id) {
        return capituloRepository.findByLivroId(id);
    }
    

}
