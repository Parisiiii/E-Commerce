package com.ecommerce.back.model.repositorys;

import com.ecommerce.back.model.entities.Pessoa;

import java.util.List;
import java.util.UUID;

public interface PessoaRepository {
    List<Pessoa> listar();
    Pessoa procurarPorUUID(UUID uuid);
    Pessoa procurarPorNome(String nome);
    void deletar(UUID uuid);
    void salvar(Pessoa pessoa);
}
