package com.ecommerce.back.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name="produto")
public class Produto extends Entidade{
    private Integer numero;
    private String nome;
    private Long preco;

    public Integer getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Long getPreco() {
        return preco;
    }
}
