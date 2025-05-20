package com.trackzone.controller;

import com.trackzone.model.Operador;
import com.trackzone.repository.OperadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operadores")
@com.trackzone.controller.RequiredArgsConstructor
public class OperadorController {

    private final OperadorRepository repository;

    @GetMapping
    public List<Operador> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Operador create(@RequestBody Operador operador) {
        return repository.save(operador);
    }
}