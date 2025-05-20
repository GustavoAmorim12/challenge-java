package com.trackzone.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String tipo;
    private String placa;
    private String status;

    @ManyToOne
    private Setor setorAtual;
}