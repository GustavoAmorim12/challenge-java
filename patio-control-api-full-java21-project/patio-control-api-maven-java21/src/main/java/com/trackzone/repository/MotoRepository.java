package com.trackzone.repository;

import com.trackzone.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Moto, Long> {
}