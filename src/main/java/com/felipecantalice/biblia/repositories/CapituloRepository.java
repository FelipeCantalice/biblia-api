package com.felipecantalice.biblia.repositories;

import java.util.List;

import com.felipecantalice.biblia.entities.Capitulo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapituloRepository extends JpaRepository<Capitulo, Long>  {
    
    List<Capitulo> findByLivroId(Long livroId);
}
