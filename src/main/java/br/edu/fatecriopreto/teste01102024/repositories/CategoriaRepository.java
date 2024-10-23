package br.edu.fatecriopreto.teste01102024.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatecriopreto.teste01102024.entities.Categoria;
@Repository
public interface CategoriaRepository extends 
JpaRepository<Categoria, Integer> {
    
}
