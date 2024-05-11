package com.ecommerce.back.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "pedido")
public class Pedido extends Entidade{
    private Integer numeroPedido;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_fk"),
            inverseJoinColumns = @JoinColumn(name = "produto_fk"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"pedido_fk", "produto_fk"}))
    private List<Produto> produtos;

}
