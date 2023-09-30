package com.ecommerce.back.model.repositorys;

import com.ecommerce.back.model.entities.Produto;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository {
    List<Produto> listar();
    Produto procurarPorUUID(String uuid);
    Produto procurarPorNumero(Integer numero);
    void deletar(String uuid);
    void salvar(Produto produto);
}
