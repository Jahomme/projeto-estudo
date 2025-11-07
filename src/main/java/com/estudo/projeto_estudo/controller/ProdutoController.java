package com.estudo.projeto_estudo.controller;

import com.estudo.projeto_estudo.model.Produto;
import com.estudo.projeto_estudo.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido:" + produto.toString());

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.isPresent() ? produto.get() : null;
    }
}
