package com.estudo.projeto_estudo.repository;

import com.estudo.projeto_estudo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
