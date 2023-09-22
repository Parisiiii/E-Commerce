package com.ecommerce.back.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id", insertable=false, updatable=false)
    private Long id;
    private String uuid;
    private Integer numero;
    private String identificacao;
    private Long preco;
}
