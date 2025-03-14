package com.example.notafiscal.controller;

import com.example.notafiscal.model.NotaFiscal;
import com.example.notafiscal.service.NotaFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notas-fiscais")
public class NotaFiscalController {
    @Autowired
    private NotaFiscalService service;

    @GetMapping
    public List<NotaFiscal> listarNotasFiscais() {
        return service.listarNotasFiscais();
    }

    @PostMapping
    public NotaFiscal criarNotaFiscal(@RequestBody NotaFiscal notaFiscal) {
        return service.criarNotaFiscal(notaFiscal);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotaFiscal> buscarPorId(@PathVariable Long id) {
        NotaFiscal notaFiscal = service.buscarPorId(id);
        if (notaFiscal != null) {
            return ResponseEntity.ok(notaFiscal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarNotaFiscal(@PathVariable Long id) {
        service.deletarNotaFiscal(id);
        return ResponseEntity.noContent().build();
    }
}