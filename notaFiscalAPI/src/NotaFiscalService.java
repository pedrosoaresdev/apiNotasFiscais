package com.example.notafiscal.service;

import com.example.notafiscal.model.NotaFiscal;
import com.example.notafiscal.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaFiscalService {
    @Autowired
    private NotaFiscalRepository repository;

    public List<NotaFiscal> listarNotasFiscais() {
        return repository.findAll();
    }

    public NotaFiscal criarNotaFiscal(NotaFiscal notaFiscal) {
        return repository.save(notaFiscal);
    }

    public NotaFiscal buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarNotaFiscal(Long id) {
        repository.deleteById(id);
    }
}