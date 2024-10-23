package br.edu.fatecriopreto.teste01102024.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbprodutos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="descricao", length = 200, nullable = false)
    private String descricao;
    @Column (name="estoque")
    private int estoque;
    @Column
    private float precoVenda;
    @Column
    private float precoCusto;
    @OneToOne
    @JoinColumn(name="idcategoria", nullable = false, 
    referencedColumnName = "id")
    private Categoria categoria;
}
