package com.felipecantalice.biblia.exceptions;

public class VersoNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public VersoNotFoundException(Long id) {
        super("Não foi possível encontrar o verso com o id: " + id);
    }

}
