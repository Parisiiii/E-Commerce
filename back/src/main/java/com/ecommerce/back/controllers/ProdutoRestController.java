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
    private ProdutoService service;

    public ProdutoRestController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping("/salvar")
    public void salvar(@RequestBody Produto produto){
        produto.setId(UUID.randomUUID().toString());
        service.salvar(produto);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<List<Produto>> procurarPorNome(@PathVariable String nome){
        if(nome.equals(" ")) {
            return ResponseEntity.ok(service.listar());
        }else {
            return ResponseEntity.ok(service.procurarPorNome(nome));
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/procurarPorNumero/{numero}")
    public ResponseEntity<Produto> procurarPorNumero(@PathVariable String numero){
        Integer numeroConvertido = Integer.parseInt(numero);
        Produto body = service.procurarPorNumero(numeroConvertido);
        return ResponseEntity.ok(body);
    }

    @DeleteMapping("/{uuid}")
    public void deletar(@PathVariable String uuid){
        service.deletar(uuid);
    }
}
