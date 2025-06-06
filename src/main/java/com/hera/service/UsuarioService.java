package com.hera.service;

import com.hera.model.Usuario;
import com.hera.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> listar() { return repo.findAll(); }
    public Usuario salvar(Usuario u) { return repo.save(u); }
    public Usuario buscar(Long id) { return repo.findById(id).orElseThrow(); }
    public Usuario atualizar(Long id, Usuario u) {
        u.setId(id);
        return repo.save(u);
    }
    public void deletar(Long id) { repo.deleteById(id); }
}