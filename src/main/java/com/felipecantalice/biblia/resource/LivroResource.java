package com.felipecantalice.biblia.resource;

import java.util.List;

import com.felipecantalice.biblia.entities.Capitulo;
import com.felipecantalice.biblia.entities.Livro;
import com.felipecantalice.biblia.entities.Verso;
import com.felipecantalice.biblia.services.CapituloService;
import com.felipecantalice.biblia.services.LivroService;
import com.felipecantalice.biblia.services.VersoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroResource {
    
    @Autowired
    private LivroService livroService;

    @Autowired 
    CapituloService capituloService;

    @Autowired
    private VersoService versoService;
    
    @GetMapping
    public List<Livro> findAll() {
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public Livro findById(@PathVariable Long id) {
        return livroService.findById(id);
    }

    @GetMapping("/{id}/capitulos")
    public List<Capitulo> findByIdWithCapitulos(@PathVariable Long id) {
        return capituloService.findByIdWithLivro(id);
    }
    
    @GetMapping("/{id}/versos")
    public List<Verso> findByIdWithVersos(@PathVariable Long id) {
        return versoService.findByIdWithCapitulo(id);
    }
}
