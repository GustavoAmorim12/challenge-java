package com.trackzone.service;

import com.trackzone.dto.EntradaRequest;
import com.trackzone.dto.SaidaRequest;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {
    public String registrarEntrada(EntradaRequest request) {
        return "Entrada registrada com sucesso para moto: " + request.getIdentificadorMoto();
    }

    public String registrarSaida(SaidaRequest request) {
        return "Saída registrada com sucesso para moto: " + request.getIdentificadorMoto();
    }
}