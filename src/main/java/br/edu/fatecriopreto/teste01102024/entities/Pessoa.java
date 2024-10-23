package br.edu.fatecriopreto.teste01102024.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbpessoas")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nome", length = 200, nullable = false)
    private String nome;
}
/*,
 * create table tbpessoas(
 * id int not null primary key identity,
 * nome varchar(200) not null)
 */
