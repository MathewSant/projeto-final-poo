package com.hera.controller;

import com.hera.model.Faculdade;
import com.hera.service.FaculdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculdades")
public class FaculdadeController {

    @Autowired
    private FaculdadeService service;

    @GetMapping
    public List<Faculdade> listar() {
        return service.listar();
    }

    @PostMapping
    public Faculdade criar(@RequestBody Faculdade f) {
        return service.salvar(f);
    }

    @GetMapping("/{id}")
    public Faculdade buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public Faculdade atualizar(@PathVariable Long id, @RequestBody Faculdade f) {
        return service.atualizar(id, f);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
