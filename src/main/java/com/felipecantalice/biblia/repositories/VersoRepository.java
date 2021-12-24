package com.felipecantalice.biblia.repositories;

import java.util.List;

import com.felipecantalice.biblia.entities.Capitulo;
import com.felipecantalice.biblia.entities.Verso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersoRepository extends JpaRepository<Verso, Long>  {
    
    List<Verso> findByCapitulo(Capitulo capitulo);
}
