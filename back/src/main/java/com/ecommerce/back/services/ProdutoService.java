package com.ecommerce.back.services;

import com.ecommerce.back.model.entities.Produto;
import com.ecommerce.back.model.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository repository;

    public List<Produto> listar(){
        return repository.listar();
    }

    public void salvar(Produto produto){
        repository.salvar(produto);
    }

    public void deletar(String uuid){
        repository.deletar(uuid);
    }

    public Produto procurarPorNumero(Integer numero){
        return repository.procurarPorNumero(numero);
    }
    public List<Produto> procurarPorNome(String nome) {
        return repository.procurarPorNome(nome);
    }
}
