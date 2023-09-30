package com.ecommerce.back.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido extends Entidade{
    private Integer numeroPedido;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_fk"),
            inverseJoinColumns = @JoinColumn(name = "produto_fk"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"pedido_fk", "produto_fk"}))
    private List<Produto> produtos;

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
