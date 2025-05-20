package com.trackzone.controller;

import com.trackzone.dto.EntradaRequest;
import com.trackzone.dto.SaidaRequest;
import com.trackzone.service.MovimentacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movimentacao")
@com.trackzone.controller.RequiredArgsConstructor
public class MovimentacaoController {

    private final MovimentacaoService movimentacaoService;

    @PostMapping("/entrada")
    public ResponseEntity<?> registrarEntrada(@RequestBody EntradaRequest request) {
        return ResponseEntity.ok(movimentacaoService.registrarEntrada(request));
    }

    @PostMapping("/saida")
    public ResponseEntity<?> registrarSaida(@RequestBody SaidaRequest request) {
        return ResponseEntity.ok(movimentacaoService.registrarSaida(request));
    }
}