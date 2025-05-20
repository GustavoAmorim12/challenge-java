package com.trackzone.repository;

import com.trackzone.model.Operador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperadorRepository extends JpaRepository<Operador, Long> {
    Operador findByIdentificador(String identificador);
}