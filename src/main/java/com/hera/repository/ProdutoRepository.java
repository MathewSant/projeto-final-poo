package com.hera.repository;

import com.hera.model.Produto;
import com.hera.model.Produto.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoria(Categoria categoria);
}
