package com.ecommerce.back.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name="produto")
public class Produto extends Entidade{
    @Column(length = 10)
    private Integer numero;
    @Column(length = 150)
    private String nome;
    @Column(length = 100)
    private Long preco;

    @Column(length = 100000)
    private String imagemProduto;

    public Integer getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Long getPreco() {
        return preco;
    }

    public String getImagemProduto() {
        return imagemProduto;
    }

}
