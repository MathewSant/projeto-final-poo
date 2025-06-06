package com.hera.service;

import com.hera.model.Diagnostico;
import com.hera.repository.DiagnosticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosticoService {
    @Autowired
    private DiagnosticoRepository repo;

    public List<Diagnostico> listar() {
        return repo.findAll();
    }

    public Diagnostico salvar(Diagnostico d) {
        return repo.save(d);
    }

    public Diagnostico buscar(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Diagnostico atualizar(Long id, Diagnostico d) {
        d.setId(id);
        return repo.save(d);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}