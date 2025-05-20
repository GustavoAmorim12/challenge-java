package com.trackzone.controller;

import com.trackzone.model.Moto;
import com.trackzone.repository.MotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motos")
@com.trackzone.controller.RequiredArgsConstructor
public class MotoController {

    private final MotoRepository repository;

    @GetMapping
    public List<Moto> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Moto> findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Moto create(@RequestBody Moto moto) {
        return repository.save(moto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Moto> update(@PathVariable Long id, @RequestBody Moto updated) {
        return repository.findById(id)
                .map(moto -> {
                    moto.setModelo(updated.getModelo());
                    moto.setTipo(updated.getTipo());
                    moto.setPlaca(updated.getPlaca());
                    moto.setStatus(updated.getStatus());
                    return ResponseEntity.ok(repository.save(moto));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}