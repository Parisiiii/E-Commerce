package com.ecommerce.back.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table
public class Pessoa extends Entidade{
    private String nome;
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pessoa_pedido",
            joinColumns = @JoinColumn(name = "pessoa_fk"),
            inverseJoinColumns = @JoinColumn(name = "pedido_fk"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"pessoa_fk", "pedido_fk"}))
    private List<Pedido> pedidos;

    @OneToMany
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

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }
}
