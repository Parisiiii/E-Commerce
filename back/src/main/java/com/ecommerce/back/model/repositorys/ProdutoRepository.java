package com.ecommerce.back.model.repositorys;

import com.ecommerce.back.model.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository{
    List<Produto> listar();
    Produto procurarPorUUID(String uuid);

    List<Produto> procurarPorNome(String nome);
    Produto procurarPorNumero(Integer numero);
    void deletar(String uuid);
    void salvar(Produto produto);
}
