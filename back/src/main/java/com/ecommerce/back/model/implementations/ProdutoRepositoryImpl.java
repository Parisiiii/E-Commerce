package com.ecommerce.back.model.implementations;

import com.ecommerce.back.model.entities.Produto;
import com.ecommerce.back.model.repositorys.ProdutoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;

@Repository
public class ProdutoRepositoryImpl implements ProdutoRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Produto> listar() {
        TypedQuery<Produto> query = manager
                .createQuery("from Produto", Produto.class);
        return query.getResultList();
    }

    @Override
    public Produto procurarPorUUID(String uuid) {
        String jpql = "FROM Produto p WHERE p.uuid=:uuid";
        TypedQuery<Produto> query = manager
                .createQuery(jpql, Produto.class)
                .setParameter("uuid", uuid);
        return query.getSingleResult();
    }

    @Override
    public Produto procurarPorNumero(Integer numero) {
        TypedQuery<Produto> query = manager.createQuery("from Produto where numero=:numero", Produto.class)
                .setParameter("numero",numero);
        return query.getSingleResult();
    }

    @Override
    @Transactional
    public void deletar(String uuid) {
        Produto produto = procurarPorUUID(uuid);
        manager.remove(produto);
    }

    @Override
    @Transactional
    public void salvar(Produto produto) {
        manager.merge(produto);
    }
}
