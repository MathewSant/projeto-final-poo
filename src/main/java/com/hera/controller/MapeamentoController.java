package com.hera.controller;

import com.hera.model.Mapeamento;
import com.hera.service.MapeamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mapeamentos")
public class MapeamentoController {

    @Autowired
    private MapeamentoService service;

    @GetMapping
    public List<Mapeamento> listar() {
        return service.listar();
    }

    @PostMapping
    public Mapeamento criar(@RequestBody Mapeamento m) {
        return service.salvar(m);
    }

    @GetMapping("/{id}")
    public Mapeamento buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public Mapeamento atualizar(@PathVariable Long id, @RequestBody Mapeamento m) {
        return service.atualizar(id, m);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
