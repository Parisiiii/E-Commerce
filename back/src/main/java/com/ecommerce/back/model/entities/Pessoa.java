package com.ecommerce.back.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "pessoa")
public class Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    private String nome;
    private String email;
    @OneToMany
    private List<Endereco> endereco;
    private String senha;
    private Long saldo;
}
