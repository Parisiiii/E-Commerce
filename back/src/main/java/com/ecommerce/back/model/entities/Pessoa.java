package com.ecommerce.back.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table
public class Pessoa extends Entidade{
    private String nome;
    private String email;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pessoa_pedido",
            joinColumns = @JoinColumn(name = "pessoa_fk"),
            inverseJoinColumns = @JoinColumn(name = "pedido_fk"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"pessoa_fk", "pedido_fk"}))
    private List<Pedido> pedidos;

    @ManyToMany
    @JoinTable(name = "pessoa_endereco",
            joinColumns = @JoinColumn(name = "pessoa_fk"),
            inverseJoinColumns = @JoinColumn(name = "endereco_fk"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"pessoa_fk", "endereco_fk"}))
    private List<Endereco> endereco;
    private String senha;
    private Long saldo;

    public Pessoa(String nome, String email, List<Endereco> endereco, String senha, Long saldo, List<Pedido> pedidos) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
        this.saldo = saldo;
        this.pedidos = pedidos;
    }

    public Pessoa() {
    }
}
