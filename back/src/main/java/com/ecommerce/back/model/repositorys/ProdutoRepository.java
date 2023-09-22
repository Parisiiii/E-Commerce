package com.ecommerce.back.model.repositorys;

import com.ecommerce.back.model.entities.Produto;

import java.util.List;

public interface ProdutoRepository {
    List<Produto> listar();
    Produto procurarPorUUID(String uuid);
    Produto procurarPorNumero(Integer numero);
    void deletar(String uuid);
    void salvar(Produto produto);
}
