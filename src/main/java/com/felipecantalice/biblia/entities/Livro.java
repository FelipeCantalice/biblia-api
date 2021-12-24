package com.felipecantalice.biblia.entities;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private Integer ano;

    @OneToMany(mappedBy = "livro", fetch = FetchType.EAGER)
    private Set<Capitulo> capitulos;
    
    public Livro() {
    }

    public Livro(String titulo, Integer ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Set<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Set<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }
    
    
}
