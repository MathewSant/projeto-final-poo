package com.hera.service;

import com.hera.model.Mapeamento;
import com.hera.repository.MapeamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapeamentoService {

    @Autowired
    private MapeamentoRepository repo;

    public List<Mapeamento> listar() {
        return repo.findAll();
    }

    public Mapeamento salvar(Mapeamento m) {
        return repo.save(m);
    }

    public Mapeamento buscar(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Mapeamento atualizar(Long id, Mapeamento m) {
        m.setId(id);
        return repo.save(m);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
