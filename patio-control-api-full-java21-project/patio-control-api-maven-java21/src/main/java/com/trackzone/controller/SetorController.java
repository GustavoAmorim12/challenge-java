package com.trackzone.controller;

import com.trackzone.model.Setor;
import com.trackzone.repository.SetorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setores")
@RequiredArgsConstructor
public class SetorController {

    private final SetorRepository repository;

    @GetMapping
    public List<Setor> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Setor create(@RequestBody Setor setor) {
        return repository.save(setor);
    }
}