package com.ecommerce.back.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Getter
@Entity
@Table(name="produto")
public class Produto extends Entidade{
    @Column(length = 10, unique = true)
    private Integer numero;
    @Column(length = 150)
    private String nome;
    @Column(length = 100)
    private Long preco;

}
