package br.edu.fatecriopreto.teste01102024.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecriopreto.teste01102024.repositories.CategoriaRepository;

@Service
public class CategoriaService {
@Autowired
    private CategoriaRepository categoriaRepository;
}
