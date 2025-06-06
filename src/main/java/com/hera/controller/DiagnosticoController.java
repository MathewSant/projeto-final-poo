package com.hera.controller;

import com.hera.model.Diagnostico;
import com.hera.service.DiagnosticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnosticos")
public class DiagnosticoController {

    @Autowired
    private DiagnosticoService service;

    @GetMapping
    public List<Diagnostico> listar() {
        return service.listar();
    }

    @PostMapping
    public Diagnostico criar(@RequestBody Diagnostico d) {
        return service.salvar(d);
    }

    @GetMapping("/{id}")
    public Diagnostico buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public Diagnostico atualizar(@PathVariable Long id, @RequestBody Diagnostico d) {
        return service.atualizar(id, d);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}