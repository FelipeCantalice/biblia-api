package com.felipecantalice.biblia.exceptions;

public class LivroNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LivroNotFoundException(Long id) {
        super("Não foi possível encontrar o livro com o id: " + id);
    }

}
