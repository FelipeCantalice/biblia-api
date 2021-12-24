package com.felipecantalice.biblia.repositories;

import com.felipecantalice.biblia.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>  {

}
