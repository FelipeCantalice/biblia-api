package com.felipecantalice.biblia.exceptions;

public class CapituloNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CapituloNotFoundException(Long id) {
        super("Não foi possível encontrar o capitulo com o id: " + id);
    }

}
