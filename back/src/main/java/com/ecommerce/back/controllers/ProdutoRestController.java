package com.ecommerce.back.controllers;

import com.ecommerce.back.model.entities.Produto;
import com.ecommerce.back.services.ProdutoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v0/produto")
public class ProdutoRestController {
    @Autowired
    ProdutoService service;

    @PostMapping("/salvar")
    public void salvar(@RequestBody Produto produto){
        produto.setUuid(UUID.randomUUID().toString());
        service.salvar(produto);
    }

    @GetMapping("/procurarPorUUID/{uuid}")
    public ResponseEntity<Produto> procurarPorUUID(@PathVariable String uuid){
        Produto body = service.procurarPorUUID(uuid);
        return ResponseEntity.ok(body);
    }

    @GetMapping("/procurarPorNumero/{numero}")
    public ResponseEntity<Produto> procurarPorNumero(@PathVariable String numero){
        Integer numeroConvertido = Integer.parseInt(numero);
        Produto body = service.procurarPorNumero(numeroConvertido);
        return ResponseEntity.ok(body);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        List<Produto> body = service.listar();
        return ResponseEntity.ok(body);
    }

    @DeleteMapping("/{uuid}")
    public void deletar(@PathVariable String uuid){
        service.deletar(uuid);
    }
}
