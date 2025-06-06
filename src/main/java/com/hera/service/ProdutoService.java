package com.hera.service;

import com.hera.model.Produto;
import com.hera.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repo;

    public List<Produto> listar() {
        return repo.findAll();
    }

    public Produto salvar(Produto p) {
        return repo.save(p);
    }

    public Produto buscar(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Produto atualizar(Long id, Produto p) {
        p.setId(id);
        return repo.save(p);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }

    public List<Produto> listarPorCategoria(Produto.Categoria categoria) {
        return repo.findByCategoria(categoria);
    }

}