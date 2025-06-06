package com.hera.service;

import com.hera.model.Faculdade;
import com.hera.repository.FaculdadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaculdadeService {

    @Autowired
    private FaculdadeRepository repo;

    public List<Faculdade> listar() {
        return repo.findAll();
    }

    public Faculdade salvar(Faculdade f) {
        return repo.save(f);
    }

    public Faculdade buscar(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Faculdade atualizar(Long id, Faculdade f) {
        f.setId(id);
        return repo.save(f);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
