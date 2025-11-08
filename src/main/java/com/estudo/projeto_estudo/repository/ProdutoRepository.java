package com.estudo.projeto_estudo.repository;

import com.estudo.projeto_estudo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    public List<Produto> findByNome(String nome);
}
