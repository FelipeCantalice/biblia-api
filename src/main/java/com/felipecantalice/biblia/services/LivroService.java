package com.felipecantalice.biblia.services;

import java.util.List;
import com.felipecantalice.biblia.entities.Livro;
import com.felipecantalice.biblia.exceptions.LivroNotFoundException;
import com.felipecantalice.biblia.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    public Livro findById(Long id) {
        return livroRepository.findById(id).orElseThrow(() -> new LivroNotFoundException(id));
    }

    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    public void delete(Long id) {
        livroRepository.deleteById(id);
    }
    
}
